package com.example.demo.config

import com.example.demo.converters.IntegerBookStatusConverter
import com.example.demo.converters.StringBookStatusConverter
import com.example.demo.formatters.IssuedDateFormatter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.format.FormatterRegistrar
import org.springframework.format.FormatterRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig implements WebMvcConfigurer {
    @Override
    void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringBookStatusConverter())
        registry.addConverter(new IntegerBookStatusConverter())
        bookDatesFormattersRegistrar().registerFormatters(registry)
    }

    @Bean
    BookDatesFormattersRegistrar bookDatesFormattersRegistrar() {
        new BookDatesFormattersRegistrar()
    }
}

class BookDatesFormattersRegistrar implements FormatterRegistrar {
    @Override
    void registerFormatters(FormatterRegistry registry) {
        registry.addFormatter(new IssuedDateFormatter())
    }
}

