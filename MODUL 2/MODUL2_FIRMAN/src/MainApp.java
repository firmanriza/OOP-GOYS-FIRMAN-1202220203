public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi(10, "Jakarta", 10000);
        TelUExpress teluexpress = new TelUExpress (100, "Bandung", 50000, true);
        FRIExpress friexpress = new FRIExpress (30, "Batan", 70000, false);
        
        System.out.print("Ekspedisi tidak diketahui ");
        ekspedisi.informasi();
        System.out.println("");
        // TO DO: Create teluexpress Object from TelUExpress Class
        System.out.print("Ekspedisi TelUExpress ");
        teluexpress.informasi();
        teluexpress.ambil("Sukabirus");
        teluexpress.antar(124315);
        teluexpress.antar(134332, 242532);
        System.out.println("");
        // TO DO: Create friexpress Object from FRIExpress Class
        System.out.print("Ekspedisi FRIExpress ");
        friexpress.informasi();
        friexpress.terima(2000);
        friexpress.kirim("Bojongsoang");
        friexpress.kirim("Braga" , "Dago");


    }
}
