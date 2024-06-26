import java.sql.SQLOutput;
import java.util.Scanner;

class Account{
    private double balance;

    public Account() {
        this.balance = 0;
    }

    public void deposit(double value) {
        this.balance +=value;
    }

    public void withdraw(double value) {
        if (value <= this.balance) {
            this.balance -=value;
        } else {
            System.out.println("Nie masz wystarczajacych srodkow na wyplate");
        }
    }
    public double getBalance() {
        return this.balance;
    }
}


public class ProgramSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Saldo poczatkowe: " + account.getBalance());
        System.out.print("Wprowadz kwote wplaty: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Saldo po wplacie: " + account.getBalance());
        System.out.print("Wprowadz kwote wyplaty: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Saldo po wyplacie: " + account.getBalance());
    }
}
