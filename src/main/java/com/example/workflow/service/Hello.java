package com.example.workflow.service;

import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("Hello")
@RequiredArgsConstructor
public class Hello implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Hello in Camunda: " + delegateExecution.getVariable("name"));
    }
}
