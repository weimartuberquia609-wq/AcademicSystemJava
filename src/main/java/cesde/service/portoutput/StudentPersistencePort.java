package cesde.service.portoutput;

import cesde.domain.Student;
import java.util.List;

/**
 * Define los métodos que el repositorio DEBE implementar para guardar los datos.
 */
public interface StudentPersistencePort {

    // Guarda un nuevo estudiante en la lista/DB
    Student createStudentRepository(Student student);

    // Busca un estudiante directamente en la base de datos/lista
    Student getStudentById(int id);

    // Recupera todos los registros de la base de datos/lista
    List<Student> getAllStudents();

    /**
     * CORRECCIÓN: Se cambia (int id) por (Student student).
     * Esto permite que el repositorio reciba el objeto ya modificado
     * en el Service y lo guarde directamente.
     */
    Student updateStudentRepository(Student student);

    // Elimina el registro físicamente
    void deleteStudentRepository(int id);
}