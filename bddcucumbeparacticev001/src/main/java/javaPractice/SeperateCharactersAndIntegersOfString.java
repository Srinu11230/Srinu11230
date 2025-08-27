

package javaPractice;

public class SeperateCharactersAndIntegersOfString {

	public static void main(String[] args) {
		String input = "srinivasa11230";
		StringBuilder characters = new StringBuilder();
		StringBuilder integers = new StringBuilder();
		for(char ch : input.toCharArray()) {
			if(Character.isLetter(ch)) {
				characters.append(ch);
			}else if(Character.isDigit(ch)) {
				integers.append(ch);
			}
		}
System.out.println("Characters: " + characters.toString());
System.out.println("Integers:" + integers.toString());
	}

}
