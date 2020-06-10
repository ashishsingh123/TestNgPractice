package testng.example;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class HardAssertionTest {
    @Test
    public void testCaseOne() {
        Assert.assertEquals(1,1);
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        Assert.assertEquals(1,2,"Not equals both values");
        Assert.assertTrue(true);

    }

    @Test
    public void testCaseTwo() {
        throw new SkipException("Skipped tcs");
    }
}
