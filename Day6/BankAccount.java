
class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private boolean isActive;
    private int pin;

    public BankAccount(String accountNumber, String accountHolderName, double balance, String accountType, boolean isActive, int pin) {
        if (accountNumber == null || accountNumber.length() < 8) {
            System.out.println("Invalid account number");
            return;
        }
        if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
            System.out.println("Invalid account holder name");
            return;
        }
        if (balance < 0) {
            System.out.println("Invalid balance");
            return;
        }
        if (pin < 1000 || pin > 9999) {
            System.out.println("pin must be 4 digits");
            return;
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

    public static void main(String[] args) {
        String accountNumber = "12345678";
        String accountHolderName = "Adi";
        double balance = 10000;
        String accountType = "Savings";
        boolean isActive = true;
        int pin = 1234;
        BankAccount obj = new BankAccount(accountNumber, accountHolderName, balance, accountType, isActive, pin);
        obj.displayDetails();
    }
}
