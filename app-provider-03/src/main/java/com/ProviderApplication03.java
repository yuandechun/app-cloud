package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author spring.yuan
 * @version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class ProviderApplication03 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication03.class, args);
    }
}
