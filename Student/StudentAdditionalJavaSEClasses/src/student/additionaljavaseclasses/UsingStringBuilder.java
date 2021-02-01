package student.additionaljavaseclasses;
import java.lang.StringBuilder;
import java.util.Locale;

public class UsingStringBuilder {

	public static void main(String[] args) {
		
		// Write code here, to explore the capabilities of the StringBuilder class.
		String palindrome ="Dot saw i was Tod";
		StringBuilder  sb = new StringBuilder(50);

		sb.append("hei hei hei");
		System.out.println("length is: " + sb.length());
		sb.delete(4,7);
		System.out.println("1: " + sb);
		System.out.println("length is: " + sb.length());

		sb.deleteCharAt(2);
		System.out.println("2: " + sb);
		System.out.println("length is: " + sb.length());

		sb.insert(4, "A");
		System.out.println("4: " + sb);
		System.out.println("length is: " + sb.length());


		sb.setCharAt(5, 'V');
		System.out.println("5: " + sb);
		System.out.println("length is: " + sb.length());

		sb.reverse();
		palindrome = sb.toString(); // overwrites palindrome
		System.out.println("6: " + palindrome);
		sb.reverse();
		System.out.println("7: " + palindrome);

		StringBuilder sb2 = new StringBuilder(15);
		sb2.append("Dot saw i was Tod");
		sb2.reverse();

		System.out.println("8: " + sb2);
		System.out.println("9: " + palindrome);

	}
}