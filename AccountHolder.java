public interface AccountHolder {

        void addMoney(double money);

        void withdrawMoney(double money) throws Exception;

        String getUniqueIdentifier();

    }
