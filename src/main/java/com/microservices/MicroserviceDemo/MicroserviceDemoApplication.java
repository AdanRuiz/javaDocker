package com.microservices.MicroserviceDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class MicroserviceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoApplication.class, args);
	}

	@GetMapping("/function")
    public String function(){
        return "Hello World";
    }

}
