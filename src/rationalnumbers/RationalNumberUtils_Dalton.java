package rationalnumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RationalNumberUtils_Dalton 
{
	private RationalNumberUtils_Dalton()
	{
		throw new RuntimeException("DO NOT INSTANTIATE!");
	}
	public static int leastCommonMultiple(int denominator1, int denominator2)
	{
		ArrayList<Integer> array_denominator1_multiple = new ArrayList<Integer>();
		ArrayList<Integer> array_denominator2_multiple= new ArrayList<Integer>();
		Set <Integer> combinedSet= new HashSet<Integer>();
		int leastCommonMultiple = 0;
		for(int i=1; i>=1; i++)
		{
			array_denominator1_multiple.add(denominator1*i);
			array_denominator2_multiple.add(denominator2*i);
			for(int j=0; j < array_denominator1_multiple.size(); j++)
			{
				if(combinedSet.add(array_denominator1_multiple.get(j))==false)
				{
					leastCommonMultiple = array_denominator1_multiple.get(j);
					break;
				}
				if(combinedSet.add(array_denominator2_multiple.get(j))==false)
				{
					leastCommonMultiple = array_denominator2_multiple.get(j);
					break;
				}
				combinedSet.add(array_denominator1_multiple.get(j));
				combinedSet.add(array_denominator2_multiple.get(j));
			}
			if(leastCommonMultiple!= 0)
			{
				break;
			}
			combinedSet.clear();
		}
		return leastCommonMultiple;
	}
	//part of post-condition rv== (ad+bc)/(bd)
	//part of post-condition (STRAIGHTFORWARD): add(1/3, 1/3) = 2/3
	//part of post-condition (EXTREME): add(-2/4, 2/6) = -1/6;
	//part of post-condition (BIZZARE/EXOTIC): add(-2/3,-1/3) = -1/1;
	public static RationalNumber add(RationalNumber r1, RationalNumber r2)
	{
		int r1Denominator = r1.getDenominator();
		int r2Denominator = r2.getDenominator();
		int leastCommonMultiple = RationalNumberUtils_Dalton.leastCommonMultiple(r1Denominator, r2Denominator);
		int r1_multiplier = leastCommonMultiple/r1Denominator;
		int r2_multiplier = leastCommonMultiple/r2Denominator;
		int r1Numerator = r1.getNumerator()*r1_multiplier;
		int r2Numerator = r2.getNumerator()*r2_multiplier;
		int numeratorRV = r1Numerator + r2Numerator;
		int denominatorRV = leastCommonMultiple;
		RationalNumber returnValue =  new RationalNumberImpl_Dalton(numeratorRV,denominatorRV);
		return returnValue;
	}
		//part of post-condition rv == (ad-bc)/(bd)
		//part of post-condition (STRAIGHTFORWARD): subtract(2/3, 1/3) = 1/3
		//part of post-condition (EXTREME): subtract(-2/4, 2/4) = -1/2;
		//part of post-condition (BIZZARE/EXOTIC): subtract(7/5,0/14) = 7/5;
	public static RationalNumber subtract(RationalNumber r1, RationalNumber r2)
	{
		int r1Denominator = r1.getDenominator();
		int r2Denominator = r2.getDenominator();
		int leastCommonMultiple = RationalNumberUtils_Dalton.leastCommonMultiple(r1Denominator, r2Denominator);
		int r1_multiplier = leastCommonMultiple/r1Denominator;
		int r2_multiplier = leastCommonMultiple/r2Denominator;
		int r1Numerator = r1.getNumerator()*r1_multiplier;
		int r2Numerator = r2.getNumerator()*r2_multiplier;
		int numeratorRV = r1Numerator - r2Numerator;
		int denominatorRV = leastCommonMultiple;
		RationalNumber returnValue =  new RationalNumberImpl_Dalton(numeratorRV,denominatorRV);
		return returnValue;
	}
		//part of post-condition rv == (ac)/(bd)
		//part of post-condition (STRAIGHTFORWARD): multiple(2/6, 8/3) = 8/9
		//part of post-condition (EXTREME): multiple(-2/8, 15/1) = -1/2;
		//part of post-condition (BIZZARE/EXOTIC): multiple(7/5,0/14) = 0/1;
	public static RationalNumber multiply(RationalNumber r1, RationalNumber r2)
	{
		int r1Numerator = r1.getNumerator();
		int r1Denominator = r1.getDenominator();
		int r2Numerator = r2.getNumerator();
		int r2Denominator = r2.getDenominator();
		int numeratorRV = r1Numerator *  r2Numerator;
		int denominatorRV = r1Denominator * r2Denominator;
		RationalNumber returnValue =  new RationalNumberImpl_Dalton(numeratorRV,denominatorRV);
		return returnValue;
	}
	//part of post-condition rv == (ad)/(bc)
	//part of post-condition (STRAIGHTFORWARD): divide(1/3, 2/4) = 2/3
	//part of post-condition (EXTREME): divide(-2/3, 5/2) = -4/15;
	//part of post-condition (BIZZARE/EXOTIC): divide(5/8,0/3) = Nuclear brocoli;
	public static RationalNumber divide(RationalNumber r1, RationalNumber r2)
	{
		int r1Numerator = r1.getNumerator();
		int r1Denominator = r1.getDenominator();
		int r2Numerator = r2.getNumerator();
		int r2Denominator = r2.getDenominator();
		int numeratorRV = r1Numerator * r2Denominator;
		int denominatorRV = r1Denominator * r2Numerator;
		RationalNumber returnValue =  new RationalNumberImpl_Dalton(numeratorRV,denominatorRV);
		return returnValue;
	}
	//part of post-condition rv == (-a/b)
		//part of post-condition (STRAIGHTFORWARD): negate(4/5) = -4/5
		//part of post-condition (EXTREME): negate(-7/6) = 7/6;
		//part of post-condition (BIZZARE/EXOTIC): negate(0/3) = 0/1;
	public static RationalNumber negate(RationalNumber r1)
	{
		int r1Numerator = r1.getNumerator();
		int r1Denominator = r1.getDenominator();
		int r1NumeratorNegated = r1Numerator * -1;
		RationalNumber returnValue =  new RationalNumberImpl_Dalton(r1NumeratorNegated,r1Denominator);
		return returnValue;
	}
	public static boolean equal(RationalNumber r1, RationalNumber r2)
	{
		int r1Numerator = r1.getNumerator();
		int r1Denominator = r1.getDenominator();
		int r2Numerator = r2.getNumerator();
		int r2Denominator = r2.getDenominator();
		boolean rv = (r1Numerator==r2Numerator && r1Denominator==r2Denominator);
		return rv;
		
	}
}

