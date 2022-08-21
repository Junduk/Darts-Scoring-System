package com.junduk.android.dartsscoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Killer extends AppCompatActivity {
    Button twoPlayers, threePlayers, fourPlayers, fivePlayers, sixPlayers, start, oneHit, twoHits, threeHits;
    int players, hits, check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_killer);
        start = findViewById(R.id.start);
        twoPlayers = findViewById(R.id.twoPlayers);
        threePlayers = findViewById(R.id.threePlayers);
        fourPlayers = findViewById(R.id.fourPlayers);
        fivePlayers = findViewById(R.id.fivePlayers);
        sixPlayers = findViewById(R.id.sixPlayers);
        oneHit = findViewById(R.id.oneHit);
        twoHits = findViewById(R.id.twoHits);
        threeHits = findViewById(R.id.threeHits);
        twoPlayers.setBackgroundResource(android.R.drawable.btn_default);
        threePlayers.setBackgroundResource(android.R.drawable.btn_default);
        fourPlayers.setBackgroundResource(android.R.drawable.btn_default);
        fivePlayers.setBackgroundResource(android.R.drawable.btn_default);
        sixPlayers.setBackgroundResource(android.R.drawable.btn_default);
        oneHit.setBackgroundResource(android.R.drawable.btn_default);
        twoHits.setBackgroundResource(android.R.drawable.btn_default);
        threeHits.setBackgroundResource(android.R.drawable.btn_default);
        start.setBackgroundResource(android.R.drawable.btn_default);

        players = 0;
        hits = 0;
        check = 0;
        start.setClickable(false);
        start.setTextColor(Color.GRAY);
    }
    public void setReturnToPickingTheGames(View view){ //method to return to previous activity
        finish();
    }
    public void openKillerParametersDescription(View view){
        Intent killerDesIntent = new Intent(this, KillerDescription.class);
        startActivity(killerDesIntent);
    }
    public void nextKiller(View view){
        Intent killer1Intent = new Intent(this, Killer1.class);
        killer1Intent.putExtra("players", players);
        killer1Intent.putExtra("hits", hits);
        startActivity(killer1Intent);
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
    public void setHitsToOne(View view){
        check = 1;
        hits = 1;
        oneHit.setBackgroundColor(Color.GRAY);
        twoHits.setBackgroundResource(android.R.drawable.btn_default);
        threeHits.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void setHitsToTwo(View view){
        check = 1;
        hits = 2;
        twoHits.setBackgroundColor(Color.GRAY);
        oneHit.setBackgroundResource(android.R.drawable.btn_default);
        threeHits.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void setHitsToThree(View view){
        check = 1;
        hits = 3;
        threeHits.setBackgroundColor(Color.GRAY);
        oneHit.setBackgroundResource(android.R.drawable.btn_default);
        twoHits.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
}