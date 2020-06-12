package com.example.demo.converters

import com.example.demo.model.BookStatus
import groovy.util.logging.Slf4j
import org.springframework.core.convert.converter.Converter

@Slf4j
class BookStatusConverter implements Converter<String, BookStatus> {
    @Override
    BookStatus convert(String source) {
        log.info "Converting $source"
        BookStatus.valueOf(source.toUpperCase())
    }
}
