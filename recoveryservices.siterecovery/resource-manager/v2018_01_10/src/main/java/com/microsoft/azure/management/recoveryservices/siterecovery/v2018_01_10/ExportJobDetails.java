/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents details for export jobs workflow.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("ExportJobDetails")
public class ExportJobDetails extends JobDetails {
    /**
     * BlobUri of the exported jobs.
     */
    @JsonProperty(value = "blobUri")
    private String blobUri;

    /**
     * The sas token to access blob.
     */
    @JsonProperty(value = "sasToken")
    private String sasToken;

    /**
     * Get blobUri of the exported jobs.
     *
     * @return the blobUri value
     */
    public String blobUri() {
        return this.blobUri;
    }

    /**
     * Set blobUri of the exported jobs.
     *
     * @param blobUri the blobUri value to set
     * @return the ExportJobDetails object itself.
     */
    public ExportJobDetails withBlobUri(String blobUri) {
        this.blobUri = blobUri;
        return this;
    }

    /**
     * Get the sas token to access blob.
     *
     * @return the sasToken value
     */
    public String sasToken() {
        return this.sasToken;
    }

    /**
     * Set the sas token to access blob.
     *
     * @param sasToken the sasToken value to set
     * @return the ExportJobDetails object itself.
     */
    public ExportJobDetails withSasToken(String sasToken) {
        this.sasToken = sasToken;
        return this;
    }

}
