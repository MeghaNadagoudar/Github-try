package crud.practice.springbootbackend;

import crud.practice.springbootbackend.model.Employee;
import crud.practice.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Megha");
		employee.setLastName("N");
		employee.setEmailId("meghanadagoudar@paramrenewable.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Jeevita");
		employee1.setLastName("N");
		employee1.setEmailId("jeevita@example.com");
		employeeRepository.save(employee1);
	}
}
