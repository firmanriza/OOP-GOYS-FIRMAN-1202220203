import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner scanner = new Scanner(System.in);
        // TO DO : Create Bioskop and Cashier objects
        Bioskop bioskop = new Bioskop();
        Cashier cashier = new Cashier();
        User user = new User();
        // TO DO : Take the name from the user, make sure it is not empty
        System.out.print("Masukkan nama: ");
        String name1 = scanner.nextLine();
        user.setName(name1);
        // TO DO : Take the phone number from the user, make sure it is valid
        System.out.print("Masukkan nomor telepon: ");
        String phoneNumber1 = scanner.nextLine();
        
        // TO DO : Create a code for ticket order
        user.register();
        System.out.println("Selamat Datang di bioskop EAD: ");
        // TO DO : Create a exception if user enter not number

        // TO DO : Create a exception if user enter number is out of range

        // TO DO : Call the method to reserve seats in the cinema

        // TO DO : Close the Scanner object when the user is finished
        scanner.close();
    }
}