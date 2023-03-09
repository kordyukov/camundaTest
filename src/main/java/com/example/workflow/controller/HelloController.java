package com.example.workflow.controller;

import com.example.workflow.service.StartCamunda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final StartCamunda startCamunda;

    public HelloController(StartCamunda startCamunda) {
        this.startCamunda = startCamunda;
    }

    @GetMapping("/{name}")
    public void say(@PathVariable String name) {
        // Start process
        startCamunda.start(name);
    }
}
