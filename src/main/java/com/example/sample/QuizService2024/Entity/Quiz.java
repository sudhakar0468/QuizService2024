package com.example.sample.QuizService2024.Entity;

import lombok.Data;

import java.util.List;




@Data
public class Quiz {

    private int id;

    private String title;



    List<Integer> quesonId;

    public Quiz() {
    }

    public Quiz(int id, String title, List<Integer> quesonId) {
        this.id = id;
        this.title = title;
        this.quesonId = quesonId;
    }

  
    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", quesonId=" + quesonId +
                '}';
    }
}
