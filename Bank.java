import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<AccountHolder> accounts;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public void addUser(String email, Currency currency) {
        accounts.add(new UserAccountHolder(email, currency));
    }

    public void addBusiness(String email, Currency currency) {
        accounts.add(new BusinessAccountHolder(email, currency));
    }

    public void addFund(String email, Currency currency) {
        accounts.add(new FundAccountHolder(email, currency));
    }


    public void addMoney (String email, double amountOfMoney) {
        for (AccountHolder user: accounts) {
            if (email.equals(user.getUniqueIdentifier())){
                user.addMoney(amountOfMoney);
                return;
            }
        }
    }

    public void withdrawMoney (String email, double amountOfMoney) throws Exception {
        for (AccountHolder user: accounts) {
            if (email.equals(user.getUniqueIdentifier())){
                user.withdrawMoney(amountOfMoney);
                return;
            }
        }
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "users=" + accounts +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
