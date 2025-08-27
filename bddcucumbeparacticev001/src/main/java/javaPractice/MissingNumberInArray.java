package javaPractice;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int [] array = {1, 2, 3, 4, 6, 7, 8, 9};
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum =sum+array[i];
		}
		System.out.println("sum of the given array is : " + sum);
		int n =9;
		int expsum = (n*(n+1))/2;
		System.out.println("Expected sum of the given array is :" +  expsum);
		int missingnumer =expsum -  sum ;
		System.out.println("Missing number of the gioven array is : " + missingnumer);

	}

}
