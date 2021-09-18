package test;

import static org.junit.Assert.*;

import org.junit.Test;

import rationalnumbers.RationalNumberUtils_Dalton;

public class RationalNumberUtils_Test_LeastCommonMultiple 
{

	@Test
	public void lcm__2_2() 
	{
		int a = 2;
		int b = 2;
		int expectedRV = 2;
		int actualRV  = RationalNumberUtils_Dalton.leastCommonMultiple(a, b);
		assertEquals(expectedRV,actualRV);
	}
	@Test
	public void lcm__3_2()
	{
		int a = 3;
		int b = 2;
		int expectedRV = 6;
		int actualRV  = RationalNumberUtils_Dalton.leastCommonMultiple(a, b);
		assertEquals(expectedRV,actualRV);
	}
	
	@Test
	public void lcm__2_3()
	{
		int a = 2;
		int b = 3;
		int expectedRV = 6;
		int actualRV  = RationalNumberUtils_Dalton.leastCommonMultiple(a, b);
		assertEquals(expectedRV,actualRV);
	}
	@Test
	public void lcm__5_6()
	{
		int a = 5;
		int b = 6;
		int expectedRV = 30;
		int actualRV  = RationalNumberUtils_Dalton.leastCommonMultiple(a, b);
		assertEquals(expectedRV,actualRV);
	}
}
