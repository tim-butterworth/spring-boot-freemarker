package com.example;

import com.example.components.BeanProvidedComponent;
import com.example.components.BeanProvidedSubComponent;
import com.example.models.DataObject;
import com.example.models.ObjectContainer;
import com.example.models.ObjectContainerImplOne;
import com.example.models.ObjectContainerImplTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public BeanProvidedComponent beanProvidedComponent(BeanProvidedSubComponent beanProvidedSubComponent) {
        return new BeanProvidedComponent(beanProvidedSubComponent);
    }

    @Bean
    public BeanProvidedSubComponent beanProvidedSubComponent() {
        return new BeanProvidedSubComponent();
    }

    // These beans can to be injected with @Qualify("name") where name is the @Bean name property
    @Bean(name = "namedBeanOne")
    public ObjectContainer getContainerThree(final DataObject dataObject) {
        return new ObjectContainerImplOne(dataObject);
    }

    @Bean(name = "namedBeanTwo")
    public ObjectContainer getContainerFour() {
        return new ObjectContainerImplTwo(getDataObject());
    }

    // These beans have to be injected with the @Qualify("name") annotation where the name is the method name
    @Bean
    public ObjectContainer getContainerOne(final DataObject dataObject) {
        return new ObjectContainerImplOne(dataObject);
    }

    @Bean
    public ObjectContainer getContainerTwo() {
        return new ObjectContainerImplTwo(getDataObject());
    }

    @Bean
    public DataObject getDataObject() {
        return new DataObject();
    }
}
