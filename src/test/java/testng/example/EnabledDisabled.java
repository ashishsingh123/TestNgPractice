package testng.example;

import org.testng.annotations.Test;

public class EnabledDisabled {

    @Test(enabled = true)
    public void testMethodOne() {
        System.out.println("Test method one.");
    }

    @Test(enabled = false)
    public void testMethodTwo() {
        System.out.println("Test method two.");
    }

    @Test
    public void atestMethodThree() {
        System.out.println("Test method three.");
    }
}
