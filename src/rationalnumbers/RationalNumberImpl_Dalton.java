package rationalnumbers;

import java.util.ArrayList;

public class RationalNumberImpl_Dalton implements RationalNumber
{
	private int numerator;
	private int denominator;

	
	public static int greatestCommonFactor(int a,int b)

	{
		int gcf = 0;
		ArrayList<Integer> array_a = new ArrayList<Integer>();
		ArrayList<Integer> array_b = new ArrayList<Integer>();
		if(a == 0)
		{
			gcf = b;
		}
		if(a < 0)
		{
			a = a*-1;
		}
		if(b < 0)
		{
			b = b*-1;
		}
		for(int i=1; i<a+1; i++)
		{
			if(a%i==0)
			{
				array_a.add(i);
			}
		}
		for(int i=1; i<b+1; i++)
		{
			if(b%i==0)
			{
				array_b.add(i);
			}
		}
		array_a.retainAll(array_b);
		for(int i = 0; i< array_a.size();i++)
		{
			if(array_a.get(i) > gcf)
			{
				gcf = array_a.get(i);
			}
		}
		return gcf;
	}
	public static int[] reducer(int[] list)
	
	{
		int numerator =  list[0];
		int denominator = list[1];
		int gcf = list[2];
		int reducedNumerator = numerator/gcf;
		int reducedDenominator = denominator/gcf;
		if(reducedDenominator < 0 && reducedNumerator <0)
		{
			reducedNumerator = reducedNumerator*-1;
			reducedDenominator = reducedDenominator*-1;
		}
		else if (reducedDenominator < 0)
		{
			reducedNumerator = reducedNumerator*-1;
			reducedDenominator = reducedDenominator*-1;
		}
		int[] reducedNumerator_reducedDenominator = {reducedNumerator,reducedDenominator};
		return reducedNumerator_reducedDenominator;
	}
	public RationalNumberImpl_Dalton(int a,int b)
	
	{
		assert b!= 0: "denominator cannot be equal to 0";
		int gcf = RationalNumberImpl_Dalton.greatestCommonFactor(a, b);
		int[] numerator_denominator_gcf = {a, b, gcf};
		int[] reducedNumerator_reducedDenominator = RationalNumberImpl_Dalton.reducer(numerator_denominator_gcf);
		int reducedNumerator = reducedNumerator_reducedDenominator[0];
		int reducedDenominator = reducedNumerator_reducedDenominator[1];
		this.numerator = reducedNumerator;
		this.denominator = reducedDenominator;
	}
	@Override
	public int getNumerator() 
	
	{
		int numeratorValue = numerator;
		return numeratorValue;
	}

	@Override
	public int getDenominator() 
	{
		int denominatorValue = denominator;
		return denominatorValue;
	}

	@Override
	public double getValue() 
	{
		double numeratorValue = numerator;
		double denominatorValue = denominator;
		double value = numeratorValue/denominatorValue;
		return value;
	}
	public String toString()
	{
		String rationalString = "";
		rationalString+= numerator +"/"+ denominator;
		return rationalString;
	}
}
