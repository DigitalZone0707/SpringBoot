package com.project.digitalzone.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GetStarted")
@Tag(name="GetStarted", description = "GetStarted Page")
public class GetStarted {

    @GetMapping("/")
    @Operation(description = "It is GetStarted Page Call")
    public ResponseEntity<Object> getStarted() {
        return ResponseEntity.status(HttpStatus.OK).body("To get started with Spring Boot, you can use the Spring Initializr to create a new project. The Spring Initializr will generate a project that includes all of the dependencies that you need to get started with Spring Boot.");
    }

}
