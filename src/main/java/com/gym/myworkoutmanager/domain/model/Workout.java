package com.gym.myworkoutmanager.domain.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.Set;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String name;

    @NonNull
    private Integer repetitions;

    @ManyToMany
    @JoinTable(
            name = "workout_exercises",
            joinColumns = @JoinColumn(name = "workout_id"),
            inverseJoinColumns = @JoinColumn(name = "exercises_id")
    )
    Set<Exercises> exercises;

    public Workout(@NonNull Long id, @NonNull String name, @NonNull Integer repetitions) {
        this.id = id;
        this.name = name;
        this.repetitions = repetitions;
    }

    public Workout() {}

    public Workout(@NonNull String name, @NonNull Integer repetitions) {
        this.name = name;
        this.repetitions = repetitions;
    }

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public Integer getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(@NonNull Integer repetitions) {
        this.repetitions = repetitions;
    }
}
