package com.example.unittesting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void Email_isCorrect()
    {
        String testEmail = "email@gamil.com";
        Assert.assertTrue(CheckMethods.emailValid(testEmail));
    }
    @Test
    public void Password_isCorrect()
    {
        String testPassword = "Pass01@";
        Assert.assertTrue(CheckMethods.checkPassword(testPassword));
    }

}