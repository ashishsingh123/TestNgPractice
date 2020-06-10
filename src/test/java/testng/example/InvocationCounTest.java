package testng.example;

import org.testng.annotations.Test;

public class InvocationCounTest {

    @Test(invocationCount = 5)
    public void testMethod() {
        System.out.println("Hi");
    }

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void testTwo() {
        System.out.println("Hello");
    }
}
