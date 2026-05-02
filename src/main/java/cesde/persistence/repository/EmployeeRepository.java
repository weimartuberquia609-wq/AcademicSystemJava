package cesde.persistence.repository;

import cesde.domain.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private static List<Employee> employees = new ArrayList<>();

    public Employee save(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public List<Employee> findAll() {
        return new ArrayList<>(employees);
    }
}