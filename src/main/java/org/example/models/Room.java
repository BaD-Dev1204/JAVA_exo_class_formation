package org.example.models;


public class Room {

    //region Fields
    private String _code;
    private int _maxCapacity;

    //endregion

    //region Constructors

    public Room(int maxCapacity, String code) {
        this._maxCapacity = maxCapacity;
        this._code = code;
    }
    //endregion

    //region Getters/Setters

    public String get_code() {
        return _code;
    }

    public void set_code(String code) {
        this._code = code;
    }

    public int get_maxCapacity() {
        return _maxCapacity;
    }

    public void set_maxCapacity(int maxCapacity) {
        this._maxCapacity = maxCapacity;
    }
    //endregion

}


