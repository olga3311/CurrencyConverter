package CurrencyConverter;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

   public TransactionHistory transactionHistory = new TransactionHistory();

    public double exchange(Currency initialCurrency, Currency targetCurrency, double amount) {
        if (initialCurrency == targetCurrency) {
            return amount;
        } else {
            double result = (amount * initialCurrency.getCoefficient() / targetCurrency.getCoefficient());
            transactionHistory.addTransaction(amount, initialCurrency.getName(), result, targetCurrency
                    .getName());
            return result;
        }

    }

    public void displayTransactions() {
        transactionHistory.printTransactions();
    }


}
