public class User {
    protected String Name;
    protected int id;

    public User(String Name, int id) {
        this.Name = Name;
        this.id = id;
    }

    public String getUserDetails() {
        return "Name: " + Name + ", ID: " + id;
    }
}
