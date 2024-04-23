package pe.edu.upc.hqpractica.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
@Entity
@Table(name = "usuario")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, unique = true)
    private String username;
    @Column(length = 200)
    private String password;

    private Boolean enabled;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Role rol_id;
}
