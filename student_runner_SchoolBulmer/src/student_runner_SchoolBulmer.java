/* Mark Bulmer - CSC 151 - 4-13-2022
 * School Classes
 * Use this runner to test your solutions to School Classes.
 */

import java.io.IOException;
import java.util.ArrayList;

public class student_runner_SchoolBulmer{

    public static void main(String arg[]) throws IOException {

        PersonBulmer p = new PersonBulmer("John", "Doe");
        System.out.println("Printing person:\n");
        System.out.println(p);

        StudentBulmer s = new StudentBulmer("Sallie", "Smithers", 7);
        System.out.println("\nPrinting student:\n");
        System.out.println(s);

        System.out.println("\nPrinting highschoolstudent:\n");
        HighSchoolStudentBulmer h = new HighSchoolStudentBulmer("Bert", "Smith", 11, 3.67);
        System.out.println(h);

        ArrayList<StudentBulmer> stu = new ArrayList<StudentBulmer>();
        stu.add(new HighSchoolStudentBulmer("Jem", "Finch", 11, 3.4));
        stu.add(new StudentBulmer("Scout", "Finch", 4));
        stu.add(new HighSchoolStudentBulmer("Natalie", "Adams", 11, 2.4));
        stu.add(new HighSchoolStudentBulmer("Boo", "Radley", 12, 1.7));
        stu.add(new HighSchoolStudentBulmer("Atticus", "Finch", 12, 4.8));
        stu.add(new StudentBulmer("Elaine", "Benes", 9));
        stu.add(new StudentBulmer("Patrick", "Henry", 11));

        ArrayList<TeacherBulmer> tea = new ArrayList<TeacherBulmer>();
        tea.add(new TeacherBulmer("Ada", "Lovelace", "Mathematics"));
        tea.add(new TeacherBulmer("Albert", "Einstein", "Physics"));
        tea.add(new TeacherBulmer("Grace", "Hopper", "Computer Science"));
        tea.add(new TeacherBulmer("Alan", "Turing", "Mathematics"));
        tea.add(new TeacherBulmer("Marie", "Curie", "Chemistry"));
        tea.add(new TeacherBulmer("Dolly", "Madison", "Government"));
        tea.add(new TeacherBulmer("Maya", "Angelou", "English Composition"));

        SchoolBulmer sch = new SchoolBulmer(stu, tea);
        System.out.println("\nPrinting school: \n");
        System.out.println(sch);

        System.out.println("\nJust seniors: \n" + sch.getGradeLevel(12));

    }
}