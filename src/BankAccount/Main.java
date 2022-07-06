public class Main {
    public static void main(String[] args){
        BankAccount Siyath = new BankAccount(7750187 , "SAVINGS" , 5000);  //Created an object from a class
        
        /*
        //Assign a value to a object
        Siyath.accountNumber = 123;
        Siyath.balance = 10000;
        Siyath.accountType = "Savings";
        */
        //Siyath.amountDeposit(50000);
       //System.out.println("Your Toatal Balance is : " + Siyath.balance);
        
        Siyath.amountWithdraw(20000);
        System.out.println("ACC No : "+Siyath.accountNumber+ " Your Total Balance is : " + Siyath.balance);
        
       /*
        BankAccount Suhail = new BankAccount();
        Suhail.amountDeposit(10000);
        System.out.println("Your Toatal Balance is : " + Suhail.balance);
        */
    }
}
