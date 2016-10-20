package com.example.controllers;

import com.example.models.MultipleImplementations;
import com.example.models.ObjectContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StuntController {

    private List<MultipleImplementations> multipleImplementationsList;
    private final ObjectContainer objectContainerOne;
    private final ObjectContainer objectContainerTwo;
    private final ObjectContainer objectContainerThree;
    private final ObjectContainer objectContainerFour;

    @Autowired
    public StuntController(
            List<MultipleImplementations> multipleImplementationsList,
            @Qualifier("getContainerOne") ObjectContainer objectContainerOne,
            @Qualifier("getContainerTwo") ObjectContainer objectContainerTwo,
            @Qualifier("namedBeanOne") ObjectContainer objectContainerThree,
            @Qualifier("namedBeanTwo") ObjectContainer objectContainerFour
    ) {
        this.multipleImplementationsList = multipleImplementationsList;
        this.objectContainerOne = objectContainerOne;
        this.objectContainerTwo = objectContainerTwo;
        this.objectContainerThree = objectContainerThree;
        this.objectContainerFour = objectContainerFour;
    }

    @RequestMapping("/stuntcontroller/multiinject")
    public String stuntControllerMultiInject() {
        String names = multipleImplementationsList.stream()
                .map(MultipleImplementations::getName)
                .collect(Collectors.joining("|"));

        return "Total implementations: " +
                multipleImplementationsList.size() +
                names;
    }

    @RequestMapping("/stuntcontroller/qualifiedinject")
    public String stuntControllerQualifiedInject() {
        return objectContainerOne + "|" +
                objectContainerTwo + "|" +
                objectContainerThree + "|" +
                objectContainerFour + "|";
    }
}
