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
 * Base class for fabric specific details of container.
 */
public class ProtectionContainerFabricSpecificDetails {
    /**
     * Gets the class type. Overridden in derived classes.
     */
    @JsonProperty(value = "instanceType", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceType;

    /**
     * Get gets the class type. Overridden in derived classes.
     *
     * @return the instanceType value
     */
    public String instanceType() {
        return this.instanceType;
    }

}
