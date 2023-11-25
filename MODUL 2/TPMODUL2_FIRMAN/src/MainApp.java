public class MainApp {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("M1", 120.0, 5, 4);
        Bus bus = new Bus("B1", 80.0, 40, 30);

        System.out.println("Informasi Mobil: ");
        System.out.println(mobil.toString());
        System.out.println("\nWaktu tempuh: " + mobil.hitungWaktuTempuh(100.0) + " jam");
        System.out.println("");
        System.out.println("Informasi Bus: ");
        System.out.println(bus.toString());
        System.out.println("\nWaktu tempuh: " + bus.hitungWaktuTempuh(100.0) + " jam");
    }
}
