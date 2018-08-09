import java.util.List;

public class FundAccountHolder implements AccountHolder {

    //can have multiple account, balance limit is 1000 money

    Account regular;
    String email;

    public FundAccountHolder(String email, Currency currency) {
        this.regular = new Account(currency);
        this.email = email;
    }

    @Override
    public void addMoney(double money) {
        if ((this.regular.getBalance() + money) > 1000) {
            double remainder = money - 1000;
            this.regular.addMoney(remainder);
//            accounts.add(new FundAccountHolder(email, regular.getCurrency()));            //if one account gets full (1000) then create new account and add money left there
        } else {
            this.regular.addMoney(money);
        }
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
        return "FundAccountHolder{" +
                "regular=" + regular +
                ", email='" + email + '\'' +
                '}';
    }
}
