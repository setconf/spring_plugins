package com.example.spring_plugins.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public final class CsvWriter implements WriterPlugin {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void write(String message) {
        log.info("writing CSV: {}", message);
    }

    @Override
    public boolean supports(String s) {
        return s.equalsIgnoreCase("csv");
    }
}
