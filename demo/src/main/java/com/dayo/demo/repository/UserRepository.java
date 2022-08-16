package com.dayo.demo.repository;

import com.dayo.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long userId);
//    boolean existsByEmail(String email);
//    User findUserByEmailAndUserId(String email);
//    User findUserByEmail(String email);

}
