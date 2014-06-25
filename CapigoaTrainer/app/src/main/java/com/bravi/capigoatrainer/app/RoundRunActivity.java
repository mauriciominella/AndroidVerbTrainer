package com.bravi.capigoatrainer.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bravi.capigoatrainer.domain.RoundRunController;
import com.bravi.capigoatrainer.domain.RoundState;


public class RoundRunActivity extends ActionBarActivity {

    RoundRunController roundController;
    int roundNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round_run);

        Bundle b = getIntent().getExtras();
        roundNumber = b.getInt(MainActivity.ROUND_NUMBER_KEY);

        roundController = new RoundRunController();
        roundController.start(roundNumber);

        //TextView roundTitle = (TextView)findViewById(R.id.txtRoundRunTitle);
        //roundTitle.setText("Round " + Integer.toString(roundNumber));

        updateViewsValues();

        Button nextVerbButton = (Button)findViewById(R.id.btn_NextVerb);
        nextVerbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandleNextButtonClick();
            }
        });
    }

    private void updateViewsValues() {
        this.setTitle("Round " + Integer.toString(roundNumber));

        TextView wordNumber = (TextView)findViewById(R.id.txt_wordNumber);
        wordNumber.setText(String.format("%d/%d", roundController.getCurrentVerbNumber(), roundController.getVerbCount()));

        TextView score = (TextView)findViewById(R.id.txt_score);
        score.setText(Float.toString(roundController.getPercentScore()) + "%");

        TextView infinitiveVerb = (TextView)findViewById(R.id.txt_infinitiveVerb);
        infinitiveVerb.setText(roundController.getCurrentVerb().getVerb().infinitive);

        TextView currentVerbTense = (TextView)findViewById(R.id.txt_currentVerbTense);
        currentVerbTense.setText(roundController.getCurrentVerbTense().getName());
    }

    private void HandleNextButtonClick() {

        EditText verbInput = (EditText)findViewById(R.id.txt_verbInput);

        if(verbInput.getText().length() == 0){
            Toast.makeText(getApplicationContext(), "You should type a verb!",
                    Toast.LENGTH_LONG).show();
        }else{
            roundController.next(verbInput.getText().toString());

            RoundState currentRoundState = roundController.getCurrentState();
            this.updateViewsValues();

            switch (currentRoundState){
                case Running:
                    verbInput.getText().clear();
                    break;
                case Finalised:
                    this.goToRoundResults();
                    break;
            }

        }


    }

    private void goToRoundResults(){
        Intent intent = new Intent(RoundRunActivity.this, RoundSummaryActivity.class);

        //Bundle b = new Bundle();
       // b.putInt(ROUND_NUMBER_KEY, roundNumber); //Your id
        //intent.putExtras(b); //Put your id to your next Intent

        RoundRunActivity.this.startActivity(intent);
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
