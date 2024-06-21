package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // Inicializa a aplicação Spring Boot
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        // Obtém uma instância de RESTAPIClientServerTask do contexto Spring
        RESTAPIClientServerTask client = context.getBean(RESTAPIClientServerTask.class);

        // Chama o método para buscar e imprimir os registros por gênero
        client.fetchAndPrintGenderCounts();

    }
}
