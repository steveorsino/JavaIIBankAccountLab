import java.util.Scanner;
public class BankAccountMain {

	public static void main(String[] args) {
		Checking check = new Checking();
		Savings save = new Savings();
		int monthlyChecks = 0;
		double interestrate = 0.0;
		String accountNumber;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to BankAccountMain.java\n");
		
		System.out.println("What is the Account Number on your Savings account?");
		accountNumber = input.nextLine();
		save.SetAccountNumber(accountNumber);
		
		System.out.println("What is the Interest Rate on your Savings account?");
		interestrate = input.nextDouble();
		input.nextLine();
		
		save.SetInterestRate(interestrate);
		
		System.out.println("Your Savings Account details:");
		save.DisplayFees();
		
		System.out.println("\n\n");
		
		System.out.println("What is the Account Number on your Checking Account?");
		accountNumber = input.nextLine();
		check.SetAccountNumber(accountNumber);
		
		System.out.println("How many checks did you write this month?");
		monthlyChecks = input.nextInt();
		
		for (int i = 0; i < monthlyChecks; i++) {
			check.WriteCheck();
		}
		
		System.out.println("Your Checking Account details:");
		check.DisplayFees();
		
		System.out.println("\n\nAt the beginning of the month...");
		check.NewMonth();
		check.DisplayFees();
		input.close();
	}

}
