package cesde.domain;



public class Teacher extends User {
    private String specialty;

    public Teacher() {
        super();
    }

    public Teacher(int id, String name, String lastName, String email, String phone, String password, enums.UserStatus status, String specialty) {
        super(id, name, lastName, email, phone, password, status);
        this.specialty = specialty;
    }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }
}