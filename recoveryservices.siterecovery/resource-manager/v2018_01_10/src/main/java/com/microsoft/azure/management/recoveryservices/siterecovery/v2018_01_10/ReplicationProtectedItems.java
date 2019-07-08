/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.ReplicationProtectedItemsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationProtectedItems.
 */
public interface ReplicationProtectedItems extends SupportsCreating<ReplicationProtectedItem.DefinitionStages.Blank>, HasInner<ReplicationProtectedItemsInner> {
    /**
     * Change or apply recovery point.
     * The operation to change the recovery point of a failed over replication protected item.
     *
     * @param fabricName The ARM fabric name.
     * @param protectionContainerName The protection container name.
     * @param replicatedProtectedItemName The replicated protected item's name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> applyRecoveryPointAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName);

    /**
     * Execute commit failover.
     * Operation to commit the failover of the replication protected item.
     *
     * @param fabricName Unique fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> failoverCommitAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName);

    /**
     * Execute planned failover.
     * Operation to initiate a planned failover of the replication protected item.
     *
     * @param fabricName Unique fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> plannedFailoverAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName);

    /**
     * Disables protection.
     * The operation to disable replication on a replication protected item. This will also remove the item.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName);

    /**
     * Resynchronize or repair replication.
     * The operation to start resynchronize/repair replication for a replication protected item requiring resynchronization.
     *
     * @param fabricName The name of the fabric.
     * @param protectionContainerName The name of the container.
     * @param replicatedProtectedItemName The name of the replication protected item.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> repairReplicationAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName);

    /**
     * Execute Reverse Replication\Reprotect.
     * Operation to reprotect or reverse replicate a failed over replication protected item.
     *
     * @param fabricName Unique fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> reprotectAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName);

    /**
     * Execute test failover.
     * Operation to perform a test failover of the replication protected item.
     *
     * @param fabricName Unique fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> testFailoverAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName);

    /**
     * Execute test failover cleanup.
     * Operation to clean up the test failover of a replication protected item.
     *
     * @param fabricName Unique fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @param properties Test failover cleanup input properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> testFailoverCleanupAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName, TestFailoverCleanupInputProperties properties);

    /**
     * Execute unplanned failover.
     * Operation to initiate a failover of the replication protected item.
     *
     * @param fabricName Unique fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> unplannedFailoverAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName);

    /**
     * Update the mobility service on a protected item.
     * The operation to update(push update) the installed mobility service software on a replication protected item to the latest available version.
     *
     * @param fabricName The name of the fabric containing the protected item.
     * @param protectionContainerName The name of the container containing the protected item.
     * @param replicationProtectedItemName The name of the protected item on which the agent is to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> updateMobilityServiceAsync(String fabricName, String protectionContainerName, String replicationProtectedItemName);

    /**
     * Gets the list of replication protected items.
     * Gets the list of ASR replication protected items in the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> listAsync();

    /**
     * Gets the details of a Replication protected item.
     * Gets the details of an ASR replication protected item.
     *
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> getAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName);

    /**
     * Gets the list of Replication protected items.
     * Gets the list of ASR replication protected items in the protection container.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationProtectedItem> listByReplicationProtectionContainersAsync(final String fabricName, final String protectionContainerName);

    /**
     * Purges protection.
     * The operation to delete or purge a replication protected item. This operation will force delete the replication protected item. Use the remove operation on replication protected item to perform a clean disable replication for the item.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable purgeAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName);

}
