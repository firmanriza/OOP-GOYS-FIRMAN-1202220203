public class Teacher extends User{
    public Teacher(String name, int id){
        super(name, id);
    }

    public void teachClass(String course) {
        System.out.println(Name + " is teaching " + course);
    }

    @Override
    public String getUserDetails() {
        return "Pak " + Name + " is teaching math";
    }
}