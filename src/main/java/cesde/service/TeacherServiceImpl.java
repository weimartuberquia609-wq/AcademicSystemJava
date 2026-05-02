package cesde.service;

import cesde.domain.Teacher;
import cesde.domain.enums;
import cesde.persistence.repository.TeacherRepository;
import cesde.util.TypeValidator;

public class TeacherServiceImpl {
    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void createTeacher() {
        Teacher teacher = new Teacher();
        teacher.setId(TypeValidator.validateInt("ID del Profesor: "));
        teacher.setName(TypeValidator.validateString("Nombre: "));
        teacher.setLastName(TypeValidator.validateString("Apellido: "));
        teacher.setSpecialty(TypeValidator.validateString("Especialidad: "));

        System.out.println("Estado: 1. ACTIVE, 2. INACTIVE");
        int opt = TypeValidator.validateInt("Opción: ");
        teacher.setStatus(opt == 2 ? enums.UserStatus.INACTIVE : enums.UserStatus.ACTIVE);

        teacherRepository.save(teacher);
        System.out.println("Profesor creado con éxito.");
    }
}