package CurrencyConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс <b>Calculator<b/> предоставляет методы для выполнения валютных операций и ведения истории транзакций.
 * @author Olga Kulaga(Volha Kulaha)
 */


public class Calculator {

    /**
     * Объект TransactionHistory для хранения и управления историей транзакций.
     */

    public TransactionHistory transactionHistory = new TransactionHistory();

    /**
     * Выполняет обмен валюты из начальной в целевую валюту.
     * Если начальная и целевая валюты совпадают, возвращает исходную сумму.
     * В противном случае рассчитывает результат обмена и добавляет транзакцию в историю.
     *
     * @param initialCurrency начальная валюта
     * @param targetCurrency  целевая валюта
     * @param amount          сумма для обмена
     * @return результат обмена в целевой валюте
     */

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

    /**
     * Отображает историю транзакций.
     */

    public void displayTransactions() {
        transactionHistory.printTransactions();
    }


}
