package com.example.ScoreBoard.models;

import javax.persistence.*;

@Entity
@Table(name = "rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "user_id",referencedColumnName = "id",nullable = false)
    private User userId;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "category_id",referencedColumnName = "id",nullable = false)
    private Category categoryId;

    @Column(nullable = false)
    private Long completedTasks;

    public Rating() {
    }

    public Rating(User userId, Category categoryId, Long completedTasks) {
        this.userId = userId;
        this.categoryId = categoryId;
        this.completedTasks = completedTasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(Long completedTasks) {
        this.completedTasks = completedTasks;
    }
}