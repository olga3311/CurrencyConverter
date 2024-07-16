package CurrencyConverter;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Класс <b>UserMenu</b> предоставляет методы для отображения меню пользователю для выбора валюты
 * и для считывания суммы от пользователя.
 * @author Olga Kulaga(Volha Kulaha)
 */

public class UserMenu {


    public static Currency displayMenu(Boolean initialMessage, List<Currency> currency) {

        /**
         * Отображает меню для выбора валюты из данного списка.
         * Метод продолжает запрашивать ввод пользователя, пока не будет сделан
         * допустимый выбор или пока пользователь не выйдет, выбрав вариант 0.
         *
         * @param initialMessage флаг Boolean, указывающий, является ли это начальным сообщением
         * @param currency список объектов Currency для отображения в меню
         * @return выбранный объект Currency или null, если Boolean initialMessage истинный и пользователь
         * выбирает вариант (99)
         */

        UserMenuMessage.displayMenu(initialMessage, currency);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            int currencyIndex = scanner.nextInt();
            if ((currencyIndex >= 0) && currencyIndex <= currency.size()) {
                return currency.get(currencyIndex - 1);
            } else if (currencyIndex == 0) {
                exit(0);
            } else if (currencyIndex == 99 && initialMessage) {
                return null;
            }
        }
    }

    /**
     * Запрашивает у пользователя ввод суммы. Метод продолжает запрашивать ввод,
     * пока не будет введена положительная сумма.
     *
     * @return введенная сумма в виде Double
     */

    public Double readAmount() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the amount: ");
            double amount = scanner.nextDouble();
            if (amount > 0) {
                return amount;
            }

        }
    }
}
