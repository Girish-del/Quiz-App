package com.girish.quiz.quiz;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String category;
    private String difficultyLevel;
    private String option1;
    private String questionTitle;
    private String option2;
    private String option3;

    private String option4;
    private String correctAnswer;


}
