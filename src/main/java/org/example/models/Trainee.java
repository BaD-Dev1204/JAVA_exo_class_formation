package org.example.models;

import java.util.Date;
import java.util.List;

public class Trainee {

    //region Fields
    private String _lastName;
    private String _firstName;
    private String _email;
    private Double _fees;
    private int _tel;
    private List<Training> _previousTraining;
    private Training _currentTraining;
    private Date _birthdate;

    //endregion

    //region Constructors

    public Trainee(String lastName, String firstName, String email, Double fees, int tel, List<Training> previousTraining, Training currentTraining, Date birthdate) {
        this._lastName = lastName;
        this._firstName = firstName;
        this._email = email;
        this._fees = fees;
        this._tel = tel;
        this._previousTraining = previousTraining;
        this._currentTraining = currentTraining;
        this._birthdate = birthdate;
    }
    //endregion

    //region Getters/Setters

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String lastName) {
        this._lastName = lastName;
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String firstName) {
        this._firstName = firstName;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String email) {
        this._email = email;
    }

    public Double get_fees() {
        return _fees;
    }

    public void set_fees(Double fees) {
        this._fees = fees;
    }

    public int get_tel() {
        return _tel;
    }

    public void set_tel(int tel) {
        this._tel = tel;
    }

    public List<Training> getPreviousTraining() {
        return _previousTraining;
    }

    public void setPreviousTraining(List<Training> previousTraining) {
        this._previousTraining = previousTraining;
    }

    public Training getCurrentTraining() {
        return _currentTraining;
    }

    public void setCurrentTraining(Training currentTraining) {
        this._currentTraining = currentTraining;
    }

    public Date get_birthdate() {
        return _birthdate;
    }

    public void set_birthdate(Date birthdate) {
        this._birthdate = birthdate;
    }

    //endregion

}