# Self-Learning-Java-Projects

Introduction to Object Oriented Java

Q1(DONE)
The exercise template comes with a ready-made class named Account. The Account object represents a bank account that has balance (i.e. one that has some amount of money in it). The accounts are used as follows:

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

Q1b(DONE)
The Account from the previous exercise class is also available in this exercise.

Write a program that:

Creates an account named "Matthews account" with the balance 1000
Creates an account named "My account" with the balance 0
Withdraws 100.0 from Matthew's account
Deposits 100.0 to "my account"
Prints both the accounts

Q2
Create a class named Room. Add the variables private String code and private int seats to the class. Then create a constructor public Room(String classCode, int numberOfSeats) through which values are assigned to the instance variables.
This class doesn't do much either. However, in the following exercise the object instantiated from our class is already capable of printing text.


