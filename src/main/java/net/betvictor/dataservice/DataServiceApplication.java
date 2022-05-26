package net.betvictor.dataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
public class DataServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DataServiceApplication.class);
	}
}
