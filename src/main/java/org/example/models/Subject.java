package org.example.models;

public class Subject {


    // #region Fields
    private String _name;
    private String _description;

    // #endregion

    // #region Constructor

    public Subject(String name, String description){

        this._name = name;
        this._description = description;

    }

    // #endregion

    // #region Getters

    public String get_name(){
        return this._name;
    }

    public String get_description(){
        return this._description;
    }

    // #endregion

    // #region Setters

    public void set_name(String name){
        this._name = name;
    }

    public void set_description(String description){
        this._description = description;
    }

    // #endregion


}
