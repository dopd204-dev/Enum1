 public class SavingsAccount implements Accountable {

    private String accountNumber;
    private double balance;

    public SavingsAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void showInfo() {
        System.out.println("SavingsAccount №" + accountNumber +
                " | Баланс: " + balance);
    }
}