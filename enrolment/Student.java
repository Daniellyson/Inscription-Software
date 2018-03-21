package enrolment;

public class Student {
    private String registrationNumber;
    private String firstName;
    private String lastName;
    private String birthday;
    private String section;
    private boolean isScholarshipHolder;
    private boolean isForeign;
    private String origin;

    public Student(String registrationNumber, String firstName, String lastName, String birthday, String section,
                   boolean isScholarshipHolder, boolean isForeign, String origin) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.section = section;
        this.isScholarshipHolder = isScholarshipHolder;
        this.isForeign = isForeign;
        this.origin = origin;
    }

    public String toString() {
        String student;
        student = "Registration Number : " + registrationNumber + "\n" +
                  "First Name : " + firstName + "\n" +
                  "Last Nmae : " + lastName + "\n" +
                  "Date of birth : " + birthday + "\n" +
                  "Section : " + section + "\n" +
                  "Scholarship Holder : " + isScholarshipHolder + "\n" +
                  "Foreign : " + isForeign + "\n" +
                  "Origin : " + origin + "\n";
        return student;
    }
}
