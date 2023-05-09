package com.example.ScoreBoard.models;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String name;
    @Column(nullable = false)
    private Long countOfTasks;

    public Category() {
    }

    public Category(String name, Long countOfTasks) {
        this.name = name;
        this.countOfTasks = countOfTasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCountOfTasks() {
        return countOfTasks;
    }

    public void setCountOfTasks(Long countOfTasks) {
        this.countOfTasks = countOfTasks;
    }
}
