package com.example.models;

import org.springframework.stereotype.Component;

@Component
public class MultipleImplementationsImplThree implements MultipleImplementations {
    @Override
    public String getName() {
        return this.getClass().getCanonicalName();
    }
}
