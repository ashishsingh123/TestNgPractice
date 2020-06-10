package testng.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DataProviderTestFact
{
    private int param;

    @Factory(dataProvider = "dataMethod")
    public DataProviderTestFact(int param) {
        this.param = param;
    }

    @DataProvider
    public static Object[][] dataMethod() {
        return new Object[][] { { 0 }, { 1 } };
    }

    @Test
    public void testMethodOne() {
        int opValue = param + 1;
        System.out.println("Test method one output: " + opValue);
    }

    @Test
    public void testMethodTwo() {
        int opValue = param + 2;
        System.out.println("Test method two output: " + opValue);
    }
}