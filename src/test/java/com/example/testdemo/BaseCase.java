package com.example.testdemo;

import javafx.application.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest(classes = Application.class)
public abstract class BaseCase extends AbstractTestNGSpringContextTests {

}
