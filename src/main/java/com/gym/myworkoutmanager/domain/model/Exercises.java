package com.gym.myworkoutmanager.domain.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
public class Exercises {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private Long id;
    @NonNull
    private String name;

    @NonNull
    private Integer repetitions;

    @NonNull
    private Integer series;

    @NonNull
    private Integer weight;

    private String timeRest;

    private String annotation;

    public Exercises(@NonNull Long id, @NonNull String name, @NonNull Integer repetitions, @NonNull Integer series, @NonNull Integer weight, String timeRest, String annotation) {
        this.id = id;
        this.name = name;
        this.repetitions = repetitions;
        this.series = series;
        this.weight = weight;
        this.timeRest = timeRest;
        this.annotation = annotation;
    }

    public Exercises() {}

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

    @NonNull
    public Integer getSeries() {
        return series;
    }

    public void setSeries(@NonNull Integer series) {
        this.series = series;
    }

    @NonNull
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(@NonNull Integer weight) {
        this.weight = weight;
    }

    public String getTimeRest() {
        return timeRest;
    }

    public void setTimeRest(String timeRest) {
        this.timeRest = timeRest;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
}
