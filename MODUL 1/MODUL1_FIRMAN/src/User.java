public class User {
    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    String Name;
    String Phonenumber;

    public void setName(String Name) {
        this.Name = Name;
    }
    public void setPhonenumber(String Phonenumber) {
        this.Phonenumber = Phonenumber;
    }

    public String getName() {
        return Name;
    }
    public String getPhonenumber() {
        return Phonenumber;
    }
    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    
    public void Register() {
        System.out.println("Selamat datang di konser EAD" );
        System.out.println("Silahkan Register terlebih dahulu" );
        System.out.println("Nama : " + Name);
        System.out.println("No Handphone: " + Phonenumber);
    }
}
