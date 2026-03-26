package org.example.models;

import java.util.Date;
import java.util.List;

public class Training {

    //region Fields

    private String _title;
    private String _description;
    private Date _startDate;
    private Date _effectiveEndDate;
    private Date _theoricalEndDate;
    private int _minTrainees;
    private int _maxTrainees;
    private List<Course> _courses;
    private List<Trainee> _trainees;
    private List<Trainer> _trainers;
    private Trainer _responsibleTrainer;
    private Room _room;
    //endregion

    //region Constructors

    public Training(String title, String description, Date startDate, Date effectiveEndDate, Date theoricalEndDate, int minTrainees, int maxTrainees, List<Course> courses, List<Trainee> trainees, List<Trainer> trainers, Trainer responsibleTrainer, Room room) {
        this._title = title;
        this._description = description;
        this._startDate = startDate;
        this._effectiveEndDate = effectiveEndDate;
        this._theoricalEndDate = theoricalEndDate;
        this._minTrainees = minTrainees;
        this._maxTrainees = maxTrainees;
        this._courses = courses;
        this._trainees = trainees;
        this._trainers = trainers;
        this._responsibleTrainer = responsibleTrainer;
        this._room = room;
    }

    //endregion

    //region Getters/Setters

    public String get_title() {
        return _title;
    }

    public void set_title(String title) {
        this._title = title;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public Date get_startDate() {
        return _startDate;
    }

    public void set_startDate(Date startDate) {
        this._startDate = startDate;
    }

    public Date get_effectiveEndDate() {
        return _effectiveEndDate;
    }

    public void set_effectiveEndDate(Date effectiveEndDate) {
        this._effectiveEndDate = effectiveEndDate;
    }

    public Date get_theoricalEndDate() {
        return _theoricalEndDate;
    }

    public void set_theoricalEndDate(Date theoricalEndDate) {
        this._theoricalEndDate = theoricalEndDate;
    }

    public int get_minTrainees() {
        return _minTrainees;
    }

    public void set_minTrainees(int minTrainees) {
        this._minTrainees = minTrainees;
    }

    public int get_maxTrainees() {
        return _maxTrainees;
    }

    public void set_maxTrainees(int maxTrainees) {
        this._maxTrainees = maxTrainees;
    }

    public List<Course> get_courses() {
        return _courses;
    }

    public void set_courses(List<Course> courses) {
        this._courses = courses;
    }

    public List<Trainee> get_trainees() {
        return _trainees;
    }

    public void set_trainees(List<Trainee> trainees) {
        this._trainees = trainees;
    }

    public List<Trainer> get_trainers() {
        return _trainers;
    }

    public void set_trainers(List<Trainer> trainers) {
        this._trainers = trainers;
    }

    public Trainer get_responsibleTrainer() {
        return _responsibleTrainer;
    }

    public void set_responsibleTrainer(Trainer responsibleTrainer) {
        this._responsibleTrainer = responsibleTrainer;
    }

    public Room get_room() {
        return _room;
    }

    public void set_room(Room room) {
        this._room = room;
    }
    //endregion
}
