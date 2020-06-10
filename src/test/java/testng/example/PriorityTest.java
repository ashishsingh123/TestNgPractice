package testng.example;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority =0)
    public void atestMethodOne() {
        System.out.println("Priority 0");
    }

    @Test(priority =1)
    public void testMethodOne1() {
        System.out.println("Priority 1");
    }

    @Test(priority =2)
    public void testMethodOne2() {
        System.out.println("Priority 2");
    }

    @Test(priority =-2)
    public void testMethodNegative() {
        System.out.println("Priority -2");
    }

    @Test(priority =-4)
    public void testMethodNegative1() {
        System.out.println("Priority -4");
    }

    @Test
    public void testMethod() {
        System.out.println("No Priority");
    }
}
