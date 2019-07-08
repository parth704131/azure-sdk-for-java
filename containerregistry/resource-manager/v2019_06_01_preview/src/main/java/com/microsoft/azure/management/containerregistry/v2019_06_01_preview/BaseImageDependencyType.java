/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BaseImageDependencyType.
 */
public final class BaseImageDependencyType extends ExpandableStringEnum<BaseImageDependencyType> {
    /** Static value BuildTime for BaseImageDependencyType. */
    public static final BaseImageDependencyType BUILD_TIME = fromString("BuildTime");

    /** Static value RunTime for BaseImageDependencyType. */
    public static final BaseImageDependencyType RUN_TIME = fromString("RunTime");

    /**
     * Creates or finds a BaseImageDependencyType from its string representation.
     * @param name a name to look for
     * @return the corresponding BaseImageDependencyType
     */
    @JsonCreator
    public static BaseImageDependencyType fromString(String name) {
        return fromString(name, BaseImageDependencyType.class);
    }

    /**
     * @return known BaseImageDependencyType values
     */
    public static Collection<BaseImageDependencyType> values() {
        return values(BaseImageDependencyType.class);
    }
}
