import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<InitialCurrency> currencies = new ArrayList<>();
        currencies.add( new InitialCurrency("EURO", 1));
        currencies.add( new InitialCurrency( "USD", 1.08 ));
        currencies.add( new InitialCurrency("GBP", 0.85));


        System.out.println("You are welcome in currency converter!");
        InitialCurrency x =UserMenu.displayMenu ("Select the initial currency:", currencies);
        double v = UserMenu.readAmount();
        InitialCurrency y = UserMenu.displayMenu("Choose the target currency:", currencies);

        //double ex = exchange(x, y, v);
        //System.out.println("You receive: " + ex + " " + y.name());

    }

}
