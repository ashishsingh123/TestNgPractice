package testng.example;

import org.testng.annotations.Test;

public class AlwaysRunTest {

    @Test
    public void testOne() {
        throw new ArithmeticException();
    }

    @Test(dependsOnMethods = "testOne",alwaysRun = true)
    public void testTwo() {
        System.out.println("Two");
    }
}
