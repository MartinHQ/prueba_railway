package pe.edu.upc.hqpractica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.hqpractica.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    public User findByUsername(String username);
}
