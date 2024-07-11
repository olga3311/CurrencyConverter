package CurrencyConverter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<InitialCurrency> currencies = new ArrayList<>();
        currencies.add(new InitialCurrency("EURO", 1));
        currencies.add(new InitialCurrency("USD", 0.92));
        currencies.add(new InitialCurrency("GBP", 1.18));


        System.out.println("You are welcome in currency converter!");

        Calculator calculator = new Calculator();

        while (true) {
            InitialCurrency x = UserMenu.displayMenu(true, currencies);

            if (x == null) {
                //  вызвать метод для истории обмена
                calculator.displayTransactions();

            } else {
                double v = UserMenu.readAmount();
                InitialCurrency y = UserMenu.displayMenu(false, currencies);

               double result = calculator.exchange (x, y, v);
                System.out.println("You receive: " + result + " " + y.getNameOfInitialCurrency());
                System.out.println("=======================================");

            }


        }
    }
}
