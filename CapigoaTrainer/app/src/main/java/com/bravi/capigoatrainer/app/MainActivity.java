package com.bravi.capigoatrainer.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.bravi.capigoatrainer.domain.VerbList;


public class MainActivity extends ActionBarActivity {

    public static String ROUND_NUMBER_KEY = "round_number";

    public VerbList verbList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.verbList = new VerbList();
        this.verbList.Load();

        HookRoundButtonClickHandlers();
    }

    private void HookRoundButtonClickHandlers() {

        Button btnRound1 = (Button)findViewById(R.id.btn_round1);
        btnRound1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 HandleRoundClick(1);
             }
        });

        Button btnRound2 = (Button)findViewById(R.id.btn_round2);
        btnRound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandleRoundClick(2);
            }
        });

        Button btnRound3 = (Button)findViewById(R.id.btn_round3);
        btnRound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandleRoundClick(3);
            }
        });


        Button btnRound4 = (Button)findViewById(R.id.btn_round4);
        btnRound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandleRoundClick(4);
            }
        });

        Button btnRound5 = (Button)findViewById(R.id.btn_round5);
        btnRound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandleRoundClick(5);
            }
        });

        Button btnRound6 = (Button)findViewById(R.id.btn_round6);
        btnRound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandleRoundClick(6);
            }
        });

        Button btnRound7 = (Button)findViewById(R.id.btn_round7);
        btnRound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandleRoundClick(7);
            }
        });
    }

    private void HandleRoundClick(int roundNumber){

        Intent intent = new Intent(MainActivity.this, RoundRunActivity.class);

        Bundle b = new Bundle();
        b.putInt(ROUND_NUMBER_KEY, roundNumber); //Your id
        intent.putExtras(b); //Put your id to your next Intent

        MainActivity.this.startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
