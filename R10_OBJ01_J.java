public class R10_OBJ01_J {
    
    // Non-compliant code - public mutable field
    public class BankAccountNonCompliant {
        public double balance; // Public mutable field - dangerous!
    }
    
    // Compliant solution - private field with accessors
    public class BankAccountCompliant {
        private double balance;
        
        public double getBalance() {
            return balance;
        }
        
        public void setBalance(double balance) {
            if (balance < 0) {
                throw new IllegalArgumentException("Balance cannot be negative");
            }
            this.balance = balance;
        }
        
        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
            this.balance += amount;
        }
        
        public void withdraw(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds");
            }
            this.balance -= amount;
        }
    }
}