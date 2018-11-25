package main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class rent
{
    public static void main(String[] args) {
    	 
        // ������
        double heating = 0;
        double water_hot = 0;
        double water_cold = 0;
        double electricity = 0;
        double gas = 0;
    	
        // ������
        double V_heating = 0;
        double V_water_hot = 0;
        double V_water_cold = 0;
        double V_electricity = 0;
        double V_gas = 0;
        
        Scanner inpt = new Scanner(System.in); // ����� ��� ����� ����������
        inpt.useLocale(Locale.ENGLISH); // ���� ����� ������ ������� ��� ������������ �����
         
        try
        {
        	//���� �������
        	System.out.println("������� ������:");       	
        	System.out.print("1. ���������:");
        	heating = inpt.nextDouble();
        	System.out.print("2. ������� ����:");
        	water_hot = inpt.nextDouble();
        	System.out.print("3. �������� ����:");
        	water_cold = inpt.nextDouble();
        	System.out.print("4. ���:");
        	gas = inpt.nextDouble();
        	System.out.print("5. �������������:");
        	electricity = inpt.nextDouble();
        	
        	//���� �������
        	System.out.println("������� ������ �����������:");       	
        	System.out.print("1. ���������:");
        	V_heating = inpt.nextDouble();
        	System.out.print("2. ������� ����:");
        	V_water_hot = inpt.nextDouble();
        	System.out.print("3. �������� ����:");
        	V_water_cold = inpt.nextDouble();
        	System.out.print("4. ���:");
        	V_gas = inpt.nextDouble();
        	System.out.print("5. �������������:");
        	V_electricity = inpt.nextDouble();

        }
        catch(InputMismatchException e) //���� ������ ��� �����
        {
        	System.out.println("Error");
        	
        	inpt.close();
        	return;
        }
        
        rentCalc ob = new rentCalc(gas, heating, water_hot, water_cold, electricity, V_gas, V_heating, V_water_hot, V_water_cold, V_electricity);
        
        // ������ ����� � ������
         	System.out.println("1. ���������:" + ob.total_houseHeating + " ���.");
         	System.out.println("2. ������� ����:" + ob.total_hotWater + " ���.");
         	System.out.println("3. �������� ����:" + ob.total_coldWater + " ���.");
         	System.out.println("4. ���:" + ob.total_houseGas + " ���.");
         	System.out.println("5. �������������:" + ob.total_houseElectricity + " ���.");
         	System.out.println("����� �����:" + ob.total_sum + " ���.");
        inpt.close();
    }
}