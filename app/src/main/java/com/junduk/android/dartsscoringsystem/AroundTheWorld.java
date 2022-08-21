package com.junduk.android.dartsscoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AroundTheWorld extends AppCompatActivity {
    Button twoPlayers, threePlayers, fourPlayers, fivePlayers, sixPlayers, start;
    int players, check;
    Button on, off;
    Boolean equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_around_the_world);
        twoPlayers = findViewById(R.id.twoPlayers);
        threePlayers = findViewById(R.id.threePlayers);
        fourPlayers = findViewById(R.id.fourPlayers);
        fivePlayers = findViewById(R.id.fivePlayers);
        sixPlayers = findViewById(R.id.sixPlayers);
        start = findViewById(R.id.start);
        on = findViewById(R.id.on);
        off = findViewById(R.id.off);
        twoPlayers.setBackgroundResource(android.R.drawable.btn_default);
        threePlayers.setBackgroundResource(android.R.drawable.btn_default);
        fourPlayers.setBackgroundResource(android.R.drawable.btn_default);
        fivePlayers.setBackgroundResource(android.R.drawable.btn_default);
        sixPlayers.setBackgroundResource(android.R.drawable.btn_default);
        start.setBackgroundResource(android.R.drawable.btn_default);
        on.setBackgroundResource(android.R.drawable.btn_default);
        off.setBackgroundResource(android.R.drawable.btn_default);
        start.setClickable(false);
        start.setTextColor(Color.GRAY);
        players = 0;
        check = 0;
        equal = false;
    }
    public void check(){ //method for checking if the options are picked
        if (players != 0 && check != 0){
            setStartButtonActive();
        }
    }
    public void setStartButtonActive(){ //setting the Start button to active
        start.setClickable(true);
        start.setTextColor(Color.BLACK);
    }
    public void activatingAroundTheWorld(View view){
        Intent AroundTheWorld1Intent = new Intent(this, AroundTheWorld1.class);
        AroundTheWorld1Intent.putExtra("players", players);
        AroundTheWorld1Intent.putExtra("equal", equal);
        startActivity(AroundTheWorld1Intent);
    }
    public void openAroundTheWorldParametersDescription(View view){
        Intent aroundTheWorldDesIntent = new Intent(this, com.junduk.android.dartsscoringsystem.AroundTheWorldDescription.class);
        startActivity(aroundTheWorldDesIntent);
    }
    public void setReturnToPickingTheGames(View view){ //method to return to previous activity
        finish();
    }
    public void playersTwo (View view){ //methods for picking the number of players with the second 5 numbers
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
    public void setEqualOn(View view){ //methods for setting equal to on or off
        equal = true;
        on.setBackgroundColor(Color.GRAY);
        off.setBackgroundResource(android.R.drawable.btn_default);
        check = 1;
        check();
    }
    public void setEqualOff(View view){
        equal = false;
        off.setBackgroundColor(Color.GRAY);
        on.setBackgroundResource(android.R.drawable.btn_default);
        check = 1;
        check();
    }
}