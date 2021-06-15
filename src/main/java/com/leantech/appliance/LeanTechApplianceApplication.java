package com.leantech.appliance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan
@EnableJpaRepositories(basePackages = "com.leantech.appliance.repositories")
@SpringBootApplication
public class LeanTechApplianceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeanTechApplianceApplication.class, args);
	}

}
