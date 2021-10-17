package com.example.spring_plugins;

import com.example.spring_plugins.writer.WriterPlugin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.plugin.core.config.EnablePluginRegistries;

@SpringBootApplication
@EnablePluginRegistries(WriterPlugin.class)
public class SpringPluginsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPluginsApplication.class, args);
    }
}

