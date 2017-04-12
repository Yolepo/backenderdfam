package org.yolpo.appfam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;

@SpringBootApplication
@IntegrationComponentScan
public class ErdhomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErdhomeApplication.class, args);
	}
}
