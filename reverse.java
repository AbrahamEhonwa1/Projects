package learn;
import java.util.Scanner;
public class reverse {
	public static void main(String [] args)
	{
		/*
		 * This system will allow the user to reverse the wor so it displays
		 * backwards
		 */
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter in a word");
		String word=input.next();
		
		for(int i=word.length()-1;i>=0;i--)
		{
			System.out.print(word.charAt(i));
		}
	}
}
