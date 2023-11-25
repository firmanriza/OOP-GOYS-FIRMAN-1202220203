import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("alex", "1202220101", 100000);
        Account account2 = new Account("john", "1202220202", 200000.0);
        Account account3 = new Account("Firman_SI4608", "1202220203", 300000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        System.out.println();


        account1.deposit(50000);
        account2.withdraw(20000);
        System.out.println();

        bank.removeAccount("1202220202");

        System.out.println("\nDaftar semua akun dalam bank:");
        ArrayList<Account> allAccounts = bank.getAllAccounts();
        for (Account account : allAccounts) {
            System.out.println("Nama: " + account.getName() + ", nomor akun: " + account.getAccountNumber() + ", saldo: " + account.getBalance());
        }
    }
}