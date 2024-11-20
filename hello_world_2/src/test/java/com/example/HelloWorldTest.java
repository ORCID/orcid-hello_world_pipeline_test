package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorldTest {

    @Test
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, World!", helloWorld.sayHello());
    }

    @Test
    public void testFailingAssertion() {
        // This assertion will fail
        assertTrue(false, "This is a failing test to test the pipeline.");
    }

    @Test
    public void testFailingAssertionMore() {
        // This assertion will fail
        assertTrue(false, "This is also failing test to test the pipeline.");
    }


}
