package test;

import static org.junit.Assert.*;

import org.junit.Test;

import rationalnumbers.RationalNumber;
import rationalnumbers.RationalNumberImpl_Dalton;
import rationalnumbers.RationalNumberUtils_Dalton;

public class RationalNumberUtils_Test_Multiply_Divide 
{
	//************MULTIPLICATION TEST CASES************
	
	//STRAIGHTFORWARD MULTIPLY CASES
	@Test
	public void multiply__1_2__1_2() 
	{
		int a = 1;
		int b = 2;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 1;
		int d = 2;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.multiply(r, q);
		
		int ANSWER_NUMERATOR = 1;
		int ANSWER_DENOMINATOR = 4;
		double ANSWER_VALUE = 0.25;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
		
	}
	@Test
	public void multiple__2_4__1_2()
	{
		int a = 2;
		int b = 4;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 1;
		int d = 2;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.multiply(r, q);
		
		int ANSWER_NUMERATOR = 1;
		int ANSWER_DENOMINATOR = 4;
		double ANSWER_VALUE = 0.25;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void multiple__7_3__4_1()
	{
		int a = 7;
		int b = 3;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 4;
		int d = 1;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.multiply(r, q);
		
		int ANSWER_NUMERATOR = 28;
		int ANSWER_DENOMINATOR = 3;
		double ANSWER_VALUE = 9.333;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	//EXTREME MULTIPLY CASES
	@Test
	public void multiple__30_21__23_98()
	{
		int a = 30;
		int b = 21;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 23;
		int d = 98;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.multiply(r, q);
		
		int ANSWER_NUMERATOR = 115;
		int ANSWER_DENOMINATOR = 343;
		double ANSWER_VALUE = 0.3353;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void multiply__0_3__2_9()
	{
		int a = 0;
		int b = 3;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 2;
		int d = 3;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.multiply(r, q);
		
		int ANSWER_NUMERATOR = 0;
		int ANSWER_DENOMINATOR = 1;
		double ANSWER_VALUE = 0.0;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void multiply__0_20__0_3()
	{
		int a = 0;
		int b = 20;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 0;
		int d = 3;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.multiply(r, q);
		
		int ANSWER_NUMERATOR = 0;
		int ANSWER_DENOMINATOR = 1;
		double ANSWER_VALUE = 0.0;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	// BIZARRE & EXOTIC CASES
	@Test 
	public void multiply__negative2_3__2_5()
	{
		int a = -2;
		int b = 3;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 2;
		int d = 5;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.multiply(r, q);
		
		int ANSWER_NUMERATOR = -4;
		int ANSWER_DENOMINATOR = 15;
		double ANSWER_VALUE = -0.26667;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test 
	public void multiply__negative3_8__negative2_3()
	{
		int a = -3;
		int b = 8;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = -2;
		int d = 3;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.multiply(r, q);
		
		int ANSWER_NUMERATOR = 1;
		int ANSWER_DENOMINATOR = 4;
		double ANSWER_VALUE = 0.25;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test 
	public void multiply__negative9_negative1__negative5_negative7()
	{
		int a = -9;
		int b = -1;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = -5;
		int d = -7;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.multiply(r, q);
		
		int ANSWER_NUMERATOR = 45;
		int ANSWER_DENOMINATOR = 7;
		double ANSWER_VALUE = 6.429;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	
	//STRAIGHTFORWARD DIVIDE CASES
	@Test
	public void divide__1_2__1_2()
	{
		int a = 1;
		int b = 2;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 1;
		int d = 2;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.divide(r, q);
		
		int ANSWER_NUMERATOR = 1;
		int ANSWER_DENOMINATOR = 1;
		double ANSWER_VALUE = 1;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void divide__5_7__2_3()
	{
		int a = 5;
		int b = 7;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 2;
		int d = 3;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.divide(r, q);
		
		int ANSWER_NUMERATOR = 15;
		int ANSWER_DENOMINATOR = 14;
		double ANSWER_VALUE = 1.0714;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void divide__2_3__5_7()
	{
		int a = 2;
		int b = 3;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 5;
		int d = 7;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.divide(r, q);
		
		int ANSWER_NUMERATOR = 14;
		int ANSWER_DENOMINATOR = 15;
		double ANSWER_VALUE = 0.9333;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void divide__9_4__3_1()
	{
		int a = 9;
		int b = 4;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 3;
		int d = 1;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.divide(r, q);
		
		int ANSWER_NUMERATOR = 3;
		int ANSWER_DENOMINATOR = 4;
		double ANSWER_VALUE = 0.75;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	//EXTREME DIVIDE CASES
	@Test
	public void divide__50_13__32_21()
	{
		int a = 50;
		int b = 13;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 32;
		int d = 21;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.divide(r, q);
		
		int ANSWER_NUMERATOR = 525;
		int ANSWER_DENOMINATOR = 208;
		double ANSWER_VALUE = 2.524;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void divide__0_9__2_3()
	{
		int a = 0;
		int b = 9;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 2;
		int d = 3;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.divide(r, q);
		
		int ANSWER_NUMERATOR = 0;
		int ANSWER_DENOMINATOR = 1;
		double ANSWER_VALUE = 0.0;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	
	
	// BIZARRE & EXOTIC CASES
	@Test
	public void divide__negative2_3__4_5()
	{
		int a = -2;
		int b = 3;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 4;
		int d = 5;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.divide(r, q);
		
		int ANSWER_NUMERATOR = -5;
		int ANSWER_DENOMINATOR = 6;
		double ANSWER_VALUE = -0.8333;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void divide__negative4_7__negative8_3()
	{
		int a = -4;
		int b = 7;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = -8;
		int d = 3;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.divide(r, q);
		
		int ANSWER_NUMERATOR = 3;
		int ANSWER_DENOMINATOR = 14;
		double ANSWER_VALUE = 0.2143;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test(expected = AssertionError.class)
	public void divide__12_5__0_5()
	{
		int a = 12;
		int b = 5;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 0;
		int d = 5;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.divide(r, q);
	}
	@Test(expected = AssertionError.class)
	public void divide__0_5__0_5()
	{
		int a = 0;
		int b = 5;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 0;
		int d = 5;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.divide(r, q);
	}
	
}
