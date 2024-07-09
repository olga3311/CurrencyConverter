public enum Currencies {
    USD(1.08),
    EURO(1),
    GBP(0.84);
    private final double course;

    Currencies(double course) {
        this.course = course;
    }

    public double getCourse() {
        return course;
    }
    public static double exchange(Currencies initialCurrency,double amount,Currencies targetCurrency){
        amount /= initialCurrency.course;
        amount *= targetCurrency.course;
        return amount;
    }
}
