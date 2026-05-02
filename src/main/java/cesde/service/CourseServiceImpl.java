package cesde.service;

import cesde.domain.Course;
import cesde.persistence.repository.CourseRepository;
import cesde.util.TypeValidator;

public class CourseServiceImpl {
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void createCourse() {
        Course course = new Course();
        course.setId(TypeValidator.validateInt("ID del Curso: "));
        course.setName(TypeValidator.validateString("Nombre de la Materia: "));
        course.setDurationMonths(TypeValidator.validateInt("Duración (meses): "));
        course.setPrice(TypeValidator.validateInt("Precio: ")); // Usando int para simplificar con TypeValidator

        courseRepository.save(course);
        System.out.println("Curso registrado.");
    }
}