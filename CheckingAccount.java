public class CheckingAccount extends Account{

    public CheckingAccount(Client client){
        super(client);
    }

    @Override
    public void printStatement(){
    	System.out.println("\n === Checking Account Statement === ");
    	super.printCommonInfo();
    }	
}