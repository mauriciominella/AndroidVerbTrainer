package com.bravi.capigoatrainer.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mauricio on 08/06/2014.
 */
public class RoundRunController {

    private int roundNumber;
    private List<RoundRunItem> roundVerList = null;

    /*Constructor*/
    public RoundRunController(int _roundNumber){
        this.roundNumber = _roundNumber;
        this.roundVerList = new ArrayList<RoundRunItem>();
    }

    public void Load(){



    }
}
