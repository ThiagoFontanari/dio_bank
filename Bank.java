public class Bank{

	private String name;
	private List<Account> Accounts;

	public String getName(){
		return name;
	}

	public String setName(String name){
		this.name = name;
	}

	public List<Account> getAccounts(){
		return Accounts;
	}

	public void setAccounts(){
		this.Accounts = Accounts;
	}
}