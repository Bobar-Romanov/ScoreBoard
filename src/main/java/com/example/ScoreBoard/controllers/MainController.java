package com.example.ScoreBoard.controllers;

import com.example.ScoreBoard.models.User;
import com.example.ScoreBoard.service.RatingService;
import com.example.ScoreBoard.util.CategoryRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MainController {

    @Autowired
    private RatingService ratingService;
    @GetMapping("/scoreboard")
    public String HomePage(@AuthenticationPrincipal User user, Model model){
        model.addAttribute("scoreResult",ratingService.getScore(user));
        return "scoreboardPage";
    }
}
