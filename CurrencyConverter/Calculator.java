package CurrencyConverter;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Transaction> transactions = new ArrayList<>();



    public double exchange(InitialCurrency initialCurrency, InitialCurrency targetCurrency, double amount) {
        if (initialCurrency == targetCurrency) {
            return amount;
        } else {
            double result = (amount * initialCurrency.getCoefficient() / targetCurrency.getCoefficient());
            Transaction transaction = new Transaction(initialCurrency, targetCurrency, amount, result);
            transactions.add(transaction);
            return result;
        }

    }
public void displayTransactions(){


    System.out.println(transactions);
}


}
