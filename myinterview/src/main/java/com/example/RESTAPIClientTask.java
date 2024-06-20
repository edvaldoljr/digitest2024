package com.example;

import jakarta.persistence.*;

/**
 * This task expects you to create an implementation of a Rest API client.
 * Your code should call the API endpoint related below.
 * After receiving the JSON Response, print out how many records exists for each gender
 * API endpoint => https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda
 *
 * >>> Bonus <<<
 * Generate a CSV file containing many records exists for each gender and save this file to AWS S3 Bucket
 * The filename need to contains your entire name, separated by uderscore. Example: john_lennon.csv
 * AWS S3 bucket name => interview-digiage
 * The credentials you can find in Coodesh platform or ask via e-mail for recrutamento@digiage.com.br
 */


@Entity
@Table(name = "cliente")
public class RESTAPIClientTask {
    // API endpoint => https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empNo;  // Identificador único do empregado
    @Column(name = "nome", nullable = false)
    private String firstName;  // Nome do empregado
    private String lastName;  // Sobrenome do empregado
    private String gender;  // Gênero do empregado

    // Getters e setters
    public Long getEmpNo() {
        return empNo;
    }
    public void setEmpNo(Long empNo) {
        this.empNo = empNo;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}