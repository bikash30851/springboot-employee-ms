package backend.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import backend.springbootbackend.model.Employee;
import backend.springbootbackend.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setFirstName("Bikash");
		employee.setLastName("Adhikari");
		employee.setEmailId("bikash30851@gmail.com");
		employeeRepository.save(employee);
		
	}

}
