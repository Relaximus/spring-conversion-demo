package com.example.demo.converters

import com.example.demo.model.BookStatus
import groovy.util.logging.Slf4j
import org.springframework.core.convert.converter.Converter

@Slf4j
class IntegerBookStatusConverter implements Converter<Integer, BookStatus> {
    @Override
    BookStatus convert(Integer source) {
        log.info "Converting $source"
        BookStatus.values().find {it.ordinal() == source}
    }
}
