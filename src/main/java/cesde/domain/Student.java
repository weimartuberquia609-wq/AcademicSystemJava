package cesde.domain;

public class Student extends User {
    private String studentCode;
    private String gradeLevel;

    public Student() {
        super();
    }

    public Student(int id, String name, String lastName, String email, String phone, String password, enums.UserStatus status, String studentCode, String gradeLevel) {
        super(id, name, lastName, email, phone, password, status);
        this.studentCode = studentCode;
        this.gradeLevel = gradeLevel;
    }

    public String getStudentCode() { return studentCode; }
    public void setStudentCode(String studentCode) { this.studentCode = studentCode; }
    public String getGradeLevel() { return gradeLevel; }
    public void setGradeLevel(String gradeLevel) { this.gradeLevel = gradeLevel; }
}