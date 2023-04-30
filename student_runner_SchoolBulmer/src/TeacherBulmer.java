// TeacherBulmer class is subclass of PersonBulmer class and differentiates teachers from students and other people.

public class TeacherBulmer extends PersonBulmer {
    private final String course;

    // Create a string with instructors full name and the subject they teach.
    public TeacherBulmer(String fName, String lName, String subject) {
        super(fName, lName);
        this.course = subject;
    }
// Return the information.
    @Override
    public String toString() {
        return super.toString() + "\n   Subject: " + course;
    }
}
