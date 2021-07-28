package ru.leroymerlin.qa.tests.junitTests;

import org.junit.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.*;

public class Test1 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class!");
    }

    @Before
    public void beforeTest(){
        System.out.println("Before Test!");
    }

    @ParameterizedTest
    @ValueSource(strings = {"string1", "string2"}) //MethodSourse
    public void parametrizedTest(String string){
        System.out.println("Parametrized Test1! Input param: " + string);
    }

    @Test
    public void simpleTest1(){
        System.out.println("Simple Test1!");
    }

    @Test
    public void simpleTest2(){
        System.out.println("Simple Test2!");
    }

    @After
    public void afterTest(){
        System.out.println("After Test!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class!");
    }
}
