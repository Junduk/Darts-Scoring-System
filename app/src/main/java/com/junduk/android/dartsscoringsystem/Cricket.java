package com.junduk.android.dartsscoringsystem;

import android.content.Intent;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cricket extends AppCompatActivity {
    Button twoPlayers, threePlayers, fourPlayers, fivePlayers, sixPlayers, start, on, off;
    int players, check;
    boolean timesFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket);
        start = findViewById(R.id.start);
        twoPlayers = findViewById(R.id.twoPlayers);
        threePlayers = findViewById(R.id.threePlayers);
        fourPlayers = findViewById(R.id.fourPlayers);
        fivePlayers = findViewById(R.id.fivePlayers);
        sixPlayers = findViewById(R.id.sixPlayers);
        twoPlayers.setBackgroundResource(android.R.drawable.btn_default);
        threePlayers.setBackgroundResource(android.R.drawable.btn_default);
        fourPlayers.setBackgroundResource(android.R.drawable.btn_default);
        fivePlayers.setBackgroundResource(android.R.drawable.btn_default);
        sixPlayers.setBackgroundResource(android.R.drawable.btn_default);
        start.setBackgroundResource(android.R.drawable.btn_default);
        players = 0;
        check = 0;
        start.setClickable(false);
        start.setTextColor(Color.GRAY);
        timesFour = false;
        on = findViewById(R.id.on);
        off = findViewById(R.id.off);
        on.setBackgroundResource(android.R.drawable.btn_default);
        off.setBackgroundResource(android.R.drawable.btn_default);
    }
    public void check(){ //method for checking if the options are picked
        if (players != 0 & check != 0){
            setStartButtonActive();
        }
    }
    public void setStartButtonActive(){ //setting the Start button to active
        start.setClickable(true);
        start.setTextColor(Color.BLACK);
    }
    public void playersTwo (View view){ //methods for picking the number of players
        players = 2;
        twoPlayers.setBackgroundColor(Color.GRAY);
        threePlayers.setBackgroundResource(android.R.drawable.btn_default);
        fourPlayers.setBackgroundResource(android.R.drawable.btn_default);
        fivePlayers.setBackgroundResource(android.R.drawable.btn_default);
        sixPlayers.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void playersThree (View view){
        players = 3;
        threePlayers.setBackgroundColor(Color.GRAY);
        twoPlayers.setBackgroundResource(android.R.drawable.btn_default);
        fourPlayers.setBackgroundResource(android.R.drawable.btn_default);
        fivePlayers.setBackgroundResource(android.R.drawable.btn_default);
        sixPlayers.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void playersFour (View view){
        players = 4;
        fourPlayers.setBackgroundColor(Color.GRAY);
        twoPlayers.setBackgroundResource(android.R.drawable.btn_default);
        threePlayers.setBackgroundResource(android.R.drawable.btn_default);
        fivePlayers.setBackgroundResource(android.R.drawable.btn_default);
        sixPlayers.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void playersFive (View view){
        players = 5;
        fivePlayers.setBackgroundColor(Color.GRAY);
        twoPlayers.setBackgroundResource(android.R.drawable.btn_default);
        threePlayers.setBackgroundResource(android.R.drawable.btn_default);
        fourPlayers.setBackgroundResource(android.R.drawable.btn_default);
        sixPlayers.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void playersSix (View view){
        players = 6;
        sixPlayers.setBackgroundColor(Color.GRAY);
        twoPlayers.setBackgroundResource(android.R.drawable.btn_default);
        threePlayers.setBackgroundResource(android.R.drawable.btn_default);
        fourPlayers.setBackgroundResource(android.R.drawable.btn_default);
        fivePlayers.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void activatingCricket(View view){
        Intent cricket1Intent = new Intent(this, com.junduk.android.dartsscoringsystem.Cricket1.class);
        cricket1Intent.putExtra("players", players);
        cricket1Intent.putExtra("timesFour", timesFour);
        startActivity(cricket1Intent);
    }
    public void openCricketParametersDescription(View view){
        Intent cricketDesIntent = new Intent(this, com.junduk.android.dartsscoringsystem.CricketDescription.class);
        startActivity(cricketDesIntent);
    }
    public void setReturnToPickingTheGames(View view){ //method to return to previous activity
        finish();
    }
    public void set4xOn(View view){
        check = 1;
        timesFour = true;
        on.setBackgroundColor(Color.GRAY);
        off.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void set4xOff(View view){
        check = 1;
        timesFour = false;
        off.setBackgroundColor(Color.GRAY);
        on.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
}
