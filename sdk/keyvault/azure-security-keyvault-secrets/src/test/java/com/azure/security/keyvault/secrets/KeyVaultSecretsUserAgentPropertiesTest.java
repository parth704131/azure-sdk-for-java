// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.secrets;

import com.azure.core.util.CoreUtils;
import com.azure.core.util.UserAgentProperties;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeyVaultSecretsUserAgentPropertiesTest {

    @Test
    public void testAzureConfiguration() {
        UserAgentProperties properties = CoreUtils.getUserAgentProperties("azure-key-vault-secrets.properties");
        assertFalse(properties.getName().matches("UnknownName"));
        assertTrue(properties.getVersion().matches("(\\d)+.(\\d)+.(\\d)+([-a-zA-Z0-9.])*"));
    }
}