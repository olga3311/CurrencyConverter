package CurrencyConverter;

import java.util.ArrayList;
import java.util.List;
/**
 * Класс TransactionHistory сохраняет все транзакции.
 */
public class TransactionHistory {

    private List<Transaction> transactions;
    /**
     * Конструктор инициализирует пустой список транзакций.
     */
    public TransactionHistory() {
        transactions = new ArrayList<>();

    }
    /**
     * Метод добавляет новую транзакцию в список.
     *
     * @param amount сумма в исходной валюте
     * @param fromCurrency исходная валюта
     * @param convertedAmount сумма в целевой валюте
     * @param toCurrency целевая валюта
     */
    public void addTransaction(double amount, String fromCurrency, double convertedAmount, String toCurrency) {
        transactions.add(new Transaction(amount, fromCurrency, convertedAmount, toCurrency));

    }
    /**
     * Метод выводит все транзакции в консоль.
     */
    public void printTransactions() {
        for (int i = 0; i < transactions.size(); i++) {
            String transaction = String.valueOf(transactions.get(i));

            System.out.println(transaction);
        }
    }
}