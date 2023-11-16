import java.util.Scanner;

public class VendingMachine{

	static Scanner input = new Scanner(System.in);
	static int qtyCoke = 10;
	static int qty7up=10;
	static int qtyfanta=2;
	static double totalCash=0;
	static int numTransactions =0;
	
	public static void main(String[] args) 
	{
		menu();
	}
	
	public static void menu()
	{
		System.out.println("Welcome to the Abraham's vending machine");
		System.out.println("**************************************");
		System.out.println("Press 1 for coke");
		System.out.println("Press 2 for 7up");
		System.out.println("Press 3 for fanta");
		System.out.println("**************************************");
		
		String choice = input.next();
		
		switch(choice)
		{
			case"1":
			{
				if(qtyCoke==0)//we put two equals to match for example ==0
				{
					System.out.println("Iten out of stock please choose another item");
					menu();
				}
				String product = "coke";
				double price = 1.20;
				payment(product,price);
			break;
			}
			
			case"2":
			{
				if(qty7up==0)//we put two equals to match for example ==0
				{
					System.out.println("Iten out of stock please choose another item");
					menu();
				}
				String product = "7up";
				double price = 1.10;
				payment(product,price);
			break;
			}
			
			case"3":
			{
				if(qtyfanta==0)//we put two equals to match for example ==0
				{
					System.out.println("Iten out of stock please choose another item");
					menu();
				}
				String product = "fanta";
				double price = 1.00;
				payment(product,price);
			break;
			}
			
			case"a":
			{
				admin();
				break;
			}
			
			case"x":
			{
				System.out.println("System shutting down....");
				System.exit(0);
				break;
			}
			
			default:
			{
				System.out.println("Invalid option please try again");
				break;
			}
		}
		menu();
	}
	
	public static void payment(String productChoice,double transactionprice)
	{
		System.out.println("Enter your panyment.Balance is €"+transactionprice);
		
		double moneyEntered = input.nextDouble();//Please enter payment
		
		while(moneyEntered<transactionprice)
		{
			System.out.println("Enter payment. Balance remaining is €"+(transactionprice-moneyEntered));
			moneyEntered = moneyEntered+ input.nextDouble();
		}
		//Product has been bought
		if(moneyEntered>transactionprice)
		{
			System.out.println("Your change is €"+(moneyEntered-transactionprice));
		}
		System.out.println("Transaction successful please take your product");
		System.out.println("******************************************************");
		numTransactions++;
		totalCash=totalCash+transactionprice;//update total takings with value of the transaction
		
		if(productChoice.equals("coke"))
		{
			qtyCoke--;
		}
		else if(productChoice.equals("7up"))
		{
			qty7up--;
		}
		else
		{
			qtyfanta--;
		}
	}
	
	
	public static void admin()
	{
		System.out.println("Total takings: €"+totalCash);
		System.out.println("Number of transactions: "+numTransactions);
		System.out.println("Average value of a transaction: €"+totalCash/numTransactions);
		System.out.println("coke stock remaining: "+qtyCoke);
		System.out.println("7up stock remaining: "+qty7up);
		System.out.println("fanta stock remaining: "+qtyfanta);
		
		System.out.println("Press r to restock or anyother key to exit admin mode");
		String choice = input.next();
		
		if(choice.equals("r"))
		{
			qtyCoke=10;
			qty7up=10;
			qtyfanta=10;
		}
	}

}
