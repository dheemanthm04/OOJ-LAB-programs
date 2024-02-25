import java.util.Scanner;

class Account {
    String customerName;
    long accountNumber;
    String accountType;
    double balance;

    Account(String customerName, long accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("\nDeposit of " + amount + " was successful. Balance: " + balance);
    }

    void displayBalance() {
        System.out.println("\nAccount Number: " + accountNumber + "\nCustomer Name: " + customerName + "\nAccount Type: " + accountType + "\nBalance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("\nInsufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("\nWithdrawal of " + amount + " successful. Updated balance: " + balance);
        }
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
    }

    void interest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("\nInterest computed and deposited. Updated balance: " + balance);
    }
}

class CurAcct extends Account {
    double minBalance = 1000;
    double serviceCharge = 50;

    // Constructor
    public CurAcct(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    // Method to withdraw with penalty check
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else if (balance >= amount && balance - amount < minBalance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
            System.out.println("Minimum balance not maintained. Service charge imposed.");
            balance -= serviceCharge;
            System.out.println("Penalty charged. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
	System.out.println("Dheemanth M");
        System.out.println("1BM22CS087");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Savings Account: ");
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        long number = scanner.nextLong();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(name, number, balance);

        System.out.println("Current Account: ");
        System.out.print("Enter customer name: ");
        scanner.nextLine(); // Consume newline
        name = scanner.nextLine();
        System.out.print("Enter account number: ");
        number = scanner.nextLong();
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
        CurAcct currentAccount = new CurAcct(name, number, balance);

        int choice;
        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit to Savings Account");
            System.out.println("2. Withdraw from Savings Account");
            System.out.println("3. Compute Interest for Savings Account");
            System.out.println("4. Deposit to Current Account");
            System.out.println("5. Withdraw from Current Account");
            System.out.println("6. Display Balances");
            System.out.println("7. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount for Savings Account: ");
                    double depositAmount = scanner.nextDouble();
                    savingsAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount for Savings Account: ");
                    double withdrawalAmount = scanner.nextDouble();
                    savingsAccount.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.print("Enter interest rate for Savings Account: ");
                    double interestRate = scanner.nextDouble();
                    savingsAccount.interest(interestRate);
                    break;
                case 4:
                    System.out.print("Enter deposit amount for Current Account: ");
                    double depositCurrent = scanner.nextDouble();
                    currentAccount.deposit(depositCurrent);
                    break;
                case 5:
                    System.out.print("Enter withdrawal amount for Current Account: ");
                    double withdrawalCurrent = scanner.nextDouble();
                    currentAccount.withdraw(withdrawalCurrent);
                    break;
                case 6:
                    System.out.println("\nFinal Balances:");
                    System.out.println("Savings Account:");
                    savingsAccount.displayBalance();
                    System.out.println("\nCurrent Account:");
                    currentAccount.displayBalance();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }
}
