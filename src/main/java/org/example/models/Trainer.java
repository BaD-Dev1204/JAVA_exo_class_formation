package org.example.models;

import java.util.List;

public class Trainer {

    //region Fields
    private String _firstName;
    private String _lastName;
    private String _email;
    private List<Course> _preferedCourses;

    //endregion

    //region Constructors

    public Trainer(String firstName, String lastName, String email, List<Course> preferedCourses) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._email = email;
        this._preferedCourses = preferedCourses;
    }

    //endregion

    //region Getters/Setters

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String firstName) {
        this._firstName = firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String lastName) {
        this._lastName = lastName;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String email) {
        this._email = email;
    }

    public List<Course> get_preferedCourses() {
        return _preferedCourses;
    }

    public void set_preferedCourses(List<Course> preferedCourses) {
        this._preferedCourses = preferedCourses;
    }

    //endregion

}