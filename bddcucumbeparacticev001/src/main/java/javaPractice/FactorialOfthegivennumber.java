package javaPractice;

import java.math.BigInteger;

public class FactorialOfthegivennumber {

	public static void main(String[] args) {
		/*
		 * int n = 9; int f = 1; for (int i=1; i<=n; i++) { f = f*i; }
		 */
		int n = 198;
		BigInteger f = BigInteger.ONE;
		for(int i=1; i<=n; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		System.out.println(" The factorialof the given number is : " + f);

	}

}



