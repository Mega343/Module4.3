package com.goit.gojavaonline.module4.test;

import com.goit.gojavaonline.module4.CalcTemperature;
import com.goit.gojavaonline.module4.Temperature;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalcTemperatureTest {

   private static CalcTemperature calc;

    @BeforeClass
    public static void setUp() throws Exception {

        calc = new CalcTemperature();
    }

    @Test (timeout = 1000)
    public void testTempCalcCel() throws Exception {
        final  double t = 55;
        Temperature temperature = new Temperature(t);
        final double result = calc.tempCalcCel(temperature);

        Assert.assertEquals(((5 * (t- 32)) / 9), result);
    }

    @Test (timeout = 1000)
    public void testTempCalcFar() throws Exception {
        final  double t = 70;
        Temperature temperature = new Temperature(t);
        final double result = calc.tempCalcFar(temperature);

        Assert.assertEquals((1.8 * t + 32), result);
    }
}