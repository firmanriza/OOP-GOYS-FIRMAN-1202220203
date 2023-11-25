
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Saldo akun " + account.getName() + ": " + account.getBalance());
    }

    public void removeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
                System.out.println("Akun " + accounts.get(i).getName() + " berhasil dihapus!");
                accounts.remove(i);
                return;
            }
        }
        System.out.println("Akun dengan Nomor Akun " + accountNumber + " tidak ditemukan.");
    }

    public void getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Nomor akun: " + account.getAccountNumber());
                System.out.println("Nama akun: " + account.getName());
                System.out.println("Saldo akun: " + account.getBalance());
            }
        }
        return;
    }

    public ArrayList<Account> getAllAccounts() {
        return accounts;
    }
}