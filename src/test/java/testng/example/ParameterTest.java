package testng.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Parameters({"browser","OS"})
    @Test
    public void prameterTestOne(String param,String os) {
        System.out.println("Test one suite param is: " + param+":"+os);

    }
}
