package CurrencyConverter;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

   public TransactionHistory transactionHistory = new TransactionHistory();

    public double exchange(InitialCurrency initialCurrency, InitialCurrency targetCurrency, double amount) {
        if (initialCurrency == targetCurrency) {
            return amount;
        } else {
            double result = (amount * initialCurrency.getCoefficient() / targetCurrency.getCoefficient());
            transactionHistory.addTransaction(amount, initialCurrency.getNameOfInitialCurrency(), result, targetCurrency.getNameOfInitialCurrency());
            return result;
        }

    }

    public void displayTransactions() {
        transactionHistory.printTransactions();
    }


}
