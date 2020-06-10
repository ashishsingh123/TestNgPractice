package testng.example;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionMessage {

    @Test(expectedExceptions = { IOException.class })
    public void exceptionTestOne() throws Exception {
        throw new IOException();
    }

    @Test(expectedExceptions = { IOException.class, NullPointerException.class })
    public void exceptionTestTwo() throws Exception {
        throw new Exception();
    }

    @Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass Message test")
    public void exceptionTestOne1() throws Exception {
        throw new IOException("Pass Message test");
    }

    @Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = ".* Message .*")
    public void exceptionTestTwo2() throws Exception {
        throw new IOException("Pass Message test");
    }

    @Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass Message test")
    public void exceptionTestThree() throws Exception {
        throw new IOException("Fail Message test");
    }
}
