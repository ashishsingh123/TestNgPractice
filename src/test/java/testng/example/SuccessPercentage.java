package testng.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessPercentage {

    int count = 0;

    @Test(invocationCount = 30, successPercentage = 20)
    public void successRate() {
        System.out.println("repeat..." + (++count));
        if (count > 15) {
            Assert.fail("fail with count > 15");
        }
    }
}
