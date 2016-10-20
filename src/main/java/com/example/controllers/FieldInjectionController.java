package com.example.controllers;

import com.example.components.SpringAnnotatedComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FieldInjectionController {

    @Autowired
    private SpringAnnotatedComponent springAnnotatedComponent;

    @RequestMapping("/fieldinjectioncontroller")
    public String home() {
        return springAnnotatedComponent.getClass().getName();
    }
}
