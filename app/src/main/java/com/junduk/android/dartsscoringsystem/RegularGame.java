package com.junduk.android.dartsscoringsystem;

import android.content.Intent;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegularGame extends AppCompatActivity {
    Boolean equal, indicator;
    Button oneEightZero, threeZeroOne, fiveZeroOne, sevenZeroOne, nineZeroOne, on, off, on2, off2;
    Button twoPlayers, threePlayers, fourPlayers, fivePlayers, sixPlayers, start;
    int score, players, check, check2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_game);
        start = findViewById(R.id.start);
        start.setBackgroundResource(android.R.drawable.btn_default);
        equal = false;
        indicator = false;
        score = 0;
        players = 0;
        check = 0; //this changes when one of the equal options is picked
        check2 = 0; //this changes when one of the indicator options is picked
        start.setClickable(false);
        start.setTextColor(Color.GRAY);
        oneEightZero = findViewById(R.id.oneEightZero);
        threeZeroOne = findViewById(R.id.threeZeroOne);
        fiveZeroOne = findViewById(R.id.fiveZeroOne);
        sevenZeroOne = findViewById(R.id.sevenZeroOne);
        nineZeroOne = findViewById(R.id.nineZeroOne);
        oneEightZero.setBackgroundResource(android.R.drawable.btn_default);
        threeZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        fiveZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        sevenZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        nineZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        on = findViewById(R.id.on);
        off = findViewById(R.id.off);
        on2 = findViewById(R.id.on2);
        off2 = findViewById(R.id.off2);
        on.setBackgroundResource(android.R.drawable.btn_default);
        off.setBackgroundResource(android.R.drawable.btn_default);
        on2.setBackgroundResource(android.R.drawable.btn_default);
        off2.setBackgroundResource(android.R.drawable.btn_default);
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
    }
    public void openRegularGameParametersDescription(View view){
        Intent regGameDesIntent = new Intent(this, com.junduk.android.dartsscoringsystem.RegularGameDescription.class);
        startActivity(regGameDesIntent);
    }
    public void activatingRegularGame(View view){
        Intent regGame1Intent = new Intent(this, com.junduk.android.dartsscoringsystem.RegularGame1.class);
        regGame1Intent.putExtra("score", score);
        regGame1Intent.putExtra("players", players);
        regGame1Intent.putExtra("equal", equal);
        regGame1Intent.putExtra("indicator", indicator);
        startActivity(regGame1Intent);
    }
    public void check(){ //method for checking if the options are picked
        if (score != 0 && players != 0 && check != 0 && check2 != 0){
            setStartButtonActive();
        }
    }
    public void setStartButtonActive(){ //setting the Start button to active
        start.setClickable(true);
        start.setTextColor(Color.BLACK);
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
    public void setIndicatorOn(View view){ //methods for setting indicator to on or off
        indicator = true;
        on2.setBackgroundColor(Color.GRAY);
        off2.setBackgroundResource(android.R.drawable.btn_default);
        check2 = 1;
        check();
    }
    public void setIndicatorOff(View view){
        indicator = false;
        off2.setBackgroundColor(Color.GRAY);
        on2.setBackgroundResource(android.R.drawable.btn_default);
        check2 = 1;
        check();
    }
    public void setReturnToPickingTheGames(View view){ //method to return to previous activity
        finish();
    }
    public void setScore180 (View view){ // methods for setting the score with first 5 buttons
        score = 180;
        oneEightZero.setBackgroundColor(Color.GRAY);
        threeZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        fiveZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        sevenZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        nineZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void setScore301 (View view){
        score = 301;
        threeZeroOne.setBackgroundColor(Color.GRAY);
        oneEightZero.setBackgroundResource(android.R.drawable.btn_default);
        fiveZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        sevenZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        nineZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void setScore501 (View view){
        score = 501;
        fiveZeroOne.setBackgroundColor(Color.GRAY);
        oneEightZero.setBackgroundResource(android.R.drawable.btn_default);
        threeZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        sevenZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        nineZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void setScore701 (View view){
        score = 701;
        sevenZeroOne.setBackgroundColor(Color.GRAY);
        oneEightZero.setBackgroundResource(android.R.drawable.btn_default);
        threeZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        fiveZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        nineZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        check();
    }
    public void setScore901 (View view){
        score = 901;
        nineZeroOne.setBackgroundColor(Color.GRAY);
        oneEightZero.setBackgroundResource(android.R.drawable.btn_default);
        threeZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        fiveZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        sevenZeroOne.setBackgroundResource(android.R.drawable.btn_default);
        check();
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
}