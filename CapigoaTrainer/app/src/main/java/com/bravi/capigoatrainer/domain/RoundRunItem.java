package com.bravi.capigoatrainer.domain;

/**
 * Created by Mauricio on 08/06/2014.
 */
public class RoundRunItem {

    public RoundRunItem(Verb verb){
        this.verb = verb;
        this.userInput = new Verb();
    }

    private Verb verb = null;
    private Verb userInput = null;

    public Verb getVerb() {
        return verb;
    }

    public Verb getUserInput() {
        return userInput;
    }

    public void setUserInput(Verb userInput) {
        this.userInput = userInput;
    }
}
