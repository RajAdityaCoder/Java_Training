
class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private boolean isActive;
    private int pin;

    public BankAccount(String accountNumber, String accountHolderName, double balance, String accountType, boolean isActive, int pin) {
        if (accountNumber == null || accountNumber.length() < 8) {
            throw new IllegalArgumentException("Invalid account number");
        }
        if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid account holder name");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Invalid balance");
        }
        if (pin < 1000 || pin > 9999) {
            throw new IllegalArgumentException("pin must be 4 digits");
        }
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.isActive = isActive;
        this.pin = pin;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Is Active: " + isActive);
        System.out.println("Pin: " + pin);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public int getPin() {
        return pin;
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount("ACC12345", "Aditya Raj Chaudhary", 10000, "Savings", true, 1234);
        System.out.println("Account Number: " + obj.getAccountNumber());
    }
}
