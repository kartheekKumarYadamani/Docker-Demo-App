package org.example.dockerdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDemoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoAppApplication.class, args);
        System.out.println("Hello Karthik ! Welcome to Belen ITS");
    }

}
