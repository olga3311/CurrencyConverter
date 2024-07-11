import java.util.Objects;

public class TargetCurrency {

    private String nameOfTargetCurrency;

    public TargetCurrency(String nameOfTargetCurrency) {
        this.nameOfTargetCurrency = nameOfTargetCurrency;

    }

    public String getNameOfTargetCurrency() {
        return nameOfTargetCurrency;
    }

    public void setNameOfTargetCurrency(String nameOfTargetCurrency) {
        this.nameOfTargetCurrency = nameOfTargetCurrency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargetCurrency that = (TargetCurrency) o;
        return Objects.equals(nameOfTargetCurrency, that.nameOfTargetCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameOfTargetCurrency);
    }

    @Override
    public String toString() {
        return "TargetCurrency{" +
                "nameOfTargetCurrency='" + nameOfTargetCurrency + '\'' +
                '}';
    }
}

