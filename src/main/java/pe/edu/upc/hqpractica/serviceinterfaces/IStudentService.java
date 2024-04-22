package pe.edu.upc.hqpractica.serviceinterfaces;

import pe.edu.upc.hqpractica.entities.Student;

import java.util.List;

public interface IStudentService {
    public void register(Student student);
    public String update(Student student);
    public Student findByDni(Long dni);
    public boolean isPassed(Long dni);
    public List<Student> listStudents();
}
