import java.util.Scanner;
public class Main
{
    
    public static final Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
	    System.out.println("Nested loops examples");
	     System.out.println("Press 1 for stars");
	     System.out.println("Press 2 for timetable");
	     
	     int choose=input.nextInt();
	     
	     switch(choose)
	     {
	   
	         case 1:
	             {
	                 star();
	                 break;
	             }
	             case 2:
	             {
	                 maths();
	                 break;
	             }
	     }
	}
	
	public static void star()
	{
	  	int rows=5;
		int star=1;
		
		for(int i=1;i<=rows;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
	
	public static void maths()
	{
	    int row=9;
	    int num=9;
	    
	    for(int i=1;i<=row;i++)
	    {
	        for(int j=1;j<=num;j++)
	        {
	            System.out.print(i*j);
	        }
	        System.out.println();
	    }
	}
}
