import java.util.Scanner;
class WithDrawMoney 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double balance=10000.50;
		int pass=1234;
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Welcome"+name+"please enter your password");
		int password=sc.nextInt();
		if(pass==password)
        {
          System.out.println("Enter the amount");
		  int amount=sc.nextInt();
		  if(amount<=balance)
		  {
		    System.out.println(amount+"with drawn successfully");
		    balance=balance-amount;
		    System.out.println("Available balance "+balance);
		  }
          else
		  {
			System.out.println("Insuffient Funds");
		  }
		}
        else
		{
			System.out.println("Incorect password");
        }
	}
}
