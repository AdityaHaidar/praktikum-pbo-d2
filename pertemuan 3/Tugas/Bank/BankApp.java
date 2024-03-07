// File        : BankApp.java          08/03/24
// Penulis     : Aditya Haidar Faishal
// Deskripsi   : Membuat class BankApp


public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            // Skenario saldo mencukupi
            account.withdraw(200.0);
            System.out.println("Saldo saat ini : $" + account.getBalance());

            // Skenario saldo tidak mencukupi
            account.withdraw(400.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
