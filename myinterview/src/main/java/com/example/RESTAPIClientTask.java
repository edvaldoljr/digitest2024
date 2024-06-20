package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client_tasks")
public class RESTAPIClientTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nome", nullable = false)
    private String name;
    private String email;
    private String phone;
    // API endpoint => https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda 
}