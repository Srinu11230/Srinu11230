package javaPractice;

public class Fingthegivennumberispalindromearenot {

	public static void main(String[] args) {
		int number = 12321;
		int reminder = 0;
		int sum = 0;
		int n= number;
		while(number > 0) {
			reminder = number % 10;
			sum = (sum * 10) + reminder;
			number = number /10;
			}
			if (n == sum) {
				System.out.println(number + " : the given num,ber is a palindrome");
			} else {
				System.out.println(number + " : the given num,ber is not a palindrome");
			}
		}

	}

