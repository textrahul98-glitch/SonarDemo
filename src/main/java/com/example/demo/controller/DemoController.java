
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/demo")
@Slf4j
public class DemoController {

    // Positive scenario: Save data successfully
    @PostMapping("/save")
    public String saveData() {

        log.info("Save API called successfully");
        log.info("Data saved successfully");

        return "Data save successfully";
    }

    // Positive scenario: Retrieve data successfully
    @GetMapping("/get")
    public String getData() {

        log.info("Get API called successfully");
        log.info("Data retrieved successfully");

        return "Data retrieve successfully";
    }

    // Negative scenario: Generate an error log
    @GetMapping("/error")
    public String errorData() {

        log.error("ERROR: Something went wrong while processing the request");

        return "Error log generated. Check Grafana";
    }

    // Negative scenario: Throw an exception
    @GetMapping("/exception")
    public String exceptionData() {

        log.error("Exception occurred in exception API");

        throw new RuntimeException("Demo exception for Grafana monitoring");
    }
}
