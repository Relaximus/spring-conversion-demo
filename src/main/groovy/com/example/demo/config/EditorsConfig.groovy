package com.example.demo.config

import com.example.demo.editors.AuthorEditor
import com.example.demo.model.Author
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.beans.PropertyEditorRegistrar
import org.springframework.beans.PropertyEditorRegistry
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Slf4j
@Configuration
class EditorsConfig {

    @Bean
    CustomPropertyEditorRegistrar configurer() {
        new CustomPropertyEditorRegistrar()
    }

}

@CompileStatic
class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {
    @Override
    void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Author, new AuthorEditor())
    }
}
