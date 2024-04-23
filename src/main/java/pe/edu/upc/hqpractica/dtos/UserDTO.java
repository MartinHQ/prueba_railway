package pe.edu.upc.hqpractica.dtos;

import lombok.Data;
import pe.edu.upc.hqpractica.entities.Role;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private Boolean enabled;
    private Role rol_id;
}
