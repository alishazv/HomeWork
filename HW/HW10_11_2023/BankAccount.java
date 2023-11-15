package HW10_11_2023;

public class BankAccount {
    double balance;

    public void deposit(double money) {
        balance += money;
    }

    public void withdraw(double money) {
        balance -= money;
    }
}

class BankTest {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.balance = 5968.76557;
        bankAccount1.deposit(65764.87656);

        System.out.println(bankAccount1.balance);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.balance = 87585.585;
        bankAccount2.withdraw(58);

        System.out.println(bankAccount2.balance);
    }
}
