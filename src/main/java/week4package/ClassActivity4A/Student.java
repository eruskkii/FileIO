package week4package.ClassActivity4A;

public class Student {
    private int admissionNo;

    private String firstName;

    private String lastName;

    private String dob;

    private int age;

    private String Gender;

    public Student(int admissionNo, String firstName, String lastName, String dob, int age, String gender) {
        this.admissionNo = admissionNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.age = age;
        Gender = gender;
    }

    public int getAdmissionNo() {
        return admissionNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return Gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "admissionNo=" + admissionNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
