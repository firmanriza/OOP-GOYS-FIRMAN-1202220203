public class Account {
    private String Name;
    private String AccountNumber;
    private double Balance;

    public Account(String Name, String AccountNumber, double Balance) {
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println("Saldo akun " + Name + " setelah menyetor: " + Balance);
        } 
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && Balance >= amount) {
            Balance -= amount;
            System.out.println("Saldo akun " + Name + " setelah menarik uang: " + Balance);
            return true;
        } else {
            System.out.println("Jumlah penarikan tidak valid atau saldo tidak mencukupi.");
            return false;
        }
    }

    public String getName() {
        return Name;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }
}
