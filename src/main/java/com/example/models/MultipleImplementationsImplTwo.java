package com.example.models;

import org.springframework.stereotype.Component;

@Component
public class MultipleImplementationsImplTwo implements MultipleImplementations {
    @Override
    public String getName() {
        return this.getClass().getCanonicalName();
    }
}
