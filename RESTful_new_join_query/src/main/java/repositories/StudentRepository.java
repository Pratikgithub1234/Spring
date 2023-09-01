package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dtos.NameState;
import entities.Student;



@Transactional


public interface StudentRepository extends JpaRepository<Student, Integer> 
{
	@Query("select new com.example.dtos.NameState(s.name,a.statename) from  Student s join s.address a")
	public List<NameState> getNameState();
}
