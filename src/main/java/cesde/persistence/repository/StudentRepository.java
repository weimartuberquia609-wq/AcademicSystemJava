package cesde.persistence.repository;

import cesde.domain.Student;
import cesde.service.portoutput.StudentPersistencePort;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements StudentPersistencePort {

    // Lista para simular la base de datos
    private static List<Student> students = new ArrayList<>();

    @Override
    public Student createStudentRepository(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student getStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public Student updateStudentRepository(Student studentActualizado) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == studentActualizado.getId()) {
                students.set(i, studentActualizado);
                return studentActualizado;
            }
        }
        return null;
    }

    @Override
    public void deleteStudentRepository(int id) {
        students.removeIf(s -> s.getId() == id);
    }
}