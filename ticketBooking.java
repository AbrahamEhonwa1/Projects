import java.text.DecimalFormat;
import java.util.Scanner;

public class ticketBooking
{
	static double childregular = 9.80;
	static double adultmax = 17.95;
	static double adultregular = 12.04;
	static double childmax = 14.84;
	
	 
	
	static Scanner input= new Scanner(System.in);
	static DecimalFormat currency = new DecimalFormat("€0.00");
	static int transactionchildTickets =0;
	static double Cash =0;//here is another example of data type conversion instead of using an integer I decided to use a double to round it down to the cents
	static int numTransaction =0;
	static int numadultTicketSold =0;
	static int transactionadultTickets =0;
	static int numchildTicketSold =0;
	
	static String  [] name =new String[1];
	static int  [] phoneNumber =new int[1];
	static String  [] email =new String[1];
	public static void main(String[] args) 
	{
		menu();
	}
	
	public static void menu()
	{
		System.out.println("*********************************");
		System.out.println("Press 1 to a choose movie");
		System.out.println("Press 2 for transaction");
		System.out.println("Press 3 to shut down the system");
		System.out.println("*********************************");
		int choose = input.nextInt();
	
		switch(choose)
		{
			case 1:
			{
				movie();
				break;
			}
			
			case 2:
			{
				transaction();
				break;
			}
			
			case 3:
			{
				System.out.println("System shutting down...");
				System.exit(0);
				
			}
			
			default:
			{
				System.out.println("Invalid option please try again");
				break;
			}
		}
	}
	
	public static void movie()
	{
		String [] names = {"Joker","Frozen 2","Blue Story"};//This the section that I use one of the arrays
		System.out.println("*************Select A Movie*************");
		System.out.println("Press 1 for "+names[0]);
		System.out.println("Press 2 for "+names[1]);
		System.out.println("Press 3 for "+names[2]);
		System.out.println("****************************************");
		
		int movie = input.nextInt();// here is an example of data type conversions instead of using a string I have used an integer
		
		switch(movie)
		{
			case 1:
			{
				System.out.println("*********************************");
				System.out.println("You have seleted Joker");
				ticketType("Joker");
				break;
			}
			
			case 2:
			{
				System.out.println("*********************************");
				System.out.println("You have seleted Frozen 2");
				ticketType("Frozen 2");
				break;
			}
			
			case 3:
			{
				System.out.println("*********************************");
				System.out.println("You have seleted Blue Story");
				ticketType("Blue Story");
				break;
			}
		}
	}
	
	public static void ticketType(String movie)
	{
		System.out.println("*********************************");
		System.out.println("Press 1 for adult regular ticket");
		System.out.println("Press 2 for adult max ticket");
		System.out.println("Press 3 for child regular ticket");
		System.out.println("Press 4 for child max ticket");
		System.out.println("Press 5 for family tickets");
		System.out.println("Press x to cancel");
		System.out.println("*********************************");
		String ticketType= input.next();
		
		switch(ticketType)
		{
		case "1":
		{
			System.out.println("You have a chosen the Adult regular ticket");
			calcCost(movie,adultregular,"adult");
			break;
		}
		
		case "2":
		{
			System.out.println("You have a chosen the Adult max ticket");
			calcCost(movie,adultmax,"adult");
			break;
		}
		
		case "3":
		{
			System.out.println("You have a chosen the Child regular ticket");
			calcCost(movie,childregular,"child");
			break;
		}
		
		case "4":
		{
			System.out.println("You have a chosen the Child max ticket");
			calcCost(movie,childmax,"child");
			break;
		}
		
		case "5":
		{
			addTicket(movie);
			break;
		}
		
		case "x":
		{
			System.out.println("Transaction Declined!");
			movie();
			break;
		}
		
		default:
		{
			System.out.println("Invalid option please try again");
			ticketType(movie);
		}
		}
	}
	
