package crud.practice.springbootbackend.repository;

import crud.practice.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //All the crud database methods
}
