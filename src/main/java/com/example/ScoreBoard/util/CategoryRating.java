package com.example.ScoreBoard.util;

import com.example.ScoreBoard.models.User;

public class CategoryRating {

    private String categoryName;
    private Long countOfTasks;
    private Long completedTasks;
    private Long placeInTop;
    private Long countOfUsers;
    private User user;


    public CategoryRating(String categoryName, Long countOfTasks, Long completedTasks, Long placeInTop, Long countOfUsers, User user) {
        this.categoryName = categoryName;
        this.countOfTasks = countOfTasks;
        this.completedTasks = completedTasks;
        this.placeInTop = placeInTop;
        this.countOfUsers = countOfUsers;
        this.user = user;
    }

    public Long getCountOfUsers() {
        return countOfUsers;
    }

    public void setCountOfUsers(Long countOfUsers) {
        countOfUsers = countOfUsers;
    }

    public CategoryRating() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getCountOfTasks() {
        return countOfTasks;
    }

    public void setCountOfTasks(Long countOfTasks) {
        this.countOfTasks = countOfTasks;
    }

    public Long getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(Long completedTasks) {
        this.completedTasks = completedTasks;
    }

    public Long getPlaceInTop() {
        return placeInTop;
    }

    public void setPlaceInTop(Long placeInTop) {
        this.placeInTop = placeInTop;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
