package coding101;
import java.util.Scanner;
public class third {
	public static void main(String [] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Press 1 to count up");
		System.out.println("Press 2 to count down");
		System.out.println("Press 3 to count up in 2s");
		int choose =input.nextInt();
		
		System.out.println("Enter in your number");
		int number =input.nextInt();
		
		switch(choose) {
			
			case 1:
			{
				countUp(number);
				break;
			}
				case 2:
				{
					countDown(number);
					break;
				}
					case 3:
					{
						countTwo(number);
						break;
					}
						default:
						{
							System.out.println("Invalid Option");
						}
		}
		
		
	}
	
	public static void countUp(int number)//this method counts up using the for loop
	{
		for(int i=0;i<=number;i++)//Something simple to count up to 10
		{
			System.out.print(i+" ");
		}
	}
	
	public static void countDown(int number)//this method counts down using the for loop
	{
		for(int i=number;i>=0;i--)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void countTwo(int number)//this method counts up by two using the for loop
	{
		for(int i=1;i<=number;i++)
		{
			System.out.print(i*2+" ");
		}
	}
}
