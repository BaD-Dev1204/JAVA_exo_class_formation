package org.example.models;

public class Room {

    // #region Fields
    private String _number;
    private int _capacity;

    // #endregion

    // #region Constructor

    public Room(String number, int capacity) {
        this._number = number;
        this._capacity = capacity;
    }

    // #endregion

    // #region Getters

    public String get_number() {
        return this._number;
    }


    public int get_capacity() {
        return this._capacity;
    }
    // #endregion

    // #region Setters

    public void set_number(String _number) {
        this._number = _number;
    }

    public void set_capacity(int _capacity) {
        this._capacity = _capacity;
    }

// #endregion

}
