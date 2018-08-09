import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("World Bank of Lots of Money");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------------------------------");
            System.out.println("Welcome to " + bank.getBankName());
            System.out.println("Choose your action:");
            System.out.println("1 - create new user;");
            System.out.println("2 - add money to selected account of your user;");
            System.out.println("3 - withdraw money from users account;");
            System.out.println("4 - Print bank");
            System.out.println("0 - Exit");
            int userOption = scanner.nextInt();
            System.out.println();

            switch (userOption) {
                case 1:
                    System.out.println("1 - New user account");
                    System.out.println("2 - New business account");
                    System.out.println("3 - New: fund account");
                    int choise = scanner.nextInt();
                    System.out.println("Enter email: ");
                    String email = scanner.next();
                    System.out.println("Currency for account:");
                    System.out.println("1 - EUR");
                    System.out.println("2 - GBP");
                    System.out.println("3 - USD");
                    int currencyChoise = scanner.nextInt();
                    Currency currency = null;

                    switch (currencyChoise) {
                        case 1:
                            currency = Currency.EUR;
                            break;
                        case 2:
                            currency = Currency.GBP;
                            break;
                        case 3:
                            currency = Currency.USD;
                            break;
                    }

                    switch (choise) {
                        case 1:
                            bank.addUser(email, currency);
                            break;
                        case 2:
                            bank.addBusiness(email, currency);
                            break;
                        case 3:
                            bank.addFund(email, currency);
                            break;
                    }

                    System.out.println("Congratulations, you have successfully created a new account");
                    break;

                case 2:
                    System.out.println("Enter email: ");
                    String email2 = scanner.next();
                    System.out.println("How much money would you like to add: ");
                    double amountOfMoney = scanner.nextDouble();
                    bank.addMoney(email2, amountOfMoney);
                    break;

                case 3:
                    System.out.println("Enter user name: ");
                    String name3 = scanner.next();
                    System.out.println("How much money would you like to withdraw: ");
                    double amountToWithdraw = scanner.nextDouble();
                    try {
                        bank.withdrawMoney(name3, amountToWithdraw);
                        System.out.println("Money was withdrawn");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println(bank);
                    break;

                case 0:
                    return;

                default:
                    break;
            }
        }
    }
}
