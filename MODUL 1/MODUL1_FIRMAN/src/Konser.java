public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String Bandname;
    private String Date;
    private String Location;
    private int Ticketprice;
    public String getBandname() {
        return Bandname;
    }
    public void setBandname(String bandname) {
        Bandname = bandname;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }
    public int getTicketprice() {
        return Ticketprice;
    }
    public void setTicketprice(int ticketprice) {
        Ticketprice = ticketprice;
    }
  
}