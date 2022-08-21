package com.junduk.android.dartsscoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Shanghai2 extends AppCompatActivity {
    String name1, name2, name3, name4, name5, name6;
    LinearLayout firstPlayer, secondPlayer, thirdPlayer, forthPlayer, fifthPlayer, sixthPlayer;
    Bundle extras;
    ImageView dart1, dart2, dart3;
    Boolean timesTwo, timesThree, sh1, sh2, sh3;
    Button timesT, timesTh, missButton, returnToPickingShanghai, roundButton;
    TextView playerOne, playerTwo, playerThree, playerFour, playerFive, playerSix, first, second, third, forth, fifth, sixth, roundText;
    int numOfPlayers, round, player, scoreOne, scoreTwo, scoreThree, scoreFour, scoreFive, scoreSix, target, counter, multiply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shanghai2);
        extras = getIntent().getExtras();
        if (extras != null) {
            numOfPlayers = extras.getInt("players");
            if (numOfPlayers == 2){
                name1 = extras.getString("name1");
                name2 = extras.getString("name2");
            } else if (numOfPlayers == 3){
                name1 = extras.getString("name1");
                name2 = extras.getString("name2");
                name3 = extras.getString("name3");
            } else if (numOfPlayers == 4){
                name1 = extras.getString("name1");
                name2 = extras.getString("name2");
                name3 = extras.getString("name3");
                name4 = extras.getString("name4");
            } else if (numOfPlayers == 5){
                name1 = extras.getString("name1");
                name2 = extras.getString("name2");
                name3 = extras.getString("name3");
                name4 = extras.getString("name4");
                name5 = extras.getString("name5");
            } else if (numOfPlayers == 6){
                name1 = extras.getString("name1");
                name2 = extras.getString("name2");
                name3 = extras.getString("name3");
                name4 = extras.getString("name4");
                name5 = extras.getString("name5");
                name6 = extras.getString("name6");
            }
        }
        //buttons
        timesT = findViewById(R.id.timesTwo);
        timesTh = findViewById(R.id.timesThree);
        missButton = findViewById(R.id.missButton);
        returnToPickingShanghai = findViewById(R.id.returnToPickingTheShanghai);
        timesT.setBackgroundResource(android.R.drawable.btn_default);
        timesTh.setBackgroundResource(android.R.drawable.btn_default);
        missButton.setBackgroundResource(android.R.drawable.btn_default);
        roundText = findViewById(R.id.roundText);
        roundButton = findViewById(R.id.roundButton);
        roundButton.setBackgroundResource(android.R.drawable.btn_default);
        //LinearLayout players
        firstPlayer = findViewById(R.id.firstPlayer);
        secondPlayer = findViewById(R.id.secondPlayer);
        thirdPlayer = findViewById(R.id.thirdPlayer);
        forthPlayer = findViewById(R.id.forthPlayer);
        fifthPlayer = findViewById(R.id.fifthPlayer);
        sixthPlayer = findViewById(R.id.sixthPlayer);
        //darts
        dart1 = findViewById(R.id.dart1);
        dart2 = findViewById(R.id.dart2);
        dart3 = findViewById(R.id.dart3);
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
        //bools of multipliers
        timesTwo = false;
        timesThree = false;
        sh1 = false;
        sh2 = false;
        sh3 = false;
        round = 1;
        player = 1;
        scoreOne = 0;
        scoreTwo = 0;
        scoreThree = 0;
        scoreFour = 0;
        scoreFive = 0;
        scoreSix = 0;
        target = 1;
        counter = 3;
        multiply = 1;
        setNames();
        settingUpTheGame();
        first.setBackgroundColor(Color.parseColor("#89cff0"));
    }
    public void setNames(){
        first.setText(name1);
        second.setText(name2);
        third.setText(name3);
        forth.setText(name4);
        fifth.setText(name5);
        sixth.setText(name6);
    }
    public void addPoints(View view){
        multiply = 1;
        sh1 = true;
        add();
    }
    public void add(){
        if (player == 1){
            scoreOne += target * multiply;
            playerOne.setText(String.valueOf(scoreOne));
        } else if (player == 2){
            scoreTwo += target * multiply;
            playerTwo.setText(String.valueOf(scoreTwo));
        } else if (player == 3){
            scoreThree += target * multiply;
            playerThree.setText(String.valueOf(scoreThree));
        } else if (player == 4){
            scoreFour += target * multiply;
            playerFour.setText(String.valueOf(scoreFour));
        } else if (player == 5){
            scoreFive += target * multiply;
            playerFive.setText(String.valueOf(scoreFive));
        } else if (player == 6){
            scoreSix += target * multiply;
            playerSix.setText(String.valueOf(scoreSix));
        }
        darts();
    }
    public void declareShanghaiWinner(){
        if (player == 1){
            String text1 = "THE WINNER IS PLAYER 1";
            first.setBackgroundColor(Color.TRANSPARENT);
            roundText.setText(text1);
            roundText.setTextSize(25);
            String text2 = "Shanghai";
            playerOne.setText(text2);
        } else if (player == 2){
            String text1 = "THE WINNER IS PLAYER 2";
            second.setBackgroundColor(Color.TRANSPARENT);
            roundText.setText(text1);
            roundText.setTextSize(25);
            String text2 = "Shanghai";
            playerTwo.setText(text2);
        } else if (player == 3){
            String text1 = "THE WINNER IS PLAYER 3";
            third.setBackgroundColor(Color.TRANSPARENT);
            roundText.setText(text1);
            roundText.setTextSize(25);
            String text2 = "Shanghai";
            playerThree.setText(text2);
        } else if (player == 4){
            String text1 = "THE WINNER IS PLAYER 4";
            forth.setBackgroundColor(Color.TRANSPARENT);
            roundText.setText(text1);
            roundText.setTextSize(25);
            String text2 = "Shanghai";
            playerFour.setText(text2);
        } else if (player == 5){
            String text1 = "THE WINNER IS PLAYER 5";
            fifth.setBackgroundColor(Color.TRANSPARENT);
            roundText.setText(text1);
            roundText.setTextSize(25);
            String text2 = "Shanghai";
            playerFive.setText(text2);
        } else if (player == 6){
            String text1 = "THE WINNER IS PLAYER 6";
            sixth.setBackgroundColor(Color.TRANSPARENT);
            roundText.setText(text1);
            roundText.setTextSize(25);
            String text2 = "Shanghai";
            playerSix.setText(text2);
        }
        missButton.setClickable(false);
        missButton.setBackgroundColor(Color.GRAY);
        roundButton.setClickable(false);
        roundButton.setBackgroundColor(Color.GRAY);
        timesT.setClickable(false);
        timesT.setBackgroundColor(Color.GRAY);
        timesTh.setClickable(false);
        timesTh.setBackgroundColor(Color.GRAY);
        returnToPickingShanghai.setVisibility(View.VISIBLE);
        returnToPickingShanghai.setClickable(true);
        dart3.setVisibility(View.VISIBLE);
        dart2.setVisibility(View.VISIBLE);
    }
    public void declareWinner(){
        int[] list = {scoreOne, scoreTwo, scoreThree, scoreFour, scoreFive, scoreSix}; //scoreOne is there for better index arrangement
        int max = scoreOne;
        int index = 0;
        for (int i = 1; i <= numOfPlayers - 1; i++){
            if (max < list[i]){
                max = list[i];
                index = i;
            }
        }
        if (index == 0){
            String text1 = "THE WINNER IS PLAYER 1";
            roundText.setText(text1);
            roundText.setTextSize(25);
        } else if (index == 1){
            String text1 = "THE WINNER IS PLAYER 2";
            roundText.setText(text1);
            roundText.setTextSize(25);
        } else if (index == 2){
            String text1 = "THE WINNER IS PLAYER 3";
            roundText.setText(text1);
            roundText.setTextSize(25);
        } else if (index == 3){
            String text1 = "THE WINNER IS PLAYER 4";
            roundText.setText(text1);
            roundText.setTextSize(25);
        } else if (index == 4){
            String text1 = "THE WINNER IS PLAYER 5";
            roundText.setText(text1);
            roundText.setTextSize(25);
        } else {
            String text1 = "THE WINNER IS PLAYER 6";
            roundText.setText(text1);
            roundText.setTextSize(25);
        }
        missButton.setClickable(false);
        missButton.setBackgroundColor(Color.GRAY);
        roundButton.setClickable(false);
        roundButton.setBackgroundColor(Color.GRAY);
        timesT.setClickable(false);
        timesT.setBackgroundColor(Color.GRAY);
        timesTh.setClickable(false);
        timesTh.setBackgroundColor(Color.GRAY);
        returnToPickingShanghai.setVisibility(View.VISIBLE);
        returnToPickingShanghai.setClickable(true);
        settingAllPlayersBackgroundsToTransparent();
        dart3.setVisibility(View.VISIBLE);
        dart2.setVisibility(View.VISIBLE);
    }
    public void darts(){ //method for changing darts and players
        multiply = 1;
        counter -= 1;
        if (counter == 2){
            dart3.setVisibility(View.INVISIBLE);
        } else if (counter == 1){
            dart2.setVisibility(View.INVISIBLE);
        } else if (counter == 0){
            if (sh1 && sh2 && sh3){
                declareShanghaiWinner();
            } else if (round == 20 && player == numOfPlayers){
                declareWinner();
            } else {
                dart3.setVisibility(View.VISIBLE);
                dart2.setVisibility(View.VISIBLE);
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
                sh1 = false;
                sh2 = false;
                sh3 = false;
            }
        }
    }
    public void changingRounds(){
        if (round == 2){
            String text = "Target: 2";
            roundText.setText(text);
            String text1 = "2";
            roundButton.setText(text1);
            target = 2;
        } else if (round == 3){
            String text = "Target: 3";
            roundText.setText(text);
            String text1 = "3";
            roundButton.setText(text1);
            target = 3;
        } else if (round == 4){
            String text = "Target: 4";
            roundText.setText(text);
            String text1 = "4";
            roundButton.setText(text1);
            target = 4;
        } else if (round == 5){
            String text = "Target: 5";
            roundText.setText(text);
            String text1 = "5";
            roundButton.setText(text1);
            target = 5;
        } else if (round == 6){
            String text = "Target: 6";
            roundText.setText(text);
            String text1 = "6";
            roundButton.setText(text1);
            target = 6;
        } else if (round == 7){
            String text = "Target: 7";
            roundText.setText(text);
            String text1 = "7";
            roundButton.setText(text1);
            target = 7;
        } else if (round == 8){
            String text = "Target: 8";
            roundText.setText(text);
            String text1 = "8";
            roundButton.setText(text1);
            target = 8;
        } else if (round == 9){
            String text = "Target: 9";
            roundText.setText(text);
            String text1 = "9";
            roundButton.setText(text1);
            target = 9;
        } else if (round == 10){
            String text = "Target: 10";
            roundText.setText(text);
            String text1 = "10";
            roundButton.setText(text1);
            target = 10;
        } else if (round == 11){
            String text = "Target: 11";
            roundText.setText(text);
            String text1 = "11";
            roundButton.setText(text1);
            target = 11;
        } else if (round == 12){
            String text = "Target: 12";
            roundText.setText(text);
            String text1 = "12";
            roundButton.setText(text1);
            target = 12;
        } else if (round == 13){
            String text = "Target: 13";
            roundText.setText(text);
            String text1 = "13";
            roundButton.setText(text1);
            target = 13;
        } else if (round == 14){
            String text = "Target: 14";
            roundText.setText(text);
            String text1 = "14";
            roundButton.setText(text1);
            target = 14;
        } else if (round == 15){
            String text = "Target: 15";
            roundText.setText(text);
            String text1 = "15";
            roundButton.setText(text1);
            target = 15;
        } else if (round == 16){
            String text = "Target: 16";
            roundText.setText(text);
            String text1 = "16";
            roundButton.setText(text1);
            target = 16;
        } else if (round == 17){
            String text = "Target: 17";
            roundText.setText(text);
            String text1 = "17";
            roundButton.setText(text1);
            target = 17;
        } else if (round == 18){
            String text = "Target: 18";
            roundText.setText(text);
            String text1 = "18";
            roundButton.setText(text1);
            target = 18;
        } else if (round == 19){
            String text = "Target: 19";
            roundText.setText(text);
            String text1 = "19";
            roundButton.setText(text1);
            target = 19;
        } else if (round == 20){
            String text = "Target: 20";
            roundText.setText(text);
            String text1 = "20";
            roundButton.setText(text1);
            target = 20;
        }
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
    public void threeTimes(View view){
        timesTh.setBackgroundColor(Color.GRAY);
        timesT.setBackgroundResource(android.R.drawable.btn_default);
        timesTwo = false;
        timesThree = true;
        multiply = 3;
        sh3 = true;
        timesTh.setBackgroundResource(android.R.drawable.btn_default);
        add();
    }
    public void twoTimes(View view){
        timesTh.setBackgroundResource(android.R.drawable.btn_default);
        timesT.setBackgroundColor(Color.GRAY);
        timesTwo = true;
        timesThree = false;
        multiply = 2;
        sh2 = true;
        timesT.setBackgroundResource(android.R.drawable.btn_default);
        add();
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
    public void miss(View view){
        darts();
    }
    public void returnToPickingTheS(View view){ //method for return button
        finish();
    }
}