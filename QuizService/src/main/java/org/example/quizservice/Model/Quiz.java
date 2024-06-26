package org.example.quizservice.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
//@Table(name = "programming_questions")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @ElementCollection
    private List<Integer> questionsIds;

}
