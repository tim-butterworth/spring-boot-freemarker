package com.example;

import com.example.controllers.ConstructorInjectionController;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CheckoutAnnotations {

    public static void main(String[] args) {
        Method[] declaredMethods = ConstructorInjectionController.class.getDeclaredMethods();

        Arrays.asList(declaredMethods).stream().forEach(method -> {
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            Arrays.asList(declaredAnnotations).forEach(annotation -> System.out.println(annotation.annotationType()));
        });

    }
}
