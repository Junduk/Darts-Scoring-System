package com.junduk.android.dartsscoringsystem;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RegularGame1 extends AppCompatActivity {
    String firstInd, secondInd, thirdInd;
    LinearLayout thirdPlayer, forthPlayer, fifthPlayer, sixthPlayer, indicatorRow;
    Bundle extras;
    Button timesTwo, timesThree, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b25, b50;
    Button returnToPicPar;
    ImageView dart1, dart2, dart3;
    TextView playerOne, playerTwo, playerThree, playerFour, playerFive, playerSix, first, second, third, forth, fifth, sixth, winner;
    TextView indicator1, indicator2, indicator3;
    int indicator, remain;
    int counter, player, num1, num2, num3, num4, num5, num6, numOfPlayers, startingScore, p, multiplier, minimalDarts, lastPlayerInTheTieBreak;
    int scoreOne, scoreTwo, scoreThree, scoreFour, scoreFive, scoreSix, endDarts1, endDarts2, endDarts3, endDarts4, endDarts5, endDarts6;
    int[] tieBreak, tieBreakPlayers;
    boolean two, three, equal, indicatorBool, activateEndPhase, activateTieBreak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_game1);
        firstInd = "";
        secondInd = "";
        thirdInd = "";
        lastPlayerInTheTieBreak = 0;
        p = 1;
        multiplier = 1;
        activateEndPhase = false;
        activateTieBreak = false;
        tieBreak = new int[6];
        tieBreakPlayers = new int[6];
        endDarts1 = 4;
        endDarts2 = 4;
        endDarts3 = 4;
        endDarts4 = 4;
        endDarts5 = 4;
        endDarts6 = 4;
        num1 = 0;
        num2 = 0;
        num3 = 0;
        num4 = 0;
        num5 = 0;
        num6 = 0;
        player = 1; //redni broj igraca
        counter = 3; //broj strelica
        two = false; //boolean za 2x
        three = false; //boolean za 3x
        indicatorRow = findViewById(R.id.indicatorRow);
        indicator1 = findViewById(R.id.Indicator1);
        indicator2 = findViewById(R.id.Indicator2);
        indicator3 = findViewById(R.id.Indicator3);
        thirdPlayer = findViewById(R.id.thirdPlayer);
        forthPlayer = findViewById(R.id.forthPlayer);
        fifthPlayer = findViewById(R.id.fifthPlayer);
        sixthPlayer = findViewById(R.id.sixthPlayer);
        returnToPicPar = findViewById(R.id.returnToPickingParameters);
        returnToPicPar.setBackgroundResource(android.R.drawable.btn_default);
        playerOne = findViewById(R.id.playerOne);
        playerTwo = findViewById(R.id.playerTwo);
        playerThree = findViewById(R.id.playerThree);
        playerFour = findViewById(R.id.playerFour);
        playerFive = findViewById(R.id.playerFive);
        playerSix = findViewById(R.id.playerSix);
        dart1 = findViewById(R.id.dart1);
        dart2 = findViewById(R.id.dart2);
        dart3 = findViewById(R.id.dart3);
        first = findViewById(R.id.first);
        first.setBackgroundColor(Color.parseColor("#89cff0"));
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        forth = findViewById(R.id.forth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        timesTwo = findViewById(R.id.timesTwo);
        timesTwo.setBackgroundResource(android.R.drawable.btn_default);
        timesThree = findViewById(R.id.timesThree);
        timesThree.setBackgroundResource(android.R.drawable.btn_default);
        winner = findViewById(R.id.winner);
        b0 = findViewById(R.id.b0);
        b0.setBackgroundResource(android.R.drawable.btn_default);
        b1 = findViewById(R.id.b1);
        b1.setBackgroundResource(android.R.drawable.btn_default);
        b2 = findViewById(R.id.b2);
        b2.setBackgroundResource(android.R.drawable.btn_default);
        b3 = findViewById(R.id.b3);
        b3.setBackgroundResource(android.R.drawable.btn_default);
        b4 = findViewById(R.id.b4);
        b4.setBackgroundResource(android.R.drawable.btn_default);
        b5 = findViewById(R.id.b5);
        b5.setBackgroundResource(android.R.drawable.btn_default);
        b6 = findViewById(R.id.b6);
        b6.setBackgroundResource(android.R.drawable.btn_default);
        b7 = findViewById(R.id.b7);
        b7.setBackgroundResource(android.R.drawable.btn_default);
        b8 = findViewById(R.id.b8);
        b8.setBackgroundResource(android.R.drawable.btn_default);
        b9 = findViewById(R.id.b9);
        b9.setBackgroundResource(android.R.drawable.btn_default);
        b10 = findViewById(R.id.b10);
        b10.setBackgroundResource(android.R.drawable.btn_default);
        b11 = findViewById(R.id.b11);
        b11.setBackgroundResource(android.R.drawable.btn_default);
        b12 = findViewById(R.id.b12);
        b12.setBackgroundResource(android.R.drawable.btn_default);
        b13 = findViewById(R.id.b13);
        b13.setBackgroundResource(android.R.drawable.btn_default);
        b14 = findViewById(R.id.b14);
        b14.setBackgroundResource(android.R.drawable.btn_default);
        b15 = findViewById(R.id.b15);
        b15.setBackgroundResource(android.R.drawable.btn_default);
        b16 = findViewById(R.id.b16);
        b16.setBackgroundResource(android.R.drawable.btn_default);
        b17 = findViewById(R.id.b17);
        b17.setBackgroundResource(android.R.drawable.btn_default);
        b18 = findViewById(R.id.b18);
        b18.setBackgroundResource(android.R.drawable.btn_default);
        b19 = findViewById(R.id.b19);
        b19.setBackgroundResource(android.R.drawable.btn_default);
        b20 = findViewById(R.id.b20);
        b20.setBackgroundResource(android.R.drawable.btn_default);
        b25 = findViewById(R.id.b25);
        b25.setBackgroundResource(android.R.drawable.btn_default);
        b50 = findViewById(R.id.b50);
        b50.setBackgroundResource(android.R.drawable.btn_default);
        extras = getIntent().getExtras();
        if (extras != null) {
            numOfPlayers = extras.getInt("players");
        }
        if (extras != null) {
            startingScore = extras.getInt("score");
        }
        if (extras != null) {
            equal = extras.getBoolean("equal");
        }
        if (extras != null){
            indicatorBool = extras.getBoolean("indicator");
        }
        scoreOne = startingScore;
        scoreTwo = startingScore;
        scoreThree = startingScore;
        scoreFour = startingScore;
        scoreFive = startingScore;
        scoreSix = startingScore;
        indicator = scoreOne;
        remain = 0;
        setNumberOfPlayer();
        setTextStartingPoints();
        if (!indicatorBool){
            indicatorRow.setVisibility(View.GONE);
        }
        assigningTheIndicator();
    }
    public void returnToPickingParameters(View view) {
        finish();
    }
    public void dart() { //method that changes the number of darts
        counter--;
        if (counter == 2) {
            dart3.setVisibility(View.INVISIBLE);
        } else if (counter == 1) {
            dart3.setVisibility(View.INVISIBLE);
            dart2.setVisibility(View.INVISIBLE);
        } else if (counter == 0) {
            if (player == numOfPlayers && activateEndPhase){
                checkForPossibleTieBreak();
                dart3.setVisibility(View.INVISIBLE);
                dart2.setVisibility(View.INVISIBLE);
            } else {
                counter = 3;
                changingPlayers();
                dart3.setVisibility(View.VISIBLE);
                dart2.setVisibility(View.VISIBLE);
            }
        }
        timesTwo.setBackgroundResource(android.R.drawable.btn_default);
        timesThree.setBackgroundResource(android.R.drawable.btn_default);
        assigningTheIndicator();
    }
    public void assigningTheIndicator(){ //assigning the correct value to the indicator and then calling it
        if (indicatorBool) {
            if (player == 1) {
                indicator = scoreOne;
            } else if (player == 2) {
                indicator = scoreTwo;
            } else if (player == 3) {
                indicator = scoreThree;
            } else if (player == 4) {
                indicator = scoreFour;
            } else if (player == 5) {
                indicator = scoreFive;
            } else if (player == 6) {
                indicator = scoreSix;
            }
            callIndicator();
        }
    }
    public void changingPlayers(){ //method for changing players after throwing all the darts
        if (player == 1){
            player = 2;
            first.setBackgroundColor(Color.TRANSPARENT);
            second.setBackgroundColor(Color.parseColor("#89cff0"));
            num1 = scoreOne;
        } else if (player == 2){
            if (player == numOfPlayers){
                player = 1;
                first.setBackgroundColor(Color.parseColor("#89cff0"));
                second.setBackgroundColor(Color.TRANSPARENT);
            } else {
                player = 3;
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.parseColor("#89cff0"));
            }
            num2 = scoreTwo;
        } else if (player == 3){
            if (player == numOfPlayers){
                player = 1;
                first.setBackgroundColor(Color.parseColor("#89cff0"));
                third.setBackgroundColor(Color.TRANSPARENT);
            } else {
                player = 4;
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.parseColor("#89cff0"));
            }
            num3 = scoreThree;
        } else if (player == 4){
            if (player == numOfPlayers){
                player = 1;
                first.setBackgroundColor(Color.parseColor("#89cff0"));
                forth.setBackgroundColor(Color.TRANSPARENT);
            } else {
                player = 5;
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.parseColor("#89cff0"));
            }
            num4 = scoreFour;
        } else if (player == 5){
            if (player == numOfPlayers){
                player = 1;
                first.setBackgroundColor(Color.parseColor("#89cff0"));
                fifth.setBackgroundColor(Color.TRANSPARENT);
            } else {
                player = 6;
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.parseColor("#89cff0"));
            }
            num5 = scoreFive;
        } else if (player == 6){
            player = 1;
            sixth.setBackgroundColor(Color.TRANSPARENT);
            first.setBackgroundColor(Color.parseColor("#89cff0"));
            num6 = scoreSix;
        }
    }
    public void displayPlayerOne() { //method that prints out the first player's score and calls darts() to activate
        playerOne.setText(String.valueOf(scoreOne));
        dart();
    }
    public void displayPlayerTwo() {
        playerTwo.setText(String.valueOf(scoreTwo));
        dart();
    }
    public void displayPlayerThree() {
        playerThree.setText(String.valueOf(scoreThree));
        dart();
    }
    public void displayPlayerFour() {
        playerFour.setText(String.valueOf(scoreFour));
        dart();
    }
    public void displayPlayerFive() {
        playerFive.setText(String.valueOf(scoreFive));
        dart();
    }
    public void displayPlayerSix() {
        playerSix.setText(String.valueOf(scoreSix));
        dart();
    }
    public void setNumberOfPlayer() { //method that sets how many players are playing
        if (numOfPlayers == 2) {
            thirdPlayer.setVisibility(View.GONE);
            forthPlayer.setVisibility(View.GONE);
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
        } else if (numOfPlayers == 3) {
            forthPlayer.setVisibility(View.GONE);
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
        } else if (numOfPlayers == 4) {
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
        } else if (numOfPlayers == 5) {
            sixthPlayer.setVisibility(View.GONE);
        }
    }
    public void setTextStartingPoints() { //method that sets starting scores
        playerOne.setText(String.valueOf(startingScore));
        playerTwo.setText(String.valueOf(startingScore));
        playerThree.setText(String.valueOf(startingScore));
        playerFour.setText(String.valueOf(startingScore));
        playerFive.setText(String.valueOf(startingScore));
        playerSix.setText(String.valueOf(startingScore));
    }
    public void timesT(View view) { //method that activates times two
        two = true;
        three = false;
        timesTwo.setBackgroundColor(Color.GRAY);
        timesThree.setBackgroundResource(android.R.drawable.btn_default);
        multiplier = 2;
    }
    public void timesTh(View view) { //method that activates times three
        three = true;
        two = false;
        timesThree.setBackgroundColor(Color.GRAY);
        timesTwo.setBackgroundResource(android.R.drawable.btn_default);
        multiplier = 3;
    }
    public void bull(int number) { //method that stops the bull from multiplying with 2 or 3
        if (number == 25 || number == 50) {
            two = false;
            three = false;
            multiplier = 1;
        }
    }
    public void subtract(int number) { //method that subtracts numbers from scores
        bull(number);
        if (player == 1) {
            if (two || three) {
                scoreOne -= number * multiplier;
                two = false;
                three = false;
                multiplier = 1;
                if (scoreOne < 0) {
                    scoreOne = num1;
                    counter = 1;
                    displayPlayerOne();
                } else if (scoreOne == 0) {
                    counter = 1;
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerOne();
                } else {
                    displayPlayerOne();
                }
            } else {
                scoreOne -= number;
                if (scoreOne < 0) {
                    scoreOne = num1;
                    counter = 1;
                    displayPlayerOne();
                } else if (scoreOne == 0) {
                    counter = 1;
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerOne();
                } else {
                    displayPlayerOne();
                }
            }
        } else if (player == 2) {
            if (two || three) {
                scoreTwo -= number * multiplier;
                two = false;
                three = false;
                multiplier = 1;
                if (scoreTwo < 0) {
                    scoreTwo = num2;
                    counter = 1;
                    displayPlayerTwo();
                } else if (scoreTwo == 0) {
                    counter = 1;
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerTwo();
                } else {
                    displayPlayerTwo();
                }
            } else {
                scoreTwo -= number;
                if (scoreTwo < 0) {
                    scoreTwo = num2;
                    counter = 1;
                    displayPlayerTwo();
                } else if (scoreTwo == 0) {
                    counter = 1;
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerTwo();
                } else {
                    displayPlayerTwo();
                }
            }
        } else if (player == 3) {
            if (two || three) {
                scoreThree -= number * multiplier;
                two = false;
                three = false;
                multiplier = 1;
                if (scoreThree < 0) {
                    scoreThree = num3;
                    counter = 1;
                    displayPlayerThree();
                } else if (scoreThree == 0) {
                    counter = 1;
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerThree();
                } else {
                    displayPlayerThree();
                }
            } else {
                scoreThree -= number;
                if (scoreThree < 0) {
                    scoreThree = num3;
                    counter = 1;
                    displayPlayerThree();
                } else if (scoreThree == 0) {
                    counter = 1;
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerThree();
                } else {
                    displayPlayerThree();
                }
            }
        } else if (player == 4) {
            if (two || three) {
                scoreFour -= number * multiplier;
                two = false;
                three = false;
                multiplier = 1;
                if (scoreFour < 0) {
                    scoreFour = num4;
                    counter = 1;
                    displayPlayerFour();
                } else if (scoreFour == 0) {
                    counter = 1;
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerFour();
                } else {
                    displayPlayerFour();
                }
            } else {
                scoreFour -= number;
                if (scoreFour < 0) {
                    scoreFour = num4;
                    counter = 1;
                } else if (scoreFour == 0) {
                    counter = 1;
                    displayPlayerFour();
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerFour();
                } else {
                    displayPlayerFour();
                }
            }
        } else if (player == 5) {
            if (two || three) {
                scoreFive -= number * multiplier;
                two = false;
                three = false;
                multiplier = 1;
                if (scoreFive < 0) {
                    scoreFive = num5;
                    counter = 1;
                    displayPlayerFive();
                } else if (scoreFive == 0) {
                    counter = 1;
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerFive();
                } else {
                    displayPlayerFive();
                }
            } else {
                scoreFive -= number;
                if (scoreFive < 0) {
                    scoreFive = num5;
                    counter = 1;
                    displayPlayerFive();
                } else if (scoreFive == 0) {
                    counter = 1;
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerFive();
                } else {
                    displayPlayerFive();
                }
            }
        } else if (player == 6) {
            if (two || three) {
                scoreSix -= number * multiplier;
                two = false;
                three = false;
                multiplier = 1;
                if (scoreSix < 0) {
                    scoreSix = num6;
                    counter = 1;
                    displayPlayerSix();
                } else if (scoreSix == 0) {
                    counter = 1;
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerSix();
                } else {
                    displayPlayerSix();
                }
            } else {
                scoreSix -= number;
                if (scoreSix < 0) {
                    scoreSix = num6;
                    counter = 1;
                    displayPlayerSix();
                } else if (scoreSix == 0) {
                    counter = 1;
                    if (equal) {
                        collectEndDarts();
                        activateEndPhase = true;
                    } else {
                        winner();
                    }
                    displayPlayerSix();
                } else {
                    displayPlayerSix();
                }
            }
        }
    }
    public void disableAllButtons() { // methood that deactivates all buttons and disables the indicator
        b0.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);
        b11.setEnabled(false);
        b12.setEnabled(false);
        b13.setEnabled(false);
        b14.setEnabled(false);
        b15.setEnabled(false);
        b16.setEnabled(false);
        b17.setEnabled(false);
        b18.setEnabled(false);
        b19.setEnabled(false);
        b20.setEnabled(false);
        b25.setEnabled(false);
        b50.setEnabled(false);
        firstInd = "";
        secondInd = "";
        thirdInd = "";
        indicator1.setText(firstInd);
        indicator2.setText(secondInd);
        indicator3.setText(thirdInd);
    }
    public void winner() { //method that tells the winner, when equal is turned off
        if (scoreOne == 0) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer1);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (scoreTwo == 0) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer2);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (scoreThree == 0) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer3);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (scoreFour == 0) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer4);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (scoreFive == 0) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer5);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (scoreSix == 0) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer6);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        }
    }
    public void winner2(){ //method that tells the winner, when equal is turned on but tie break isn't achieved
        if (minimalDarts == endDarts1) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer1);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (minimalDarts == endDarts2) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer2);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (minimalDarts == endDarts3) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer3);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (minimalDarts == endDarts4) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer4);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (minimalDarts == endDarts5) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer5);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (minimalDarts == endDarts6) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer6);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        }
    }
    public void setAllBackgroundsToTransparent() {
        first.setBackgroundColor(Color.TRANSPARENT);
        second.setBackgroundColor(Color.TRANSPARENT);
        third.setBackgroundColor(Color.TRANSPARENT);
        forth.setBackgroundColor(Color.TRANSPARENT);
        fifth.setBackgroundColor(Color.TRANSPARENT);
        sixth.setBackgroundColor(Color.TRANSPARENT);
    }
    public void collectEndDarts() { //method that keeps track of how many darts it needs players to get to 0, when equal is turned on
        if (player == 1) {
            if (counter == 3){
                endDarts1 = 1;
            } else if (counter == 2){
                endDarts1 = 2;
            } else if (counter == 1){
                endDarts1 = 3;
            }
        } else if (player == 2) {
            if (counter == 3){
                endDarts2 = 1;
            } else if (counter == 2){
                endDarts2 = 2;
            } else if (counter == 1){
                endDarts2 = 3;
            }
        } else if (player == 3) {
            if (counter == 3){
                endDarts3 = 1;
            } else if (counter == 2){
                endDarts3 = 2;
            } else if (counter == 1){
                endDarts3 = 3;
            }
        } else if (player == 4) {
            if (counter == 3){
                endDarts4 = 1;
            } else if (counter == 2){
                endDarts4 = 2;
            } else if (counter == 1){
                endDarts4 = 3;
            }
        } else if (player == 5) {
            if (counter == 3){
                endDarts5 = 1;
            } else if (counter == 2){
                endDarts5 = 2;
            } else if (counter == 1){
                endDarts5 = 3;
            }
        } else if (player == 6) {
            if (counter == 3){
                endDarts6 = 1;
            } else if (counter == 2){
                endDarts6 = 2;
            } else if (counter == 1){
                endDarts6 = 3;
            }
        }
    }
    public void checkForPossibleTieBreak() { //method that checks if there's a chance for tie break
        int k = 1;
        int min = 0;
        int[] endDarts = {endDarts1, endDarts2, endDarts3, endDarts4, endDarts5, endDarts6};
        minimalDarts = endDarts1;
        for (int i = 0; i <= 5; i++) {
            for (int j = i + 1; j <= 5; j++) {
                if (minimalDarts > endDarts[j]) {
                    minimalDarts = endDarts[j];
                    min = j;
                }
            }
        }
        tieBreak[0] = minimalDarts;
        tieBreakPlayers[0] = min + 1;
        for (int i = min + 1; i <= 5; i++) {
            if (minimalDarts == endDarts[i]) {
                tieBreak[k] = endDarts[i];
                tieBreakPlayers[k] = i + 1;
                k++;
            }
        }
        if (tieBreak[1] == 0) {
            winner2();
        } else {
            tieBreak();
        }
    }
    public void tieBreak() { //method for tie break
        activateTieBreak = true;
        counter = 1;
        scoreOne = 0;
        playerOne.setText(String.valueOf(0));
        scoreTwo = 0;
        playerTwo.setText(String.valueOf(0));
        scoreThree = 0;
        playerThree.setText(String.valueOf(0));
        scoreFour = 0;
        playerFour.setText(String.valueOf(0));
        scoreFive = 0;
        playerFive.setText(String.valueOf(0));
        scoreSix = 0;
        playerSix.setText(String.valueOf(0));
        int[] p = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (p[i] == tieBreakPlayers[j]) {
                    p[i] = 0;
                    break;
                }
            }
        }
        for (int i = 0; i <= 5; i++) {
            if (p[i] != 0) {
                beGone(p[i]);
            }
        }
        settingOffTheLastPlayerBeforeTieBreak();
        setFirstPlayerBlue();
        setLastPlayerInTieBreak();
    }
    public void settingOffTheLastPlayerBeforeTieBreak(){
        if (player == 2){
            second.setBackgroundColor(Color.TRANSPARENT);
        } else if (player == 3){
            third.setBackgroundColor(Color.TRANSPARENT);
        } else if (player == 4){
            forth.setBackgroundColor(Color.TRANSPARENT);
        } else if (player == 5){
            fifth.setBackgroundColor(Color.TRANSPARENT);
        } else if (player == 6){
            sixth.setBackgroundColor(Color.TRANSPARENT);
        }
    }
    public void beGone(int number) { //method that sets players invisibile if they're not participating in the tie break
        if (number == 1) {
            playerOne.setVisibility(View.GONE);
        } else if (number == 2) {
            playerTwo.setVisibility(View.GONE);
        } else if (number == 3) {
            playerThree.setVisibility(View.GONE);
        } else if (number == 4) {
            playerFour.setVisibility(View.GONE);
        } else if (number == 5) {
            playerFive.setVisibility(View.GONE);
        } else if (number == 6) {
            playerSix.setVisibility(View.GONE);
        }
    }
    public void setFirstPlayerBlue() { //method that sets the color for the first player in the tie break
        if (tieBreakPlayers[0] == 1) {
            player = 1;
            first.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (tieBreakPlayers[0] == 2) {
            player = 2;
            second.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (tieBreakPlayers[0] == 3) {
            player = 3;
            third.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (tieBreakPlayers[0] == 4) {
            player = 4;
            forth.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (tieBreakPlayers[0] == 5) {
            player = 5;
            fifth.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (tieBreakPlayers[0] == 6) {
            player = 6;
            sixth.setBackgroundColor(Color.parseColor("#89cff0"));
        }
    }
    public void add(int number) { //method that adds number if the tie break is on
        bull(number);
        if (player == 1) {
            if (two) {
                scoreOne += number * 2;
                two = false;
                displayOne();
                setColor();
            } else if (three) {
                scoreOne += number * 3;
                three = false;
                displayOne();
                setColor();
            } else {
                scoreOne += number;
                displayOne();
                setColor();
            }
        } else if (player == 2) {
            if (two) {
                scoreTwo += number * 2;
                two = false;
                displayTwo();
                if (lastPlayerInTheTieBreak == 2) {
                    p = 1; //because tieBreak sets the first player to play and in display(Any number) it just repeats the first number if the p = 0
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            } else if (three) {
                scoreTwo += number * 3;
                three = false;
                displayTwo();
                if (lastPlayerInTheTieBreak == 2) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            } else {
                scoreTwo += number;
                displayTwo();
                if (lastPlayerInTheTieBreak == 2) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            }
        } else if (player == 3) {
            if (two) {
                scoreThree += number * 2;
                two = false;
                displayThree();
                if (lastPlayerInTheTieBreak == 3) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            } else if (three) {
                scoreThree += number * 3;
                three = false;
                displayThree();
                if (lastPlayerInTheTieBreak == 3) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            } else {
                scoreThree += number;
                displayThree();
                if (lastPlayerInTheTieBreak == 3) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            }
        } else if (player == 4) {
            if (two) {
                scoreFour += number * 2;
                two = false;
                displayFour();
                if (lastPlayerInTheTieBreak == 4) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            } else if (three) {
                scoreFour += number * 3;
                three = false;
                displayFour();
                if (lastPlayerInTheTieBreak == 4) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            } else {
                scoreFour += number;
                displayFour();
                if (lastPlayerInTheTieBreak == 4) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            }
        } else if (player == 5) {
            if (two) {
                scoreFive += number * 2;
                two = false;
                displayFive();
                if (lastPlayerInTheTieBreak == 5) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            } else if (three) {
                scoreFive += number * 3;
                three = false;
                displayFive();
                if (lastPlayerInTheTieBreak == 5) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            } else {
                scoreFive += number;
                displayFive();
                if (lastPlayerInTheTieBreak == 5) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            }
        } else if (player == 6) {
            if (two) {
                scoreSix += number * 2;
                two = false;
                displaySix();
                if (lastPlayerInTheTieBreak == 6) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            } else if (three) {
                scoreSix += number * 3;
                three = false;
                displaySix();
                if (lastPlayerInTheTieBreak == 6) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            } else {
                scoreSix += number;
                displaySix();
                if (lastPlayerInTheTieBreak == 6) {
                    p = 1;
                    checkTieBreakWinner();
                } else {
                    setColor();
                }
            }
        }
    }
    public void displayOne() { //method that prints the score for players in tie break
        playerOne.setText(String.valueOf(scoreOne));
        if (tieBreakPlayers[p] != 0) {
            player = tieBreakPlayers[p];
            p++;
        } else if (tieBreakPlayers[p] == 0) {
            p = 0;
            player = tieBreakPlayers[p];
            p++;
        }
        first.setBackgroundColor(Color.TRANSPARENT);
    }
    public void displayTwo() {
        playerTwo.setText(String.valueOf(scoreTwo));
        if (tieBreakPlayers[p] != 0) {
            player = tieBreakPlayers[p];
            p++;
        } else if (tieBreakPlayers[p] == 0) {
            p = 0;
            player = tieBreakPlayers[p];
            p++;
        }
        second.setBackgroundColor(Color.TRANSPARENT);
    }
    public void displayThree() {
        playerThree.setText(String.valueOf(scoreThree));
        if (tieBreakPlayers[p] != 0) {
            player = tieBreakPlayers[p];
            p++;
        } else if (tieBreakPlayers[p] == 0) {
            p = 0;
            player = tieBreakPlayers[p];
            p++;
        }
        third.setBackgroundColor(Color.TRANSPARENT);
    }
    public void displayFour() {
        playerFour.setText(String.valueOf(scoreFour));
        if (tieBreakPlayers[p] != 0) {
            player = tieBreakPlayers[p];
            p++;
        } else if (tieBreakPlayers[p] == 0) {
            p = 0;
            player = tieBreakPlayers[p];
            p++;
        }
        forth.setBackgroundColor(Color.TRANSPARENT);
    }
    public void displayFive() {
        playerFive.setText(String.valueOf(scoreFive));
        if (tieBreakPlayers[p] != 0) {
            player = tieBreakPlayers[p];
            p++;
        } else if (tieBreakPlayers[p] == 0) {
            p = 0;
            player = tieBreakPlayers[p];
            p++;
        }
        fifth.setBackgroundColor(Color.TRANSPARENT);
    }
    public void displaySix() {
        playerSix.setText(String.valueOf(scoreSix));
        p = 0;
        player = tieBreakPlayers[p];
        p++;
        sixth.setBackgroundColor(Color.TRANSPARENT);
    }
    public void setColor() { //method that sets the color to the player that's playing tie break
        if (player == 1) {
            first.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (player == 2) {
            second.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (player == 3) {
            third.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (player == 4) {
            forth.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (player == 5) {
            fifth.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (player == 6) {
            sixth.setBackgroundColor(Color.parseColor("#89cff0"));
        }
    }
    public void checkTieBreakWinner() { //method that checks the tie break
        int k = 0;
        int[] tieBreakScore = new int[6];
        for (int i = 0; i <= 5; i++) {
            if (tieBreakPlayers[i] == 1) {
                tieBreakScore[k] = scoreOne;
                k++;
            } else if (tieBreakPlayers[i] == 2) {
                tieBreakScore[k] = scoreTwo;
                k++;
            } else if (tieBreakPlayers[i] == 3) {
                tieBreakScore[k] = scoreThree;
                k++;
            } else if (tieBreakPlayers[i] == 4) {
                tieBreakScore[k] = scoreFour;
                k++;
            } else if (tieBreakPlayers[i] == 5) {
                tieBreakScore[k] = scoreFive;
                k++;
            } else if (tieBreakPlayers[i] == 6) {
                tieBreakScore[k] = scoreSix;
                k++;
            }
        }
        int maximalScore;
        maximalScore = tieBreakScore[0];
        for (int i = 1; i <= 5; i++) {
            if (tieBreakScore[i] > maximalScore) {
                maximalScore = tieBreakScore[i];
                tieBreakPlayers[0] = tieBreakPlayers[i];
                tieBreakPlayers[i] = 0;
                tieBreakScore[i] = 0;
            }
        }
        int z = 1;
        for (int i = 1; i <= 5; i++){
            if (tieBreakPlayers[i] != tieBreakPlayers[0]){
                if (tieBreakScore[i] == maximalScore){
                    tieBreakPlayers[z] = tieBreakPlayers[i];
                    z++;
                } else {
                    tieBreakPlayers[i] = 0;
                    tieBreakScore[i] = 0;
                }
            }
        }
        if (tieBreakPlayers[1] == 0) {
            tBreakWinner();
        } else {
            tieBreak();
        }
    }
    public void setLastPlayerInTieBreak(){ //method that tells which player is last in tie break (if there are 3 players and 3rd player doesn't get to tie break, it breaks)
        for (int i = 0; i <= 5; i++){
            if (tieBreakPlayers[i] != 0){
                lastPlayerInTheTieBreak = tieBreakPlayers[i];
            }
        }
    }
    public void tBreakWinner() { //method that prints the winner of the tie break
        if (tieBreakPlayers[0] == 1) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer1);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (tieBreakPlayers[0] == 2) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer2);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (tieBreakPlayers[0] == 3) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer3);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (tieBreakPlayers[0] == 4) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer4);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (tieBreakPlayers[0] == 5) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer5);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        } else if (tieBreakPlayers[0] == 6) {
            timesTwo.setVisibility(View.GONE);
            timesThree.setVisibility(View.GONE);
            winner.setText(R.string.winnerplayer6);
            winner.setVisibility(View.VISIBLE);
            returnToPicPar.setVisibility(View.VISIBLE);
            disableAllButtons();
            setAllBackgroundsToTransparent();
        }
    }
    public void subtract0(View view) { //method that activates subtraction or addition for when a button is pressed
        if (!activateTieBreak) {
            subtract(0);
        } else {
            add(0);
        }
    }
    public void subtract1(View view) {
        if (!activateTieBreak) {
            subtract(1);
        } else {
            add(1);
        }
    }
    public void subtract2(View view) {
        if (!activateTieBreak) {
            subtract(2);
        } else {
            add(2);
        }
    }
    public void subtract3(View view) {
        if (!activateTieBreak) {
            subtract(3);
        } else {
            add(3);
        }
    }
    public void subtract4(View view) {
        if (!activateTieBreak) {
            subtract(4);
        } else {
            add(4);
        }
    }
    public void subtract5(View view) {
        if (!activateTieBreak) {
            subtract(5);
        } else {
            add(5);
        }
    }
    public void subtract6(View view) {
        if (!activateTieBreak) {
            subtract(6);
        } else {
            add(6);
        }
    }
    public void subtract7(View view) {
        if (!activateTieBreak) {
            subtract(7);
        } else {
            add(7);
        }
    }
    public void subtract8(View view) {
        if (!activateTieBreak) {
            subtract(8);
        } else {
            add(8);
        }
    }
    public void subtract9(View view) {
        if (!activateTieBreak) {
            subtract(9);
        } else {
            add(9);
        }
    }
    public void subtract10(View view) {
        if (!activateTieBreak) {
            subtract(10);
        } else {
            add(10);
        }
    }
    public void subtract11(View view) {
        if (!activateTieBreak) {
            subtract(11);
        } else {
            add(11);
        }
    }
    public void subtract12(View view) {
        if (!activateTieBreak) {
            subtract(12);
        } else {
            add(12);
        }
    }
    public void subtract13(View view) {
        if (!activateTieBreak) {
            subtract(13);
        } else {
            add(13);
        }
    }
    public void subtract14(View view) {
        if (!activateTieBreak) {
            subtract(14);
        } else {
            add(14);
        }
    }
    public void subtract15(View view) {
        if (!activateTieBreak) {
            subtract(15);
        } else {
            add(15);
        }
    }
    public void subtract16(View view) {
        if (!activateTieBreak) {
            subtract(16);
        } else {
            add(16);
        }
    }
    public void subtract17(View view) {
        if (!activateTieBreak) {
            subtract(17);
        } else {
            add(17);
        }
    }
    public void subtract18(View view) {
        if (!activateTieBreak) {
            subtract(18);
        } else {
            add(18);
        }
    }
    public void subtract19(View view) {
        if (!activateTieBreak) {
            subtract(19);
        } else {
            add(19);
        }
    }
    public void subtract20(View view) {
        if (!activateTieBreak) {
            subtract(20);
        } else {
            add(20);
        }
    }
    public void subtract25(View view) {
        if (!activateTieBreak) {
            subtract(25);
        } else {
            add(25);
        }
    }
    public void subtract50(View view) {
        if (!activateTieBreak) {
            subtract(50);
        } else {
            add(50);
        }
    }
    public void callIndicator(){
        remain = 0;
        firstInd = "";
        secondInd = "";
        thirdInd = "";
        firstIndDart();
        indicator1.setText(firstInd);
        indicator2.setText(secondInd);
        indicator3.setText(thirdInd);
    }
    public void firstIndDart(){
        if (counter == 3){
            if (indicator > 180 || indicator == 179 || indicator == 178 || indicator == 176 || indicator == 175 || indicator == 173 ||
                    indicator == 172 || indicator == 169 || indicator == 166 || indicator == 163){
                firstInd = "";
                secondInd = "";
                thirdInd = "";
            } else if (indicator > 60){
                remain = indicator - 60;
                firstInd = "T20";
                secondIndDart();
            } else if (indicator == 59 || indicator == 58 || indicator == 56 || indicator == 55 || indicator == 53 || indicator == 52
                    || indicator == 49 || indicator == 47 || indicator == 46 || indicator == 44 || indicator == 43 || indicator == 41){
                remain = indicator - 40;
                firstInd = "D20";
                secondIndDart();
            } else if (indicator == 37 || indicator == 35 || indicator == 31 || indicator == 29 || indicator == 23){
                remain = indicator - 20;
                firstInd = "20";
                secondIndDart();
            } else {
                firstInd = oneDartShoot(indicator);
            }
        } else if (counter == 2){
            if (indicator > 120 || indicator == 119 || indicator == 118 || indicator == 116 || indicator == 115 || indicator == 113 || indicator == 112
                    || indicator == 109 || indicator == 106 || indicator == 103) {
                firstInd = "";
                secondInd = "";
                thirdInd = "";
            } else if (indicator == 107 || indicator == 97 || indicator == 95 || indicator == 91 || indicator == 89 || indicator == 87 || indicator == 83){
                remain = indicator - 57;
                firstInd = "T19";
                secondIndDart();
            } else if (indicator == 104){
                remain = indicator - 54;
                firstInd = "T18";
                secondIndDart();
            } else if (indicator == 101){
                remain = indicator - 51;
                firstInd = "T17";
                secondIndDart();
            } else if (indicator > 60){
                remain = indicator - 60;
                firstInd = "T20";
                secondIndDart();
            } else if (indicator == 59 || indicator == 58 || indicator == 56 || indicator == 55 || indicator == 53 || indicator == 52
                    || indicator == 49 || indicator == 47 || indicator == 46 || indicator == 44 || indicator == 43 || indicator == 41){
                remain = indicator - 40;
                firstInd = "D20";
                secondIndDart();
            } else if (indicator == 37 || indicator == 35 || indicator == 31 || indicator == 29 || indicator == 23){
                remain = indicator - 20;
                firstInd = "20";
                secondIndDart();
            } else {
                firstInd = oneDartShoot(indicator);
            }
        } else if (counter == 1 && indicator <= 60){
            firstInd = oneDartShoot(indicator);
        } else {
            firstInd = "";
            secondInd = "";
            thirdInd = "";
        }
    }
    public void secondIndDart(){
        if (counter == 3) {
            if (remain == 107 || remain == 97 || remain == 95 || remain == 91 || remain == 89 || remain == 87 || remain == 83){
                remain -= 57;
                secondInd = "T19";
                thirdInd = oneDartShoot(remain);
            } else if (remain == 104){
                remain -= 54;
                secondInd = "T18";
                thirdInd = oneDartShoot(remain);
            } else if (remain == 101){
                remain -= 51;
                secondInd = "T17";
                thirdInd = oneDartShoot(remain);
            } else if (remain > 60){
                remain -= 60;
                secondInd = "T20";
                thirdInd = oneDartShoot(remain);
            } else if (remain == 59 || remain == 58 || remain == 56 || remain == 55 || remain == 53 || remain == 52
                    || remain == 49 || remain == 47 || remain == 46 || remain == 44 || remain == 43 || remain == 41){
                remain -= 40;
                secondInd = "D20";
                thirdInd = oneDartShoot(remain);
            } else if (remain == 37 || remain == 35 || remain == 31 || remain == 29 || remain == 23){
                remain -= 20;
                secondInd = "20";
                thirdInd = oneDartShoot(remain);
            } else {
                secondInd = oneDartShoot(remain);
            }
        } else if (counter == 2 && remain <= 60){
            secondInd = oneDartShoot(remain);
        } else {
            firstInd = "";
            secondInd = "";
            thirdInd = "";
        }
    }
    public String oneDartShoot(int number){ //cover all numbers with 60 or less
        String a;
        switch (number){
            case 60:
                a = "T20";
                break;
            case 57:
                a = "T19";
                break;
            case 54:
                a = "T18";
                break;
            case 51:
                a = "T17";
                break;
            case 50:
                a = "Inner \nBull";
                break;
            case 48:
                a = "T16";
                break;
            case 45:
                a = "T15";
                break;
            case 42:
                a = "T14";
                break;
            case 40:
                a = "D20";
                break;
            case 39:
                a = "T13";
                break;
            case 38:
                a = "D19";
                break;
            case 36:
                a = "T12\nD18";
                break;
            case 34:
                a = "D17";
                break;
            case 33:
                a = "T11";
                break;
            case 32:
                a = "D16";
                break;
            case 30:
                a = "T10\nD15";
                break;
            case 28:
                a = "D14";
                break;
            case 27:
                a = "T9";
                break;
            case 26:
                a = "D13";
                break;
            case 25:
                a = "Outer\nBull";
                break;
            case 24:
                a = "T8\nD12";
                break;
            case 22:
                a = "D11";
                break;
            case 21:
                a = "T7";
                break;
            case 20:
                a = "20";
                break;
            case 19:
                a = "19";
                break;
            case 18:
                a = "18";
                break;
            case 17:
                a = "17";
                break;
            case 16:
                a = "16";
                break;
            case 15:
                a = "15";
                break;
            case 14:
                a = "14";
                break;
            case 13:
                a = "13";
                break;
            case 12:
                a = "12";
                break;
            case 11:
                a = "11";
                break;
            case 10:
                a = "10";
                break;
            case 9:
                a = "9";
                break;
            case 8:
                a = "8";
                break;
            case 7:
                a = "7";
                break;
            case 6:
                a = "6";
                break;
            case 5:
                a = "5";
                break;
            case 4:
                a = "4";
                break;
            case 3:
                a = "3";
                break;
            case 2:
                a = "2";
                break;
            case 1:
                a = "1";
                break;
            default:
                a = "";
                break;
        }
        return a;
    }
}