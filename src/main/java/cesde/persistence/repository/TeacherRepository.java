package cesde.persistence.repository;

import cesde.domain.Teacher;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {
    // Lista que funciona como base de datos
    private static List<Teacher> teachers = new ArrayList<>();

    public Teacher save(Teacher teacher) {
        teachers.add(teacher);
        return teacher;
    }

    public List<Teacher> findAll() {
        return new ArrayList<>(teachers);
    }

    public Teacher findById(int id) {
        return teachers.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    public void delete(int id) {
        teachers.removeIf(t -> t.getId() == id);
    }
}