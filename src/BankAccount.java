public class BankAccount {
    private final String accountNumber;
    private double balance;
    static double totalBankMoney;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber= accountNumber;
        if (balance < 500){
            System.out.println("Error: Minimum 500 required");
            this.balance =0;
        }else{
            this.balance= balance;
            totalBankMoney += balance;
        }
    }
    public void getBalance(){
        System.out.println(this.balance);
    }
    public void getAccountNumber(){
        System.out.println(this.accountNumber);
    }
    public void deposit(double x){
        this.balance += x;
        totalBankMoney +=x;
    }
    public void withdraw(double x){
        if (x <= this.balance){
            this.balance -= x;
            totalBankMoney -=x;
        }else{
            System.out.println("Insufficient funds");
        }
    }


}
