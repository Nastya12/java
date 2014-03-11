package haupt;

class ContinuedFraction {
	private double denominator, valueFraction;
	public double calculationFraction(int []arr)
	{
		valueFraction=arr[arr.length];
		for(int i=arr.length;i>arr.length; i--){
			denominator=arr[arr.length-1]+1/valueFraction;
			valueFraction=denominator;
		}
		return valueFraction;
	}
}

class Calculation {
	@SuppressWarnings("null")
	public static void main(String[] args)
	{
		int mas1[]={1, 2, 3};
		int mas2[]={1, 1, 4};
		ContinuedFraction fractionOne = null, fractionSecond = null;
		double addition, subtraction1, product, division;
		double fraction1=0;
		double fraction2=0;
		fraction1=fractionOne.calculationFraction(mas1);
		fraction2=fractionSecond.calculationFraction(mas2);
		addition=fraction1+fraction2;
		System.out.print("Addition of two continued fractions: " + addition);
		subtraction1=fraction1-fraction2;
		System.out.print("Subtraction of two continued fractions: " + subtraction1);
		product=fraction1*fraction2;
		System.out.print("Product of two continued fractions: " + product);
		division=fraction1/fraction2;
		System.out.print("Division of two continued fractions: " + division);
	}
}