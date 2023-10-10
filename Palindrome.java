package learn;
import java.util.Scanner;
public class Palindrome {
	public static void main(String [] args) {
		Scanner input= new Scanner(System.in);
		/*
		 * The system will allow the user to enter in a word
		 * and see if the word was in reverse would it still appear the same
		 * that is called a palindrome
		 */
		System.out.println("Please enter in a word");
		
		String word=input.next();
		String second="";
		second=second.toLowerCase();
		for(int i=word.length()-1;i>=0;i--)
		{
			second=second +word.charAt(i);
		}
		
		if(word.equals(second))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
}
