         package javaPractice;

public class FindDuplicatsofthegivenarray {

	public static void main(String[] args) {
		int [] duplicatearray = {1, 2, 5, 9, 5, 10, 8, 2,10, 9,10};
		
		for(int i =0; i<duplicatearray.length; i++) {
			for(int j =1+i; j<duplicatearray.length; j++) {
				if (duplicatearray[i] == duplicatearray[j]) {
					System.out.println("the duplicates of the given array : " + duplicatearray[j]);
				} 
			}
		}

	}

}
