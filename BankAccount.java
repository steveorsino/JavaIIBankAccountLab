
/*BankAccount abstract super class
 * March 15, 2017
 */


public abstract class BankAccount {
	
	private String acctNumber;
	
	
	public BankAccount()
	{
		
		acctNumber = "123-45-6789";
	}
	
	public void SetAccountNumber(String acct)
	{
		acctNumber = acct;
	}
	
	public String GetAccountNumber()
	{
		return acctNumber;
	}
	
	public abstract double MonthlyFees();
	
	public void DisplayFees()
	{
		System.out.println("Account Number " + acctNumber);
	}
		
}
