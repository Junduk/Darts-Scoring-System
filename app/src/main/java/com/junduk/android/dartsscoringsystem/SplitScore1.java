package com.junduk.android.dartsscoringsystem;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SplitScore1 extends AppCompatActivity {
    LinearLayout firstPlayer, secondPlayer, thirdPlayer, forthPlayer, fifthPlayer, sixthPlayer;
    ImageView dart1, dart2, dart3;
    Button timesF, timesT, timesTh, missButton, roundButton, specificAdditionButton, returnToPickingSplitScore;
    EditText inputField;
    TextView playerOne, playerTwo, playerThree, playerFour, playerFive, playerSix, first, second, third, forth, fifth, sixth, roundText;
    Bundle extras;
    Boolean timesTwo, timesThree, timesFour, didScore, inputFieldTest, split, fourX;
    int numOfPlayers, round, numberOfRounds, player, scoreOne, scoreTwo, scoreThree, scoreFour, scoreFive, scoreSix, target, counter;
    int multiply, inputScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split_score1);
        //darts
        dart1 = findViewById(R.id.dart1);
        dart2 = findViewById(R.id.dart2);
        dart3 = findViewById(R.id.dart3);
        //multiplier buttons
        timesF = findViewById(R.id.timesFour);
        timesT = findViewById(R.id.timesTwo);
        timesTh = findViewById(R.id.timesThree);
        //miss button
        missButton = findViewById(R.id.missButton);
        //rounds
        roundButton = findViewById(R.id.roundButton);
        roundText = findViewById(R.id.roundText);
        //inputs
        inputField = findViewById(R.id.inputField);
        //TextView players
        playerOne = findViewById(R.id.playerOne);
        playerTwo = findViewById(R.id.playerTwo);
        playerThree = findViewById(R.id.playerThree);
        playerFour = findViewById(R.id.playerFour);
        playerFive = findViewById(R.id.playerFive);
        playerSix = findViewById(R.id.playerSix);
        //player scores
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        forth = findViewById(R.id.forth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        //button for addition
        specificAdditionButton = findViewById(R.id.specificAdditionButton);
        //return button
        returnToPickingSplitScore = findViewById(R.id.returnToPickingTheSplitScore);
        //LinearLayout players
        firstPlayer = findViewById(R.id.firstPlayer);
        secondPlayer = findViewById(R.id.secondPlayer);
        thirdPlayer = findViewById(R.id.thirdPlayer);
        forthPlayer = findViewById(R.id.forthPlayer);
        fifthPlayer = findViewById(R.id.fifthPlayer);
        sixthPlayer = findViewById(R.id.sixthPlayer);
        //bools of multipliers
        timesTwo = false;
        timesThree = false;
        timesFour = false;
        didScore = false;
        split = true;
        timesF.setBackgroundResource(android.R.drawable.btn_default);
        timesT.setBackgroundResource(android.R.drawable.btn_default);
        timesTh.setBackgroundResource(android.R.drawable.btn_default);
        missButton.setBackgroundResource(android.R.drawable.btn_default);
        roundButton.setBackgroundResource(android.R.drawable.btn_default);
        extras = getIntent().getExtras();
        if (extras != null) {
            numOfPlayers = extras.getInt("players");
        }
        if (extras != null) {
            fourX = extras.getBoolean("timesFour");
        }
        round = 1;
        player = 1;
        scoreOne = 40;
        scoreTwo = 40;
        scoreThree = 40;
        scoreFour = 40;
        scoreFive = 40;
        scoreSix = 40;
        target = 15;
        counter = 3;
        multiply = 1;
        inputScore = 0;
        inputFieldTest = false;
        if (fourX) {
            numberOfRounds = 10;
        } else {
            numberOfRounds = 9;
            timesF.setVisibility(View.GONE);
            timesF.setClickable(false);
        }
        inputField.setVisibility(View.INVISIBLE);
        inputField.setClickable(false);
        specificAdditionButton.setVisibility(View.INVISIBLE);
        specificAdditionButton.setClickable(false);
        settingUpTheGame();
        first.setBackgroundColor(Color.parseColor("#89cff0"));
    }
    public void twoTimes(View view){
        if (round == 9){
            if (player == 1){
                scoreOne += 25;
                playerOne.setText(String.valueOf(scoreOne));
                split = false;
            } else if (player == 2){
                scoreTwo += 25;
                playerTwo.setText(String.valueOf(scoreTwo));
                split = false;
            } else if (player == 3){
                scoreThree += 25;
                playerThree.setText(String.valueOf(scoreThree));
                split = false;
            } else if (player == 4){
                scoreFour += 25;
                playerFour.setText(String.valueOf(scoreFour));
                split = false;
            } else if (player == 5){
                scoreFive += 25;
                playerFive.setText(String.valueOf(scoreFive));
                split = false;
            } else if (player == 6){
                scoreSix += 25;
                playerSix.setText(String.valueOf(scoreSix));
                split = false;
            }
            darts();
        } else {
            timesT.setBackgroundColor(Color.GRAY);
            timesTh.setBackgroundResource(android.R.drawable.btn_default);
            timesF.setBackgroundResource(android.R.drawable.btn_default);
            timesTwo = true;
            timesThree = false;
            timesFour = false;
            multiply = 2;
        }
    }
    public void threeTimes(View view){
        if (round == 9){
            if (player == 1){
                scoreOne += 50;
                playerOne.setText(String.valueOf(scoreOne));
                split = false;
            } else if (player == 2){
                scoreTwo += 50;
                playerTwo.setText(String.valueOf(scoreTwo));
                split = false;
            } else if (player == 3){
                scoreThree += 50;
                playerThree.setText(String.valueOf(scoreThree));
                split = false;
            } else if (player == 4){
                scoreFour += 50;
                playerFour.setText(String.valueOf(scoreFour));
                split = false;
            } else if (player == 5){
                scoreFive += 50;
                playerFive.setText(String.valueOf(scoreFive));
                split = false;
            } else if (player == 6){
                scoreSix += 50;
                playerSix.setText(String.valueOf(scoreSix));
                split = false;
            }
            darts();
        } else {
            timesTh.setBackgroundColor(Color.GRAY);
            timesT.setBackgroundResource(android.R.drawable.btn_default);
            timesF.setBackgroundResource(android.R.drawable.btn_default);
            timesTwo = false;
            timesThree = true;
            timesFour = false;
            multiply = 3;
        }
    }
    public void fourTimes(View view){
        timesF.setBackgroundColor(Color.GRAY);
        timesTh.setBackgroundResource(android.R.drawable.btn_default);
        timesT.setBackgroundResource(android.R.drawable.btn_default);
        timesTwo = false;
        timesThree = false;
        timesFour = true;
        multiply = 4;
    }
    public void addingPoints(View view){ //this is for adding points via the normal round button
        if (player == 1){
            if (timesTwo || timesThree || timesFour){
                scoreOne += multiply * target;
                playerOne.setText(String.valueOf(scoreOne));
                resettingMultiplications();
                split = false;
            } else {
                scoreOne += target;
                playerOne.setText(String.valueOf(scoreOne));
                split = false;
            }
        } else if(player == 2){
            if (timesTwo || timesThree || timesFour){
                scoreTwo += multiply * target;
                playerTwo.setText(String.valueOf(scoreTwo));
                resettingMultiplications();
                split = false;
            } else {
                scoreTwo += target;
                playerTwo.setText(String.valueOf(scoreTwo));
                split = false;
            }
        } else if(player == 3){
            if (timesTwo || timesThree || timesFour){
                scoreThree += multiply * target;
                playerThree.setText(String.valueOf(scoreThree));
                resettingMultiplications();
                split = false;
            } else {
                scoreThree += target;
                playerThree.setText(String.valueOf(scoreThree));
                split = false;
            }
        } else if(player == 4){
            if (timesTwo || timesThree || timesFour){
                scoreFour += multiply * target;
                playerFour.setText(String.valueOf(scoreFour));
                resettingMultiplications();
                split = false;
            } else {
                scoreFour += target;
                playerFour.setText(String.valueOf(scoreFour));
                split = false;
            }
        } else if(player == 5){
            if (timesTwo || timesThree || timesFour){
                scoreFive += multiply * target;
                playerFive.setText(String.valueOf(scoreFive));
                resettingMultiplications();
                split = false;
            } else {
                scoreFive += target;
                playerFive.setText(String.valueOf(scoreFive));
                split = false;
            }
        } else if(player == 6){
            if (timesTwo || timesThree || timesFour){
                scoreSix += multiply * target;
                playerSix.setText(String.valueOf(scoreSix));
                resettingMultiplications();
                split = false;
            } else {
                scoreSix += target;
                playerSix.setText(String.valueOf(scoreSix));
                split = false;
            }
        }
        darts();
    }
    public void addingSpecificPoints(View view){ //this is for rounds where there's an input needed, exp: 2x, 3x and 4x
        if (inputField.getText().toString().isEmpty()){
            String text1 = "Error";
            inputField.setHint(text1);
            String text2 = "";
            inputField.setText(text2);
        } else {
            inputScore = Integer.parseInt(inputField.getText().toString());
            for (int i = 1; i <= 20; i++) {
                if (inputScore == i) {
                    inputFieldTest = true;
                    break;
                }
            }
            if (inputField.getText().toString().isEmpty() || !inputFieldTest) {
                String text1 = "Error";
                inputField.setHint(text1);
                String text2 = "";
                inputField.setText(text2);
            } else {
                if (round == 3) {
                    multiply = 2;
                } else if (round == 6) {
                    multiply = 3;
                } else if (round == 10) {
                    multiply = 4;
                }
                if (player == 1) {
                    scoreOne += multiply * inputScore;
                    playerOne.setText(String.valueOf(scoreOne));
                    split = false;
                }
                if (player == 2) {
                    scoreTwo += multiply * inputScore;
                    playerTwo.setText(String.valueOf(scoreTwo));
                    split = false;
                }
                if (player == 3) {
                    scoreThree += multiply * inputScore;
                    playerThree.setText(String.valueOf(scoreThree));
                    split = false;
                }
                if (player == 4) {
                    scoreFour += multiply * inputScore;
                    playerFour.setText(String.valueOf(scoreFour));
                    split = false;
                }
                if (player == 5) {
                    scoreFive += multiply * inputScore;
                    playerFive.setText(String.valueOf(scoreFive));
                    split = false;
                }
                if (player == 6) {
                    scoreSix += multiply * inputScore;
                    playerSix.setText(String.valueOf(scoreSix));
                    split = false;
                }
                darts();
                inputFieldTest = false;
            }
        }
    }
    public void darts(){ //method for changing darts and players
        counter -= 1;
        if (counter == 2){
            dart3.setVisibility(View.INVISIBLE);
        } else if (counter == 1){
            dart2.setVisibility(View.INVISIBLE);
        } else if (counter == 0){
            dart3.setVisibility(View.VISIBLE);
            dart2.setVisibility(View.VISIBLE);
            if (split){
                splittingThePoints();
            }
            if (round == numberOfRounds && player == numOfPlayers){
                endingTheGame();
            } else {
                counter = 3;
                if (player == numOfPlayers) {
                    round++;
                    changingRounds();
                }
                player++;
                if (player > numOfPlayers) {
                    player = 1;
                }
                changingPlayers();
                split = true;
            }
        }
    }
    public void splittingThePoints(){ //method for splitting the points for those who didn't score anything in that round
        if (player == 1){
            scoreOne = (int) Math.floor((double)scoreOne / 2);
            playerOne.setText(String.valueOf(scoreOne));
        } else if (player == 2){
            scoreTwo = (int) Math.floor((double)scoreTwo / 2);
            playerTwo.setText(String.valueOf(scoreTwo));
        } else if (player == 3){
            scoreThree = (int) Math.floor((double)scoreThree / 2);
            playerThree.setText(String.valueOf(scoreThree));
        } else if (player == 4){
            scoreFour = (int) Math.floor((double)scoreFour / 2);
            playerFour.setText(String.valueOf(scoreFour));
        } else if (player == 5){
            scoreFive = (int) Math.floor((double)scoreFive / 2);
            playerFive.setText(String.valueOf(scoreFive));
        } else if (player == 6){
            scoreSix = (int) Math.floor((double)scoreSix / 2);
            playerSix.setText(String.valueOf(scoreSix));
        }
    }
    public void changingRounds(){
        if (round == 2){
            String text = "Target: 16";
            roundText.setText(text);
            String text1 = "16";
            roundButton.setText(text1);
            target = 16;
        } else if (round == 3){
            String text = "Target: 2x";
            roundText.setText(text);
            String text1 = " ";
            roundButton.setText(text1);
            timesTwoAndThreeRounds();
        } else if (round == 4){
            String text = "Target: 17";
            roundText.setText(text);
            target = 17;
            String text1 = "17";
            roundButton.setText(text1);
            normalRound();
            resettingMultiplications();
        } else if (round == 5){
            String text = "Target: 18";
            roundText.setText(text);
            String text1 = "18";
            roundButton.setText(text1);
            target = 18;
        } else if (round == 6){
            String text = "Target: 3x";
            roundText.setText(text);
            String text1 = " ";
            roundButton.setText(text1);
            timesTwoAndThreeRounds();
        } else if (round == 7){
            String text = "Target: 19";
            roundText.setText(text);
            target = 19;
            String text1 = "19";
            roundButton.setText(text1);
            normalRound();
            resettingMultiplications();
        } else if (round == 8){
            String text = "Target: 20";
            roundText.setText(text);
            String text1 = "20";
            roundButton.setText(text1);
            target = 20;
        } else if (round == 9){
            String text = "Target: Bull";
            roundText.setText(text);
            String text1 = " ";
            roundButton.setText(text1);
            bullRound();
        } else if (round == 10){
            String text = "Target: 4x";
            roundText.setText(text);
            String text1 = " ";
            roundButton.setText(text1);
            antiBullRound();
        }
    }
    public void timesTwoAndThreeRounds(){ //changing everything to times two and times three rounds
        roundButton.setClickable(false);
        roundButton.setBackgroundColor(Color.GRAY);
        timesF.setClickable(false);
        timesF.setBackgroundColor(Color.GRAY);
        timesT.setClickable(false);
        timesT.setBackgroundColor(Color.GRAY);
        timesTh.setClickable(false);
        timesTh.setBackgroundColor(Color.GRAY);
        inputField.setClickable(true);
        inputField.setVisibility(View.VISIBLE);
        specificAdditionButton.setClickable(true);
        specificAdditionButton.setVisibility(View.VISIBLE);
    }
    public void normalRound(){ //changing everything back to normal after times two and times three rounds
        roundButton.setClickable(true);
        roundButton.setBackgroundResource(android.R.drawable.btn_default);
        timesF.setClickable(true);
        timesF.setBackgroundResource(android.R.drawable.btn_default);
        timesT.setClickable(true);
        timesT.setBackgroundResource(android.R.drawable.btn_default);
        timesTh.setClickable(true);
        timesTh.setBackgroundResource(android.R.drawable.btn_default);
        inputField.setClickable(false);
        inputField.setVisibility(View.INVISIBLE);
        specificAdditionButton.setClickable(false);
        specificAdditionButton.setVisibility(View.INVISIBLE);
    }
    public void bullRound(){ //changing everything for bull round
        String text1 = "25";
        String text2 = "50";
        timesT.setText(text1);
        timesTh.setText(text2);
        specificAdditionButton.setClickable(false);
        specificAdditionButton.setVisibility(View.INVISIBLE);
        roundButton.setClickable(false);
        roundButton.setBackgroundColor(Color.GRAY);
        inputField.setClickable(false);
        inputField.setVisibility(View.INVISIBLE);
        if (fourX){
            timesF.setClickable(false);
            timesF.setBackgroundColor(Color.GRAY);
        }
    }
    public void antiBullRound(){ //changes everything from bull round to 4x round
        String text1 = "2x";
        String text2 = "3x";
        timesT.setText(text1);
        timesTh.setText(text2);
        timesT.setClickable(false);
        timesTh.setClickable(false);
        timesT.setBackgroundColor(Color.GRAY);
        timesTh.setBackgroundColor(Color.GRAY);
        specificAdditionButton.setVisibility(View.VISIBLE);
        inputField.setVisibility(View.VISIBLE);
        specificAdditionButton.setClickable(true);
        specificAdditionButton.setBackgroundResource(android.R.drawable.btn_default);
        inputField.setClickable(true);
    }
    public void changingPlayers(){ //method for changing colors of the players
        if (player == 1){
            first.setBackgroundColor(Color.parseColor("#89cff0"));
            second.setBackgroundColor(Color.TRANSPARENT);
            third.setBackgroundColor(Color.TRANSPARENT);
            forth.setBackgroundColor(Color.TRANSPARENT);
            fifth.setBackgroundColor(Color.TRANSPARENT);
            sixth.setBackgroundColor(Color.TRANSPARENT);
        } else if (player == 2){
            first.setBackgroundColor(Color.TRANSPARENT);
            second.setBackgroundColor(Color.parseColor("#89cff0"));
            third.setBackgroundColor(Color.TRANSPARENT);
            forth.setBackgroundColor(Color.TRANSPARENT);
            fifth.setBackgroundColor(Color.TRANSPARENT);
            sixth.setBackgroundColor(Color.TRANSPARENT);
        } else if (player == 3){
            first.setBackgroundColor(Color.TRANSPARENT);
            second.setBackgroundColor(Color.TRANSPARENT);
            third.setBackgroundColor(Color.parseColor("#89cff0"));
            forth.setBackgroundColor(Color.TRANSPARENT);
            fifth.setBackgroundColor(Color.TRANSPARENT);
            sixth.setBackgroundColor(Color.TRANSPARENT);
        } else if (player == 4){
            first.setBackgroundColor(Color.TRANSPARENT);
            second.setBackgroundColor(Color.TRANSPARENT);
            third.setBackgroundColor(Color.TRANSPARENT);
            forth.setBackgroundColor(Color.parseColor("#89cff0"));
            fifth.setBackgroundColor(Color.TRANSPARENT);
            sixth.setBackgroundColor(Color.TRANSPARENT);
        } else if (player == 5){
            first.setBackgroundColor(Color.TRANSPARENT);
            second.setBackgroundColor(Color.TRANSPARENT);
            third.setBackgroundColor(Color.TRANSPARENT);
            forth.setBackgroundColor(Color.TRANSPARENT);
            fifth.setBackgroundColor(Color.parseColor("#89cff0"));
            sixth.setBackgroundColor(Color.TRANSPARENT);
        } else if (player == 6){
            first.setBackgroundColor(Color.TRANSPARENT);
            second.setBackgroundColor(Color.TRANSPARENT);
            third.setBackgroundColor(Color.TRANSPARENT);
            forth.setBackgroundColor(Color.TRANSPARENT);
            fifth.setBackgroundColor(Color.TRANSPARENT);
            sixth.setBackgroundColor(Color.parseColor("#89cff0"));
        }
    }
    public void settingUpTheGame(){ //this sets up the players spots and kicks out the unnecessary parts
        if (numOfPlayers == 2){
            thirdPlayer.setVisibility(View.GONE);
            forthPlayer.setVisibility(View.GONE);
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
        } else if (numOfPlayers == 3){
            forthPlayer.setVisibility(View.GONE);
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
        } else if (numOfPlayers == 4){
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
        } else if (numOfPlayers == 5){
            sixthPlayer.setVisibility(View.GONE);
        }
    }
    public void resettingMultiplications(){
        timesT.setBackgroundResource(android.R.drawable.btn_default);
        timesTh.setBackgroundResource(android.R.drawable.btn_default);
        timesF.setBackgroundResource(android.R.drawable.btn_default);
        timesTwo = false;
        timesThree = false;
        timesFour = false;
        multiply = 1;
    }
    public void miss(View view){
        darts();
    }
    public void endingTheGame(){ //method for ending the game
        int[] endScores = {scoreOne, scoreTwo, scoreThree, scoreFour, scoreFive, scoreSix};
        int max = endScores[0];
        for (int i = 1; i <= numOfPlayers - 1; i++){
            if (endScores[i] > max){
                max = endScores[i];
            }
        }
        if (max == endScores[0]){
            String text1 = "THE WINNER IS PLAYER 1";
            roundText.setText(text1);
            roundText.setTextSize(25);
        } else if (max == endScores[1]){
            String text1 = "THE WINNER IS PLAYER 2";
            roundText.setText(text1);
            roundText.setTextSize(25);
        } else if (max == endScores[2]){
            String text1 = "THE WINNER IS PLAYER 3";
            roundText.setText(text1);
            roundText.setTextSize(25);
        } else if (max == endScores[3]){
            String text1 = "THE WINNER IS PLAYER 4";
            roundText.setText(text1);
            roundText.setTextSize(25);
        } else if (max == endScores[4]){
            String text1 = "THE WINNER IS PLAYER 5";
            roundText.setText(text1);
            roundText.setTextSize(25);
        } else if (max == endScores[5]){
            String text1 = "THE WINNER IS PLAYER 6";
            roundText.setText(text1);
            roundText.setTextSize(25);
        }
        missButton.setClickable(false);
        missButton.setBackgroundColor(Color.GRAY);
        roundButton.setClickable(false);
        roundButton.setBackgroundColor(Color.GRAY);
        timesF.setClickable(false);
        timesF.setBackgroundColor(Color.GRAY);
        timesT.setClickable(false);
        timesT.setBackgroundColor(Color.GRAY);
        timesTh.setClickable(false);
        timesTh.setBackgroundColor(Color.GRAY);
        inputField.setVisibility(View.INVISIBLE);
        inputField.setClickable(false);
        specificAdditionButton.setVisibility(View.INVISIBLE);
        specificAdditionButton.setClickable(false);
        returnToPickingSplitScore.setVisibility(View.VISIBLE);
        returnToPickingSplitScore.setClickable(true);
        settingAllPlayersBackgroundsToTransparent();
    }
    public void settingAllPlayersBackgroundsToTransparent(){ //setting every player background to transparent at the end
        if (numOfPlayers == 2){
            second.setBackgroundColor(Color.TRANSPARENT);
        } else if (numOfPlayers == 3){
            third.setBackgroundColor(Color.TRANSPARENT);
        } else if (numOfPlayers == 4){
            forth.setBackgroundColor(Color.TRANSPARENT);
        } else if (numOfPlayers == 5){
            fifth.setBackgroundColor(Color.TRANSPARENT);
        } else if (numOfPlayers == 6){
            sixth.setBackgroundColor(Color.TRANSPARENT);
        }
    }
    public void returnToPickingTheSS(View view){ //method for return button
        finish();
    }
}