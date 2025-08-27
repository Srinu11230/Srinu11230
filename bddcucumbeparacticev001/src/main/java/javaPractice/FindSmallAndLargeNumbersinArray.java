package javaPractice;

public class FindSmallAndLargeNumbersinArray {

	public static void main(String[] args) {
		int [] array = {12, 45, 67, 23, 89, 3, 1, 10};
		int smallest = array[0];
		int largest = array[0];
		for (int i=0; i<array.length; i++){
			if(array[i]>largest) {
				largest = array[i];
			}else {
				if(array[i]<smallest) {
					smallest = array[i];
				}
			}
			
		}
		System.out.println("Smallest number is : " + smallest);
		System.out.println("Largest number is : " + largest);

	}

}
