package com.example.demo.formatters

import groovy.util.logging.Slf4j
import org.springframework.format.Formatter

import java.text.ParseException

@Slf4j
class IssuedDateFormatter implements Formatter<Date> {
    @Override
    Date parse(String text, Locale locale) throws ParseException {
        log.info "Parsing date from $text"
        new Date(text.toLong())
    }

    @Override
    String print(Date dt, Locale locale) {
        log.info "printing date from $dt"
        dt.time.toString()
    }
}
