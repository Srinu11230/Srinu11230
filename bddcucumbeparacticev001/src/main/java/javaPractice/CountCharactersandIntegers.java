 package javaPractice;

public class CountCharactersandIntegers {

	public static void main(String[] args) {
		String str = "srinivasaraonali11230";
		char[] ch =str.toCharArray();
		int character =0;
		int integers =0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isLetter(ch[i])) {
				
				character++;
			}else if(Character.isDigit(ch[i])) {
				integers++;
			}
		}
		System.out.println("Number of the characters in the String is: " + character);
		System.out.println("Number of the integers in the string is: " + integers);
	}
}

