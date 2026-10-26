public class Transaction {
        private String type;
        private double amount;

        Transaction(String type, double amount){
            this.type = type;
            this.amount = amount;
        }
        public void displayTransaction(){
            System.out.println("Type: "+ type);
            System.out.println("Amount: "+ amount);
        }
    }

