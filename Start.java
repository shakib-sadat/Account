import java.lang.*;
public class Start
{
	public static void main(String []args)
	Account a1 = new Account();
	a1.setAccountNumber(007);
	a1.setAccountHolderName("Mara khao");
	a1.setBalance(00000000000000000);
	System.out.println("account num :"+a1.getAccountName());
	System.out.println("account Holder name:"+a1.getAccountHolderName());
	System.out.println("Balance :"+a1.getBalance());
	
	Account a2 = new account(009, "abar mara khao", 2009);
	a2.showdetails();
}