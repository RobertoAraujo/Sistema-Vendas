package com.poshyweb.venda;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendaAplication {

    @Value(value = "${application.name}")
    private String applicationName;

    @GetMapping("/hello")
    public String helloWold(){
        System.out.println("Teste de escrita no log ");
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendaAplication.class, args);
    }
}
