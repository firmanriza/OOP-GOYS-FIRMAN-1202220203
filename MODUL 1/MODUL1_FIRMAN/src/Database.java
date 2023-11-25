import java.util.List;
import java.util.ArrayList;

public class Database {

    // TODO: Create List of Konser Object to Store Konser from Konser Class
    ArrayList<Konser> daftarkonser = new ArrayList<>();

    // TODO: Create Method to insert Konser to Database
    public void addkonser(Konser konser) {
        daftarkonser.add(konser);
    }

    // TODO: Create Method to Show Konser from Database
    public void showkonser(Konser konser) {
        System.out.println(" Daftar konser yang tersedia :");
        System.out.println("1.");
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price

}
