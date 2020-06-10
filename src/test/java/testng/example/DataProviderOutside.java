package testng.example;

import org.testng.annotations.Test;

public class DataProviderOutside {

    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testMethod(String data)
    {
        System.out.println("Data is: " + data);
    }
}
