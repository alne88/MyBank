public class BusinessAccountHolder implements AccountHolder {


    Account regular;
    String email;

    public BusinessAccountHolder(String email, Currency currency) {
        this.regular = new Account(currency);
        this.email = email;
    }

    @Override
    public void addMoney(double money) {
        this.regular.addMoney(money);
    }

    @Override
    public void withdrawMoney(double money) throws Exception {
        if (regular.getBalance() < money) {
            throw new Exception("Not enough money on account");
        }
        this.regular.withdrawMoney(money);
    }

    @Override
    public String getUniqueIdentifier() {
        return email;
    }

    @Override
    public String toString() {
        return "BusinessAccountHolder{" +
                "regular=" + regular +
                ", email='" + email + '\'' +
                '}';
    }
}
