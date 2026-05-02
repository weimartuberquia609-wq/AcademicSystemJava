package cesde.domain;

import cesde.domain.enums;

public class Employee extends User {
    private String role;

    public Employee() {
        super();
    }

    public Employee(int id, String name, String lastName, String email, String phone, String password, enums.UserStatus status, String role) {
        super(id, name, lastName, email, phone, password, status);
        this.role = role;
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}