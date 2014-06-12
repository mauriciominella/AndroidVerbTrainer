package com.bravi.capigoatrainer.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.bravi.capigoatrainer.domain.RoundRunController;


public class RoundRunActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round_run);

        Bundle b = getIntent().getExtras();
        int roundNumber = b.getInt(MainActivity.ROUND_NUMBER_KEY);

        RoundRunController roundController = new RoundRunController(roundNumber);
        roundController.Start();

        TextView roundTitle = (TextView)findViewById(R.id.txtRoundRunTitle);
        roundTitle.setText("Round " + Integer.toString(roundNumber));
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
