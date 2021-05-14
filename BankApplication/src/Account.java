
public class Account {
		int currentTransaction;
		int balance=0;
		
		String customerName;
		int customerId;
		int password;
		Account(String CN, int CI){
			customerName = CN;
			customerId = CI;
		}
		
		
		int deposit(int amount) {
			balance = balance + amount;
			currentTransaction = balance;
			return balance;
		}
		int withdraw(int amount) {
			if(balance>=amount) {
				balance = balance-amount;
				currentTransaction = -balance;
				return balance;
				
			}
			else {
				System.out.println("Not enough money in account");
				System.out.println("Current balance is "+ balance);
			}
			return 0;
		}
		void previousTransaction() {
			if(currentTransaction>0) {
				System.out.println("In the previous transacton amount was deposited");
				System.out.println("The total aount deposited is " + balance);
			}
			else if (currentTransaction<0) {
				System.out.println("in the previous transaction amount was withdrawn");
				System.out.println("The total balance is "+Math.abs(currentTransaction));
			}
			else {
				System.out.println("There was no previous transaction ");
				System.out.println("Press (E) to exit");
			}
		}
		
		
}

