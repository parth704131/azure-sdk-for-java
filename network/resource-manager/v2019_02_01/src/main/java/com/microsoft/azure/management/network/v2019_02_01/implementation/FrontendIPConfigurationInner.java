/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_02_01.IPAllocationMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Frontend IP address of the load balancer.
 */
@JsonFlatten
public class FrontendIPConfigurationInner extends SubResource {
    /**
     * Read only. Inbound rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.inboundNatRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundNatRules;

    /**
     * Read only. Inbound pools URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.inboundNatPools", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundNatPools;

    /**
     * Read only. Outbound rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.outboundRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> outboundRules;

    /**
     * Gets load balancing rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.loadBalancingRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> loadBalancingRules;

    /**
     * The private IP address of the IP configuration.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIPAddress;

    /**
     * The Private IP allocation method. Possible values include: 'Static',
     * 'Dynamic'.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IPAllocationMethod privateIPAllocationMethod;

    /**
     * The reference of the subnet resource.
     */
    @JsonProperty(value = "properties.subnet")
    private SubnetInner subnet;

    /**
     * The reference of the Public IP resource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private PublicIPAddressInner publicIPAddress;

    /**
     * The reference of the Public IP Prefix resource.
     */
    @JsonProperty(value = "properties.publicIPPrefix")
    private SubResource publicIPPrefix;

    /**
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * A list of availability zones denoting the IP allocated for the resource
     * needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Get read only. Inbound rules URIs that use this frontend IP.
     *
     * @return the inboundNatRules value
     */
    public List<SubResource> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Get read only. Inbound pools URIs that use this frontend IP.
     *
     * @return the inboundNatPools value
     */
    public List<SubResource> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Get read only. Outbound rules URIs that use this frontend IP.
     *
     * @return the outboundRules value
     */
    public List<SubResource> outboundRules() {
        return this.outboundRules;
    }

    /**
     * Get gets load balancing rules URIs that use this frontend IP.
     *
     * @return the loadBalancingRules value
     */
    public List<SubResource> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Get the private IP address of the IP configuration.
     *
     * @return the privateIPAddress value
     */
    public String privateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * Set the private IP address of the IP configuration.
     *
     * @param privateIPAddress the privateIPAddress value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
        return this;
    }

    /**
     * Get the Private IP allocation method. Possible values include: 'Static', 'Dynamic'.
     *
     * @return the privateIPAllocationMethod value
     */
    public IPAllocationMethod privateIPAllocationMethod() {
        return this.privateIPAllocationMethod;
    }

    /**
     * Set the Private IP allocation method. Possible values include: 'Static', 'Dynamic'.
     *
     * @param privateIPAllocationMethod the privateIPAllocationMethod value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPrivateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod) {
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        return this;
    }

    /**
     * Get the reference of the subnet resource.
     *
     * @return the subnet value
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the reference of the subnet resource.
     *
     * @param subnet the subnet value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the reference of the Public IP resource.
     *
     * @return the publicIPAddress value
     */
    public PublicIPAddressInner publicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * Set the reference of the Public IP resource.
     *
     * @param publicIPAddress the publicIPAddress value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPublicIPAddress(PublicIPAddressInner publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
        return this;
    }

    /**
     * Get the reference of the Public IP Prefix resource.
     *
     * @return the publicIPPrefix value
     */
    public SubResource publicIPPrefix() {
        return this.publicIPPrefix;
    }

    /**
     * Set the reference of the Public IP Prefix resource.
     *
     * @param publicIPPrefix the publicIPPrefix value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPublicIPPrefix(SubResource publicIPPrefix) {
        this.publicIPPrefix = publicIPPrefix;
        return this;
    }

    /**
     * Get gets the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set gets the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get a list of availability zones denoting the IP allocated for the resource needs to come from.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set a list of availability zones denoting the IP allocated for the resource needs to come from.
     *
     * @param zones the zones value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

}
