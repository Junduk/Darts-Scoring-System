package com.junduk.android.dartsscoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shanghai extends AppCompatActivity {
    Button twoPlayers, threePlayers, fourPlayers, fivePlayers, sixPlayers, start;
    int players;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shanghai);
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
        start.setClickable(false);
        start.setTextColor(Color.GRAY);
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
        setStartButtonActive();
    }
    public void playersThree (View view){
        players = 3;
        threePlayers.setBackgroundColor(Color.GRAY);
        twoPlayers.setBackgroundResource(android.R.drawable.btn_default);
        fourPlayers.setBackgroundResource(android.R.drawable.btn_default);
        fivePlayers.setBackgroundResource(android.R.drawable.btn_default);
        sixPlayers.setBackgroundResource(android.R.drawable.btn_default);
        setStartButtonActive();
    }
    public void playersFour (View view){
        players = 4;
        fourPlayers.setBackgroundColor(Color.GRAY);
        twoPlayers.setBackgroundResource(android.R.drawable.btn_default);
        threePlayers.setBackgroundResource(android.R.drawable.btn_default);
        fivePlayers.setBackgroundResource(android.R.drawable.btn_default);
        sixPlayers.setBackgroundResource(android.R.drawable.btn_default);
        setStartButtonActive();
    }
    public void playersFive (View view){
        players = 5;
        fivePlayers.setBackgroundColor(Color.GRAY);
        twoPlayers.setBackgroundResource(android.R.drawable.btn_default);
        threePlayers.setBackgroundResource(android.R.drawable.btn_default);
        fourPlayers.setBackgroundResource(android.R.drawable.btn_default);
        sixPlayers.setBackgroundResource(android.R.drawable.btn_default);
        setStartButtonActive();
    }
    public void playersSix (View view){
        players = 6;
        sixPlayers.setBackgroundColor(Color.GRAY);
        twoPlayers.setBackgroundResource(android.R.drawable.btn_default);
        threePlayers.setBackgroundResource(android.R.drawable.btn_default);
        fourPlayers.setBackgroundResource(android.R.drawable.btn_default);
        fivePlayers.setBackgroundResource(android.R.drawable.btn_default);
        setStartButtonActive();
    }
    public void activatingShanghai(View view){
        Intent shanghai1Intent = new Intent(this, com.junduk.android.dartsscoringsystem.Shanghai1.class);
        shanghai1Intent.putExtra("players", players);
        startActivity(shanghai1Intent);
    }
    public void openShanghaiParametersDescription(View view){
        Intent shanghaiDesIntent = new Intent(this, com.junduk.android.dartsscoringsystem.ShanghaiDescription.class);
        startActivity(shanghaiDesIntent);
    }
    public void setReturnToPickingTheGames(View view){ //method to return to previous activity
        finish();
    }
}