package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface RESTAPIRespositoryTask extends JpaRepository<Repository, Integer> {
}
