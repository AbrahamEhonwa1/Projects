
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    String word="";
		while(!word.equals("stop"))
		{
		    System.out.println("What is your name");
		    word=input.nextLine();
		}
	}
}
