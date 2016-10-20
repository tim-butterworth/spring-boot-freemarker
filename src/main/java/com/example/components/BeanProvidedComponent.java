package com.example.components;

public class BeanProvidedComponent {
    private BeanProvidedSubComponent beanProvidedSubComponent;

    public BeanProvidedComponent(BeanProvidedSubComponent beanProvidedSubComponent) {
        this.beanProvidedSubComponent = beanProvidedSubComponent;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " -> " + beanProvidedSubComponent.getClass().getCanonicalName();
    }
}
