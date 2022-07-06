public class BankAccount {
    int accountNumber;
    String accountType;
    int balance;
    
    public BankAccount(int accNo , String accType , int bal){
        this.accountNumber = accNo;
        this.accountType = accType;
        this.balance = bal;
}
    
    public void amountWithdraw(int amount){
        if(this.balance<amount){
            System.out.println("Your Account Balance is not enough......");
        }else{
        this.balance -= amount;
        System.out.println("debited.....");
        }
    }
    
    public void amountDeposit(int amount){
        this.balance += amount;
        System.out.println(amount + "credited.....");
    }
    
    public void accountClosure(){
        System.out.println("Account DELETED..!!!!!");
    }


}
