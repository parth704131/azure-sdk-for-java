// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.rx;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.util.CosmosPagedFlux;
import com.azure.cosmos.implementation.CosmosItemProperties;
import com.azure.cosmos.models.QueryRequestOptions;
import com.azure.cosmos.implementation.FeedResponseListValidator;
import com.azure.cosmos.implementation.FeedResponseValidator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class SinglePartitionReadFeedDocumentsTest extends TestSuiteBase {

    private CosmosAsyncContainer createdCollection;
    private List<CosmosItemProperties> createdDocuments;

    private CosmosAsyncClient client;

    @Factory(dataProvider = "clientBuildersWithDirect")
    public SinglePartitionReadFeedDocumentsTest(CosmosClientBuilder clientBuilder) {
        super(clientBuilder);
    }

    @Test(groups = { "simple" }, timeOut = FEED_TIMEOUT)
    public void readDocuments() {
        final QueryRequestOptions options = new QueryRequestOptions();

        int maxItemCount = 2;
        final CosmosPagedFlux<CosmosItemProperties> feedObservable = createdCollection
            .queryItems("SELECT * FROM r", options, CosmosItemProperties.class);
        final int expectedPageSize = (createdDocuments.size() + maxItemCount - 1) / maxItemCount;

        FeedResponseListValidator<CosmosItemProperties> validator = new FeedResponseListValidator.Builder<CosmosItemProperties>()
                .totalSize(createdDocuments.size())
                .numberOfPages(expectedPageSize)
                .exactlyContainsInAnyOrder(createdDocuments.stream().map(d -> d.getResourceId()).collect(Collectors.toList()))
                .allPagesSatisfy(new FeedResponseValidator.Builder<CosmosItemProperties>()
                        .requestChargeGreaterThanOrEqualTo(1.0).build())
                .build();
        validateQuerySuccess(feedObservable.byPage(maxItemCount), validator, FEED_TIMEOUT);
    }

    @BeforeClass(groups = { "simple" }, timeOut = 4 * SETUP_TIMEOUT)
    public void before_SinglePartitionReadFeedDocumentsTest() {
        client = getClientBuilder().buildAsyncClient();
        createdCollection = getSharedSinglePartitionCosmosContainer(client);
        truncateCollection(createdCollection);

        List<CosmosItemProperties> docDefList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            docDefList.add(getDocumentDefinition());
        }

        createdDocuments = bulkInsertBlocking(createdCollection, docDefList);
        waitIfNeededForReplicasToCatchUp(getClientBuilder());
    }

    @AfterClass(groups = { "simple" }, timeOut = SHUTDOWN_TIMEOUT, alwaysRun = true)
    public void afterClass() {
        safeClose(client);
    }

    private CosmosItemProperties getDocumentDefinition() {
        String uuid = UUID.randomUUID().toString();
        CosmosItemProperties doc = new CosmosItemProperties(String.format("{ "
            + "\"id\": \"%s\", "
            + "\"mypk\": \"%s\", "
            + "\"sgmts\": [[6519456, 1471916863], [2498434, 1455671440]]"
            + "}"
            , uuid, uuid));
        return doc;
    }
}
