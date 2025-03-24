package ru.masnaviev.calorimeter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.masnaviev.calorimeter.model.User;

public interface UserRepository extends JpaRepository<User, String> {

    boolean existsByEmail(String email);
}
