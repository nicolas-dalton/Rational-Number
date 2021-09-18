package test;

import static org.junit.Assert.*;

import org.junit.Test;

import rationalnumbers.RationalNumber;
import rationalnumbers.RationalNumberImpl_Dalton;
import rationalnumbers.RationalNumberUtils_Dalton;

public class RationalNumberUtils_Test_Add_Subtract {

	@Test
	public void add__1_2__3_4()
	{
		int a = 1;
		int b = 2;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 3;
		int d = 4;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.add(r, q);
		
		int ANSWER_NUMERATOR = 5;
		int ANSWER_DENOMINATOR = 4;
		double ANSWER_VALUE = 1.25;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void add__2_3__2_3()
	{
		int a = 2;
		int b = 3;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 2;
		int d = 3;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.add(r, q);
		
		int ANSWER_NUMERATOR = 4;
		int ANSWER_DENOMINATOR = 3;
		double ANSWER_VALUE = 1.333;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	
	@Test
	public void add__7_4__2_5()
	{
		int a = 7;
		int b = 4;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 2;
		int d = 5;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.add(r, q);
		
		int ANSWER_NUMERATOR = 43;
		int ANSWER_DENOMINATOR = 20;
		double ANSWER_VALUE = 2.15;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	
	//EXTREME ADD CASES
	@Test
	public void add__22_31__15_97()
	{
		int a = 22;
		int b = 31;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 15;
		int d = 97;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.add(r, q);
		
		int ANSWER_NUMERATOR = 2599;
		int ANSWER_DENOMINATOR = 3007;
		double ANSWER_VALUE = 0.864;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void subtract__1_3__2_3()
	{
		int a = 1;
		int b = 3;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 2;
		int d = 3;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.subtract(r, q);
		
		int ANSWER_NUMERATOR = -1;
		int ANSWER_DENOMINATOR = 3;
		double ANSWER_VALUE = -0.333;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void subtract__1_3__negative4_3()
	{
		int a = 1;
		int b = 3;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = -4;
		int d = 3;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);
		
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.subtract(r, q);
		
		int ANSWER_NUMERATOR = 5;
		int ANSWER_DENOMINATOR = 3;
		double ANSWER_VALUE = 1.6667;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
}