	public static void addTicket(String movie)
	{
		System.out.println("Enter number of adult tickets");
		int adultTickets = input.nextInt();
		numadultTicketSold++;
		
		
		System.out.println("Enter number of child tickets");
		int childTickets = input.nextInt();
		numchildTicketSold++;
		
		
		System.out.println("Press r for a regular ticket type");
		System.out.println("Press m for a max ticket type");
		String choice = input.next();
		
		
		double adultTransactionPrice=0;
		double childTransactionPrice=0;
		
		
		
		if(choice.equals("r"))
		{
			System.out.println("You have chosen the regular ticket");
			
			adultTransactionPrice = adultregular;
			adultTransactionPrice = adultTransactionPrice * adultTickets;
			
			
			childTransactionPrice = childregular;
			childTransactionPrice = childTransactionPrice * childTickets;
			
			
			
			double transactonPrice = childTransactionPrice + adultTransactionPrice;
			payment(movie,transactonPrice,"family");
			
			
		}
		
		else if(choice.equals("m"))
		{
			System.out.println("You have chosen the max ticket");
			
			adultTransactionPrice = adultmax;
			adultTransactionPrice = adultTransactionPrice * adultTickets;
			numadultTicketSold++;
			
			
			childTransactionPrice = childmax;
			childTransactionPrice = childTransactionPrice * childTickets;
			numchildTicketSold++;
			
			double transactonPrice = childTransactionPrice + adultTransactionPrice;
			payment(movie,transactonPrice,"family");
			
			
		}
		
		else
		{
			System.out.println("Invalid option please try again");
			addTicket(movie);
		}
		
		
		
	}
	
	public static void calcCost(String movie,double transactonPrice,String ticketType)
	{
		
		payment(movie,transactonPrice,ticketType);
	}
	

	
	public static void transaction()
	{
		System.out.println("************************************************");
		System.out.println("Customer name:                \t"+name[0]);
		System.out.println("Customer phone number:        \t"+phoneNumber[0]);
		System.out.println("Customer email:               \t"+email[0]);
		System.out.println("Average Cash per Transaction: \t"+currency.format(Cash/numTransaction));
		System.out.println("Total Tickets Sold:           \t"+(numchildTicketSold+numadultTicketSold));
		System.out.println("Total Number of Transactions: \t"+numTransaction);
		System.out.println("************************************************");
		menu();
	}
	
	public static void payment(String movie,double transactonPrice,String ticketType)
	{
		
		for (int i = 0 ;  i< name.length;i++)
		{
			System.out.println(" ");
			System.out.println("Please enter your name");
			name[i]=input.next();
		
			System.out.println("Please enter your phone number");
			phoneNumber[i]=input.nextInt();
			
			System.out.println("Please enter your email");
			email[i]=input.next();
		
		}
		
		System.out.println("Application Confirmed");
		
		
		System.out.println("************************************************");
		System.out.println("Movie selected:   \t"+movie);
		System.out.println("Transaction price:\t"+ currency.format(transactonPrice));
		System.out.println("************************************************");
		
		System.out.println("Please enter in your payment");
		
		double paymentApproved = input.nextDouble();
		
		while(paymentApproved<transactonPrice)
		{
			System.out.println("Your balance is "+currency.format(transactonPrice-paymentApproved));
			System.out.println("Please pay");
			paymentApproved = paymentApproved + input.nextDouble();
		}
		
		if(paymentApproved>transactonPrice)
		{
			System.out.println("Change: "+currency.format(paymentApproved-transactonPrice));
		}
		else
		{
			System.out.println("Transaction Unsuccessful please try again");
			payment(movie,transactonPrice,ticketType);
		}
		
		Cash = Cash + transactonPrice;
		numTransaction++;
		
		if(ticketType.equals("adult"))
		{
			numadultTicketSold++;
		}
		
		else if(ticketType.equals("child"))
		{
			numchildTicketSold++;
		}
		
		else
		{
			numadultTicketSold= numadultTicketSold +transactionadultTickets;
			numchildTicketSold= numchildTicketSold +transactionchildTickets;
		}
		menu();
	}
	
	
	

}
