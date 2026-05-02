package cesde.service;

import cesde.domain.Student;
import cesde.domain.enums; // Importación necesaria para el Enum
import cesde.persistence.repository.StudentRepository;
import cesde.service.portinput.StudentService;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createStudentService() {
        Student student = new Student();

        student.setId(TypeValidator.validateInt("Ingrese el id del estudiante: "));
        student.setName(TypeValidator.validateString("Ingrese el Nombre del Estudiante: "));
        student.setLastName(TypeValidator.validateString("Ingrese el apellido del estudiante: "));
        student.setEmail(TypeValidator.validateString("Ingrese un email valido: "));

        // Selección de estado mediante menú para asignar el Enum
        System.out.println("Seleccione el estado: 1. ACTIVE, 2. INACTIVE, 3. SUSPENDED");
        int option = TypeValidator.validateInt("Opción: ");
        switch (option) {
            case 1 -> student.setStatus(enums.UserStatus.ACTIVE);
            case 2 -> student.setStatus(enums.UserStatus.INACTIVE);
            case 3 -> student.setStatus(enums.UserStatus.SUSPENDED);
            default -> student.setStatus(enums.UserStatus.ACTIVE);
        }

        student.setStudentCode(TypeValidator.validateString("Ingrese el código del estudiante: "));
        student.setGradeLevel(TypeValidator.validateString("Ingrese el nivel de grado: "));

        return studentRepository.createStudentRepository(student);
    }

    @Override
    public Student updateStudentService(int id) {
        Student student = studentRepository.getStudentById(id);

        if (student != null) {
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Apellido \n" +
                    "4. Email \n" +
                    "5. Estado (Enum)");

            int option = TypeValidator.validateInt("Opcion: ");

            switch (option) {
                case 1 -> student.setId(TypeValidator.validateInt("Actualizar id: "));
                case 2 -> student.setName(TypeValidator.validateString("Actualizar Nombre: "));
                case 3 -> student.setLastName(TypeValidator.validateString("Actualizar Apellido: "));
                case 4 -> student.setEmail(TypeValidator.validateString("Actualizar Email: "));
                case 5 -> {
                    System.out.println("Seleccione estado: 1. ACTIVE, 2. INACTIVE, 3. SUSPENDED");
                    int st = TypeValidator.validateInt("Estado: ");
                    if (st == 1) student.setStatus(enums.UserStatus.ACTIVE);
                    else if (st == 2) student.setStatus(enums.UserStatus.INACTIVE);
                    else student.setStatus(enums.UserStatus.SUSPENDED);
                }
                default -> System.out.println("Opción no válida");
            }
            // Llamada al repositorio para persistir el cambio
            studentRepository.updateStudentRepository(student);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
        return student;
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        Student student = studentRepository.getStudentById(id);
        if (student != null) {
            System.out.println("ID: " + student.getId() + " | Nombre: " + student.getName() + " | Estado: " + student.getStatus());
        } else {
            System.out.println("Id no encontrado");
        }
        return Optional.ofNullable(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteStudentRepository(id);
    }
}