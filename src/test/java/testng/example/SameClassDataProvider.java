package testng.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameClassDataProvider {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] { { "data one","1" }, { "data two","2" } };
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String data,String a) {
        System.out.println("Data is: " + data+":"+a);
    }
}
