public class User {
   // TO DO: Create Private Attributes of User (nama, noHandphone)
   private String Name;
   private int noHandPhone;
   // TO DO: Create Constructor of User
   
   public void setName(String Name) {
      this.Name = Name;
      }

   public void setNoHandPhone(int noHandPhone) {
      this.noHandPhone = noHandPhone;
      }
   // TO DO: Create register Method to show information about name and phone number
   public void register(){
      System.out.println("Register Berhasil");
      System.out.println("Nama : " + Name);
      System.out.println("No Handphone : " + noHandPhone);
    }
    
   // TO DO: Create method to return name and phone number
   
   public String getName() {
     return Name;
  }

   public int getnoHandPhone() {
     return noHandPhone;
  }
}






  