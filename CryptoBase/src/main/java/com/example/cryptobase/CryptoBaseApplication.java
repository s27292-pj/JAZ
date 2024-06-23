package com.example.cryptobase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients
public class CryptoBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(CryptoBaseApplication.class, args);
    }



}
