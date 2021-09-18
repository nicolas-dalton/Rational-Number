package test;

import static org.junit.Assert.*;

import org.junit.Test;

import rationalnumbers.RationalNumber;
import rationalnumbers.RationalNumberImpl_Dalton;
import rationalnumbers.RationalNumberUtils_Dalton;

public class RationalNumberUtils_Test_Negate 
{

	//STRAIGHTFORWARD NEGATE CASES
	@Test
	public void negate__1_2() 
	{
		int a = 1;
		int b = 2;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);


		RationalNumber studentAnswer = RationalNumberUtils_Dalton.negate(r);

		int ANSWER_NUMERATOR = -1;
		int ANSWER_DENOMINATOR = 2;
		double ANSWER_VALUE = -0.50;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void negate__7_5()
	{
		int a = 7;
		int b = 5;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);


		RationalNumber studentAnswer = RationalNumberUtils_Dalton.negate(r);

		int ANSWER_NUMERATOR = -7;
		int ANSWER_DENOMINATOR = 5;
		double ANSWER_VALUE = -1.4;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	//EXTREME NEGATE CASES
	@Test
	public void negate__negative6_2()
	{
		int a = -6;
		int b = 2;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);


		RationalNumber studentAnswer = RationalNumberUtils_Dalton.negate(r);

		int ANSWER_NUMERATOR = 3;
		int ANSWER_DENOMINATOR = 1;
		double ANSWER_VALUE = 3.0;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void negate__negative4_5()
	{
		int a = -4;
		int b = 5;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);


		RationalNumber studentAnswer = RationalNumberUtils_Dalton.negate(r);

		int ANSWER_NUMERATOR = 4;
		int ANSWER_DENOMINATOR = 5;
		double ANSWER_VALUE = 0.8;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void negate__negative7_negative4()
	{
		int a = -7;
		int b = -4;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);


		RationalNumber studentAnswer = RationalNumberUtils_Dalton.negate(r);

		int ANSWER_NUMERATOR = -7;
		int ANSWER_DENOMINATOR = 4;
		double ANSWER_VALUE = -1.75;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		double STUDENT_VALUE = studentAnswer.getValue();
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
		assertEquals(ANSWER_VALUE, STUDENT_VALUE,0.01);
	}
	@Test
	public void equal__1_2__1_2()
	{
		int a = 1;
		int b = 2;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 1;
		int d = 2;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);


		boolean expectedRV = true;
		boolean actualRV = RationalNumberUtils_Dalton.equal(r, q);
		assertEquals(expectedRV, actualRV);
	}
	@Test
	public void equal__1_2__2_4()
	{
		int a = 1;
		int b = 2;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 2;
		int d = 4;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);


		boolean expectedRV = true;
		boolean actualRV = RationalNumberUtils_Dalton.equal(r, q);
		assertEquals(expectedRV, actualRV);
	}
	@Test
	public void equal__2_3__1_2()
	{
		int a = 2;
		int b = 3;
		RationalNumber r = new RationalNumberImpl_Dalton(a, b);

		int c = 1;
		int d = 2;
		RationalNumber q = new RationalNumberImpl_Dalton(c, d);


		boolean expectedRV = false;
		boolean actualRV = RationalNumberUtils_Dalton.equal(r, q);
		assertEquals(expectedRV, actualRV);
	}
}
