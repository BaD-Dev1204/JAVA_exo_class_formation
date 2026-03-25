package org.example.models;

public class Trainee {

    // #region Fields
    private String _lastName;
    private String _firstName;
    // #endregion

    // #region Constructor
    public Trainee(String lastName, String firstName) {
        this._lastName = lastName;
        this._firstName = firstName;
    }
    // #endregion

    // #region Getters
    public String get_lastName() {
        return this._lastName;
    }

    public String get_firstName() {
        return this._firstName;
    }
    // #endregion

    // #region Setters
    public void set_lastName(String lastName) {
        this._lastName = lastName;
    }

    public void set_firstName(String firstName) {
        this._firstName = firstName;
    }
    // #endregion
}