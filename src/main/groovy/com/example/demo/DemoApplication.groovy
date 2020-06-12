package com.example.demo


import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@Slf4j
@SpringBootApplication
class DemoApplication {

	static void main(String[] args) {
		SpringApplication.run(DemoApplication, args)
	}
}
