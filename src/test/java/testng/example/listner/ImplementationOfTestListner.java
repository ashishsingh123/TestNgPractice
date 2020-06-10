package testng.example.listner;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testng.example.listner.TestListner.class)
public class ImplementationOfTestListner {

    @Test
    public void testOne() {
        throw new ArithmeticException();
    }

    @Test
    public void testTwo() {
        System.out.println("Two");
    }

    @Test
    public void testThree() {
        throw new SkipException("Skipped tcs");
    }
}
