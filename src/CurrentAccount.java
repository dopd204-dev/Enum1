import java.util.ArrayList;
import java.util.List;

public class CurrentAccount implements Transferable {

    private String accountNumber;
    private double balance;
    private List<String> history = new ArrayList<>();

    public CurrentAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            history.add("Салынды: +" + amount);
        }
    }

    @Override
    public void transfer(Transferable recipient, double amount) {

        if (amount <= 0) {
            System.out.println("Которуу суммасы туура эмес!");
            return;
        }

        if (balance < amount) {
            System.out.println("Акча жетишсиз!");
            history.add("Ийгиликсиз которуу: -" + amount);
            return;
        }

        balance -= amount;
        recipient.deposit(amount);

        history.add("Которулду: -" + amount);
    }

    @Override
    public void showHistory() {
        System.out.println("История операций №" + accountNumber);
        for (String record : history) {
            System.out.println(record);
        }
    }

    @Override
    public void showInfo() {
        System.out.println("CurrentAccount №" + accountNumber +
                " | Баланс: " + balance);
    }
}