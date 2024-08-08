package hello.dockercomposecdpractice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${backend.test}")
    private String backendTest;

    @GetMapping
    public String hello() {
        System.out.println("backendTest: " + backendTest);
        return backendTest;
    }
}
