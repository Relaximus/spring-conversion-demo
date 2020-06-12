package com.example.demo.config

import com.example.demo.converters.BookStatusConverter
import org.springframework.context.annotation.Configuration
import org.springframework.format.FormatterRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig implements WebMvcConfigurer {
    @Override
    void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new BookStatusConverter())
    }
}
