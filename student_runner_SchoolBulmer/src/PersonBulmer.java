// PersonBulmer class creates a "person" set that is separate from the "student" or "teacher" sets.

public class PersonBulmer {
    private String firstName;
    private String lastName;

    // Create a string of the person's full name.
    public PersonBulmer(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    // Return the string
    @Override
    public String toString() {

        return lastName + ", " + firstName;
    }
}