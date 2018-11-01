
public class Fraction {
	// Field
	public int numerator;
	public int denominator;
	
	// Constructor or Constructor Stack
	public Fraction(String passFraction1, String passFraction2) {
		int separator = passFraction1.indexOf("/");
		String strNumerator1 = passFraction1.substring(0, separator);
		String strDenominator1 = passFraction1.substring(separator + 1);
		
		this.numerator = Integer.parseInt(strNumerator1);
		this.denominator = Integer.parseInt(strDenominator1);
		
		separator = passFraction2.indexOf("/");
		String strNumerator2 = passFraction2.substring(0, separator);
		String strDenominator2 = passFraction2.substring(separator + 1);
		
		int Denominator = strDenominator1 * strDenominator2;
		
		this.numerator = Integer.parseInt(strNumerator2);
		this.denominator = Integer.parseInt(Denominator);
		
	}
	
	// Methods
	public int getNumerator() {
		return numerator;
		
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
		
	}

	public int getDenominator() {
		return denominator;
		
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
		
	}
	
}
