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
		/*
		 * In the main method the user will have to enter in their name an their score.
		 * The system will then call the main source of code from the system method.
		 */
		System.out.println("Please enter in your score");
		int score =input.nextInt();
		/*
		 * Once I declared the parameters in the main method then I 
		 * call these two parameters which can be seen down below.
		 */
		system(name,score);//calls the system method
	}
	
	public static void system(String name,int score)
	{
		//< is for less while > is for greater plus = is for equals
		if(score <100 && score >=85)
		{/*
		*&& is for making sure that both conditions are met
		*it will then be true
		*/
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
			/*
			 * This else statement is for if the user adds a number 
			 * that is not part of the grading system 
			 * for example entering the number 111 the system will say
			 * invalid option
			 */
			System.out.println("Invalid option "+name);
			System.exit(0);
			//the system will shut down because of wrong attempt
		}
	}
}
