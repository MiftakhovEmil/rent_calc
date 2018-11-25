package main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class rent
{
    public static void main(String[] args) {
    	 
        // тарифы
        double heating = 0;
        double water_hot = 0;
        double water_cold = 0;
        double electricity = 0;
        double gas = 0;
    	
        // объемы
        double V_heating = 0;
        double V_water_hot = 0;
        double V_water_cold = 0;
        double V_electricity = 0;
        double V_gas = 0;
        
        Scanner inpt = new Scanner(System.in); // класс для ввода информации
        inpt.useLocale(Locale.ENGLISH); // ввод точки вместо запятой для вещественных чисел
         
        try
        {
        	//Ввод тарифов
        	System.out.println("Введите тарифы:");       	
        	System.out.print("1. Отопление:");
        	heating = inpt.nextDouble();
        	System.out.print("2. Горячая вода:");
        	water_hot = inpt.nextDouble();
        	System.out.print("3. Холодная вода:");
        	water_cold = inpt.nextDouble();
        	System.out.print("4. Газ:");
        	gas = inpt.nextDouble();
        	System.out.print("5. Электричество:");
        	electricity = inpt.nextDouble();
        	
        	//Ввод объемов
        	System.out.println("Введите объемы потребления:");       	
        	System.out.print("1. Отопление:");
        	V_heating = inpt.nextDouble();
        	System.out.print("2. Горячая вода:");
        	V_water_hot = inpt.nextDouble();
        	System.out.print("3. Холодная вода:");
        	V_water_cold = inpt.nextDouble();
        	System.out.print("4. Газ:");
        	V_gas = inpt.nextDouble();
        	System.out.print("5. Электричество:");
        	V_electricity = inpt.nextDouble();

        }
        catch(InputMismatchException e) //Если ошибка при вводе
        {
        	System.out.println("Error");
        	
        	inpt.close();
        	return;
        }
        
        rentCalc ob = new rentCalc(gas, heating, water_hot, water_cold, electricity, V_gas, V_heating, V_water_hot, V_water_cold, V_electricity);
        
        // печать суммы к оплате
         	System.out.println("1. Отопление:" + ob.total_houseHeating + " руб.");
         	System.out.println("2. Горячая вода:" + ob.total_hotWater + " руб.");
         	System.out.println("3. Холодная вода:" + ob.total_coldWater + " руб.");
         	System.out.println("4. Газ:" + ob.total_houseGas + " руб.");
         	System.out.println("5. Электричество:" + ob.total_houseElectricity + " руб.");
         	System.out.println("Общая сумма:" + ob.total_sum + " руб.");
        inpt.close();
    }
}