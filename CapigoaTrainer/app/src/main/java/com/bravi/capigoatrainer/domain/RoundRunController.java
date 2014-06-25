package com.bravi.capigoatrainer.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mauricio on 08/06/2014.
 */
public class RoundRunController {

    private int roundNumber;
    private List<RoundRunItem> roundItems = null;

    //RoundInfo
    RoundInfo roundInfo;

    //Verb Count
    private int currentVerbNumber;
    private int verbCount;

    //Score
    private float percentScore;

    //Current Verb
    private RoundRunItem currentVerb;

    //Current Verb Tense
    private VerbTense currentVerbTense;

    //Current Round State
    private RoundState currentState;

    /*Constructor*/
    public RoundRunController(){

    }

    public void start(int _roundNumber){

        this.roundNumber = _roundNumber;
        this.roundItems = new ArrayList<RoundRunItem>();

        //Load the list of verbs
        VerbList verbList = new VerbList();
        verbList.loadFullVerbList();

        //Load the round info
        roundInfo = new RoundInfo(this.roundNumber);
        roundInfo.loadInfo();

        //Select the verbs that belong to the current round
        List<Verb> roundVerbList = verbList.list.subList(roundInfo.getStartIndex(), roundInfo.getEndIndex());

        //Set the current initial verb
        for(Verb verb : roundVerbList){
            RoundRunItem item = new RoundRunItem(verb);
            roundItems.add(item);
        }
        //Set the current verb number
        this.currentVerbNumber = 1;
        this.verbCount = roundItems.size() + 1;

        //Score
        this.percentScore = 0;

        //set the current verb
        currentVerb = roundItems.get(currentVerbNumber - 1);

        //set current verbTense
        this.currentVerbTense = VerbTense.PastSimple;

        currentState = RoundState.Running;
    }

    public void next(String userInput){

        switch (this.currentVerbTense){
            case Infinitive:
                this.currentVerb.getVerb().infinitive = userInput;
                this.currentVerbTense = VerbTense.PastSimple;
                break;
            case PastSimple:
                this.currentVerb.getVerb().simple = userInput;
                this.currentVerbTense = VerbTense.PastParticiple;
                break;
            case PastParticiple:
                this.currentVerb.getVerb().participle = userInput;
                this.currentVerbTense = VerbTense.PastSimple;
                currentVerbNumber++;

                if(roundInfo.getEndIndex() == currentVerbNumber){
                    this.end();
                }else{
                    currentVerb = roundItems.get(currentVerbNumber - 1);
                }

                break;
        }
    }

    private void end(){
        currentState = RoundState.Finalised;
    }

    private void CalculatePercentScore(){

    }

    public int getCurrentVerbNumber() {
        return currentVerbNumber;
    }

    public int getVerbCount() {
        return verbCount;
    }

    public float getPercentScore() {
        return percentScore;
    }

    public RoundRunItem getCurrentVerb() {
        return currentVerb;
    }

    public VerbTense getCurrentVerbTense() {
        return currentVerbTense;
    }

    public RoundState getCurrentState() {
        return currentState;
    }
}

