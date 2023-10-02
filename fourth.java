package coding101;
import java.util.Scanner;
public class fourth {
	public static void main(String [] args) {
		//Simple while loop code
		Scanner input=new Scanner(System.in);
		
		int count =1;
		while(count<=10)
		{
			System.out.println(count);
			count++;
		}
		System.out.println("Finished");
		System.out.println(" ");
		
		/*
		 * As we can see by using the while loop
		 * count will start at 1 but the while loop has conditions which we can see
		 * if the count is less or equaled to 10 the while loop will stop and the
		 * finished message will be displayed
		 */
		
		System.out.println("Press 1 to print name 10 times");
		System.out.println("Press 2 to shut down system");
		int ch=input.nextInt();
		
		switch(ch)
		{
			case 1:
			{
				next();
				break;
			}
				case 2:
				{
					System.out.println("System shutting down......");
					System.exit(0);
				}
		}
		
		
	}
	
	public static void next() {
		int num=1;
		String n="Abraham";
		while(num<=10) {
			System.out.println(num+": "+n);
			num++;//this will update the number so it starts at one when it reaches num++ it will then be 2
		}
	}
}
