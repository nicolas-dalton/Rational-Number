package rationalnumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class RationalNumberUtilsTest 
{
	RationalNumber one_two = new RationalNumberImpl_Dalton(1,2);
	RationalNumber one_four = new RationalNumberImpl_Dalton(1,4);
	RationalNumber two_three= new RationalNumberImpl_Dalton(2,3);
	RationalNumber one_three= new RationalNumberImpl_Dalton(1,3);
	RationalNumber three_three= new RationalNumberImpl_Dalton(3,3);
	RationalNumber zero_five= new RationalNumberImpl_Dalton(0,5);
	RationalNumber one_five= new RationalNumberImpl_Dalton(1,5);
	RationalNumber negativeOne_three= new RationalNumberImpl_Dalton(-1,3);
	RationalNumber negativeTwo_three= new RationalNumberImpl_Dalton(-2,3);
	@Test
	public void add_example()
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
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
	}
	
	@Test
	public void add__1_4__1_4()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.add(one_four, one_four);

		int expectedRV = 1;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 2;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = 0.5;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;

	}
	@Test
	public void add__2_3__1_3()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.add(two_three, one_three);

		int expectedRV = 1;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 1;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = 1;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;
	}
	@Test
	public void add__3_3__1_3()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.add(three_three, one_three);

		int expectedRV = 4;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 3;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = 1.3333333333333333;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;
	}
	@Test
	public void add__2_3__1_4()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.add(two_three, one_four);

		int expectedRV = 11;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 12;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = 0.9166666666666666;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;
	}
	@Test
	public void add__0_5__0_5()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.add(zero_five, zero_five);

		int expectedRV = 0;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 1;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = 0.0;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;
	}
	@Test
	public void add__1_5__0_5()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.add(one_five, zero_five);

		int expectedRV = 1;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 5;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = 0.2;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;
	}
	@Test
	public void add__2_3__negative1_3()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.add(two_three, negativeOne_three);

		int expectedRV = 1;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 3;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = 0.3333333333333333;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;
	}
	@Test
	public void add__negative2_3__1_3()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.add(negativeTwo_three, one_three);

		int expectedRV = -1;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 3;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = -0.3333333333333333;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;
	}
	@Test
	public void subtract__2_3__1_3()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.subtract(two_three, one_three);

		int expectedRV = 1;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 3;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = 0.3333333333333333;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;
	}
	
	@Test
	public void subtract__2_3__1_2()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.subtract(two_three, one_two);

		int expectedRV = 1;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 6;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = 0.16666666666666666;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;
	}
	@Test
	public void subtract__1_2__1_2()
	{
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.subtract(one_two, one_two);
		
		int ANSWER_NUMERATOR = 0;
		int ANSWER_DENOMINATOR = 1;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
	}
	@Test
	public void subtract__0_5__1_2()
	{
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.subtract(zero_five, one_two);
		
		int ANSWER_NUMERATOR = -1;
		int ANSWER_DENOMINATOR = 2;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
	}
	@Test
	public void subtract__1_2__0_5()
	{
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.subtract(one_two, zero_five);
		
		int ANSWER_NUMERATOR = 1;
		int ANSWER_DENOMINATOR = 2;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
	}
	@Test
	public void subtract__0_5__0_5()
	{
		RationalNumber studentAnswer = RationalNumberUtils_Dalton.subtract(zero_five, zero_five);
		
		int ANSWER_NUMERATOR = 0;
		int ANSWER_DENOMINATOR = 1;
		int STUDENT_NUMERATOR = studentAnswer.getNumerator();
		int STUDENT_DENOMINATOR = studentAnswer.getDenominator();
		
		assertEquals(ANSWER_NUMERATOR, STUDENT_NUMERATOR);
		assertEquals(ANSWER_DENOMINATOR, STUDENT_DENOMINATOR);
	}
	@Test
	public void subtract__2_3__negative1_3()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.subtract(two_three, negativeOne_three);

		int expectedRV = 1;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 1;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = 1;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;
	}
	@Test
	public void subtract__negative2_3__negative1_3()
	{
		RationalNumber rationalRV = RationalNumberUtils_Dalton.subtract(negativeTwo_three, negativeOne_three);

		int expectedRV = -1;
		int actualRV = rationalRV.getNumerator();
		String failureMessage = rationalRV.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		expectedRV = 3;
		actualRV =  rationalRV.getDenominator();
		failureMessage = rationalRV.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;

		double expectedValue = -0.3333333333333333;
		double actualValue = rationalRV.getValue();
		failureMessage = rationalRV.toString()+".getValue() expected to be "+ expectedValue 
				+ " but instead it was "+ actualValue;
		assert(actualValue==expectedValue):failureMessage;
	}
	
	
}
