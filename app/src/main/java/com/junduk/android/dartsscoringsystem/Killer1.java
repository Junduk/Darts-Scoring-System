package com.junduk.android.dartsscoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Killer1 extends AppCompatActivity {
    TextView playerOne, playerTwo, playerThree, playerFour, playerFive, playerSix;
    RelativeLayout firstPlayer, secondPlayer, thirdPlayer, fourthPlayer, fifthPlayer, sixthPlayer;
    EditText name1, name2, name3, name4, name5, name6, number1, number2, number3, number4, number5, number6;
    Bundle extras;
    Button start;
    int players, hits, trg1, trg2, trg3, trg4, trg5, trg6;
    int[] trg;
    String n1, n2, n3, n4, n5, n6;
    Boolean ready, chk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_killer1);
        playerOne = findViewById(R.id.playerOne);
        playerTwo = findViewById(R.id.playerTwo);
        playerThree = findViewById(R.id.playerThree);
        playerFour = findViewById(R.id.playerFour);
        playerFive = findViewById(R.id.playerFive);
        playerSix = findViewById(R.id.playerSix);
        firstPlayer = findViewById(R.id.firstPlayer);
        secondPlayer = findViewById(R.id.secondPlayer);
        thirdPlayer = findViewById(R.id.thirdPlayer);
        fourthPlayer = findViewById(R.id.fourthPlayer);
        fifthPlayer = findViewById(R.id.fifthPlayer);
        sixthPlayer = findViewById(R.id.sixthPlayer);
        start = findViewById(R.id.start);
        start.setBackgroundResource(android.R.drawable.btn_default);
        name1 = findViewById(R.id.name1);
        name2 = findViewById(R.id.name2);
        name3 = findViewById(R.id.name3);
        name4 = findViewById(R.id.name4);
        name5 = findViewById(R.id.name5);
        name6 = findViewById(R.id.name6);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);
        number4 = findViewById(R.id.number4);
        number5 = findViewById(R.id.number5);
        number6 = findViewById(R.id.number6);
        chk = false;
        extras = getIntent().getExtras();
        if (extras != null) {
            players = extras.getInt("players");
        }
        if (extras != null) {
            hits = extras.getInt("hits");
        }
        setPlayers();
    }
    public void check(View view){
        settingNames();
        settingNumbers();
        if (ready) {
            if (players == 2) {
                if (trg1 < 1 || trg1 > 20 || trg2 < 1 || trg2 > 20) {
                    Toast.makeText(this, "Invalid numbers. Check again.", Toast.LENGTH_SHORT).show();
                } else {
                    for (int i = 0; i <= 0; i++){
                        for (int j = 1; j <= 1; j++){
                            if (trg[i] == trg[j]){
                                Toast.makeText(this, "Players can't have identical numbers.", Toast.LENGTH_SHORT).show();
                                break;
                            } else {
                                start();
                            }
                        }
                    }
                }
            } else if (players == 3) {
                if (trg1 < 1 || trg1 > 20 || trg2 < 1 || trg2 > 20 ||
                        trg3 < 1 || trg3 > 20) {
                    Toast.makeText(this, "Invalid numbers. Check again.", Toast.LENGTH_SHORT).show();
                } else {
                    for (int i = 0; i <= 1; i++){
                        if (chk) {
                            break;
                        } else {
                            for (int j = 1; j <= 2; j++) {
                                if (trg[i] == trg[j] && i != j) {
                                    chk = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (chk) {
                        Toast.makeText(this, "Players can't have identical numbers.", Toast.LENGTH_SHORT).show();
                        chk = false;
                    } else {
                        start();
                    }
                }
            } else if (players == 4) {
                if (trg1 < 1 || trg1 > 20 || trg2 < 1 || trg2 > 20 ||
                        trg3 < 1 || trg3 > 20 || trg4 < 1 || trg4 > 20) {
                    Toast.makeText(this, "Invalid numbers. Check again.", Toast.LENGTH_SHORT).show();
                } else {
                    for (int i = 0; i <= 2; i++){
                        if (chk) {
                            break;
                        } else {
                            for (int j = 1; j <= 3; j++) {
                                if (trg[i] == trg[j] && i != j) {
                                    chk = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (chk) {
                        Toast.makeText(this, "Players can't have identical numbers.", Toast.LENGTH_SHORT).show();
                        chk = false;
                    } else {
                        start();
                    }
                }
            } else if (players == 5) {
                if (trg1 < 1 || trg1 > 20 || trg2 < 1 || trg2 > 20 ||
                        trg3 < 1 || trg3 > 20 || trg4 < 1 || trg4 > 20 ||
                        trg5 < 1 || trg5 > 20) {
                    Toast.makeText(this, "Invalid numbers. Check again.", Toast.LENGTH_SHORT).show();
                } else {
                    for (int i = 0; i <= 3; i++){
                        if (chk) {
                            break;
                        } else {
                            for (int j = 1; j <= 4; j++) {
                                if (trg[i] == trg[j] && i != j) {
                                    chk = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (chk) {
                        Toast.makeText(this, "Players can't have identical numbers.", Toast.LENGTH_SHORT).show();
                        chk = false;
                    } else {
                        start();
                    }
                }
            } else if (players == 6) {
                if (trg1 < 1 || trg1 > 20 || trg2 < 1 || trg2 > 20 ||
                        trg3 < 1 || trg3 > 20 || trg4 < 1 || trg4 > 20 ||
                        trg5 < 1 || trg5 > 20 || trg6 < 1 || trg6 > 20) {
                    Toast.makeText(this, "Invalid numbers. Check again.", Toast.LENGTH_SHORT).show();
                } else {
                    for (int i = 0; i <= 4; i++){
                        if (chk) {
                            break;
                        } else {
                            for (int j = 1; j <= 5; j++) {
                                if (trg[i] == trg[j] && i != j) {
                                    chk = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (chk) {
                        Toast.makeText(this, "Players can't have identical numbers.", Toast.LENGTH_SHORT).show();
                        chk = false;
                    } else {
                        start();
                    }
                }
            }
        }
    }
    public void start(){
        Intent killer2Intent = new Intent(this, Killer2.class);
        killer2Intent.putExtra("players", players);
        killer2Intent.putExtra("hits", hits);
        if (players == 2){
            killer2Intent.putExtra("name1", n1);
            killer2Intent.putExtra("name2", n2);
            killer2Intent.putExtra("number1", number1.getText().toString().trim());
            killer2Intent.putExtra("number2", number2.getText().toString().trim());
        } else if (players == 3){
            killer2Intent.putExtra("name1", n1);
            killer2Intent.putExtra("name2", n2);
            killer2Intent.putExtra("name3", n3);
            killer2Intent.putExtra("number1", number1.getText().toString().trim());
            killer2Intent.putExtra("number2", number2.getText().toString().trim());
            killer2Intent.putExtra("number3", number3.getText().toString().trim());
        } else if (players == 4){
            killer2Intent.putExtra("name1", n1);
            killer2Intent.putExtra("name2", n2);
            killer2Intent.putExtra("name3", n3);
            killer2Intent.putExtra("name4", n4);
            killer2Intent.putExtra("number1", number1.getText().toString().trim());
            killer2Intent.putExtra("number2", number2.getText().toString().trim());
            killer2Intent.putExtra("number3", number3.getText().toString().trim());
            killer2Intent.putExtra("number4", number4.getText().toString().trim());
        } else if (players == 5){
            killer2Intent.putExtra("name1", n1);
            killer2Intent.putExtra("name2", n2);
            killer2Intent.putExtra("name3", n3);
            killer2Intent.putExtra("name4", n4);
            killer2Intent.putExtra("name5", n5);
            killer2Intent.putExtra("number1", number1.getText().toString().trim());
            killer2Intent.putExtra("number2", number2.getText().toString().trim());
            killer2Intent.putExtra("number3", number3.getText().toString().trim());
            killer2Intent.putExtra("number4", number4.getText().toString().trim());
            killer2Intent.putExtra("number5", number5.getText().toString().trim());
        } else if (players == 6){
            killer2Intent.putExtra("name1", n1);
            killer2Intent.putExtra("name2", n2);
            killer2Intent.putExtra("name3", n3);
            killer2Intent.putExtra("name4", n4);
            killer2Intent.putExtra("name5", n5);
            killer2Intent.putExtra("name6", n6);
            killer2Intent.putExtra("number1", number1.getText().toString().trim());
            killer2Intent.putExtra("number2", number2.getText().toString().trim());
            killer2Intent.putExtra("number3", number3.getText().toString().trim());
            killer2Intent.putExtra("number4", number4.getText().toString().trim());
            killer2Intent.putExtra("number5", number5.getText().toString().trim());
            killer2Intent.putExtra("number6", number6.getText().toString().trim());
        }
        startActivity(killer2Intent);
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
    public void settingNumbers(){
        if (players == 2){
            setting2Players();
        } else if (players == 3){
            setting3Players();
        } else if (players == 4){
            setting4Players();
        } else if (players == 5){
            setting5Players();
        } else if (players == 6){
            setting6Players();
        }
    }
    public void setting2Players(){
        if (number1.getText().toString().trim().equals("") || number2.getText().toString().trim().equals("")){
            Toast.makeText(this, "You must input all the numbers.", Toast.LENGTH_SHORT).show();
            ready = false;
        } else {
            trg1 = Integer.parseInt(number1.getText().toString().trim());
            trg2 = Integer.parseInt(number2.getText().toString().trim());
            ready = true;
            trg = new int[]{trg1, trg2};
        }
    }
    public void setting3Players(){
        if (number1.getText().toString().trim().equals("") || number2.getText().toString().trim().equals("") ||
                number3.getText().toString().trim().equals("")){
            Toast.makeText(this, "You must input all the numbers.", Toast.LENGTH_SHORT).show();
            ready = false;
        } else {
            trg1 = Integer.parseInt(number1.getText().toString().trim());
            trg2 = Integer.parseInt(number2.getText().toString().trim());
            trg3 = Integer.parseInt(number3.getText().toString().trim());
            ready = true;
            trg = new int[]{trg1, trg2, trg3};
        }
    }
    public void setting4Players(){
        if (number1.getText().toString().trim().equals("") || number2.getText().toString().trim().equals("") ||
                number3.getText().toString().trim().equals("") || number4.getText().toString().trim().equals("")){
            Toast.makeText(this, "You must input all the numbers.", Toast.LENGTH_SHORT).show();
            ready = false;
        } else {
            trg1 = Integer.parseInt(number1.getText().toString().trim());
            trg2 = Integer.parseInt(number2.getText().toString().trim());
            trg3 = Integer.parseInt(number3.getText().toString().trim());
            trg4 = Integer.parseInt(number4.getText().toString().trim());
            ready = true;
            trg = new int[]{trg1, trg2, trg3, trg4};
        }
    }
    public void setting5Players(){
        if (number1.getText().toString().trim().equals("") || number2.getText().toString().trim().equals("") ||
                number3.getText().toString().trim().equals("") || number4.getText().toString().trim().equals("") ||
                number5.getText().toString().trim().equals("")){
            Toast.makeText(this, "You must input all the numbers.", Toast.LENGTH_SHORT).show();
            ready = false;
        } else {
            trg1 = Integer.parseInt(number1.getText().toString().trim());
            trg2 = Integer.parseInt(number2.getText().toString().trim());
            trg3 = Integer.parseInt(number3.getText().toString().trim());
            trg4 = Integer.parseInt(number4.getText().toString().trim());
            trg5 = Integer.parseInt(number5.getText().toString().trim());
            ready = true;
            trg = new int[]{trg1, trg2, trg3, trg4, trg5};
        }
    }
    public void setting6Players(){
        if (number1.getText().toString().trim().equals("") || number2.getText().toString().trim().equals("") ||
                number3.getText().toString().trim().equals("") || number4.getText().toString().trim().equals("") ||
                number5.getText().toString().trim().equals("") || number6.getText().toString().trim().equals("")){
            Toast.makeText(this, "You must input all the numbers.", Toast.LENGTH_SHORT).show();
            ready = false;
        } else {
            trg1 = Integer.parseInt(number1.getText().toString().trim());
            trg2 = Integer.parseInt(number2.getText().toString().trim());
            trg3 = Integer.parseInt(number3.getText().toString().trim());
            trg4 = Integer.parseInt(number4.getText().toString().trim());
            trg5 = Integer.parseInt(number5.getText().toString().trim());
            trg6 = Integer.parseInt(number6.getText().toString().trim());
            ready = true;
            trg = new int[]{trg1, trg2, trg3, trg4, trg5, trg6};
        }
    }
    public void setPlayers(){
        if (players == 2){
            playerThree.setVisibility(View.GONE);
            playerFour.setVisibility(View.GONE);
            playerFive.setVisibility(View.GONE);
            playerSix.setVisibility(View.GONE);
            thirdPlayer.setVisibility(View.GONE);
            fourthPlayer.setVisibility(View.GONE);
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
        } else if (players == 3){
            playerFour.setVisibility(View.GONE);
            playerFive.setVisibility(View.GONE);
            playerSix.setVisibility(View.GONE);
            fourthPlayer.setVisibility(View.GONE);
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
        } else if (players == 4){
            playerFive.setVisibility(View.GONE);
            playerSix.setVisibility(View.GONE);
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
        } else if (players == 5){
            playerSix.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
        }
    }
    public void setReturnToPickingTheGames(View view){ //method to return to previous activity
        finish();
    }
    public void openKiller1ParametersDescription(View view){
        Intent killerDesIntent = new Intent(this, Killer1Description.class);
        startActivity(killerDesIntent);
    }
}