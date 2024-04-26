package pe.edu.upc.hqpractica.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.hqpractica.dtos.StudentDTO;
import pe.edu.upc.hqpractica.dtos.StudentStatusDTO;
import pe.edu.upc.hqpractica.entities.Student;
import pe.edu.upc.hqpractica.serviceinterfaces.IStudentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService sS;

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping
    public void registerStudent(@RequestBody StudentDTO dto) {
        Student s = new Student(dto.getHqDni(),dto.getHqName(),dto.getHqLastName(),dto.getHqGrade1(),dto.getHqGrade2());
        sS.register(s);
    }

    @PutMapping
    public String updateStudent(@RequestBody StudentDTO dto) {
        Student s = new Student(dto.getHqDni(),dto.getHqName(),dto.getHqLastName(),dto.getHqGrade1(),dto.getHqGrade2());
        return sS.update(s);
    }

    @PreAuthorize("hasAuthority('USER')")
    @GetMapping("{dni}")
    public boolean isPassed(@PathVariable("dni") Long hqDni) {
        return sS.isPassed(hqDni);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/listar")
    public List<StudentStatusDTO> getStudents() {
        List<StudentStatusDTO> dto;
        dto= sS.listStudents().stream().map(y->{
            ModelMapper m =new ModelMapper();
            StudentStatusDTO dto1=m.map(y,StudentStatusDTO.class);
            dto1.setHqStatus(y.getHqFinalGrade()>12?"Aprobado":"Desaprobado");
            return dto1;
        }).collect(Collectors.toList());
        return dto;
    }
}
