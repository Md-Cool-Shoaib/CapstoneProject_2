public class Main {
    public static void main(String[] args) {

        // Create accounts
        BankAccount acc1 = new BankAccount("AC001", 1000);
        BankAccount acc2 = new BankAccount("AC002", 800);

        // Show details
        acc1.getAccountNumber();
        acc1.getBalance();

        acc2.getAccountNumber();
        acc2.getBalance();

        // Perform transactions
        acc1.deposit(500);
        acc1.withdraw(200);

        acc2.withdraw(1000); // should show insufficient funds

        // Show updated balances
        System.out.println("Updated Balances:");
        acc1.getBalance();
        acc2.getBalance();

        // Show total bank money
        System.out.println("Total money in bank: " + BankAccount.totalBankMoney);
    }
}
