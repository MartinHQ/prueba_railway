package pe.edu.upc.hqpractica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.hqpractica.entities.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
}
