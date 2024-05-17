package pe.edu.upc.hqpractica.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "hqDni", nullable = false, unique = true)
    private Long hqDni;
    @Column(name = "hqName", length = 50, nullable = false)
    private String hqName;
    @Column(name = "hqLastName", length = 50, nullable = false)
    private String hqLastName;
    @Column(name = "hqGrade1", nullable = false)
    private Double hqGrade1;
    @Column(name = "hqGrade2", nullable = false)
    private Double hqGrade2;
    @Column(name = "hqFinalGrade", nullable = false)
    private Double hqFinalGrade;

    public Student(Long hqDni, String hqName, String hqLastName, Double hqGrade1, Double hqGrade2) {
        this.hqDni = hqDni;
        this.hqName = hqName;
        this.hqLastName = hqLastName;
        this.hqGrade1 = hqGrade1;
        this.hqGrade2 = hqGrade2;
        this.hqFinalGrade = hqGrade1 * 0.4 + hqGrade2 * 0.6;
    }

    //funcionalidad2-Juan
    //Aqui implementaré funcionalidad2

    //funcionalidad1 - Martin
    //aqui implementaré una funcionalidad 1

    //Funcionalidad Fiorella
    //implementando funcionalidad o clase

    //funcionalidad Christian
    //creando funcionalidad de christian

    //funcionalidad Mario

    //funcionalidad Joseph
}
