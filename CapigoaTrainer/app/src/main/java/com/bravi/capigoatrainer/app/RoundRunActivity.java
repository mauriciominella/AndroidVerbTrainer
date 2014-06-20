package com.bravi.capigoatrainer.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bravi.capigoatrainer.domain.RoundRunController;


public class RoundRunActivity extends ActionBarActivity {

    RoundRunController roundController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round_run);

        Bundle b = getIntent().getExtras();
        int roundNumber = b.getInt(MainActivity.ROUND_NUMBER_KEY);

        roundController = new RoundRunController();
        roundController.Start(roundNumber);

        //TextView roundTitle = (TextView)findViewById(R.id.txtRoundRunTitle);
        //roundTitle.setText("Round " + Integer.toString(roundNumber));

       this.setTitle("Round " + Integer.toString(roundNumber));

        TextView wordNumber = (TextView)findViewById(R.id.txt_wordNumber);
        wordNumber.setText(String.format("%d/%d", roundController.getCurrentVerbNumber(), roundController.getVerbCount()));


        TextView score = (TextView)findViewById(R.id.txt_score);
        score.setText(Float.toString(roundController.getPercentScore()) + "%");

        TextView infinitiveVerb = (TextView)findViewById(R.id.txt_infinitiveVerb);
        infinitiveVerb.setText(roundController.getCurrentVerb().getVerb().infinitive);

        TextView currentVerbTense = (TextView)findViewById(R.id.txt_currentVerbTense);
        currentVerbTense.setText(roundController.getCurrentVerbTense().getName());

        EditText verbInput = (EditText)findViewById(R.id.txt_verbInput);

        Button nextVerbButton = (Button)findViewById(R.id.btn_NextVerb);
        nextVerbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandleNextButtonClick();
            }
        });
    }

    private void HandleNextButtonClick() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.round_running, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
