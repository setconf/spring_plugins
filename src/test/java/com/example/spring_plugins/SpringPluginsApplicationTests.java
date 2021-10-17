package com.example.spring_plugins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
record SpringPluginsApplicationTests(ApplicationContext applicationContext) {

    @Test
    void contextLoads() {
        assertThat(applicationContext).isNotNull();
    }
}
