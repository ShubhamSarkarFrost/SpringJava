package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
      setterInjectedController = new SetterInjectedController();
      setterInjectedController.setGreetingServices(new GreetingServicesImpl());
    }

    @Test
    void setGreetingServices() {
        setterInjectedController.sayHello();
    }
}