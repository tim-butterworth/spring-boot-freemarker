package com.example.controllers;

import com.example.components.BeanProvidedComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanConstructorInjectionController {

    private BeanProvidedComponent beanProvidedComponent;

    @Autowired
    public BeanConstructorInjectionController(
            BeanProvidedComponent beanProvidedComponent
    ) {
        this.beanProvidedComponent = beanProvidedComponent;
    }

    @RequestMapping("/beanconstructorinjectioncontroller")
    public String home() {
        return beanProvidedComponent.toString();
    }
}
