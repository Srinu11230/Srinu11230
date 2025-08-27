 package javaPractice;

import java.util.LinkedHashSet;
import java.util.*;

public class FiltertheDuplicatesfromthegivenstring {

	public static void main(String[] args) {
		String Str = "srinivasaraonali";
		Set<Character> Unique = new LinkedHashSet<Character>();
		for (int i=0; i<Str.length(); i++) {
			 Unique.add(Str.charAt(i));
		}
		for(Character ch: Unique) {
			System.out.println("all the Unique characters are: " + ch);
		}

	}

}
