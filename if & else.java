package coding101;

public class fifth {
	public static void main(String [] args)
	{
		/*
		 * This code uses a for loop to count from 1 to 100 
		 * but if a number is divisble by 3 call it fizz
		 * if it is divisble by 5 call it buzz
		 * if it is divisble by both call it fizz buzz
		 */
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0) {
				System.out.println("Fizz Buzz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
