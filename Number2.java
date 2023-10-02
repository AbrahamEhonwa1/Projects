package coding101;
import java.util.Scanner;
public class Number2 {
	public static void main(String [] args) {
		/*
		 * THIS CODE IS FOR GIVING STUDENTS THIER GRADES 
		 * FROM THIER SCORE FOR EXAMPLE IF JACK GETS 99%
		 * HE WILL GET AN A
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		
		System.out.println("Please enter in your score");
		int score =input.nextInt();
		
		system(name,score);
	}
	
	public static void system(String name,int score)
	{
		if(score <100 && score >=85)
		{
			System.out.println(name+" result is: A");
		}
		else if(score <85 && score >=65)
		{
			System.out.println(name+" result is: B");
		}
		
		else if(score <65 && score >=55)
		{
			System.out.println(name+" result is: C");
		}
		
		else if (score <55 && score >=40)
		{
			System.out.println(name+" result is: D");
		}
		
		else if (score <40)
		{
			System.out.println(name+" result is: Failed");
		}
		
		else
		{
			System.out.println("Invalid option "+name);
		}
		
		
	}
}
