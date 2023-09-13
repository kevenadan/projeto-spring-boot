package br.com.vendasapplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@Bean(name = "applicationName")
	String applicationName() {
		return "Sistema de Vendas";
	}
}
