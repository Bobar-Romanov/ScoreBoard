package com.example.ScoreBoard.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.ScoreBoard.models.User;
import com.example.ScoreBoard.repo.CategoryRepo;
import com.example.ScoreBoard.repo.RatingRepo;
import com.example.ScoreBoard.repo.UserRepo;
import com.example.ScoreBoard.util.CategoryRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class RatingService {
    @Autowired
    CategoryRepo categoryRepo;
    @Autowired
    RatingRepo ratingRepo;
    @Autowired
    UserRepo userRepo;
    public ArrayList<CategoryRating> getScore(User user){
        List<Long> categories = categoryRepo.findAllIds();
        ArrayList<CategoryRating> result = new ArrayList<>();
        for (Long categoryId : categories) {
            CategoryRating res = new CategoryRating(categoryRepo.getCategoryNameById(categoryId),
                    categoryRepo.getCountOfTasksById(categoryId),
                    ratingRepo.getCompletedTasksByCategoryIdAndUserId(categoryId, user.getId()),
                    ratingRepo.getPosition(categoryId, user.getId()),
                    userRepo.getCountOfUsers(), user);
            result.add(res);
        }
        return result;
    }

}
