package org.example.jpa3.repositories;

import org.example.jpa3.entities.Role;
import org.example.jpa3.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUserName(String userName);
}
