package pe.edu.upc.hqpractica.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.hqpractica.entities.Student;
import pe.edu.upc.hqpractica.repositories.IStudentRepository;
import pe.edu.upc.hqpractica.serviceinterfaces.IStudentService;

import java.util.List;

@Service
public class StudentServiceImplement implements IStudentService {

    @Autowired
    private IStudentRepository sR;

    @Override
    public void register(Student student) {
        sR.save(student);
    }

    @Override
    public String update(Student student) {
        if (sR.existsById(student.getHqDni())) {
            sR.save(student);
            return "Registro actualizado exitosamente";
        } else {
            return "No se encontro el alumno con DNI: " + student.getHqDni();
        }
    }

    @Override
    public Student findByDni(Long dni) {
        return sR.findById(dni).orElse(new Student());
    }

    @Override
    public boolean isPassed(Long dni) {
        if(sR.existsById(dni)==false) {return false;}
        if (findByDni(dni).getHqFinalGrade() > 12) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Student> listStudents() {
        return sR.findAll();
    }

}
