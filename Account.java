public abstract class Account implements AccountInterface{

    protected static final int DEFAULT_BRANCH = 0001;
    protected static int SEQUENCIAL = 1;

	protected int branch;
	protected int number;
	protected double balance;
	protected Client client;

	public Account(Client client){
		this.branch = Account.DEFAULT_BRANCH;
		this.number = Account.SEQUENCIAL++;
		this.client = client;
	}

	@Override
	public void withdraw(double amount){
		balance -= amount;
	}

	@Override
	public void deposit(double amount){
		balance += amount;		
	}

	@Override
	public void transfer(double amount, Account destinationAccount){
		this.withdraw(amount);
		destinationAccount.deposit(amount);		
	}

	public Integer getBranch(){
		return branch;
	}

	public Integer getNumber(){
		return number;
	}

	public Double getBalance(){
		return balance;
	}

	protected void printCommonInfo(){
		System.out.println(String.format("\nAccount Owner: %s", this.client.getName()));
		System.out.println(String.format("Branch: %d", this.branch));
    	System.out.println(String.format("Account Number: %d", this.number));
    	System.out.println(String.format("Balance: %.2f\n", this.balance));
    	System.out.println(" === End of Statement === \n");
	}
}