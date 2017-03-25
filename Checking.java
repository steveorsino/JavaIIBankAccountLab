
public class Checking extends BankAccount {
	
	private int numChecksWritten;
	
	public Checking() {
		super();
		numChecksWritten = 0;
	}
	
	public void WriteCheck() {
		numChecksWritten++;
	}
	
	public void NewMonth() {
		numChecksWritten = 0;
	}
	
	public double MonthlyFees() {
		double fees = 10.0;
		fees += (numChecksWritten * .1);
		return fees;
	}
	
	public void DisplayFees() {
		System.out.println("Account Number: " + "\t\t" + this.GetAccountNumber() + "\n" +
				"Number of Checks Written: " + "\t"+ this.numChecksWritten + "\n" +
				"Monthly Fees: " + "\t\t\t"+ this.MonthlyFees());
	}

}
