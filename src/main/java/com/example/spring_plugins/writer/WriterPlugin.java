package com.example.spring_plugins.writer;

import org.springframework.plugin.core.Plugin;

public sealed interface WriterPlugin extends Plugin<String> permits CsvWriter, PdfWriter, TxtWriter {
    void write(String message);
}
