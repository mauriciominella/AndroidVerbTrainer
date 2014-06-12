package com.bravi.capigoatrainer.domain;

/**
 * Created by Mauricio on 11/06/2014.
 */
public class RoundInfo {

    public RoundInfo(int _roundNumber){
        this.number = _roundNumber;
    }

    private int number;
    private String displayName;
    private int startIndex;
    private int endIndex;

    public void loadInfo(){
        SetStartAndEndIndex();
        SetDisplayName();
    }

    private void SetDisplayName() {
        this.displayName = String.format("Round {0}", this.getNumber());
    }

    private void SetStartAndEndIndex() {
        switch (this.getNumber()){
            case 1:
                this.startIndex = 1;
                this.endIndex = 50;
                break;
            case 2:
                this.startIndex = 51;
                this.endIndex = 100;
                break;
            case 3:
                this.startIndex = 101;
                this.endIndex = 150;
                break;
            case 4:
                this.startIndex = 151;
                this.endIndex = 200;
                break;
            case 5:
                this.startIndex = 1;
                this.endIndex = 100;
                break;
            case 6:
                this.startIndex = 101;
                this.endIndex = 200;
                break;
            case 7:
                this.startIndex = 1;
                this.endIndex = 200;
                break;
        }
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }
}



