package com.example.userapi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UserapiApplication {

	@Value("${management.metrics.export.datadog.api-key}")
    private String datadogApiKey;

	public static void main(String[] args) {
		SpringApplication.run(UserapiApplication.class, args);
	}

	@PostConstruct
    public void printApiKey() {
        System.out.println("DATADOG API KEY DETECTED: " + datadogApiKey);
    }

}
