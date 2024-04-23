package pe.edu.upc.hqpractica.serviceinterfaces;

import pe.edu.upc.hqpractica.entities.User;

import java.util.List;

public interface IUserService {
    public void insert(User usuario);

    public List<User> list();

    public void delete(Long idUsuario);

    public User listarId(Long idUsuario);
}
