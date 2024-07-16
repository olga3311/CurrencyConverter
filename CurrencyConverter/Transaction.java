package CurrencyConverter;

import java.text.SimpleDateFormat;

public class Transaction {

    private String timeStamp;
    private double amount;
    private String fromCurrency;
    private double convertedAmount;
    private String toCurrency;



    public Transaction(double amount, String fromCurrency, double convertedAmount, String toCurrency) {
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.convertedAmount = convertedAmount;
        this.toCurrency = toCurrency;
        this.timeStamp = new SimpleDateFormat("HH.mm.ss-dd.MM.yyyy").format(new java.util.Date());

    }



    @Override
    public String toString() {
        return "Transaction :" +
                " " + timeStamp + '\'' +
                "  amount " + amount +
                "  from " + fromCurrency + '\'' +
                "to " + convertedAmount +
                "  " + toCurrency + '\'' +
                '}';
/**
 @author Vadim Danilchenko
 * в этом методе происходит Переопределение метода toString() для класса Transaction.

 *  @Override
 *  public String toString() {
            return "Transaction" +
                    "timeStamp='" + timeStamp + '\'' +         Временная метка транзакции
                    ", amount=" + amount +                     Сумма транзакции
                    ", from'" + fromCurrency + '\'' +          Исходная валюта
                    ", convertedAmount=" + convertedAmount +   Сумма после конвертации
                    ", to'" + toCurrency + '\'' +              Целевая валюта
                    '}';*/

    }
}




