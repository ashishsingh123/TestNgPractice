package testng.example;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {

    @Test
    public void testCaseOne() {
        try {
            SoftAssert softAssert = new SoftAssert();
            System.out.println("*** test case One started ***");
            softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
            System.out.println("hard assert success....");
            softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
            softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed");
            System.out.println("*** test case two executed successfully ***");
            softAssert.assertEquals(1, 2);
            softAssert.assertNotEquals(2, 2);
            softAssert.assertAll();
        }catch(Exception e){}
    }

}
