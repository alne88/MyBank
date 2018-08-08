public enum Currency {

    EUR("EUR") , GBP("EUR") , USD("EUR");

    String currency;

    Currency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return currency;
    }

}
