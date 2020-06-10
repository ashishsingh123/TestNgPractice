package testng.example;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippedTestcases {

    @Test
    public void testCaseOne() {
        throw new SkipException("Skipped tcs");
    }
}
