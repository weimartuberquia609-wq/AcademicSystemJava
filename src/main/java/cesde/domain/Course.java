package cesde.domain;

public class Course {
    private int id;
    private String name;
    private String description;
    private int durationMonths;
    private double price;

    public Course() {}

    public Course(int id, String name, String description, int durationMonths, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.durationMonths = durationMonths;
        this.price = price;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getDurationMonths() { return durationMonths; }
    public void setDurationMonths(int durationMonths) { this.durationMonths = durationMonths; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}