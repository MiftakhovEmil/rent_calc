package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.rentCalc;

public class Test_0 {

	@Test
	public void test() 
	{
		rentCalc t0; 
		// вводим входные параметры для тестирования
		// первые 5 - тарифы, вторые 5 - объемы
		// gaz, heat, hot, cold, electr, V_gaz, V_heat, V_hot, V_cold, V_electr
		
		//test1
		t0 = new rentCalc(10,20,30,40,50,50,40,30,20,10);
		 
		assertEquals(500, t0.total_houseGas);
		assertEquals(800, t0.total_houseHeating);
		assertEquals(900, t0.total_hotWater);
		assertEquals(800, t0.total_coldWater);
		assertEquals(500, t0.total_houseElectricity);
		assertEquals(3500, t0.total_sum);
	}
}

