package CurrencyConverter;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class UserMenu {

    public static Currency displayMenu(Boolean initialMessage, List<Currency> currency) {

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


    public static Double readAmount() {
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
