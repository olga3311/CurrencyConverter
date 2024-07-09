import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static   final Map<String,Double>  exchangeRates = new HashMap<>();

    static {
       exchangeRates.put("USD_EUR", 0.85);
       exchangeRates.put("EUR_USD",1.08);
       exchangeRates.put("GBP_USD", 1.39);
       exchangeRates.put("USD_GBP", 0.72);
       exchangeRates.put("GBP_EUR",1.18);
       exchangeRates.put("EUR_GBP",0.85);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите исходную валюту (USD, EUR, GBP):");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.println("Введите целевую валюту (USD, EUR, GBP):");
        String toCurrency = scanner.next().toUpperCase();

        System.out.println("Введите сумму для обмена:");
        double amount = scanner.nextDouble();

        String key = fromCurrency + "_" + toCurrency;
        if (exchangeRates.containsKey(key)) {
            double rate = exchangeRates.get(key);
            double convertedAmount = amount * rate;
            System.out.printf("Результат обмена: %.2f %s%n", convertedAmount, toCurrency);
        } else {
            System.out.println("Курс обмена для данной пары валют не найден.");
        }
    }
}
