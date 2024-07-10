import java.util.List;
import java.util.Scanner;

public class UserMenu {

    public static InitialCurrency displayMenu(String message, List<InitialCurrency> currency) {
        System.out.println(message);

        for (int i = 0; i < currency.size(); i++) {
            System.out.println((i + 1) + "." + currency.get(i).getNameOfInitialCurrency());
        }
        System.out.println("0.Exit");

        boolean choice = true;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int currencyIndex = scanner.nextInt();
            if ((currencyIndex >= 0) && currencyIndex <= currency.size()) {
                return currency.get(currencyIndex - 1);
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
