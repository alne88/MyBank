import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

    private String id;
    private String password;
    private String fullName;
    private String aadress;
    private List<Account> accounts;
    private String phoneNumber;
    private String email;
    private String secretQuestion;
    private String answerForSecretQuestion;


    public User(String password,
                String fullName,
                String aadress,
                String phoneNumber,
                String email,
                String secretQuestion,
                String answerForSecretQuestion) {

        this.id = UUID.randomUUID().toString();         //generate random id when creating new user
        this.password = password;
        this.fullName = fullName;
        this.aadress = aadress;
        this.accounts = new ArrayList<>();
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.secretQuestion = secretQuestion;
        this.answerForSecretQuestion = answerForSecretQuestion;
    }

    public double totalAmountOfMoney(){
        double sum = 0;
        for (Account account: accounts) {
            sum += account.getBalance();
        }

//        double sumWithIndex = 0;                                      //this is the same as for each loop above
//        for (int i = 0; i < accounts.size(); i++) {
//            sumWithIndex += accounts.get(i).getBalance();
//        }

        return sum;
    }


    public void addNewAccount(String currency) {
        Account newAccount = new Account(currency);
        accounts.add(newAccount);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAadress() {
        return aadress;
    }

    public void setAadress(String aadress) {
        this.aadress = aadress;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getAnswerForSecretQuestion() {
        return answerForSecretQuestion;
    }

    public void setAnswerForSecretQuestion(String answerForSecretQuestion) {
        this.answerForSecretQuestion = answerForSecretQuestion;
    }


    public void addMoneyToAccount (long accountId, double amountOfMoney) {
        for (Account account: accounts) {
            if (account.getAccountNumber() == accountId){
                account.addMoney(amountOfMoney);
            }
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", aadress='" + aadress + '\'' +
                ", accounts=" + accounts +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", secretQuestion='" + secretQuestion + '\'' +
                ", answerForSecretQuestion='" + answerForSecretQuestion + '\'' +
                '}';
    }
}
