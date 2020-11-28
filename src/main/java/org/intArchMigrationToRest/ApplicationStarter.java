package org.intArchMigrationToRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = { "org.IntArchMigrationToRest.ManagePersonal" })
public class ApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStarter.class, args);

	}
}