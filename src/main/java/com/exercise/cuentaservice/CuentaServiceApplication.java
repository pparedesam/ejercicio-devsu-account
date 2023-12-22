package com.exercise.cuentaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CuentaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CuentaServiceApplication.class, args);
    }

}
