package rationalnumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class RationalNumberImplTest_Dalton 
{
	RationalNumber one_two = new RationalNumberImpl_Dalton(1,2);
	RationalNumber three_four = new RationalNumberImpl_Dalton(3,4);
	RationalNumber nine_eighteen = new RationalNumberImpl_Dalton(9,18);
	RationalNumber four_twentytwo = new RationalNumberImpl_Dalton(4,22);
	RationalNumber five_two = new RationalNumberImpl_Dalton(5,2);
	RationalNumber fifty_twenty = new RationalNumberImpl_Dalton(50,20);
	RationalNumber zero_five = new RationalNumberImpl_Dalton(0,5);
	RationalNumber two_negativeThree = new RationalNumberImpl_Dalton(2,-3);
	RationalNumber negativeTwo_negativeThree = new RationalNumberImpl_Dalton(-2,-3);


	@Test
	public void getNumerator__1_2() 
	{
		int expectedRV = 1;
		int actualRV = one_two.getNumerator();
		String failureMessage = one_two.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getDenominator__1_2()
	{
		int expectedRV = 2;
		int actualRV = one_two.getDenominator();
		String failureMessage = one_two.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getValue__1_2()
	{
		double expectedRV = 0.5;
		double actualRV = one_two.getValue();
		String failureMessage = one_two.toString()+".getValue() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getNumerator__3_4()
	{
		int expectedRV = 3;
		int actualRV = three_four.getNumerator();
		String failureMessage = three_four.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getDenominator__3_4()
	{
		int expectedRV = 4;
		int actualRV = three_four.getDenominator();
		String failureMessage = three_four.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getValue__3_4()
	{
		double expectedRV = 0.75;
		double actualRV = three_four.getValue();
		String failureMessage = three_four.toString()+".getValue() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getNumerator__9_18()
	{
		int expectedRV = 1;
		int actualRV = nine_eighteen.getNumerator();
		String failureMessage = nine_eighteen.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getDenominator__9_18()
	{
		int expectedRV = 2;
		int actualRV = nine_eighteen.getDenominator();
		String failureMessage = nine_eighteen.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getValue__9_18()
	{
		double expectedRV = 0.5;
		double actualRV = nine_eighteen.getValue();
		String failureMessage = nine_eighteen.toString()+".getValue() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getNumerator__4_22()
	{
		int expectedRV = 2;
		int actualRV = four_twentytwo.getNumerator();
		String failureMessage = four_twentytwo.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getDenominator__4_22()
	{
		int expectedRV = 11;
		int actualRV = four_twentytwo.getDenominator();
		String failureMessage = four_twentytwo.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getValue__4_22()
	{
		double expectedRV = 0.18181818181818182;
		double actualRV = four_twentytwo.getValue();
		String failureMessage = four_twentytwo.toString()+".getValue() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getNumerator__5_2()
	{
		int expectedRV = 5;
		int actualRV = five_two.getNumerator();
		String failureMessage = five_two.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getDenominator__5_2()
	{
		int expectedRV = 2;
		int actualRV = five_two.getDenominator();
		String failureMessage = five_two.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getValue__5_2()
	{
		double expectedRV = 2.5;
		double actualRV = five_two.getValue();
		String failureMessage = five_two.toString()+".getValue() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getNumerator__50_20()
	{
		int expectedRV = 5;
		int actualRV = fifty_twenty.getNumerator();
		String failureMessage = five_two.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getDenominator__50_20()
	{
		int expectedRV = 2;
		int actualRV = fifty_twenty.getDenominator();
		String failureMessage = five_two.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getValue__50_20()
	{
		double expectedRV = 2.5;
		double actualRV = fifty_twenty.getValue();
		String failureMessage = five_two.toString()+".getValue() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getNumerator__0_5()
	{
		int expectedRV = 0;
		int actualRV = zero_five.getNumerator();
		String failureMessage = zero_five.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getDenominator__0_5()
	{
		int expectedRV = 1;
		int actualRV = zero_five.getDenominator();
		String failureMessage = zero_five.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getValue__0_5()
	{
		double expectedRV = 0;
		double actualRV = zero_five.getValue();
		String failureMessage = zero_five.toString()+".getValue() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getNumerator__2_negative3()
	{
		int expectedRV = -2;
		int actualRV = two_negativeThree.getNumerator();
		String failureMessage = two_negativeThree.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getDenominator__2_negative3()
	{
		int expectedRV = 3;
		int actualRV = two_negativeThree.getDenominator();
		String failureMessage = two_negativeThree.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getValue__2_negative3()
	{
		double expectedRV = -0.6666666666666666;
		double actualRV = two_negativeThree.getValue();
		String failureMessage = two_negativeThree.toString()+".getValue() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getNumerator__negative2_negative3()
	{
		int expectedRV = 2;
		int actualRV = negativeTwo_negativeThree.getNumerator();
		String failureMessage = negativeTwo_negativeThree.toString()+".getNumerator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getDenominator__negative2_negative3()
	{
		int expectedRV = 3;
		int actualRV = negativeTwo_negativeThree.getDenominator();
		String failureMessage = negativeTwo_negativeThree.toString()+".getDenominator() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
	@Test
	public void getValue__negative2_negative3()
	{
		double expectedRV = 0.6666666666666666;
		double actualRV = negativeTwo_negativeThree.getValue();
		String failureMessage = negativeTwo_negativeThree.toString()+".getValue() expected to be "+ expectedRV 
				+ " but instead it was "+ actualRV;
		assert(actualRV==expectedRV):failureMessage;
	}
}
