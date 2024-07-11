package CurrencyConverter;

import java.util.Objects;

public class Currency {
    private String name;
    private double coefficient;

    public Currency(String nameOfInitialCurrency, double coefficient) {
        this.name = nameOfInitialCurrency;
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

    @Override
    public String toString() {
        return "InitialCurrency{" +
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
