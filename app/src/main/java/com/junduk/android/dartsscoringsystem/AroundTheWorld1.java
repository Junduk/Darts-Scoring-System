package com.junduk.android.dartsscoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AroundTheWorld1 extends AppCompatActivity {
    Button start;
    TextView playerOne, playerTwo, playerThree, playerFour, playerFive, playerSix;
    EditText name1, name2, name3, name4, name5, name6;
    Bundle extras;
    int players;
    String n1, n2, n3, n4, n5, n6;
    Boolean equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_around_the_world1);
        playerOne = findViewById(R.id.playerOne);
        playerTwo = findViewById(R.id.playerTwo);
        playerThree = findViewById(R.id.playerThree);
        playerFour = findViewById(R.id.playerFour);
        playerFive = findViewById(R.id.playerFive);
        playerSix = findViewById(R.id.playerSix);
        name1 = findViewById(R.id.name1);
        name2 = findViewById(R.id.name2);
        name3 = findViewById(R.id.name3);
        name4 = findViewById(R.id.name4);
        name5 = findViewById(R.id.name5);
        name6 = findViewById(R.id.name6);
        start = findViewById(R.id.start);
        start.setBackgroundResource(android.R.drawable.btn_default);
        extras = getIntent().getExtras();
        if (extras != null) {
            players = extras.getInt("players");
            equal = extras.getBoolean("equal");
        }
        setPlayers();
    }
    public void start(View view){
        settingNames();
        Intent aroundTheWorld2Intent = new Intent(this, AroundTheWorld2.class);
        aroundTheWorld2Intent.putExtra("players", players);
        aroundTheWorld2Intent.putExtra("equal", equal);
        if (players == 2){
            aroundTheWorld2Intent.putExtra("name1", n1);
            aroundTheWorld2Intent.putExtra("name2", n2);
        } else if (players == 3){
            aroundTheWorld2Intent.putExtra("name1", n1);
            aroundTheWorld2Intent.putExtra("name2", n2);
            aroundTheWorld2Intent.putExtra("name3", n3);
        } else if (players == 4){
            aroundTheWorld2Intent.putExtra("name1", n1);
            aroundTheWorld2Intent.putExtra("name2", n2);
            aroundTheWorld2Intent.putExtra("name3", n3);
            aroundTheWorld2Intent.putExtra("name4", n4);
        } else if (players == 5){
            aroundTheWorld2Intent.putExtra("name1", n1);
            aroundTheWorld2Intent.putExtra("name2", n2);
            aroundTheWorld2Intent.putExtra("name3", n3);
            aroundTheWorld2Intent.putExtra("name4", n4);
            aroundTheWorld2Intent.putExtra("name5", n5);
        } else if (players == 6){
            aroundTheWorld2Intent.putExtra("name1", n1);
            aroundTheWorld2Intent.putExtra("name2", n2);
            aroundTheWorld2Intent.putExtra("name3", n3);
            aroundTheWorld2Intent.putExtra("name4", n4);
            aroundTheWorld2Intent.putExtra("name5", n5);
            aroundTheWorld2Intent.putExtra("name6", n6);
        }
        startActivity(aroundTheWorld2Intent);
    }
    public void settingNames(){
        if (name1.getText().toString().trim().equals("")){
            n1 = "Player 1";
        } else {
            n1 = name1.getText().toString().trim();
        }
        if (name2.getText().toString().trim().equals("")){
            n2 = "Player 2";
        } else {
            n2 = name2.getText().toString().trim();
        }
        if (name3.getText().toString().trim().equals("")){
            n3 = "Player 3";
        } else {
            n3 = name3.getText().toString().trim();
        }
        if (name4.getText().toString().trim().equals("")){
            n4 = "Player 4";
        } else {
            n4 = name4.getText().toString().trim();
        }
        if (name5.getText().toString().trim().equals("")){
            n5 = "Player 5";
        } else {
            n5 = name5.getText().toString().trim();
        }
        if (name6.getText().toString().trim().equals("")){
            n6 = "Player 6";
        } else {
            n6 = name6.getText().toString().trim();
        }
    }
    public void setPlayers(){
        if (players == 2){
            playerThree.setVisibility(View.GONE);
            playerFour.setVisibility(View.GONE);
            playerFive.setVisibility(View.GONE);
            playerSix.setVisibility(View.GONE);
            name3.setVisibility(View.GONE);
            name4.setVisibility(View.GONE);
            name5.setVisibility(View.GONE);
            name6.setVisibility(View.GONE);
        } else if (players == 3){
            playerFour.setVisibility(View.GONE);
            playerFive.setVisibility(View.GONE);
            playerSix.setVisibility(View.GONE);
            name4.setVisibility(View.GONE);
            name5.setVisibility(View.GONE);
            name6.setVisibility(View.GONE);
        } else if (players == 4){
            playerFive.setVisibility(View.GONE);
            playerSix.setVisibility(View.GONE);
            name5.setVisibility(View.GONE);
            name6.setVisibility(View.GONE);
        } else if (players == 5){
            playerSix.setVisibility(View.GONE);
            name6.setVisibility(View.GONE);
        }
    }
    public void setReturnToPickingTheGames(View view){ //method to return to previous activity
        finish();
    }
}