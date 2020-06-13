package com.example.demo

import com.example.demo.model.BookStatus
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.core.convert.ConversionService

@Slf4j
@SpringBootApplication
class DemoApplication implements CommandLineRunner {

	@Autowired
	ConversionService conversionService

	static void main(String[] args) {
		SpringApplication.run(DemoApplication, args)
	}

	@Override
	void run(String... args) throws Exception {

		// Demonstrating that the conversion service could be used programmatically
		// even being configured in WebMvcConfigurer
		def status = conversionService.convert('forbidden', BookStatus)
		log.info "Runner... status after conversion: $status"
	}
}
