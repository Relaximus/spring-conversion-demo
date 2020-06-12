package com.example.demo.editors

import com.example.demo.model.Author

import java.beans.PropertyEditorSupport

class AuthorEditor extends PropertyEditorSupport {
    @Override
    void setAsText(String text) throws IllegalArgumentException {
        setValue(new Author(name: text))
    }
}
