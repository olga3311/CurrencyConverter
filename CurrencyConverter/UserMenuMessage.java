package CurrencyConverter;

import java.util.List;

/**
 * Класс <b>UserMenuMessage</b> содержит методы для отображения меню пользователю с возможностью
 * выбора валюты, просмотра совершенных транзакций или выхода из программы.
 * @author Olga Kulaga(Volha Kulaha)
 */

public class UserMenuMessage {

    /**
     * Отображает меню для выбора начальной или целевой валюты из данного списка.
     * Если <b>initialMessage<b/> истинно, отображается меню для выбора начальной валюты,
     * в противном случае — для выбора целевой валюты.
     *
     * @param initialMessage   флаг Boolean, указывающий, является ли это начальным сообщением
     * @param currency список объектов Currency для отображения в меню
     */

    public static void displayMenu(Boolean initialMessage, List<Currency> currency) {

        if (initialMessage) {
            System.out.println("Select the initial currency:");
        } else System.out.println("Choose the target currency:");


        for (int i = 0; i < currency.size(); i++) {
            System.out.println((i + 1) + "." + currency.get(i).getName());
        }

        if (initialMessage) {
            System.out.println("99. Display the conversion history");
        }

        System.out.println("0. Exit");

    }
}
