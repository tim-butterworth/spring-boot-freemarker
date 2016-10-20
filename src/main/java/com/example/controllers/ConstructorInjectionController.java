package com.example.controllers;

import com.example.components.SpringAnnotatedComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorInjectionController {

    private SpringAnnotatedComponent springAnnotatedComponent;

    @Autowired
    public ConstructorInjectionController(
            SpringAnnotatedComponent springAnnotatedComponent
    ) {
        this.springAnnotatedComponent = springAnnotatedComponent;
    }

    @RequestMapping(value = "/constructorspringinjectioncontroller")
    public String home() {
        return springAnnotatedComponent.getClass().getCanonicalName();
    }
}
