package backend.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.springbootbackend.model.Employee;


//JpaRepository parameters are type of the entity and type of the Primary Key
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	//All CRUD database methods written here to interact with the Database.
	
	
	

}
