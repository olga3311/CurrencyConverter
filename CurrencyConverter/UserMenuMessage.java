package CurrencyConverter;

import java.util.List;

public class UserMenuMessage {
    public static void displayMenu(Boolean initialMessage, List<InitialCurrency> currency) {

        if (initialMessage) {
            System.out.println("Select the initial currency:");
        } else System.out.println("Choose the target currency:");


        for (int i = 0; i < currency.size(); i++) {
            System.out.println((i + 1) + "." + currency.get(i).getNameOfInitialCurrency());
        }

        if (initialMessage) {
            System.out.println("99. Display the conversion history");
        }

        System.out.println("0. Exit");

    }
}
