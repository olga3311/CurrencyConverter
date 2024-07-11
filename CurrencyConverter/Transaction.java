package CurrencyConverter;

public class Transaction implements TransactionInterface{

    public Transaction(InitialCurrency initialCurrency, InitialCurrency targetCurrency, double amount,double result){}

    @Override
    public String toString() {
        return "Transaction{}";
    }
}
