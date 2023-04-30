// HighSchoolStudentBulmer class is a subclass of StudentBulmer and allows for differentiation between "highschoolstudents"
// and other potential types of students.

public class HighSchoolStudentBulmer extends StudentBulmer {
    private final double gradePointAvg;

    // Sets up the string which we can call to display our student information.
    public HighSchoolStudentBulmer(String fName, String lName, int glevel, double gpa) {
        super(fName, lName, glevel);
        if (gpa < 0 || gpa > 5) { // If the GPA is not between 0 and 5, defaults to 0.
            this.gradePointAvg = 0;
        } else {
            this.gradePointAvg = gpa;
        }
    }

    // Return the information
    @Override
    public String toString() {
        return super.toString() + "\n   GPA: " + gradePointAvg;
    }
}
