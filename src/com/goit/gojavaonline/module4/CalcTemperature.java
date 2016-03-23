package com.goit.gojavaonline.module4;


public class CalcTemperature {

    public static double tempCalcCel(Temperature name) {
        double resultC = (5 * (name.getTemp() - 32)) / 9;
        return resultC;
    }

    public static double tempCalcFar(Temperature name) {
        double resultF = (1.8 * name.getTemp() + 32);
        return resultF;
    }
}
