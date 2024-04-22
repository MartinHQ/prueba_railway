package pe.edu.upc.hqpractica.dtos;

import lombok.Data;

@Data
public class StudentStatusDTO {
    private Long hqDni;
    private String hqName;
    private String hqLastName;
    private Double hqGrade1;
    private Double hqGrade2;
    private Double hqFinalGrade;
    private String hqStatus;
}
