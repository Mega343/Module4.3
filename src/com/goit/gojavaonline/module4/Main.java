package com.goit.gojavaonline.module4;


public class Main {

    public static void main(String[] args) {

        Temperature temp = new Temperature(50);
        CalcTemperature calcTemperature = new CalcTemperature();
        calcTemperature.tempCalc(temp);
    }
}
