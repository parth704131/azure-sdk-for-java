/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Logical Network Properties.
 */
public class LogicalNetworkProperties {
    /**
     * The Friendly Name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * A value indicating whether Network Virtualization is enabled for the
     * logical network.
     */
    @JsonProperty(value = "networkVirtualizationStatus")
    private String networkVirtualizationStatus;

    /**
     * A value indicating whether logical network is used as private test
     * network by test failover.
     */
    @JsonProperty(value = "logicalNetworkUsage")
    private String logicalNetworkUsage;

    /**
     * A value indicating whether logical network definitions are isolated.
     */
    @JsonProperty(value = "logicalNetworkDefinitionsStatus")
    private String logicalNetworkDefinitionsStatus;

    /**
     * Get the Friendly Name.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the Friendly Name.
     *
     * @param friendlyName the friendlyName value to set
     * @return the LogicalNetworkProperties object itself.
     */
    public LogicalNetworkProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get a value indicating whether Network Virtualization is enabled for the logical network.
     *
     * @return the networkVirtualizationStatus value
     */
    public String networkVirtualizationStatus() {
        return this.networkVirtualizationStatus;
    }

    /**
     * Set a value indicating whether Network Virtualization is enabled for the logical network.
     *
     * @param networkVirtualizationStatus the networkVirtualizationStatus value to set
     * @return the LogicalNetworkProperties object itself.
     */
    public LogicalNetworkProperties withNetworkVirtualizationStatus(String networkVirtualizationStatus) {
        this.networkVirtualizationStatus = networkVirtualizationStatus;
        return this;
    }

    /**
     * Get a value indicating whether logical network is used as private test network by test failover.
     *
     * @return the logicalNetworkUsage value
     */
    public String logicalNetworkUsage() {
        return this.logicalNetworkUsage;
    }

    /**
     * Set a value indicating whether logical network is used as private test network by test failover.
     *
     * @param logicalNetworkUsage the logicalNetworkUsage value to set
     * @return the LogicalNetworkProperties object itself.
     */
    public LogicalNetworkProperties withLogicalNetworkUsage(String logicalNetworkUsage) {
        this.logicalNetworkUsage = logicalNetworkUsage;
        return this;
    }

    /**
     * Get a value indicating whether logical network definitions are isolated.
     *
     * @return the logicalNetworkDefinitionsStatus value
     */
    public String logicalNetworkDefinitionsStatus() {
        return this.logicalNetworkDefinitionsStatus;
    }

    /**
     * Set a value indicating whether logical network definitions are isolated.
     *
     * @param logicalNetworkDefinitionsStatus the logicalNetworkDefinitionsStatus value to set
     * @return the LogicalNetworkProperties object itself.
     */
    public LogicalNetworkProperties withLogicalNetworkDefinitionsStatus(String logicalNetworkDefinitionsStatus) {
        this.logicalNetworkDefinitionsStatus = logicalNetworkDefinitionsStatus;
        return this;
    }

}
