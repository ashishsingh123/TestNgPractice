package testng.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod()
    {
        return new Object[][] { { "data one","aaaa" }, { "data two","aaac" },{ "data three","aaaa" } };
    }

/*    @Test(dataProvider = "data-provider")
    public void testMethod(String data,String data1)
    {
        System.out.println("Data is: " + data+":"+data1);
    }*/
}
