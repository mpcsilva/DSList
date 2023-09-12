package br.com.springboot.DSLista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * Spring Boot application starter class
 */

@SpringBootApplication
@EntityScan(basePackages = { "br.com.springboot.DSLista.entities" })
@ComponentScan(basePackages = { "br.*" })
@EnableJpaRepositories(basePackages = { "br.com.springboot.DSLista.repositories" })
@EnableTransactionManagement
@EnableWebMvc
@RestController
@EnableAutoConfiguration
@Configuration

public class DSListaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DSListaApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DSListaApplication.class);
	}
}