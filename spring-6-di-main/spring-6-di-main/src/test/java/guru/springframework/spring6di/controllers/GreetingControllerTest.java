package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingControllerTest {

    @Test
    void sayHello() {
        GreetingController greetingController = new GreetingController();
        greetingController.sayHello();
    }
}