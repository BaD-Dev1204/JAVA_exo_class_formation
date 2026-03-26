package org.example.models;

import java.util.List;

public class Course {

    //region Fields

    private String _title;
    private String _description;
    private List<Trainer> _trainers;
    private int _durationInDay;
    private String _prerequisite;
    //endregion

    //region Constructors

    public Course(String title, List<Trainer> trainers, String description, int durationInDay,String prerequisite) {
        this._title = title;
        this._trainers = trainers;
        this._description = description;
        this._durationInDay = durationInDay;
        this._prerequisite = prerequisite;
    }
    //endregion

    //region Getters/Setters

    public String get_title() {
        return _title;
    }

    public void set_title(String title) {
        this._title = title;
    }

    public int get_durationInDay() {
        return _durationInDay;
    }

    public void set_durationInDay(int durationInDay) {
        this._durationInDay = durationInDay;
    }

    public List<Trainer> get_trainers() {
        return _trainers;
    }

    public void set_trainers(List<Trainer> trainers) {
        this._trainers = trainers;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public String get_prerequiste() {
        return _prerequisite;
    }

    public void set_prerequiste(String prerequisite) {
        this._prerequisite = prerequisite;
    }

    //endregion

}
