import java.util.ArrayList;

public class Student extends User {
    
    protected ArrayList<String> enrolledCourses;

    public Student(String name, int id) {
        super(name, id);
        enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(String course) {
        enrolledCourses.add(course);
    }

    @Override
    public String getUserDetails() {
        return "Student - " + super.getUserDetails() + ", \nEnrolled courses: " + enrolledCourses;
    }
}
