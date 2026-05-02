package cesde.persistence.repository;

import cesde.domain.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private static List<Course> courses = new ArrayList<>();

    public Course save(Course course) {
        courses.add(course);
        return course;
    }

    public List<Course> findAll() {
        return new ArrayList<>(courses);
    }
}