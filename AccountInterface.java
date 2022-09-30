public interface AccountInterface{

	public void withdraw(double amount);

	public void deposit(double amount);

	public void transfer(double amount, Account destinationAccount);

	public void printStatement();
}