public class Cashier extends Bioskop {
    public boolean isBooked = false;
    
    // TO DO : Create a method to print ticket
    public void printTicket(User user) {
        for (int i = 0; i < super.seatReservation.length; i++) {
            for (int j = 0; j < super.seatReservation[i].length; j++) {
                if(!(i == 2 && j == 4 | i == 1 && j == 3)) {
                  if(super.seatReservation[i][j] == 1) {
                    isBooked = true;
                    System.out.println("Menceta Tiket...");
                    System.out.println("========================");
                    System.out.println("Nama : " + user.getName());
                    System.out.println("Phone: " + user.getnoHandPhone());
                    System.out.println("Seat : " + (i+1) + " " + (j+1));
                  }
                }
            }
           
        }
    } 
}

