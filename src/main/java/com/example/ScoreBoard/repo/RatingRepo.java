package com.example.ScoreBoard.repo;

import com.example.ScoreBoard.models.Rating;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface RatingRepo extends CrudRepository<Rating,Long> {

    @Query(value = "SELECT c.completed_tasks FROM rating c WHERE c.category_id = ?1 AND c.user_id = ?2", nativeQuery = true)
    Long getCompletedTasksByCategoryIdAndUserId(Long categoryId, Long userId);

    @Query(value = "SELECT COUNT(*) + 1\n" +
            "FROM rating r1\n" +
            "WHERE r1.category_id = ?1\n" +
            "  AND r1.user_id != ?2\n" +
            "  AND r1.completed_tasks > (SELECT completed_tasks FROM rating WHERE category_id = ?1 AND user_id = ?2);" , nativeQuery = true)
    Long getPosition(Long categoryId, Long userId);
}
