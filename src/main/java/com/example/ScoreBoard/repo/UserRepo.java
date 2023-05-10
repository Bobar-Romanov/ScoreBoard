package com.example.ScoreBoard.repo;

import com.example.ScoreBoard.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
    @Query(value = "SELECT COUNT(*) FROM user", nativeQuery = true)
    Long getCountOfUsers();
}
