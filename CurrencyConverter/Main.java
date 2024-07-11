package CurrencyConverter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Currency> currencies = new ArrayList<>();
        currencies.add(new Currency("EURO", 1));
        currencies.add(new Currency("USD", 0.92));
        currencies.add(new Currency("GBP", 1.18));


        System.out.println("You are welcome in currency converter!");

        Calculator calculator = new Calculator();

        UserMenu userMenu = new UserMenu();
        while (true) {

            Currency x = userMenu.displayMenu(true, currencies);
      

            if (x == null) {
                //  вызвать метод для истории обмена
                calculator.displayTransactions();

            } else {

                double v = userMenu.readAmount();
                Currency y = userMenu.displayMenu(false, currencies);

              

               double result = calculator.exchange (x, y, v);
                System.out.println("You receive: " + result + " " + y.getName());
                System.out.println("=======================================");

            }


        }
    }
}
