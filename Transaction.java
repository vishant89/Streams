public class Transaction {
    private int id;
    private String currency;
    private double amount;

    public Transaction(int id, String currency, double amount) {
        this.id = id;
        this.currency = currency;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}
