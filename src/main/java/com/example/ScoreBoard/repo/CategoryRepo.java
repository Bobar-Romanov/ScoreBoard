package com.example.ScoreBoard.repo;

import com.example.ScoreBoard.models.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Long> {


    @Query(value = "SELECT c.id FROM categories c ORDER BY c.id ASC", nativeQuery = true)
    List<Long> findAllIds();

    @Query(value = "SELECT c.name FROM categories c WHERE id = ?1", nativeQuery = true)
    String getCategoryNameById(Long id);

    @Query(value = "SELECT c.count_of_tasks FROM categories c WHERE id = ?1", nativeQuery = true)
    Long getCountOfTasksById(Long id);



}
