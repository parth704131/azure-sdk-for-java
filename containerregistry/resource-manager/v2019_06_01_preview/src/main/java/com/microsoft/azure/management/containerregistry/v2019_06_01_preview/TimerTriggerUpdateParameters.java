/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties for updating a timer trigger.
 */
public class TimerTriggerUpdateParameters {
    /**
     * The CRON expression for the task schedule.
     */
    @JsonProperty(value = "schedule")
    private String schedule;

    /**
     * The current status of trigger. Possible values include: 'Disabled',
     * 'Enabled'.
     */
    @JsonProperty(value = "status")
    private TriggerStatus status;

    /**
     * The name of the trigger.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the CRON expression for the task schedule.
     *
     * @return the schedule value
     */
    public String schedule() {
        return this.schedule;
    }

    /**
     * Set the CRON expression for the task schedule.
     *
     * @param schedule the schedule value to set
     * @return the TimerTriggerUpdateParameters object itself.
     */
    public TimerTriggerUpdateParameters withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the current status of trigger. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the status value
     */
    public TriggerStatus status() {
        return this.status;
    }

    /**
     * Set the current status of trigger. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param status the status value to set
     * @return the TimerTriggerUpdateParameters object itself.
     */
    public TimerTriggerUpdateParameters withStatus(TriggerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the name of the trigger.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the trigger.
     *
     * @param name the name value to set
     * @return the TimerTriggerUpdateParameters object itself.
     */
    public TimerTriggerUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

}
