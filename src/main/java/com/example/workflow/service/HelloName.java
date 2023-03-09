package com.example.workflow.service;

import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("HelloName")
@RequiredArgsConstructor
public class HelloName implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        var name = delegateExecution.getVariable("name");
        System.out.println(name + "!!!");
    }
}
