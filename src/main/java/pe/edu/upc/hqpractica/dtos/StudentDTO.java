package pe.edu.upc.hqpractica.dtos;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class StudentDTO {
    private Long hqDni;
    private String hqName;
    private String hqLastName;
    private Double hqGrade1;
    private Double hqGrade2;

}
