package com.example.calculatorapplab03;

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
    public void Test01GetAddition(){
        String oldNumber = "3";
        String newNumber = "2";

        double actualResult = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
        double expectedResult = 5.0;
        Assert.assertEquals(expectedResult, actualResult,0.0001);
    }
    @Test
    public void Test02GetSubtraction(){
        String oldNumber = "3";
        String newNumber = "2";

        double actualResult = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
        double expectedResult = 1.0;
        Assert.assertEquals(expectedResult, actualResult,0.0001);
    }
    @Test
    public void Test03GetDivision(){
        String oldNumber = "3";
        String newNumber = "2";

        double actualResult = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
        double expectedResult = 1.5;
        Assert.assertEquals(expectedResult, actualResult,0.0001);
    }
    @Test
    public void Test04GetMultiplication(){
        String oldNumber = "3";
        String newNumber = "2";

        double actualResult = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
        double expectedResult = 6.0;
        Assert.assertEquals(expectedResult, actualResult,0.0001);
    }
    @Test
    public void Test05GetSquareRoot1(){
        String oldNumber = "5";

        double actualResult = Math.sqrt(Double.parseDouble(oldNumber));
        double expectedResult = 2.236;
        Assert.assertEquals(expectedResult, actualResult,0.0001);
    }
    @Test
    public void Test06GetSquareRoot2(){
        String oldNumber = "49";

        double actualResult = Math.sqrt(Double.parseDouble(oldNumber));
        double expectedResult = 7.0;
        Assert.assertEquals(expectedResult, actualResult,0.0001);
    }
}