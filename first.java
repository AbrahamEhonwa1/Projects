package Year_1;
import java.util.Scanner;
public class first {
 static Scanner input = new Scanner(System.in);
	public static void main(String [] args)
	{
		//The main method is being used to allow the user to select what method they want to access
		System.out.println("Pleasee select what method you want");
		System.out.println("1 for Declare");
		System.out.println("2 for Input");
		
		int respond=input.nextInt();//This will capture the input of the user
		
		if(respond == 1)//if the user selects 1 the system will automatically go to the declare method
		{
			declare();
		}
		else if(respond == 2)  //if the user selects 2 the system will automatically go to the input method
		{
			input();
		}
		else 
		{
			System.out.println("Wrong answer System Shutting Down...."); /* This is added so if the user does not enter in the right 
			selection the system will shut down
			*/
			System.exit(respond);
		}
	}
	
	public static void declare()
	{
		String name="Abraham Ehonwa";// I declared a string which is a variable and then I added the value
		System.out.println(name);
	}
	
	public static void input()
	{
		
		System.out.println("What is your name?"); //This is used to print out text in java
		String answer = input.nextLine(); //By adding in the nextLine that allows for a space and to add extra text
		System.out.println("My name is "+answer); //The input the user put in will be printed through the print method
	}
	
}
