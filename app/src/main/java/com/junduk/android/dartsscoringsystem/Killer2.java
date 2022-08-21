package com.junduk.android.dartsscoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Killer2 extends AppCompatActivity {
    Bundle extras;
    int players, hits, counter, player, lastPlayer, deathCount;
    LinearLayout firstPlayer, secondPlayer, thirdPlayer, forthPlayer, fifthPlayer, sixthPlayer;
    TextView firstKiller, secondKiller, thirdKiller, forthKiller, fifthKiller, sixthKiller, firstNumber, secondNumber, thirdNumber, forthNumber, fifthNumber, sixthNumber;
    TextView first, second, third, forth, fifth, sixth, firstLives, secondLives, thirdLives, forthLives, fifthLives, sixthLives;
    String name1, name2, name3, name4, name5, name6, number1, number2, number3, number4, number5, number6, dead, klr;
    Button firstButton, secondButton, thirdButton, forthButton, fifthButton, sixthButton, missButton;
    ImageView dart1, dart2, dart3;
    Boolean killer1, killer2, killer3, killer4, killer5, killer6, dead1, dead2, dead3, dead4, dead5, dead6, winner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_killer2);
        //players
        firstPlayer = findViewById(R.id.firstPlayer);
        secondPlayer = findViewById(R.id.secondPlayer);
        thirdPlayer = findViewById(R.id.thirdPlayer);
        forthPlayer = findViewById(R.id.forthPlayer);
        fifthPlayer = findViewById(R.id.fifthPlayer);
        sixthPlayer = findViewById(R.id.sixthPlayer);
        //killers
        firstKiller = findViewById(R.id.firstKiller);
        secondKiller = findViewById(R.id.secondKiller);
        thirdKiller = findViewById(R.id.thirdKiller);
        forthKiller = findViewById(R.id.forthKiller);
        fifthKiller = findViewById(R.id.fifthKiller);
        sixthKiller = findViewById(R.id.sixthKiller);
        //numbers
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        thirdNumber = findViewById(R.id.thirdNumber);
        forthNumber = findViewById(R.id.forthNumber);
        fifthNumber = findViewById(R.id.fifthNumber);
        sixthNumber = findViewById(R.id.sixthNumber);
        //buttons
        firstButton = findViewById(R.id.firstButton);
        secondButton = findViewById(R.id.secondButton);
        thirdButton = findViewById(R.id.thirdButton);
        forthButton = findViewById(R.id.forthButton);
        fifthButton = findViewById(R.id.fifthButton);
        sixthButton = findViewById(R.id.sixthButton);
        missButton = findViewById(R.id.missButton);
        //players
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        forth = findViewById(R.id.forth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        //darts
        dart1 = findViewById(R.id.dart1);
        dart2 = findViewById(R.id.dart2);
        dart3 = findViewById(R.id.dart3);
        //lives
        firstLives = findViewById(R.id.firstLives);
        secondLives = findViewById(R.id.secondLives);
        thirdLives = findViewById(R.id.thirdLives);
        forthLives = findViewById(R.id.forthLives);
        fifthLives = findViewById(R.id.fifthLives);
        sixthLives = findViewById(R.id.sixthLives);

        klr = "KILLER";
        dead = "DEAD";
        killer1 = false;
        killer2 = false;
        killer3 = false;
        killer4 = false;
        killer5 = false;
        killer6 = false;
        dead1 = false;
        dead2 = false;
        dead3 = false;
        dead4 = false;
        dead5 = false;
        dead6 = false;
        winner = false;
        counter = 3;
        player = 1;
        lastPlayer = 1;
        deathCount = 0;
        extras = getIntent().getExtras();
        if (extras != null) {
            players = extras.getInt("players");
        }
        if (extras != null) {
            hits = extras.getInt("hits");
        }
        setPlayers();
        first.setBackgroundColor(Color.parseColor("#89cff0"));
        secondButton.setEnabled(false);
        thirdButton.setEnabled(false);
        forthButton.setEnabled(false);
        fifthButton.setEnabled(false);
        sixthButton.setEnabled(false);
    }
    public void checkTheWinner(){ //method that checks the winner after every death
        if (deathCount == (players - 1)){
            winner = true;
        }
    }
    public void declareTheWinner(){ //method that declares the winner after it was confirmed that there is one
        firstButton.setEnabled(false);
        secondButton.setEnabled(false);
        thirdButton.setEnabled(false);
        forthButton.setEnabled(false);
        fifthButton.setEnabled(false);
        sixthButton.setEnabled(false);
        String rtrn = "RETURN";
        missButton.setText(rtrn);
        String win = "WINNER";
        if (!dead1){
            firstLives.setText(win);
        } else if (!dead2){
            secondLives.setText(win);
        } else if (!dead3){
            thirdLives.setText(win);
        } else if (!dead4){
            forthLives.setText(win);
        } else if (!dead5){
            fifthLives.setText(win);
        } else if (!dead6){
            sixthLives.setText(win);
        }
    }
    public void button1(View view){
        if (player == 1 && !killer1){
            killerActivation();
            dart();
        } else if (player == 1){
            selfLifeReduction();
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        } else {
            if (firstLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                firstLives.setText("o\t\t\to");
            } else if (firstLives.getText().toString().trim().equals("o\t\t\to")){
                firstLives.setText("o");
            } else if (firstLives.getText().toString().trim().equals("o")){
                dead1 = true;
                firstLives.setText("---");
                firstButton.setEnabled(false);
                firstKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                firstKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        }
    }
    public void button2(View view){
        if (player == 2 && !killer2){
            killerActivation();
            dart();
        } else if (player == 2){
            selfLifeReduction();
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        } else {
            if (secondLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                secondLives.setText("o\t\t\to");
            } else if (secondLives.getText().toString().trim().equals("o\t\t\to")){
                secondLives.setText("o");
            } else if (secondLives.getText().toString().trim().equals("o")){
                dead2 = true;
                secondLives.setText("---");
                secondButton.setEnabled(false);
                secondKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                secondKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        }
    }
    public void button3(View view){
        if (player == 3 && !killer3){
            killerActivation();
            dart();
        } else if (player == 3){
            selfLifeReduction();
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        } else {
            if (thirdLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                thirdLives.setText("o\t\t\to");
            } else if (thirdLives.getText().toString().trim().equals("o\t\t\to")){
                thirdLives.setText("o");
            } else if (thirdLives.getText().toString().trim().equals("o")){
                dead3 = true;
                thirdLives.setText("---");
                thirdButton.setEnabled(false);
                thirdKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                thirdKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        }
    }
    public void button4(View view){
        if (player == 4 && !killer4){
            killerActivation();
            dart();
        } else if (player == 4){
            selfLifeReduction();
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        } else {
            if (forthLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                forthLives.setText("o\t\t\to");
            } else if (forthLives.getText().toString().trim().equals("o\t\t\to")){
                forthLives.setText("o");
            } else if (forthLives.getText().toString().trim().equals("o")){
                dead4 = true;
                forthLives.setText("---");
                forthButton.setEnabled(false);
                forthKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                forthKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        }
    }
    public void button5(View view){
        if (player == 5 && !killer5){
            killerActivation();
            dart();
        } else if (player == 5){
            selfLifeReduction();
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        } else {
            if (fifthLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                fifthLives.setText("o\t\t\to");
            } else if (fifthLives.getText().toString().trim().equals("o\t\t\to")){
                fifthLives.setText("o");
            } else if (fifthLives.getText().toString().trim().equals("o")){
                dead5 = true;
                fifthLives.setText("---");
                fifthButton.setEnabled(false);
                fifthKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                fifthKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        }
    }
    public void button6(View view){
        if (player == 6 && !killer6){
            killerActivation();
            dart();
        } else if (player == 6){
            selfLifeReduction();
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        } else {
            if (sixthLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                sixthLives.setText("o\t\t\to");
            } else if (sixthLives.getText().toString().trim().equals("o\t\t\to")){
                sixthLives.setText("o");
            } else if (sixthLives.getText().toString().trim().equals("o")){
                dead6 = true;
                sixthLives.setText("---");
                sixthButton.setEnabled(false);
                sixthKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                sixthKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
            if (winner){
                declareTheWinner();
            } else {
                dart();
            }
        }
    }
    public void selfLifeReduction(){
        if (player == 1){
            if (firstLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                firstLives.setText("o\t\t\to");
            } else if (firstLives.getText().toString().trim().equals("o\t\t\to")){
                firstLives.setText("o");
            } else if (firstLives.getText().toString().trim().equals("o")){
                dead1 = true;
                counter = 1;
                firstLives.setText("---");
                firstKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                firstKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
        } else if (player == 2){
            if (secondLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                secondLives.setText("o\t\t\to");
            } else if (secondLives.getText().toString().trim().equals("o\t\t\to")){
                secondLives.setText("o");
            } else if (secondLives.getText().toString().trim().equals("o")){
                dead2 = true;
                counter = 1;
                secondLives.setText("---");
                secondKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                secondKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
        } else if (player == 3){
            if (thirdLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                thirdLives.setText("o\t\t\to");
            } else if (thirdLives.getText().toString().trim().equals("o\t\t\to")){
                thirdLives.setText("o");
            } else if (thirdLives.getText().toString().trim().equals("o")){
                dead3 = true;
                counter = 1;
                thirdLives.setText("---");
                thirdKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                thirdKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
        } else if (player == 4){
            if (forthLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                forthLives.setText("o\t\t\to");
            } else if (forthLives.getText().toString().trim().equals("o\t\t\to")){
                forthLives.setText("o");
            } else if (forthLives.getText().toString().trim().equals("o")){
                dead4 = true;
                counter = 1;
                forthLives.setText("---");
                forthKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                forthKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
        } else if (player == 5){
            if (fifthLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                fifthLives.setText("o\t\t\to");
            } else if (fifthLives.getText().toString().trim().equals("o\t\t\to")){
                fifthLives.setText("o");
            } else if (fifthLives.getText().toString().trim().equals("o")){
                dead5 = true;
                counter = 1;
                fifthLives.setText("---");
                fifthKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                fifthKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
        } else if (player == 6){
            if (sixthLives.getText().toString().trim().equals("o\t\t\to\t\t\to")){
                sixthLives.setText("o\t\t\to");
            } else if (sixthLives.getText().toString().trim().equals("o\t\t\to")){
                sixthLives.setText("o");
            } else if (sixthLives.getText().toString().trim().equals("o")){
                dead6 = true;
                counter = 1;
                sixthLives.setText("---");
                sixthKiller.setBackgroundColor(Color.parseColor("#AAAAAA"));
                sixthKiller.setText(dead);
                deathCount++;
                checkTheWinner();
            }
        }
    }
    public void killerActivation(){
        if (player == 1){
            if (firstKiller.getText().toString().trim().equals("X\t\tX\t\tX")){
                firstKiller.setText("X\t\tX");
            } else if (firstKiller.getText().toString().trim().equals("X\t\tX")){
                firstKiller.setText("X");
            } else if (firstKiller.getText().toString().trim().equals("X")){
                killer1 = true;
                firstKiller.setText(klr);
                firstKiller.setBackgroundColor(Color.parseColor("#660000"));
                activateAllAlivePlayer();
            }
        } else if (player == 2){
            if (secondKiller.getText().toString().trim().equals("X\t\tX\t\tX")){
                secondKiller.setText("X\t\tX");
            } else if (secondKiller.getText().toString().trim().equals("X\t\tX")){
                secondKiller.setText("X");
            } else if (secondKiller.getText().toString().trim().equals("X")){
                killer2 = true;
                secondKiller.setText(klr);
                secondKiller.setBackgroundColor(Color.parseColor("#660000"));
                activateAllAlivePlayer();
            }
        } else if (player == 3){
            if (thirdKiller.getText().toString().trim().equals("X\t\tX\t\tX")){
                thirdKiller.setText("X\t\tX");
            } else if (thirdKiller.getText().toString().trim().equals("X\t\tX")){
                thirdKiller.setText("X");
            } else if (thirdKiller.getText().toString().trim().equals("X")){
                killer3 = true;
                thirdKiller.setText(klr);
                thirdKiller.setBackgroundColor(Color.parseColor("#660000"));
                activateAllAlivePlayer();
            }
        } else if (player == 4){
            if (forthKiller.getText().toString().trim().equals("X\t\tX\t\tX")){
                forthKiller.setText("X\t\tX");
            } else if (forthKiller.getText().toString().trim().equals("X\t\tX")){
                forthKiller.setText("X");
            } else if (forthKiller.getText().toString().trim().equals("X")){
                killer4 = true;
                forthKiller.setText(klr);
                forthKiller.setBackgroundColor(Color.parseColor("#660000"));
                activateAllAlivePlayer();
            }
        } else if (player == 5){
            if (fifthKiller.getText().toString().trim().equals("X\t\tX\t\tX")){
                fifthKiller.setText("X\t\tX");
            } else if (fifthKiller.getText().toString().trim().equals("X\t\tX")){
                fifthKiller.setText("X");
            } else if (fifthKiller.getText().toString().trim().equals("X")){
                killer5 = true;
                fifthKiller.setText(klr);
                fifthKiller.setBackgroundColor(Color.parseColor("#660000"));
                activateAllAlivePlayer();
            }
        } else if (player == 6){
            if (sixthKiller.getText().toString().trim().equals("X\t\tX\t\tX")){
                sixthKiller.setText("X\t\tX");
            } else if (sixthKiller.getText().toString().trim().equals("X\t\tX")){
                sixthKiller.setText("X");
            } else if (sixthKiller.getText().toString().trim().equals("X")){
                killer6 = true;
                sixthKiller.setText(klr);
                sixthKiller.setBackgroundColor(Color.parseColor("#660000"));
                activateAllAlivePlayer();
            }
        }
    }
    public void dart() { //method that changes the number of darts
        counter--;
        if (counter == 2) {
            dart3.setVisibility(View.INVISIBLE);
        } else if (counter == 1) {
            dart3.setVisibility(View.INVISIBLE);
            dart2.setVisibility(View.INVISIBLE);
        } else if (counter == 0) {
            counter = 3;
            changingPlayers();
            dart3.setVisibility(View.VISIBLE);
            dart2.setVisibility(View.VISIBLE);
        }
    }
    /*public void checkMidDarts(){ //method that checks if someone was killed mid darts and changes them
        if (!dead1){
            if ()
        }

    }*/
    public void missButton(View view){
        if (!winner){
            dart();
        } else {
            returnToPickingTheParameters();
        }
    }
    public void returnToPickingTheParameters(){
        finish();
    }
    public void changingTheButtons(){
        ifSomeoneKilledThemselves();
        if (player == 1){
            if (killer1){
                activateAllAlivePlayer();
            } else {
                firstButton.setEnabled(true);
                secondButton.setEnabled(false);
                thirdButton.setEnabled(false);
                forthButton.setEnabled(false);
                fifthButton.setEnabled(false);
                sixthButton.setEnabled(false);
            }
        } else if (player == 2){
            if (killer2){
                activateAllAlivePlayer();
            } else {
                secondButton.setEnabled(true);
                firstButton.setEnabled(false);
                thirdButton.setEnabled(false);
                forthButton.setEnabled(false);
                fifthButton.setEnabled(false);
                sixthButton.setEnabled(false);
            }
        } else if (player == 3){
            if (killer3){
                activateAllAlivePlayer();
            } else {
                thirdButton.setEnabled(true);
                firstButton.setEnabled(false);
                secondButton.setEnabled(false);
                forthButton.setEnabled(false);
                fifthButton.setEnabled(false);
                sixthButton.setEnabled(false);
            }
        } else if (player == 4){
            if (killer4){
                activateAllAlivePlayer();
            } else {
                forthButton.setEnabled(true);
                firstButton.setEnabled(false);
                secondButton.setEnabled(false);
                thirdButton.setEnabled(false);
                fifthButton.setEnabled(false);
                sixthButton.setEnabled(false);
            }
        } else if (player == 5){
            if (killer5){
                activateAllAlivePlayer();
            } else {
                fifthButton.setEnabled(true);
                firstButton.setEnabled(false);
                secondButton.setEnabled(false);
                thirdButton.setEnabled(false);
                forthButton.setEnabled(false);
                sixthButton.setEnabled(false);
            }
        } else if (player == 6){
            if (killer6){
                activateAllAlivePlayer();
            } else {
                sixthButton.setEnabled(true);
                firstButton.setEnabled(false);
                secondButton.setEnabled(false);
                thirdButton.setEnabled(false);
                forthButton.setEnabled(false);
                fifthButton.setEnabled(false);
            }
        }
    }
    public void ifSomeoneKilledThemselves(){ //if one player killed themselves then his button must be shut down
        if (lastPlayer == 1 && dead1){
            firstButton.setEnabled(false);
        } else if (lastPlayer == 2 && dead2){
            secondButton.setEnabled(false);
        } else if (lastPlayer == 3 && dead3){
            thirdButton.setEnabled(false);
        } else if (lastPlayer == 4 && dead4){
            forthButton.setEnabled(false);
        } else if (lastPlayer == 5 && dead5){
            fifthButton.setEnabled(false);
        } else if (lastPlayer == 6 && dead6){
            sixthButton.setEnabled(false);
        }
    }
    public void activateAllAlivePlayer(){
        if (!dead1){
            firstButton.setEnabled(true);
        } else {
            firstButton.setEnabled(false);
        }
        if (!dead2){
            secondButton.setEnabled(true);
        } else {
            secondButton.setEnabled(false);
        }
        if (!dead3){
            thirdButton.setEnabled(true);
        } else {
            thirdButton.setEnabled(false);
        }
        if (!dead4){
            forthButton.setEnabled(true);
        } else {
            forthButton.setEnabled(false);
        }
        if (!dead5){
            fifthButton.setEnabled(true);
        } else {
            fifthButton.setEnabled(false);
        }
        if (!dead6){
            sixthButton.setEnabled(true);
        } else {
            sixthButton.setEnabled(false);
        }
    }
    public void changingPlayers(){ //method for changing players after throwing all the darts
        lastPlayer = player;
        checkActivePlayers();
        changingTheButtons();
    }
    public void checkActivePlayers(){
        if (player == 1) {
            if (!dead2) {
                player = 2;
                changingColors();
            } else if (!dead3){
                player = 3;
                changingColors();
            } else if (!dead4){
                player = 4;
                changingColors();
            } else if (!dead5){
                player = 5;
                changingColors();
            } else if (!dead6){
                player = 6;
                changingColors();
            }
        } else if (player == 2){
            if (!dead3 && players != 2){
                player = 3;
                changingColors();
            } else if (!dead4 && players != 3){
                player = 4;
                changingColors();
            } else if (!dead5 && players != 4){
                player = 5;
                changingColors();
            } else if (!dead6 && players != 5){
                player = 6;
                changingColors();
            } else {
                if (!dead1){
                    player = 1;
                    changingColors();
                } else {
                    player = 1;
                    checkActivePlayers();
                }
            }
        } else if (player == 3){
            if (!dead4 && players != 3){
                player = 4;
                changingColors();
            } else if (!dead5 && players != 4){
                player = 5;
                changingColors();
            } else if (!dead6 && players != 5){
                player = 6;
                changingColors();
            } else {
                if (!dead1){
                    player = 1;
                    changingColors();
                } else {
                    player = 1;
                    checkActivePlayers();
                }
            }
        } else if (player == 4){
            if (!dead5 && players != 4){
                player = 5;
                changingColors();
            } else if (!dead6 && players != 5){
                player = 6;
                changingColors();
            } else {
                if (!dead1){
                    player = 1;
                    changingColors();
                } else {
                    player = 1;
                    checkActivePlayers();
                }
            }
        } else if (player == 5){
            if (!dead6 && players != 5){
                player = 6;
                changingColors();
            } else {
                if (!dead1){
                    player = 1;
                    changingColors();
                } else {
                    player = 1;
                    checkActivePlayers();
                }
            }
        } else {
            if (!dead1){
                player = 1;
                changingColors();
            } else {
                player = 1;
                checkActivePlayers();
            }
        }
    }
    public void changingColors(){ //method for changing color to the player that is playing and changing color of the last player that has played
        if (lastPlayer == 1){
            first.setBackgroundColor(Color.TRANSPARENT);
        } else if (lastPlayer == 2){
            second.setBackgroundColor(Color.TRANSPARENT);
        } else if (lastPlayer == 3){
            third.setBackgroundColor(Color.TRANSPARENT);
        } else if (lastPlayer == 4){
            forth.setBackgroundColor(Color.TRANSPARENT);
        } else if (lastPlayer == 5){
            fifth.setBackgroundColor(Color.TRANSPARENT);
        } else if (lastPlayer == 6){
            sixth.setBackgroundColor(Color.TRANSPARENT);
        }
        if (player == 1){
            first.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (player == 2){
            second.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (player == 3){
            third.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (player == 4){
            forth.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (player == 5){
            fifth.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (player == 6){
            sixth.setBackgroundColor(Color.parseColor("#89cff0"));
        }
    }
    public void setPlayers(){
        if (players == 2){
            thirdPlayer.setVisibility(View.GONE);
            forthPlayer.setVisibility(View.GONE);
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
            name1 = extras.getString("name1");
            name2 = extras.getString("name2");
            number1 = extras.getString("number1");
            number2 = extras.getString("number2");
            first.setText(name1);
            second.setText(name2);
            firstNumber.setText(number1);
            secondNumber.setText(number2);
            firstButton.setText(number1);
            secondButton.setText(number2);
            dead3 = true;
            dead4 = true;
            dead5 = true;
            dead6 = true;
        } else if (players == 3){
            forthPlayer.setVisibility(View.GONE);
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
            name1 = extras.getString("name1");
            name2 = extras.getString("name2");
            name3 = extras.getString("name3");
            number1 = extras.getString("number1");
            number2 = extras.getString("number2");
            number3 = extras.getString("number3");
            first.setText(name1);
            second.setText(name2);
            third.setText(name3);
            firstNumber.setText(number1);
            secondNumber.setText(number2);
            thirdNumber.setText(number3);
            firstButton.setText(number1);
            secondButton.setText(number2);
            thirdButton.setText(number3);
            dead4 = true;
            dead5 = true;
            dead6 = true;
        } else if (players == 4){
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
            name1 = extras.getString("name1");
            name2 = extras.getString("name2");
            name3 = extras.getString("name3");
            name4 = extras.getString("name4");
            number1 = extras.getString("number1");
            number2 = extras.getString("number2");
            number3 = extras.getString("number3");
            number4 = extras.getString("number4");
            first.setText(name1);
            second.setText(name2);
            third.setText(name3);
            forth.setText(name4);
            firstNumber.setText(number1);
            secondNumber.setText(number2);
            thirdNumber.setText(number3);
            forthNumber.setText(number4);
            firstButton.setText(number1);
            secondButton.setText(number2);
            thirdButton.setText(number3);
            forthButton.setText(number4);
            dead5 = true;
            dead6 = true;
        } else if (players == 5){
            sixthPlayer.setVisibility(View.GONE);
            name1 = extras.getString("name1");
            name2 = extras.getString("name2");
            name3 = extras.getString("name3");
            name4 = extras.getString("name4");
            name5 = extras.getString("name5");
            number1 = extras.getString("number1");
            number2 = extras.getString("number2");
            number3 = extras.getString("number3");
            number4 = extras.getString("number4");
            number5 = extras.getString("number5");
            first.setText(name1);
            second.setText(name2);
            third.setText(name3);
            forth.setText(name4);
            fifth.setText(name5);
            firstNumber.setText(number1);
            secondNumber.setText(number2);
            thirdNumber.setText(number3);
            forthNumber.setText(number4);
            fifthNumber.setText(number5);
            firstButton.setText(number1);
            secondButton.setText(number2);
            thirdButton.setText(number3);
            forthButton.setText(number4);
            fifthButton.setText(number5);
            dead6 = true;
        } else if (players == 6){
            name1 = extras.getString("name1");
            name2 = extras.getString("name2");
            name3 = extras.getString("name3");
            name4 = extras.getString("name4");
            name5 = extras.getString("name5");
            name6 = extras.getString("name6");
            number1 = extras.getString("number1");
            number2 = extras.getString("number2");
            number3 = extras.getString("number3");
            number4 = extras.getString("number4");
            number5 = extras.getString("number5");
            number6 = extras.getString("number6");
            first.setText(name1);
            second.setText(name2);
            third.setText(name3);
            forth.setText(name4);
            fifth.setText(name5);
            sixth.setText(name6);
            firstNumber.setText(number1);
            secondNumber.setText(number2);
            thirdNumber.setText(number3);
            forthNumber.setText(number4);
            fifthNumber.setText(number5);
            sixthNumber.setText(number6);
            firstButton.setText(number1);
            secondButton.setText(number2);
            thirdButton.setText(number3);
            forthButton.setText(number4);
            fifthButton.setText(number5);
            sixthButton.setText(number6);
        }
        if (hits == 2){
            firstKiller.setText("X\t\tX");
            secondKiller.setText("X\t\tX");
            thirdKiller.setText("X\t\tX");
            forthKiller.setText("X\t\tX");
            fifthKiller.setText("X\t\tX");
            sixthKiller.setText("X\t\tX");
        } else if (hits == 3){
            firstKiller.setText("X\t\tX\t\tX");
            secondKiller.setText("X\t\tX\t\tX");
            thirdKiller.setText("X\t\tX\t\tX");
            forthKiller.setText("X\t\tX\t\tX");
            fifthKiller.setText("X\t\tX\t\tX");
            sixthKiller.setText("X\t\tX\t\tX");
        }
    }
}