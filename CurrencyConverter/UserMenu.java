package CurrencyConverter;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class UserMenu {

    public  InitialCurrency displayMenu(Boolean initialMessage, List<InitialCurrency> currency) {

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
