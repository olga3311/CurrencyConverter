package CurrencyConverter;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {

    private List<Transaction> transactions;

    public TransactionHistory() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(double amount, String fromCurrency, double convertedAmount, String toCurrency) {
        transactions.add(new Transaction(amount, fromCurrency, convertedAmount, toCurrency));

    }

    public void printTransactions() {
        for (int i = 0; i < transactions.size(); i++) {
            String transaction = String.valueOf(transactions.get(i));

            System.out.println(transaction);
        }
    }
}