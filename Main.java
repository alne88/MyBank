import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("World Bank of Lots of Money");
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("---------------------------------------------------------");
            System.out.println("Welcome to " + bank.getBankName() + " bank!");
            System.out.println("Choose your action:");
            System.out.println("1 - create new user;");
            System.out.println("2 - add money to selected account of your user;");
            System.out.println("3 - withdraw money from users account;");
            System.out.println("4 - check total amount of money of your user");
            System.out.println("5 - Print bank");
            System.out.println("0 - Exit");
            int userOption = scanner.nextInt();
            System.out.println();

            switch (userOption) {
                case 1:
                    System.out.println("1 - New user");
                    System.out.println("2 - New business");
                    System.out.println("3 - New: fund");
                    int choise = scanner.nextInt();
                    System.out.println("Full name: ");
                    String fullName = scanner.next();
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
                            bank.addUser(fullName, currency);
                            break;
                        case 2:
                            bank.addBusiness(fullName, currency);
                            break;
                        case 3:
                            bank.addFund(fullName, currency);
                            break;
                    }

                    System.out.println("Congratulations, you have successfully created a new account");
                    break;

                case 2:
                    System.out.println("Enter user name: ");
                    String name2 = scanner.next();
//                    System.out.println("Enter account number: ");
//                    long accountNumber = scanner.nextLong();
                    System.out.println("How much money would you like to add: ");
                    double amountOfMoney = scanner.nextDouble();
                    bank.addMoney(name2, amountOfMoney);
//                    System.out.println("Account balance is: " + bank.totalAmountOfMoney(userId2));
                    break;

                case 3:
                    System.out.println("Enter user name: ");
                    String name3 = scanner.next();
//                    System.out.println("Enter account number: ");
//                    long accountNumber1 = scanner.nextLong();
                    System.out.println("How much money would you like to withdraw: ");
                    double amountToWithdraw = scanner.nextDouble();
                    bank.withdrawMoney(name3, amountToWithdraw);
                    System.out.println("Account balance is: " + bank.balanceOfUser(name3));
                    break;

                case 4:
                  System.out.println("Enter name: ");
                  String name4 = scanner.next();
                  System.out.println(bank.balanceOfUser(name4));
                    break;

                case 5:
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
