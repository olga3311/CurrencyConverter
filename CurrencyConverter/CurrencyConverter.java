package CurrencyConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * Главный класс приложения, отвечающий за инициализацию и запуск конвертера валют.
 *
 */

public class CurrencyConverter {

    /**
     * Точка входа в приложение.
     * Инициализирует список валют и запускает основной цикл работы конвертера валют.
     *
     * @param args аргументы командной строки
     */

    public static void main(String[] args) {

        // Инициализация списка валют


        List<Currency> currencies = new ArrayList<>();
        currencies.add(new Currency("EURO", 1));
        currencies.add(new Currency("USD", 0.92));
        currencies.add(new Currency("GBP", 1.18));


        System.out.println("You are welcome in currency converter!");

        Calculator calculator = new Calculator();

        UserMenu userMenu = new UserMenu();

        // Основной цикл работы приложения
        while (true) {

            // Отображение меню для выбора начальной валюты
            Currency x = userMenu.displayMenu(true, currencies);


            if (x == null) {
                // Вызов метода для отображения истории транзакций
                calculator.displayTransactions();

            } else {
                // Считывание суммы для обмена
                double v = userMenu.readAmount();

                // Отображение меню для выбора целевой валюты
                Currency y = userMenu.displayMenu(false, currencies);

                // Выполнение обмена валют
                double result = calculator.exchange(x, y, v);
                System.out.println("You receive: " + result + " " + y.getName());
                System.out.println("=======================================");

            }


        }
    }
}
