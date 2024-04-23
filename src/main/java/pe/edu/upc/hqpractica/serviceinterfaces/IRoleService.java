package pe.edu.upc.hqpractica.serviceinterfaces;

import pe.edu.upc.hqpractica.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role rol);

    public List<Role> list();

    public void delete(Long idRol);

    public Role listarId(Long idRol);
}
