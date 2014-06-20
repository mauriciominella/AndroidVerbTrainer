package com.bravi.capigoatrainer.domain;

/**
 * Created by Mauricio on 19/06/2014.
 */
public enum VerbTense{
    Infinitive (1,"Infinitive"),
    PastSimple (2,"Past simple"),
    PastParticiple (3, "Past participle");

    int id;
    String name;

    private VerbTense(int id, String name) {
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