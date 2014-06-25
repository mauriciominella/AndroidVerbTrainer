package com.bravi.capigoatrainer.domain;

/**
 * Created by Mauricio on 24/06/2014.
 */
public enum RoundState {
    Running (1,"Running"),
    Finalised (2,"Finalised");
    int id;
    String name;

    private RoundState(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}
