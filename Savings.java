
public class Savings extends BankAccount {
	
	private double interestRate;
	
	public Savings() {
		super();
		interestRate = 0;
	}
	
	public void SetInterestRate(double ir) {
		interestRate = ir;
	}
	
	
	public double GetInterestRate() {
		return interestRate;
	}
	
	
	public double MonthlyFees() {
		return 5.0;
	}
	
	public void DisplayFees() {
		System.out.println("Account Number: " + "\t" + this.GetAccountNumber() + "\n" +
				"Interest Rate: " + this.GetInterestRate() + "\n" +
				"Monthly Fees: " + this.MonthlyFees());
	}
}
