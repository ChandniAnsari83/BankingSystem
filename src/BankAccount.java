import java.util.ArrayList;

public class BankAccount {
        private final String name;
        private final String accNumber;
        private double balance;

        private final ArrayList<Transaction> transactions = new ArrayList<>();

        //constructor
        BankAccount(String name, String accNumber, double balance){
            this.name = name;
            this.accNumber = accNumber;
            this.balance = balance;
        }

        //getter and setter
        public String getName(){
            return name;
        }

        //deposit amount
        public void deposit(double amount){
            balance = balance + amount;
            //keeping history
            Transaction transaction = new Transaction("Deposit", amount);
            transactions.add(transaction);
        }
        //withdraw amount
        public void withdraw(double amount){
            if(amount > balance){
                System.out.println("Insufficient balance!");
            } else {
                balance = balance - amount;
                Transaction transaction = new Transaction("Withdraw", amount);
                transactions.add(transaction);
            }
        }

        //display amount or get balance
        public void displayBalance(){
            System.out.println(name+" who's account number is: "+accNumber);
            System.out.println("Total balance is: "+ balance);
        }

        //display records or transactions
        public void displayTransactions(){
            for(int i = 0; i < transactions.size(); i++) {
                Transaction transaction = transactions.get(i);
                transaction.displayTransaction();
            }
//        for (Transaction transaction : transactions) {
//            transaction.displayTransaction();
//        }
        }
    }


