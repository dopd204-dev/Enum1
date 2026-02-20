public class Main {
    public static void main(String[] args) {

        CurrentAccount current1 = new CurrentAccount("001");
        CurrentAccount current2 = new CurrentAccount("002");
        SavingsAccount savings = new SavingsAccount("003");

        current1.deposit(1000);
        current2.deposit(500);
        savings.deposit(2000);

        current1.transfer(current2, 300);
        current1.transfer(current2, 2000);

        Accountable[] accounts = {current1, current2, savings};

        System.out.println("=== Бардык эсептер ===");
        for (Accountable acc : accounts) {
            acc.showInfo();
        }

        System.out.println("\n=== История ===");
        current1.showHistory();
        current2.showHistory();
    }
}