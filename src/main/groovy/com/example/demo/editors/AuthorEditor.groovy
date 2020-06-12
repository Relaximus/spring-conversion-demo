package com.example.demo.editors

import com.example.demo.model.Author
import groovy.util.logging.Slf4j

import java.beans.PropertyEditorSupport

@Slf4j
class AuthorEditor extends PropertyEditorSupport {
    @Override
    void setAsText(String text) throws IllegalArgumentException {
        log.info "Creating author from $text"
        setValue(new Author(name: text))
    }
}
