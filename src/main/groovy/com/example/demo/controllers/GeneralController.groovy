package com.example.demo.controllers

import com.example.demo.config.CustomPropertyEditorRegistrar
import com.example.demo.model.Book
import groovy.util.logging.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.web.bind.WebDataBinder
import org.springframework.web.bind.annotation.*

@Slf4j
@RestController
class GeneralController {

    private CustomPropertyEditorRegistrar customPropertyEditorRegistrar

    GeneralController(CustomPropertyEditorRegistrar customPropertyEditorRegistrar) {
        this.customPropertyEditorRegistrar = customPropertyEditorRegistrar
    }

    @InitBinder
    void initBinder(WebDataBinder binder) {
        customPropertyEditorRegistrar.registerCustomEditors(binder)
    }

    @PostMapping(value = "/book" )
    @ResponseStatus(HttpStatus.CREATED)
    def createBook(@ModelAttribute Book book) {
        log.info "Created book: $book"
    }

}
