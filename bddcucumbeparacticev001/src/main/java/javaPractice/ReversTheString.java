package javaPractice;

public class ReversTheString {

	public static void main(String[] args) {
		String Str = "srinivasarao";
		String rev = "";
		Character ch;
		for(int i=Str.length()-1; i>=0; i--) {
			ch=Str.charAt(i);
			rev = rev + ch;
		}
		System.out.println("reveresed String is:" + rev);
		if (rev.equalsIgnoreCase(Str)) {
			System.out.println(Str + " : String os plaindrome");
		} else {
			System.out.println(Str + " : String is not plaindrome");
		}

	}

}
