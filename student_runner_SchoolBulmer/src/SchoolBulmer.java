import java.util.ArrayList;

// SchoolBulmer class takes information from Student and Teacher classes to compile them into
// a "student body" section

public class SchoolBulmer {
    private final ArrayList<StudentBulmer> pupils;
    private final ArrayList<TeacherBulmer> instructors;

    // Method which specifies the students and teachers through the arrays which were pulled.
    public SchoolBulmer(ArrayList<StudentBulmer> students, ArrayList<TeacherBulmer> teachers) {
        this.pupils = students;
        this.instructors = teachers;
    }

    // Returns students for a specified grade level.
    public String getGradeLevel(int level){
        StringBuilder result = new StringBuilder();
        for (StudentBulmer student : pupils) {
            if (student.getLevel() == level) {
                result.append(student);
                result.append('\n');
            }
        }
        return result.toString();
    }

    // Print the results.
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Faculty:\n");
        for (TeacherBulmer teacher : instructors) {
            result.append(teacher);
            result.append('\n');
        }
        result.append("\nStudent Body:\n");
        for (StudentBulmer student : pupils) {
            result.append(student);
            result.append('\n');
        }
        return result.toString();
    }
}
