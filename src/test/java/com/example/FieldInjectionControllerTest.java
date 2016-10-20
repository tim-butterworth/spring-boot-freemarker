package com.example;

import com.example.components.SpringAnnotatedComponent;
import com.example.controllers.FieldInjectionController;
import com.example.models.ObjectContainer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class FieldInjectionControllerTest {

    @InjectMocks
    private FieldInjectionController fieldInjectionController;

    @Mock
    private SpringAnnotatedComponent objectContainer;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void injectionStyle() throws Exception {
        System.out.println(fieldInjectionController.home());
    }

    @Test
    public void instantiationStyle() throws Exception {
        FieldInjectionController fieldInjectionController = new FieldInjectionController();

        System.out.println(fieldInjectionController.home());
    }

}