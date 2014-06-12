package com.bravi.capigoatrainer.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mauricio on 08/06/2014.
 */
public class RoundRunController {

    private int roundNumber;
    private List<RoundRunItem> roundItems = null;


    /*Constructor*/
    public RoundRunController(){

    }

    public void Start(int _roundNumber){

        this.roundNumber = _roundNumber;
        this.roundItems = new ArrayList<RoundRunItem>();

        //Load the list of verbs
        VerbList verbList = new VerbList();
        verbList.loadFullVerbList();

        //Load the round info
        RoundInfo roundInfo = new RoundInfo(this.roundNumber);
        roundInfo.loadInfo();

        //Select the verbs that belong to the current round
        List<Verb> roundVerbList = verbList.list.subList(roundInfo.getStartIndex(), roundInfo.getEndIndex());

        //Set the current initial verb
        for(Verb verb : roundVerbList){
            RoundRunItem item = new RoundRunItem(verb);
            roundItems.add(item);
        }
        //Set the current tense
    }

    public void Next(){
        //
    }
}
