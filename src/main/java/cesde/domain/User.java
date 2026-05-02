package cesde.domain;

// Importamos la clase que contiene el Enum
import cesde.domain.enums;

public abstract class User {
    private int id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private enums.UserStatus status; // Referencia corregida a la clase enums

    public User() {}

    public User(int id, String name, String lastName, String email, String phone, String password, enums.UserStatus status) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.status = status;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public enums.UserStatus getStatus() { return status; }
    public void setStatus(enums.UserStatus status) { this.status = status; }
}