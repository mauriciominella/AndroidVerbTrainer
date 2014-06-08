package com.bravi.capigoatrainer.domain;

/**
 * Created by Mauricio on 03/06/2014.
 */
public class Verb {

    public String infinitive;
    public String simple;
    public String participle;
    public String meaning;

    public Verb(String _infinitive, String _simple, String _participle, String _meaning){
        this.infinitive = _infinitive;
        this.simple = _simple;
        this.participle = _participle;
        this.meaning = _meaning;
    }

    public Verb(){

    }

}
