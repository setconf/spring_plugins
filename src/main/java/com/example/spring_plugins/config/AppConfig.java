package com.example.spring_plugins.config;

import com.example.spring_plugins.writer.WriterPlugin;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.plugin.core.PluginRegistry;

@Configuration
public class AppConfig {
    @Bean
    ApplicationRunner runner(PluginRegistry<WriterPlugin, String> plugins) {
        return args -> {
            for (String format : "csv,txt,pdf".split(","))
                plugins.getPluginFor(format).ifPresent(p -> p.write("Hello, Sprint plugin!"));
        };
    }
}
