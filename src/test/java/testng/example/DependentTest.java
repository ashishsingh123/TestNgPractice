package testng.example;

import org.testng.annotations.Test;

public class DependentTest {

    @Test(dependsOnMethods = { "testTwo", "testThree" })
    public void testOne() {
        System.out.println("Test method one");
    }

    @Test
    public void testTwo() {
        System.out.println("Test method two");
    }

    @Test
    public void testThree() {
        throw new ArithmeticException();
    }


    @Test
    public void testFour() {
        System.out.println("Test four method in Inherited test");
    }


    @Test(dependsOnMethods = { "testFour" })
    public void testFive() {
        System.out.println("Test five method in Inherited test");
    }
}
