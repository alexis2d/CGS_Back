package fr.cgs.cgs_back.repository;

import fr.cgs.cgs_back.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {


    Optional<User> findByEmail(String email);

    User findByEmailAndPassword(String email, String password);

}
