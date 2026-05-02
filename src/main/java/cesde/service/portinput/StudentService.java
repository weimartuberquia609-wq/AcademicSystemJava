package cesde.service.portinput;

import cesde.domain.Student;
import java.util.List;
import java.util.Optional;

/**
 * Define las operaciones que el usuario puede realizar desde el menú.
 */
public interface StudentService {

    // Crea un estudiante solicitando datos por consola
    Student createStudentService();

    // Actualiza un estudiante existente buscando por su ID
    Student updateStudentService(int id);

    // Obtiene un estudiante envuelto en Optional para manejar nulos de forma segura
    Optional<Student> getStudentById(int id);

    // Retorna la lista completa de estudiantes registrados
    List<Student> getAllStudents();

    // Elimina un estudiante del sistema
    void deleteStudent(int id);
}