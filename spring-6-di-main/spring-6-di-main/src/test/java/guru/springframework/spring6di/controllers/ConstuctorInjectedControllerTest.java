package guru.springframework.spring6di.controllers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ConstuctorInjectedControllerTest {

    @Autowired
    ConstuctorInjectedController constuctorInjectedController;

    @Test
    void sayHello() {
        System.out.println(constuctorInjectedController.sayHello());
    }
}