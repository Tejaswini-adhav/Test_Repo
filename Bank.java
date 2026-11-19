class Bank 
{

public void checkBalance()
{

System.out.println("--------Check balance method in bank class--------");

}

public void displayBalance()
{

System.out.println("--------Display balance method in bank class--------");

}


public static void main(String [] args)
{

Bank bank=new Bank();
bank.checkBalance();
bank.displayBalance();

}
}