
package javaPractice;

public class FindLargestandSecondLargestNumkbers {

	public static void main(String[] args) {
		int Number = 458907623;
		int Largest = Integer.MIN_VALUE;
		int SecondLargest = Integer.MIN_VALUE;
		while(Number > 0){
			int digit = Number % 10;
			if (digit > Largest) {
				SecondLargest = Largest;
				Largest = digit;
			}else if (digit <  SecondLargest && digit > Largest) {
				SecondLargest =digit;
				
			}
			Number = Number / 10;
		}
		System.out.println("Largest Number is: " + Largest);
		System.out.println("Second Largest Number is:" + SecondLargest);

	}

}
