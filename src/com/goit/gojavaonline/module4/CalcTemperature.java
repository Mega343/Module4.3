package com.goit.gojavaonline.module4;


public class CalcTemperature {

    public static void tempCalc(Temperature name){
        double resultC = (5 * (name.getTemp() - 32))/9;
        System.out.println(name.getTemp() + " градус(а) по Фаренгейту = " + resultC + " градус(а) по Цельсию");
        double resultF = (1.8* name.getTemp() + 32);
        System.out.println(name.getTemp() + " градус(а) по Цельсию = " + resultF + " градус(а) по Фаренгейту");

    }
}
