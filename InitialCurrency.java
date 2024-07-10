import java.util.Objects;

public class InitialCurrency {
    private String nameOfInitialCurrency;
    private double coefficient;

    public InitialCurrency(String nameOfInitialCurrency, double coefficient) {
        this.nameOfInitialCurrency = nameOfInitialCurrency;
        this.coefficient = coefficient;
    }

    public String getNameOfInitialCurrency() {
        return nameOfInitialCurrency;
    }

    public void setNameOfInitialCurrency(String nameOfInitialCurrency) {
        this.nameOfInitialCurrency = nameOfInitialCurrency;
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
                "nameOfInitialCurrency='" + nameOfInitialCurrency + '\'' +
                ", coefficient=" + coefficient +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InitialCurrency that = (InitialCurrency) o;
        return Double.compare(coefficient, that.coefficient) == 0 && Objects.equals(nameOfInitialCurrency, that.nameOfInitialCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfInitialCurrency, coefficient);
    }
}
