package com.darrenforsythe.azurestarterymlpropertiesissue;

import com.microsoft.azure.spring.autoconfigure.aad.ServiceEndpoints;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AzureStarterYmlPropertiesIssueApplicationTests {

    @Autowired
    private Environment environment;

    @Test
    public void contextLoadsPropertiesAreNotOverriden() {
        assertThat(environment.getProperty("azure.service.endpoints.global.aad-membership-rest-uri")).isEqualTo("https://test/");
        assertThat(environment.getProperty("azure.service.endpoints.global.aad-key-discovery-uri")).isEqualTo("https://test/");
        assertThat(environment.getProperty("azure.service.endpoints.global.aad-signin-uri")).isEqualTo("https://test/");
        assertThat(environment.getProperty("azure.service.endpoints.global.aad-membership-rest-uri")).isEqualTo("https://test/");

    }

}

