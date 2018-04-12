package com.tcf.hackathon.application.cucumber.stepdefs;

import com.tcf.hackathon.application.TcfblockchainApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TcfblockchainApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
