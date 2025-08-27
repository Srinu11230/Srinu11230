

package javaPractice;

public class Sumofthegivenarray {

	public static void main(String[] args) {
		int [] sumofthearray = {1, 2, 5, 9, 5, 10, 8, 2,10,};
		int sum = 0;
		for (int i=0; i<sumofthearray.length; i++) {
			sum =sum + sumofthearray[i];
		}
		System.out.println("The sum of the givenarray is : " + sum);
	}

}
