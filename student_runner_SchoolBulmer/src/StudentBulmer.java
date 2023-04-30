// Class StudentBulmer is a subclass of PersonBulmer and differentiates students from other people.

public class StudentBulmer extends PersonBulmer {
    public static int numStudent = 1;
    private final int studentId;
    private final int level;

    // Create a string with student name and grade.
    public StudentBulmer(String fName, String lName, int glevel) {
        super(fName, lName);
        if (glevel < 0 || glevel > 12) { // Grades are accepted from 1-12, otherwise defaults to 0.
            this.level = 0;
        } else {
            this.level = glevel;
        }
        studentId = numStudent++;
    }

    public int getLevel() {
        return level;
    }
// Print the results.
    @Override
    public String toString() {
        return super.toString() + "\n   Grade Level: " + level + "\n   ID #: " + studentId;
    }
}