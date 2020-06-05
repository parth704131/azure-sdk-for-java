/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventgrid.v2020_06_01.DomainTopics;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.eventgrid.v2020_06_01.DomainTopic;

class DomainTopicsImpl extends WrapperImpl<DomainTopicsInner> implements DomainTopics {
    private final EventGridManager manager;

    DomainTopicsImpl(EventGridManager manager) {
        super(manager.inner().domainTopics());
        this.manager = manager;
    }

    public EventGridManager manager() {
        return this.manager;
    }

    @Override
    public DomainTopicImpl define(String name) {
        return wrapModel(name);
    }

    private DomainTopicImpl wrapModel(DomainTopicInner inner) {
        return  new DomainTopicImpl(inner, manager());
    }

    private DomainTopicImpl wrapModel(String name) {
        return new DomainTopicImpl(name, this.manager());
    }

    @Override
    public Observable<DomainTopic> listByDomainAsync(final String resourceGroupName, final String domainName) {
        DomainTopicsInner client = this.inner();
        return client.listByDomainAsync(resourceGroupName, domainName)
        .flatMapIterable(new Func1<Page<DomainTopicInner>, Iterable<DomainTopicInner>>() {
            @Override
            public Iterable<DomainTopicInner> call(Page<DomainTopicInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DomainTopicInner, DomainTopic>() {
            @Override
            public DomainTopic call(DomainTopicInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DomainTopic> getAsync(String resourceGroupName, String domainName, String domainTopicName) {
        DomainTopicsInner client = this.inner();
        return client.getAsync(resourceGroupName, domainName, domainTopicName)
        .flatMap(new Func1<DomainTopicInner, Observable<DomainTopic>>() {
            @Override
            public Observable<DomainTopic> call(DomainTopicInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DomainTopic)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String domainName, String domainTopicName) {
        DomainTopicsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, domainName, domainTopicName).toCompletable();
    }

}
