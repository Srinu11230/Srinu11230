package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class Findmultiplemissingnumbers {

	public static void main(String[] args) {
		int[] array = {1, 4, 5, 8, 9, 10, 11};
		int n = array[array.length - 1];;
		Set<Integer>missing = new HashSet<Integer>();
		for(int num : array) {
			missing.add(num);
		}
		
		for(int i=0; i<=n; i++) {
			if(!missing.contains(i)) {
				System.out.println("Missing number : " + i);
			}
		}

	}

}
