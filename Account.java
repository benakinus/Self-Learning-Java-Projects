/*The exercise template comes with a ready-made class named Account.
The Account object represents a bank account that has balance
(i.e. one that has some amount of money in it). The accounts
are used as follows:
Write a program that creates an account with a balance of 100.0, 
deposits 20.0 in it, and finally prints the balance. NB! 
Perform all the operations in this exact order.*/

public class Account {
  String name ;
  double balance = 0.0;
  
  public Account(String name, double balance){
    this.name = name;
	this.balance = balance;
    System.out.println(balance);
  }
  
  public double withdraw(double money){
    this.balance = balance;
    balance = balance-money;
    return balance;
  }
  public double deposit(double money){
    this.balance = balance;
    balance = balance+money;
    return balance;
  }
  public double balance(){
    return balance;
  }
  /* Running the test for the Account class ends up providing hash code when trying to 
  	 print out the two objects, since this is the test code I won't change it, but I am currently unsure
     on how to fix it within editing the test code ( I could fix it by printing objectname.balance(), but that 
     would require me to edit the provided test code)*/
    public static void main(String[] args) {
    
     Account artosAccount = new Account("Arto's account", 100.00);
     Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

	      System.out.println("Initial state");
		  System.out.println(artosAccount);
		  System.out.println(artosSwissAccount);

          artosAccount.withdraw(20);
          System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
          artosSwissAccount.deposit(200);
          System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

          System.out.println("End state");
          System.out.println(artosAccount);
          System.out.println(artosSwissAccount);
    
  }

}
