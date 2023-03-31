package com.gym.myworkoutmanager.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private Long id;
    @NonNull
    private String name;

    @NonNull
    private Integer repetitions;

    public Workout(@NonNull Long id, @NonNull String name, @NonNull Integer repetitions) {
        this.id = id;
        this.name = name;
        this.repetitions = repetitions;
    }

    public Workout() {}

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
