/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.NetworkMappingInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.RecoveryServicesManager;

/**
 * Type representing NetworkMapping.
 */
public interface NetworkMapping extends HasInner<NetworkMappingInner>, Indexable, Refreshable<NetworkMapping>, Updatable<NetworkMapping.Update>, HasManager<RecoveryServicesManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    NetworkMappingProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the NetworkMapping definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithReplicationNetwork, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NetworkMapping definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NetworkMapping definition.
         */
        interface Blank extends WithReplicationNetwork {
        }

        /**
         * The stage of the networkmapping definition allowing to specify ReplicationNetwork.
         */
        interface WithReplicationNetwork {
           /**
            * Specifies fabricName, networkName.
            * @param fabricName Primary fabric name
            * @param networkName Primary network name
            * @return the next definition stage
            */
            WithProperties withExistingReplicationNetwork(String fabricName, String networkName);
        }

        /**
         * The stage of the networkmapping definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Input properties for creating network mapping
            * @return the next definition stage
            */
            WithCreate withProperties(CreateNetworkMappingInputProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NetworkMapping> {
        }
    }
    /**
     * The template for a NetworkMapping update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NetworkMapping>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of NetworkMapping update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the networkmapping update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties The input properties needed to update network mapping
             * @return the next update stage
             */
            Update withProperties(UpdateNetworkMappingInputProperties properties);
        }

    }
}
