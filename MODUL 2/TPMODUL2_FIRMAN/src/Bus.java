public class Bus extends Kendaraan {
    private int jumlahKursi;


    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int kursi) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahKursi = kursi;
    }

    public String toString() {
        return super.toString() + 
        "\nJumlah Kursi: " + jumlahKursi;
    }
}