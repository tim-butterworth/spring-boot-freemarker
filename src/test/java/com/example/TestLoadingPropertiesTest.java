package com.example;

import org.junit.Before;
import org.junit.Test;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.support.ResourcePropertySource;

import java.util.Map;

public class TestLoadingPropertiesTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void name() throws Exception {
        Map<String, String> getenv = System.getenv();
        StandardEnvironment environment = new StandardEnvironment();
        String[] activeProfiles = environment.getActiveProfiles();

        environment.getPropertySources().addLast(new ResourcePropertySource("/application-another.properties"));
        PropertiesPropertySource propertiesPropertySource = new ResourcePropertySource("/application.properties");

        String someproperty = environment.getProperty("some.property");
        String placehoder = environment.resolvePlaceholders("${some.property}");
        String somevalue = environment.getProperty("some.value");
        String placeholdrevalue = environment.getProperty("${some.value}");
    }
}
