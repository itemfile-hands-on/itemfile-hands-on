
/**
 * 
 * Questions
 * 1. Why does this equate to false, showing they are not equal?
 * 2. How can we fix to show equal?
 * 3. How do we fix this to show the correct answer 0.5?
 * 
 */
public class MyDouble {
	private static final double D1 = Double.NaN;
	private static final double D2 = Double.NaN;
	
	public static void main(String[] args) {
		// Question #1
		System.out.println(D1 == D2);
		
		// Answer #2
		System.out.println();
	
		// Question #3
		double d = 1 / 2;
		System.out.println(d);
	}
}
