package com.example.springrecipie.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob // Allow larger strings in database
    private String recipeNotes;

}
