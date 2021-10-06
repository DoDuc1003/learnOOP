public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Constructor.
     */
    Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * set Operation.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * set Balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * set Amount.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * get operation.
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * get amount.
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     * get balance.
     */
    public double getBalance() {
        return this.balance;
    }
}
