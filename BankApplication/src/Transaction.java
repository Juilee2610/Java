import java.util.Scanner;

public class Transaction extends Account{

	Transaction(String CN, int CI) {
		super(CN, CI);
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you name");
		String name = scan.nextLine();
		System.out.println("Enter customer Id");
		int id = scan.nextInt();
		System.out.println("Welcome "+name);

		Account obj = new Account(name,id);
		String option;
		do {
			System.out.println("Enter the option ");
			System.out.println("A. View your savings");
			System.out.println("B. Deposit money");
			System.out.println("C. Withfraw money");
			System.out.println("D. View Previous transaction");
			System.out.println("E. Exit");
			option = scan.next();
			
			switch(option){
				case "A":{
					System.out.println("Your current balance is "+Math.abs(obj.balance));
					break;
			}
				case "B":{
					System.out.println("Enter the amount to be deposited: ");
					int amount = scan.nextInt();
					obj.deposit(amount);
					System.out.println("The amount has been deposited");
					break;
				}
				case "C":{
					System.out.println("Enter the amount to be deposited: ");
					int amount = scan.nextInt();
					obj.withdraw(amount);
					break;
				}
				case "D":{
					obj.previousTransaction();
					break;
				}
				case "E":{
					System.out.println("Thank you for visiting");
					break;
				}
				default:
					System.out.println("Please enter valid option");
					break;
			
		}
		
		
		}
		while(option!="E");
	}	
}
