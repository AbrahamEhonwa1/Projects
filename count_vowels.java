package learn;
import java.util.Scanner;
public class count_vowels {
	public static void main(String [] args)
	{
		
		/*
		 * This system will ask the user to enter in a word
		 * once the user put its a input the system
		 * will count the amount of vowels in the word
		 */
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter in a word");
		String word=input.next();
		word=word.toLowerCase();
		
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='a'||word.charAt(i)=='o'||word.charAt(i)=='e'||word.charAt(i)=='u'||word.charAt(i)=='i')		
			{
				count++;
			}
		}
		
		System.out.println("The word "+word+" has "+count);
	}
}
