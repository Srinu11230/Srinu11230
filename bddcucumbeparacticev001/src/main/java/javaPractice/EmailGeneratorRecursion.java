package javaPractice;

import java.util.stream.IntStream;

public class EmailGeneratorRecursion {
    public static void main(String[] args) {
		/*
		 * int count = 10; IntStream.rangeClosed(1, count) .mapToObj(i -> "user" + i +
		 * "@testmail.com") .forEach(System.out::println);
		 */
		
		  generateEmails(1, 5); // start = 1, total = 5 
		  }
		  
		  static void generateEmails(int current, int total)
		  {
			  if (current <= total) {
		  }
		  System.out.println("user" + current + "@testmail.com");
		  generateEmails(current + 1, total); // recursion instead of loop 
		  }
    }
