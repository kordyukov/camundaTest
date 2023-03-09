package com.example.workflow.service;

import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

import static org.apache.commons.lang3.StringUtils.EMPTY;

@Service
public class StartCamundaImpl implements StartCamunda {
    @Autowired
    private ProcessEngine processEngine;

    @Override
    public void start(String name) {
        processEngine.getRuntimeService()
                .startProcessInstanceByKey("camundaTest-process", EMPTY, Map.of("name", name));
    }
}
