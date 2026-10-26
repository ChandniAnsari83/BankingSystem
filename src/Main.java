import java.util.Scanner;

public class Main {
        static void main() {
            Scanner sc = new Scanner(System.in);
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
            switch (choice){
                case 1:
                    System.out.println("Check Balance Selected");
                    break;
                case 2:
                    System.out.println("Deposit Money Selected");
                    break;
                case 3:
                    System.out.println("Withdraw Money selected");
                    break;
                case 4:
                    System.out.println("Transaction History selected");
                    break;
                case 5:
                    System.out.println("Thank you for using our ATM!");
                    break;
                default:
                    System.out.println("Invalid!");
            }
//        BankAccount acc1 = new BankAccount("Chandni Ansari", "2107", 60000);
//        BankAccount acc2 = new BankAccount("Nandni Gupta", "2110", 50000);
//        acc1.deposit(40000);
//        acc1.withdraw(10000);
//        acc1.displayBalance();
//
//        acc2.deposit(10000);
//        acc2.withdraw(15000);
//        acc2.displayBalance();
//        acc1.displayTransactions();
        }
    }
