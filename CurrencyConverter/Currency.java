package CurrencyConverter;

import java.util.Objects;
/**
 * класс валюта со свойствами <b>mane</b> и <b>coefficient</b>
 * является классом который используется в других классах
 * @author Maxim Nikolus
 * @version фиг знает какая:)
 */

public class Currency {
    /**поле имя оно же название  валюты*/
    private String name;
    /**поле коэфициент которое означает курс валюты*/
    private double coefficient;

    public Currency(String name, double coefficient) {
        this.name = name;
        this.coefficient = coefficient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    /**
     * @return возвращает валюту её имя и курс
     * */
    @Override
    public String toString() {

        return "Currency{" +
                "name='" + name + '\'' +
                ", coefficient=" + coefficient +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency that = (Currency) o;
        return Double.compare(coefficient, that.coefficient) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, coefficient);
    }
}
