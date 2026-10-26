import java.util.Scanner;

public class Main {
    static void main() {
        BankAccount acc1 = new BankAccount("Chandni Ansari", "2107", 60000);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("========================================");
            System.out.println("              Bank Account");
            System.out.println("========================================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    acc1.displayBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    acc1.deposit(amount);
                    System.out.println("Amount deposited successfully!");
                    break;
                case 3:
                    System.out.print("Enter amount to Withdraw: ");
                    double amount2 = sc.nextDouble();
                    acc1.withdraw(amount2);
                    System.out.println("Withdraw successfully!");
                    break;
                case 4:
                    System.out.println("Transaction History selected");
                    acc1.displayTransactions();
                    break;
                case 5:
                    System.out.println("Thank you for using our ATM!");
                    break;
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}

