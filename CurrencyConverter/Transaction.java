package CurrencyConverter;

public class Transaction {


    private String timeStamp;
    private double amount;
    private String fromCurrency;
    private double convertedAmount;
    private String toCurrency;

    public Transaction(double amount, String fromCurrency, double convertedAmount, String toCurrency) {
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.convertedAmount = convertedAmount;
        this.toCurrency = toCurrency;
    }

    @Override
    public String toString() {
        return "Transaction:" +
                "timeStamp='" + timeStamp + '\'' +
                ", amount=" + amount +
                ", from'" + fromCurrency + '\'' +
                ", convertedAmount=" + convertedAmount +
                ", to" + toCurrency + '\'' +
                '}';
    }
}


