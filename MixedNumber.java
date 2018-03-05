/**
 *********************************************************************************
 *
 * This class represents a mixed number which consist of sign (+ or -), integer 
 * and fraction parts of a number. Example: -10 3/5, 0 1/2, -0 3/4, 4 5/6
 * 
 * Requirements:
 * 1. Must use the given Fraction and FractionInterface to store fraction part
 * 2. Implement interfaces: MixedNumberInterface and Comparable (i.e. compareTo())
 * 3. Implement methods equals() and toString() from class Object
 * 4. Must work for both positive and negative mixed numbers
 * 5. Must reduce to mixed number to lowest term, e.g. 3 22/4 --> 8 1/2 
 * 6. Must reduce result mixed number to lowest term for operations 
 *    add(), subtract(), multiply() and divide(), e.g. see test cases
 * 7. For input 2 3/-10 & 2 -3/-10, must convert them to 
 *    -2 3/10 & 2 3/10 respectively (see Hint 2. below)
 * 8. Must throw only Project1Exception in case of errors
 * 9. Must not add new or modify existing data fields
 * 10.Must not add new or modify existing public methods
 * 11.May add private methods
 *
 * More info:
 *
 * 1. You need to downcast reference parameter MixedNumberInterface to 
 *    MixedNumber if you want to use it as MixedNumber. 
 *    See add, subtract, multiply and divide methods
 *
 * 2. The following private methods will be useful
 *
 *    // Private method: reduce a MixedNumber object to lowest term 
 *    // E.g. -3 50/7 --> -10 1/7;  3 25/10 --> 5 1/2
 *    private void reduceToLowestForm()
 *
 *    // Private method: convert a MixedNumber to new Fraction object
 *    // object. E.g. -7 1/7 --> -50/7;  3 1/8 --> 25/8
 *    private FractionInterface getFractionalEquivalent()
 *           
 * 3. Use "this" to access this object if it is needed
 *
 * 4. You need to downcast reference parameter FractionInterface to Fraction if  
 *    you want to use it as Fraction. 
 *
 * 5. More Fraction class info
 *
 *    It works for both positive and negative fractions
 *    For input 3/-10 & -3/-10, they are converted to -3/10 & 3/10 respectively 
 *    All fraction objects are reduced to lowest term, e.g. 10/20 --> 1/2
 *    Additional methods in Fraction:
 *
 *		public Fraction()  // default value: 0/1
 *		public Fraction(int num, int den)
 *		public boolean equals(Object other)
 *		public int compareTo(Fraction other)
 *		public String toString() // e.g. "3/5" or "-10/11"
 *
 ************************************************************************************/

import java.util.*;
package PJ1;

public class MixedNumber implements PJ1.MixedNumberInterface, Comparable<MixedNumber>
{

        // Fields:

	// both integer and fraction parts are forced to >= 0
	// sign of a mixed number is stored as '+' or '-'

	private char              sign;	    // '+' or '-'
	private int               integer;  // whole number portion >= 0
	private PJ1.FractionInterface fraction; // fractional portion in lowest terms;


	// Methods:

	public MixedNumber()
	{
		setMixedNumber(0, 0, 1);
	}	// end default constructor

	public MixedNumber(int integerPart, int fractionNumerator, 
				int fractionDenominator)
	{
                setMixedNumber(integerPart, fractionNumerator, fractionDenominator);
	}	// end constructor

	public MixedNumber(int integerPart, PJ1.FractionInterface fractionPart)
	{
		setMixedNumber(integerPart, fractionPart);
	}	// end constructor


	public void setMixedNumber(int integerPart, PJ1.FractionInterface fractionPart)
	{
		// add statements
		// set this object to the given values
		// make sure to reduce to lowest term 
		// check for exception cases
	}	// end setMixedNumber

	public void setMixedNumber(int integerPart, 
		int fractionNumerator, int fractionDenominator)
	{
		// add statements
		// set this object to the given values
		// make sure to reduce to lowest term 
		// check for exception cases
	}	// end setMixedNumber

	public int getIntegerPart()
	{
		// add statements
		// retrieve integer portion wth the correct sign
		return 0;  // change this
	}	// end getInteger

	public PJ1.FractionInterface getFractionPart()
	{
		// retrieve fraction portion, assume + value 
		return fraction;
	}	// end getFraction

	public PJ1.MixedNumberInterface add(PJ1.MixedNumberInterface operand)
	{
		// add statements
		// convert MixedNumber object to Fraction object
		// Use Fraction's add() method to obtain Fraction result
		// convert result to a new lowest term MixedNumber object
		// hint: return new MixedNumber(0,result);
		return null; // change it
	} // end add

	public PJ1.MixedNumberInterface subtract(PJ1.MixedNumberInterface operand)
	{
		// add statements
		// convert MixedNumber object to Fraction object
		// Use Fraction's substract() method to obtain Fraction result
		// convert result to a new lowest term MixedNumber object
		// hint: return new MixedNumber(0,result);
		return null; // change it
	}	// end subtract

	public PJ1.MixedNumberInterface multiply(PJ1.MixedNumberInterface multiplier)
	{
		// add statements
		// convert MixedNumber object to Fraction object
		// Use Fraction's multiply() method to obtain Fraction result
		// convert result to a new lowest term MixedNumber object
		// hint: return new MixedNumber(0,result);
		return null; // change it
	}	// end multiply

	public PJ1.MixedNumberInterface divide(PJ1.MixedNumberInterface divisor)
	{
		// add statements
		// convert MixedNumber object to Fraction object
		// Use Fraction's divide() method to obtain Fraction result
		// convert result to a new lowest term MixedNumber object
		// hint: return new MixedNumber(0,result);
		// check for exception cases
		return null; // change it
	}	// end divide


	public boolean equals(Object other)
	{
		// add statements
		// possible solution:
                // convert MixedNumber objects to Fraction objects
		// Use Fraction's equals() method to obtain boolean result
		return false; // change it
	} // end equals


	public int compareTo(MixedNumber other)
	{
		// add statements
		// possible solution:
                // convert MixedNumber objects to Fraction objects
		// Use Fraction's compareTo() method to obtain result
		return 0; // change it
	} // end compareTo


	public String toString()
	{
		// possible solution:
		// together with sign, integer and Fraction's toString() method 
                // to obtain string value
		// add statements
		return null; // change it
	} // end toString


	// Private method: reduce a MixedNumber object to lowest term 
        // E.g. -3 50/7 --> -10 1/7;  3 25/10 --> 5 1/2
	private void reduceToLowestForm()
	{
		// add statements
	}	


	// Private method: convert a MixedNumber to new Fraction object
        // object. E.g. -7 1/7 --> -50/7;  3 1/8 --> 25/8
	private PJ1.FractionInterface getFractionalEquivalent()
	{
		// add statements
		return null; // changeit
	}	

	// You may add more private methods

} // end MixedNumber

