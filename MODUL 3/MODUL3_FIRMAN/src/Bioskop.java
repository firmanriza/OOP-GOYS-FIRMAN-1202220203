public class Bioskop {
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private int rows = 5;
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private int seatsPerRows = 10;
    // TO DO: Create 2 dimensional array to store seat reservation status
    public int [][] seatReservation = new int [rows][seatsPerRows];
    
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        seatReservation[2][4]=1;
        seatReservation[1][3]=1;

    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Selamat Datang di bioskop EAD!");
        System.out.println("Booking tiket Bioskop:");;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRows; j++) {
                System.out.print(seatReservation[i][j] + " ");
            }
            System.out.println();
        }
    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (seatReservation[row][seat] == 0) {
            seatReservation[row][seat] = 1;
            System.out.println("Kursi berhasil di pesan!");
        } else {
            System.out.println("Kursi sudah di pesan!");
        }
        }

    }