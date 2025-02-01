package guru.springframework.spring6di.controllers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectedControllerTest {
    @Autowired
    SetterInjectedController setterInjectedController;

    @Test
    void setGreetingServices() {
        System.out.println(setterInjectedController.sayHello());
    }
}