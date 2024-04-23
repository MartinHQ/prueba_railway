package pe.edu.upc.hqpractica.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.hqpractica.entities.User;
import pe.edu.upc.hqpractica.repositories.IUserRepository;
import pe.edu.upc.hqpractica.serviceinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(User usuario) {
        uR.save(usuario);
    }

    @Override
    public List<User> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public User listarId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new User());
    }
}
