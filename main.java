public class main{

	public static void main(String [] Args){

    Client thiago = new Client();
    thiago.setName("Thiago");
    
    Account cc = new CheckingAccount(thiago);
    Account poup = new SavingsAccount(thiago);

    cc.deposit(300);
    cc.printStatement();
    poup.printStatement();
    
	}
}