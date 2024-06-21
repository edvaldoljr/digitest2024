package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RESTAPIClientServerTask {

    private final String apiUrl = "https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda";

    private RestTemplate restTemplate;

    @Autowired
    public RESTAPIClientServerTask(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void fetchAndPrintGenderCounts() {
        ResponseEntity<Employee[]> responseEntity = restTemplate.getForEntity(apiUrl, Employee[].class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            Employee[] employees = responseEntity.getBody();

            if (employees != null) {
                int maleCount = 0;
                int femaleCount = 0;

                for (Employee employee : employees) {
                    if ("M".equalsIgnoreCase(employee.getGender())) {
                        maleCount++;
                    } else if ("F".equalsIgnoreCase(employee.getGender())) {
                        femaleCount++;
                    }
                }

                System.out.println("Número de registros por gênero:");
                System.out.println("Masculino: " + maleCount);
                System.out.println("Feminino: " + femaleCount);
            } else {
                System.out.println("Resposta vazia da API.");
            }
        } else {
            System.out.println("Falha ao obter resposta da API. Status: " + responseEntity.getStatusCodeValue());
        }
    }

    // Classe de modelo para representar a estrutura dos dados da API
    private static class Employee {
        private Integer emp_no;
        private String first_name;
        private String last_name;
        private String gender;

        // Getters e Setters para os campos necessários
        public String getGender() {
            return gender;
        }
    }
}
