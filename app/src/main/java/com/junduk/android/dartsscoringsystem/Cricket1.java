package com.junduk.android.dartsscoringsystem;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Cricket1 extends AppCompatActivity {
    LinearLayout firstPlayer, secondPlayer, thirdPlayer, forthPlayer, fifthPlayer, sixthPlayer;
    RelativeLayout rowOfPoints4, rowOfPoints5, rowOfPoints6, rowOfPoints7;
    ImageView dart1, dart2, dart3;
    Button timesF, timesT, timesTh, missButton, returnButton;
    Button fifteen, sixteen, seventeen, eighteen, nineteen, twenty, twentyFive, fifty;
    TextView playerOne, playerTwo, playerThree, playerFour, playerFive, playerSix, first, second, third, forth, fifth, sixth, roundText;
    TextView player1Twenty, player1Nineteen, player1Eighteen, player1Seventeen, player1Sixteen, player1Fifteen, player1Bull;
    TextView player2Twenty, player2Nineteen, player2Eighteen, player2Seventeen, player2Sixteen, player2Fifteen, player2Bull;
    TextView player3Twenty, player3Nineteen, player3Eighteen, player3Seventeen, player3Sixteen, player3Fifteen, player3Bull;
    TextView player4Twenty, player4Nineteen, player4Eighteen, player4Seventeen, player4Sixteen, player4Fifteen, player4Bull;
    TextView player5Twenty, player5Nineteen, player5Eighteen, player5Seventeen, player5Sixteen, player5Fifteen, player5Bull;
    TextView player6Twenty, player6Nineteen, player6Eighteen, player6Seventeen, player6Sixteen, player6Fifteen, player6Bull;
    Bundle extras;
    Boolean timesTwo, timesThree, timesFour, fourX;
    Boolean gate15, gate16, gate17, gate18, gate19, gate20, gateBull, win;
    int numOfPlayers, round, player, scoreOne, scoreTwo, scoreThree, scoreFour, scoreFive, scoreSix, counter, multiply, hit, winner;
    int sumP1, sumP2, sumP3, sumP4, sumP5, sumP6;
    int[] sums, scores;
    String rnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket1);
        //darts
        dart1 = findViewById(R.id.dart1);
        dart2 = findViewById(R.id.dart2);
        dart3 = findViewById(R.id.dart3);
        //multiplier buttons
        timesF = findViewById(R.id.timesFour);
        timesT = findViewById(R.id.timesTwo);
        timesTh = findViewById(R.id.timesThree);
        //miss button and return button
        missButton = findViewById(R.id.missButton);
        returnButton = findViewById(R.id.returnToPickingParameters);
        //LinearLayout players
        firstPlayer = findViewById(R.id.firstPlayer);
        secondPlayer = findViewById(R.id.secondPlayer);
        thirdPlayer = findViewById(R.id.thirdPlayer);
        forthPlayer = findViewById(R.id.forthPlayer);
        fifthPlayer = findViewById(R.id.fifthPlayer);
        sixthPlayer = findViewById(R.id.sixthPlayer);
        //RelativeLayout rowOfPoints
        rowOfPoints4 = findViewById(R.id.rowOfPoints4);
        rowOfPoints5 = findViewById(R.id.rowOfPoints5);
        rowOfPoints6 = findViewById(R.id.rowOfPoints6);
        rowOfPoints7 = findViewById(R.id.rowOfPoints7);
        //TextView players and round
        playerOne = findViewById(R.id.playerOne);
        playerTwo = findViewById(R.id.playerTwo);
        playerThree = findViewById(R.id.playerThree);
        playerFour = findViewById(R.id.playerFour);
        playerFive = findViewById(R.id.playerFive);
        playerSix = findViewById(R.id.playerSix);
        roundText = findViewById(R.id.roundText);
        //player scores
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        forth = findViewById(R.id.forth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        extras = getIntent().getExtras();
        //TextView hitmarks
        player1Twenty = findViewById(R.id.player1Twenty);
        player1Nineteen = findViewById(R.id.player1Nineteen);
        player1Eighteen = findViewById(R.id.player1Eighteen);
        player1Seventeen = findViewById(R.id.player1Seventeen);
        player1Sixteen = findViewById(R.id.player1Sixteen);
        player1Fifteen = findViewById(R.id.player1Fifteen);
        player1Bull = findViewById(R.id.player1Bull);

        player2Twenty = findViewById(R.id.player2Twenty);
        player2Nineteen = findViewById(R.id.player2Nineteen);
        player2Eighteen = findViewById(R.id.player2Eighteen);
        player2Seventeen = findViewById(R.id.player2Seventeen);
        player2Sixteen = findViewById(R.id.player2Sixteen);
        player2Fifteen = findViewById(R.id.player2Fifteen);
        player2Bull = findViewById(R.id.player2Bull);

        player3Twenty = findViewById(R.id.player3Twenty);
        player3Nineteen = findViewById(R.id.player3Nineteen);
        player3Eighteen = findViewById(R.id.player3Eighteen);
        player3Seventeen = findViewById(R.id.player3Seventeen);
        player3Sixteen = findViewById(R.id.player3Sixteen);
        player3Fifteen = findViewById(R.id.player3Fifteen);
        player3Bull = findViewById(R.id.player3Bull);

        player4Twenty = findViewById(R.id.player4Twenty);
        player4Nineteen = findViewById(R.id.player4Nineteen);
        player4Eighteen = findViewById(R.id.player4Eighteen);
        player4Seventeen = findViewById(R.id.player4Seventeen);
        player4Sixteen = findViewById(R.id.player4Sixteen);
        player4Fifteen = findViewById(R.id.player4Fifteen);
        player4Bull = findViewById(R.id.player4Bull);

        player5Twenty = findViewById(R.id.player5Twenty);
        player5Nineteen = findViewById(R.id.player5Nineteen);
        player5Eighteen = findViewById(R.id.player5Eighteen);
        player5Seventeen = findViewById(R.id.player5Seventeen);
        player5Sixteen = findViewById(R.id.player5Sixteen);
        player5Fifteen = findViewById(R.id.player5Fifteen);
        player5Bull = findViewById(R.id.player5Bull);

        player6Twenty = findViewById(R.id.player6Twenty);
        player6Nineteen = findViewById(R.id.player6Nineteen);
        player6Eighteen = findViewById(R.id.player6Eighteen);
        player6Seventeen = findViewById(R.id.player6Seventeen);
        player6Sixteen = findViewById(R.id.player6Sixteen);
        player6Fifteen = findViewById(R.id.player6Fifteen);
        player6Bull = findViewById(R.id.player6Bull);
        //buttons for scores
        fifteen = findViewById(R.id.fifteen);
        sixteen = findViewById(R.id.sixteen);
        seventeen = findViewById(R.id.seventeen);
        eighteen = findViewById(R.id.eighteen);
        nineteen = findViewById(R.id.nineteen);
        twenty = findViewById(R.id.twenty);
        twentyFive = findViewById(R.id.twentyFive);
        fifty = findViewById(R.id.fifty);
        //making buttons look realistic
        timesT.setBackgroundResource(android.R.drawable.btn_default);
        timesTh.setBackgroundResource(android.R.drawable.btn_default);
        missButton.setBackgroundResource(android.R.drawable.btn_default);
        fifteen.setBackgroundResource(android.R.drawable.btn_default);
        sixteen.setBackgroundResource(android.R.drawable.btn_default);
        seventeen.setBackgroundResource(android.R.drawable.btn_default);
        eighteen.setBackgroundResource(android.R.drawable.btn_default);
        nineteen.setBackgroundResource(android.R.drawable.btn_default);
        twenty.setBackgroundResource(android.R.drawable.btn_default);
        twentyFive.setBackgroundResource(android.R.drawable.btn_default);
        fifty.setBackgroundResource(android.R.drawable.btn_default);
        returnButton.setBackgroundResource(android.R.drawable.btn_default);
        numOfPlayers = extras.getInt("players");
        fourX = extras.getBoolean("timesFour");
        round = 1;
        player = 1;
        scoreOne = 0;
        scoreTwo = 0;
        scoreThree = 0;
        scoreFour = 0;
        scoreFive = 0;
        scoreSix = 0;
        counter = 3;
        multiply = 1;
        hit = 0;
        winner = 0;
        sumP1 = 0;
        sumP2 = 0;
        sumP3 = 0;
        sumP4 = 0;
        sumP5 = 0;
        sumP6 = 0;
        sums = new int[6];
        scores = new int[6];
        gate15 = false;
        gate16 = false;
        gate17 = false;
        gate18 = false;
        gate19 = false;
        gate20 = false;
        gateBull = false;
        win = false;
        rnd = "";
        if (fourX){
            timesF.setBackgroundResource(android.R.drawable.btn_default);
        } else {
            timesF.setVisibility(View.GONE);
        }
        setNumberOfPlayer();
        deleteExtraRowOfPoints();
        first.setBackgroundColor(Color.parseColor("#89cff0"));
    }
    public void dart() { //method that changes the number of darts and checks if someone has finished
        checkEarlyWin();
        if (!win) {
            counter--;
            if (counter == 2) {
                dart3.setVisibility(View.INVISIBLE);
            } else if (counter == 1) {
                dart3.setVisibility(View.INVISIBLE);
                dart2.setVisibility(View.INVISIBLE);
            } else if (counter == 0) {
                if (player == numOfPlayers && round == 20) {
                    dart3.setVisibility(View.VISIBLE);
                    dart2.setVisibility(View.VISIBLE);
                    checkTheEndWinner();
                } else {
                    counter = 3;
                    changingPlayers();
                    rnd = "Round: " + round;
                    roundText.setText(rnd);
                    dart3.setVisibility(View.VISIBLE);
                    dart2.setVisibility(View.VISIBLE);
                }
            }
        }
        timesT.setBackgroundResource(android.R.drawable.btn_default);
        timesTh.setBackgroundResource(android.R.drawable.btn_default);
        timesF.setBackgroundResource(android.R.drawable.btn_default);
        multiply = 1;
    }
    public void changingPlayers(){ //method for changing players after throwing all the darts
        if (player == 1){
            player = 2;
            first.setBackgroundColor(Color.TRANSPARENT);
            second.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (player == 2){
            if (player == numOfPlayers){
                player = 1;
                first.setBackgroundColor(Color.parseColor("#89cff0"));
                second.setBackgroundColor(Color.TRANSPARENT);
                round++;
            } else {
                player = 3;
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.parseColor("#89cff0"));
            }
        } else if (player == 3){
            if (player == numOfPlayers){
                player = 1;
                first.setBackgroundColor(Color.parseColor("#89cff0"));
                third.setBackgroundColor(Color.TRANSPARENT);
                round++;
            } else {
                player = 4;
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.parseColor("#89cff0"));
            }
        } else if (player == 4){
            if (player == numOfPlayers){
                player = 1;
                first.setBackgroundColor(Color.parseColor("#89cff0"));
                forth.setBackgroundColor(Color.TRANSPARENT);
                round++;
            } else {
                player = 5;
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.parseColor("#89cff0"));
            }
        } else if (player == 5){
            if (player == numOfPlayers){
                player = 1;
                first.setBackgroundColor(Color.parseColor("#89cff0"));
                fifth.setBackgroundColor(Color.TRANSPARENT);
                round++;
            } else {
                player = 6;
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.parseColor("#89cff0"));
            }
        } else if (player == 6){
            player = 1;
            sixth.setBackgroundColor(Color.TRANSPARENT);
            first.setBackgroundColor(Color.parseColor("#89cff0"));
            round++;
        }
    }
    public void missButton(View view){
        dart();
    }
    public void buttonTwenty(View view){
        hit = 20;
        markHitPoint();
    }
    public void buttonNineteen(View view){
        hit = 19;
        markHitPoint();
    }
    public void buttonEighteen(View view){
        hit = 18;
        markHitPoint();
    }
    public void buttonSeventeen(View view){
        hit = 17;
        markHitPoint();
    }
    public void buttonSixteen(View view){
        hit = 16;
        markHitPoint();
    }
    public void buttonFifteen(View view){
        hit = 15;
        markHitPoint();
    }
    public void buttonTwentyFive(View view){
        hit = 25;
        markHitPoint();
    }
    public void buttonFifty(View view){
        hit = 50;
        markHitPoint();
    }
    public void markHitPoint(){ //marks the spot of a number someone has hit or adds the score if the gate is done
        if (player == 1){
            if (hit == 15) {
                if (multiply == 1) {
                    if (!player1Fifteen.getText().equals("xxx")) {
                        String i = player1Fifteen.getText() + "x";
                        player1Fifteen.setText(i);
                        sumP1 += 15;
                        checkGate15();
                        dart();
                    } else {
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player1Fifteen.getText().equals("xxx") && !player1Fifteen.getText().equals("xx")) {
                        String i = player1Fifteen.getText() + "xx";
                        player1Fifteen.setText(i);
                        sumP1 += 30;
                        checkGate15();
                        dart();
                    } else if (player1Fifteen.getText().equals("xx")) {
                        String i = player1Fifteen.getText() + "x";
                        player1Fifteen.setText(i);
                        sumP1 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player1Fifteen.getText().equals("")) {
                        String i = player1Fifteen.getText() + "xxx";
                        player1Fifteen.setText(i);
                        sumP1 += 45;
                        checkGate15();
                        dart();
                    } else if (player1Fifteen.getText().equals("x")) {
                        String i = player1Fifteen.getText() + "xx";
                        player1Fifteen.setText(i);
                        sumP1 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player1Fifteen.getText().equals("xx")) {
                        String i = player1Fifteen.getText() + "x";
                        player1Fifteen.setText(i);
                        sumP1 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player1Fifteen.getText().equals("")) {
                        String i = player1Fifteen.getText() + "xxx";
                        player1Fifteen.setText(i);
                        sumP1 += 45;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player1Fifteen.getText().equals("x")) {
                        String i = player1Fifteen.getText() + "xx";
                        player1Fifteen.setText(i);
                        sumP1 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else if (player1Fifteen.getText().equals("xx")) {
                        String i = player1Fifteen.getText() + "x";
                        player1Fifteen.setText(i);
                        sumP1 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(60);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 16){
                    if (multiply == 1) {
                        if (!player1Sixteen.getText().equals("xxx")) {
                            String i = player1Sixteen.getText() + "x";
                            player1Sixteen.setText(i);
                            sumP1 += 16;
                            checkGate16();
                            dart();
                        } else {
                            if (!gate16) {
                                add(16);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 2) {
                        if (!player1Sixteen.getText().equals("xxx") && !player1Sixteen.getText().equals("xx")) {
                            String i = player1Sixteen.getText() + "xx";
                            player1Sixteen.setText(i);
                            sumP1 += 32;
                            checkGate16();
                            dart();
                        } else if (player1Sixteen.getText().equals("xx")){
                            String i = player1Sixteen.getText() + "x";
                            player1Sixteen.setText(i);
                            sumP1 += 16;
                            checkGate16();
                            if (!gate16) {
                                add(16);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate16) {
                                add(32);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 3){
                        if (player1Sixteen.getText().equals("")) {
                            String i = player1Sixteen.getText() + "xxx";
                            player1Sixteen.setText(i);
                            sumP1 += 48;
                            checkGate16();
                            dart();
                        } else if (player1Sixteen.getText().equals("x")){
                            String i = player1Sixteen.getText() + "xx";
                            player1Sixteen.setText(i);
                            sumP1 += 32;
                            checkGate16();
                            if (!gate16) {
                                add(16);
                            } else {
                                dart();
                            }
                        } else if (player1Sixteen.getText().equals("xx")){
                            String i = player1Sixteen.getText() + "x";
                            player1Sixteen.setText(i);
                            sumP1 += 16;
                            checkGate16();
                            if (!gate16) {
                                add(32);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate16) {
                                add(48);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 4){
                        if (player1Sixteen.getText().equals("")) {
                            String i = player1Sixteen.getText() + "xxx";
                            player1Sixteen.setText(i);
                            sumP1 += 48;
                            checkGate16();
                            if (!gate16) {
                                add(16);
                            } else {
                                dart();
                            }
                        } else if (player1Sixteen.getText().equals("x")){
                            String i = player1Sixteen.getText() + "xx";
                            player1Sixteen.setText(i);
                            sumP1 += 32;
                            checkGate16();
                            if (!gate16) {
                                add(32);
                            } else {
                                dart();
                            }
                        } else if (player1Sixteen.getText().equals("xx")){
                            String i = player1Sixteen.getText() + "x";
                            player1Sixteen.setText(i);
                            sumP1 += 16;
                            checkGate16();
                            if (!gate16) {
                                add(48);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate16) {
                                add(64);
                            } else {
                                dart();
                            }
                        }
                    }
            } else if (hit == 17){
                    if (multiply == 1) {
                        if (!player1Seventeen.getText().equals("xxx")) {
                            String i = player1Seventeen.getText() + "x";
                            player1Seventeen.setText(i);
                            sumP1 += 17;
                            checkGate17();
                            dart();
                        } else {
                            if (!gate17) {
                                add(17);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 2) {
                        if (!player1Seventeen.getText().equals("xxx") && !player1Seventeen.getText().equals("xx")) {
                            String i = player1Seventeen.getText() + "xx";
                            player1Seventeen.setText(i);
                            sumP1 += 34;
                            checkGate17();
                            dart();
                        } else if (player1Seventeen.getText().equals("xx")){
                            String i = player1Seventeen.getText() + "x";
                            player1Seventeen.setText(i);
                            sumP1 += 17;
                            checkGate17();
                            if (!gate17) {
                                add(17);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate17) {
                                add(34);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 3){
                        if (player1Seventeen.getText().equals("")) {
                            String i = player1Seventeen.getText() + "xxx";
                            player1Seventeen.setText(i);
                            sumP1 += 51;
                            checkGate17();
                            dart();
                        } else if (player1Seventeen.getText().equals("x")){
                            String i = player1Seventeen.getText() + "xx";
                            player1Seventeen.setText(i);
                            sumP1 += 34;
                            checkGate17();
                            if (!gate17) {
                                add(17);
                            } else {
                                dart();
                            }
                        } else if (player1Seventeen.getText().equals("xx")){
                            String i = player1Seventeen.getText() + "x";
                            player1Seventeen.setText(i);
                            sumP1 += 17;
                            checkGate17();
                            if (!gate17) {
                                add(34);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate17) {
                                add(51);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 4){
                        if (player1Seventeen.getText().equals("")) {
                            String i = player1Seventeen.getText() + "xxx";
                            player1Seventeen.setText(i);
                            sumP1 += 51;
                            checkGate17();
                            if (!gate17) {
                                add(17);
                            } else {
                                dart();
                            }
                        } else if (player1Seventeen.getText().equals("x")){
                            String i = player1Seventeen.getText() + "xx";
                            player1Seventeen.setText(i);
                            sumP1 += 34;
                            checkGate17();
                            if (!gate17) {
                                add(34);
                            } else {
                                dart();
                            }
                        } else if (player1Seventeen.getText().equals("xx")){
                            String i = player1Seventeen.getText() + "x";
                            player1Seventeen.setText(i);
                            sumP1 += 17;
                            checkGate17();
                            if (!gate17) {
                                add(51);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate17) {
                                add(68);
                            } else {
                                dart();
                            }
                        }
                    }
            } else if (hit == 18){
                    if (multiply == 1) {
                        if (!player1Eighteen.getText().equals("xxx")) {
                            String i = player1Eighteen.getText() + "x";
                            player1Eighteen.setText(i);
                            sumP1 += 18;
                            checkGate18();
                            dart();
                        } else {
                            if (!gate18) {
                                add(18);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 2) {
                        if (!player1Eighteen.getText().equals("xxx") && !player1Eighteen.getText().equals("xx")) {
                            String i = player1Eighteen.getText() + "xx";
                            player1Eighteen.setText(i);
                            sumP1 += 36;
                            checkGate18();
                            dart();
                        } else if (player1Eighteen.getText().equals("xx")){
                            String i = player1Eighteen.getText() + "x";
                            player1Eighteen.setText(i);
                            sumP1 += 18;
                            checkGate18();
                            if (!gate18) {
                                add(18);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate18) {
                                add(36);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 3){
                        if (player1Eighteen.getText().equals("")) {
                            String i = player1Eighteen.getText() + "xxx";
                            player1Eighteen.setText(i);
                            sumP1 += 54;
                            checkGate18();
                            dart();
                        } else if (player1Eighteen.getText().equals("x")){
                            String i = player1Eighteen.getText() + "xx";
                            player1Eighteen.setText(i);
                            sumP1 += 36;
                            checkGate18();
                            if (!gate18) {
                                add(18);
                            } else {
                                dart();
                            }
                        } else if (player1Eighteen.getText().equals("xx")){
                            String i = player1Eighteen.getText() + "x";
                            player1Eighteen.setText(i);
                            sumP1 += 18;
                            checkGate18();
                            if (!gate18) {
                                add(36);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate18) {
                                add(54);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 4){
                        if (player1Eighteen.getText().equals("")) {
                            String i = player1Eighteen.getText() + "xxx";
                            player1Eighteen.setText(i);
                            sumP1 += 54;
                            checkGate18();
                            if (!gate18) {
                                add(18);
                            } else {
                                dart();
                            }
                        } else if (player1Eighteen.getText().equals("x")){
                            String i = player1Eighteen.getText() + "xx";
                            player1Eighteen.setText(i);
                            sumP1 += 36;
                            checkGate18();
                            if (!gate18) {
                                add(36);
                            } else {
                                dart();
                            }
                        } else if (player1Eighteen.getText().equals("xx")){
                            String i = player1Eighteen.getText() + "x";
                            player1Eighteen.setText(i);
                            sumP1 += 18;
                            checkGate18();
                            if (!gate18) {
                                add(54);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate18) {
                                add(72);
                            } else {
                                dart();
                            }
                        }
                    }
            } else if (hit == 19){
                    if (multiply == 1) {
                        if (!player1Nineteen.getText().equals("xxx")) {
                            String i = player1Nineteen.getText() + "x";
                            player1Nineteen.setText(i);
                            sumP1 += 19;
                            checkGate19();
                            dart();
                        } else {
                            if (!gate19) {
                                add(19);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 2) {
                        if (!player1Nineteen.getText().equals("xxx") && !player1Nineteen.getText().equals("xx")) {
                            String i = player1Nineteen.getText() + "xx";
                            player1Nineteen.setText(i);
                            sumP1 += 38;
                            checkGate19();
                            dart();
                        } else if (player1Nineteen.getText().equals("xx")){
                            String i = player1Nineteen.getText() + "x";
                            player1Nineteen.setText(i);
                            sumP1 += 19;
                            checkGate19();
                            if (!gate19) {
                                add(19);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate19) {
                                add(38);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 3){
                        if (player1Nineteen.getText().equals("")) {
                            String i = player1Nineteen.getText() + "xxx";
                            player1Nineteen.setText(i);
                            sumP1 += 57;
                            checkGate19();
                            dart();
                        } else if (player1Nineteen.getText().equals("x")){
                            String i = player1Nineteen.getText() + "xx";
                            player1Nineteen.setText(i);
                            sumP1 += 38;
                            checkGate19();
                            if (!gate19) {
                                add(19);
                            } else {
                                dart();
                            }
                        } else if (player1Nineteen.getText().equals("xx")){
                            String i = player1Nineteen.getText() + "x";
                            player1Nineteen.setText(i);
                            sumP1 += 19;
                            checkGate19();
                            if (!gate19) {
                                add(38);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate19) {
                                add(57);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 4){
                        if (player1Nineteen.getText().equals("")) {
                            String i = player1Nineteen.getText() + "xxx";
                            player1Nineteen.setText(i);
                            sumP1 += 57;
                            checkGate19();
                            if (!gate19) {
                                add(19);
                            } else {
                                dart();
                            }
                        } else if (player1Nineteen.getText().equals("x")){
                            String i = player1Nineteen.getText() + "xx";
                            player1Nineteen.setText(i);
                            sumP1 += 38;
                            checkGate19();
                            if (!gate19) {
                                add(38);
                            } else {
                                dart();
                            }
                        } else if (player1Nineteen.getText().equals("xx")){
                            String i = player1Nineteen.getText() + "x";
                            player1Nineteen.setText(i);
                            sumP1 += 19;
                            checkGate19();
                            if (!gate19) {
                                add(57);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate19) {
                                add(76);
                            } else {
                                dart();
                            }
                        }
                    }
            } else if (hit == 20){
                    if (multiply == 1) {
                        if (!player1Twenty.getText().equals("xxx")) {
                            String i = player1Twenty.getText() + "x";
                            player1Twenty.setText(i);
                            sumP1 += 20;
                            checkGate20();
                            dart();
                        } else {
                            if (!gate20) {
                                add(20);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 2) {
                        if (!player1Twenty.getText().equals("xxx") && !player1Twenty.getText().equals("xx")) {
                            String i = player1Twenty.getText() + "xx";
                            player1Twenty.setText(i);
                            sumP1 += 40;
                            checkGate20();
                            dart();
                        } else if (player1Twenty.getText().equals("xx")){
                            String i = player1Twenty.getText() + "x";
                            player1Twenty.setText(i);
                            sumP1 += 20;
                            checkGate20();
                            if (!gate20) {
                                add(20);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate20) {
                                add(40);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 3){
                        if (player1Twenty.getText().equals("")) {
                            String i = player1Twenty.getText() + "xxx";
                            player1Twenty.setText(i);
                            sumP1 += 60;
                            checkGate20();
                            dart();
                        } else if (player1Twenty.getText().equals("x")){
                            String i = player1Twenty.getText() + "xx";
                            player1Twenty.setText(i);
                            sumP1 += 40;
                            checkGate20();
                            if (!gate20) {
                                add(20);
                            } else {
                                dart();
                            }
                        } else if (player1Twenty.getText().equals("xx")){
                            String i = player1Twenty.getText() + "x";
                            player1Twenty.setText(i);
                            sumP1 += 20;
                            checkGate20();
                            if (!gate20) {
                                add(40);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate20) {
                                add(60);
                            } else {
                                dart();
                            }
                        }
                    } else if (multiply == 4){
                        if (player1Twenty.getText().equals("")) {
                            String i = player1Twenty.getText() + "xxx";
                            player1Twenty.setText(i);
                            sumP1 += 60;
                            checkGate20();
                            if (!gate20) {
                                add(20);
                            } else {
                                dart();
                            }
                        } else if (player1Twenty.getText().equals("x")){
                            String i = player1Twenty.getText() + "xx";
                            player1Twenty.setText(i);
                            sumP1 += 40;
                            checkGate20();
                            if (!gate20) {
                                add(40);
                            } else {
                                dart();
                            }
                        } else if (player1Twenty.getText().equals("xx")){
                            String i = player1Twenty.getText() + "x";
                            player1Twenty.setText(i);
                            sumP1 += 20;
                            checkGate20();
                            if (!gate20) {
                                add(60);
                            } else {
                                dart();
                            }
                        } else {
                            if (!gate20) {
                                add(80);
                            } else {
                                dart();
                            }
                        }
                    }
            } else if (hit == 25){
                    if (!player1Bull.getText().equals("xxx")) {
                        String i = player1Bull.getText() + "x";
                        player1Bull.setText(i);
                        sumP1 += 25;
                        checkGateBull();
                        dart();
                    } else {
                        if (!gateBull) {
                            add(25);
                        } else {
                            dart();
                        }
                    }
            } else if (hit == 50) {
                if (!player1Bull.getText().equals("xxx") && !player1Bull.getText().equals("xx")) {
                    String i = player1Bull.getText() + "xx";
                    player1Bull.setText(i);
                    sumP1 += 50;
                    checkGateBull();
                    dart();
                } else if (player1Bull.getText().equals("xx")) {
                    String i = player1Bull.getText() + "x";
                    player1Bull.setText(i);
                    sumP1 += 25;
                    checkGateBull();
                    if (!gateBull) {
                        add(25);
                    } else {
                        dart();
                    }
                } else {
                    if (!gateBull) {
                        add(50);
                    } else {
                        dart();
                    }
                }
            }
            //second player
        } else if (player == 2){
            if (hit == 15) {
                if (multiply == 1) {
                    if (!player2Fifteen.getText().equals("xxx")) {
                        String i = player2Fifteen.getText() + "x";
                        player2Fifteen.setText(i);
                        sumP2 += 15;
                        checkGate15();
                        dart();
                    } else {
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player2Fifteen.getText().equals("xxx") && !player2Fifteen.getText().equals("xx")) {
                        String i = player2Fifteen.getText() + "xx";
                        player2Fifteen.setText(i);
                        sumP2 += 30;
                        checkGate15();
                        dart();
                    } else if (player2Fifteen.getText().equals("xx")) {
                        String i = player2Fifteen.getText() + "x";
                        player2Fifteen.setText(i);
                        sumP2 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player2Fifteen.getText().equals("")) {
                        String i = player2Fifteen.getText() + "xxx";
                        player2Fifteen.setText(i);
                        sumP2 += 45;
                        checkGate15();
                        dart();
                    } else if (player2Fifteen.getText().equals("x")) {
                        String i = player2Fifteen.getText() + "xx";
                        player2Fifteen.setText(i);
                        sumP2 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player2Fifteen.getText().equals("xx")) {
                        String i = player2Fifteen.getText() + "x";
                        player2Fifteen.setText(i);
                        sumP2 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player2Fifteen.getText().equals("")) {
                        String i = player2Fifteen.getText() + "xxx";
                        player2Fifteen.setText(i);
                        sumP2 += 45;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player2Fifteen.getText().equals("x")) {
                        String i = player2Fifteen.getText() + "xx";
                        player2Fifteen.setText(i);
                        sumP2 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else if (player2Fifteen.getText().equals("xx")) {
                        String i = player2Fifteen.getText() + "x";
                        player2Fifteen.setText(i);
                        sumP2 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(60);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 16) {
                if (multiply == 1) {
                    if (!player2Sixteen.getText().equals("xxx")) {
                        String i = player2Sixteen.getText() + "x";
                        player2Sixteen.setText(i);
                        sumP2 += 16;
                        checkGate16();
                        dart();
                    } else {
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player2Sixteen.getText().equals("xxx") && !player2Sixteen.getText().equals("xx")) {
                        String i = player2Sixteen.getText() + "xx";
                        player2Sixteen.setText(i);
                        sumP2 += 32;
                        checkGate16();
                        dart();
                    } else if (player2Sixteen.getText().equals("xx")) {
                        String i = player2Sixteen.getText() + "x";
                        player2Sixteen.setText(i);
                        sumP2 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player2Sixteen.getText().equals("")) {
                        String i = player2Sixteen.getText() + "xxx";
                        player2Sixteen.setText(i);
                        sumP2 += 48;
                        checkGate16();
                        dart();
                    } else if (player2Sixteen.getText().equals("x")) {
                        String i = player2Sixteen.getText() + "xx";
                        player2Sixteen.setText(i);
                        sumP2 += 32;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else if (player2Sixteen.getText().equals("xx")) {
                        String i = player2Sixteen.getText() + "x";
                        player2Sixteen.setText(i);
                        sumP2 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(48);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player2Sixteen.getText().equals("")) {
                        String i = player2Sixteen.getText() + "xxx";
                        player2Sixteen.setText(i);
                        sumP2 += 48;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else if (player2Sixteen.getText().equals("x")) {
                        String i = player2Sixteen.getText() + "xx";
                        player2Sixteen.setText(i);
                        sumP2 += 32;
                        checkGate16();
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    } else if (player2Sixteen.getText().equals("xx")) {
                        String i = player2Sixteen.getText() + "x";
                        player2Sixteen.setText(i);
                        sumP2 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(48);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(64);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 17) {
                if (multiply == 1) {
                    if (!player2Seventeen.getText().equals("xxx")) {
                        String i = player2Seventeen.getText() + "x";
                        player2Seventeen.setText(i);
                        sumP2 += 17;
                        checkGate17();
                        dart();
                    } else {
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player2Seventeen.getText().equals("xxx") && !player2Seventeen.getText().equals("xx")) {
                        String i = player2Seventeen.getText() + "xx";
                        player2Seventeen.setText(i);
                        sumP2 += 34;
                        checkGate17();
                        dart();
                    } else if (player2Seventeen.getText().equals("xx")) {
                        String i = player2Seventeen.getText() + "x";
                        player2Seventeen.setText(i);
                        sumP2 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player2Seventeen.getText().equals("")) {
                        String i = player2Seventeen.getText() + "xxx";
                        player2Seventeen.setText(i);
                        sumP2 += 51;
                        checkGate17();
                        dart();
                    } else if (player2Seventeen.getText().equals("x")) {
                        String i = player2Seventeen.getText() + "xx";
                        player2Seventeen.setText(i);
                        sumP2 += 34;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else if (player2Seventeen.getText().equals("xx")) {
                        String i = player2Seventeen.getText() + "x";
                        player2Seventeen.setText(i);
                        sumP2 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(51);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player2Seventeen.getText().equals("")) {
                        String i = player2Seventeen.getText() + "xxx";
                        player2Seventeen.setText(i);
                        sumP2 += 51;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else if (player2Seventeen.getText().equals("x")) {
                        String i = player2Seventeen.getText() + "xx";
                        player2Seventeen.setText(i);
                        sumP2 += 34;
                        checkGate17();
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    } else if (player2Seventeen.getText().equals("xx")) {
                        String i = player2Seventeen.getText() + "x";
                        player2Seventeen.setText(i);
                        sumP2 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(51);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(68);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 18) {
                if (multiply == 1) {
                    if (!player2Eighteen.getText().equals("xxx")) {
                        String i = player2Eighteen.getText() + "x";
                        player2Eighteen.setText(i);
                        sumP2 += 18;
                        checkGate18();
                        dart();
                    } else {
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player2Eighteen.getText().equals("xxx") && !player2Eighteen.getText().equals("xx")) {
                        String i = player2Eighteen.getText() + "xx";
                        player2Eighteen.setText(i);
                        sumP2 += 36;
                        checkGate18();
                        dart();
                    } else if (player2Eighteen.getText().equals("xx")) {
                        String i = player2Eighteen.getText() + "x";
                        player2Eighteen.setText(i);
                        sumP2 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player2Eighteen.getText().equals("")) {
                        String i = player2Eighteen.getText() + "xxx";
                        player2Eighteen.setText(i);
                        sumP2 += 54;
                        checkGate18();
                        dart();
                    } else if (player2Eighteen.getText().equals("x")) {
                        String i = player2Eighteen.getText() + "xx";
                        player2Eighteen.setText(i);
                        sumP2 += 36;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else if (player2Eighteen.getText().equals("xx")) {
                        String i = player2Eighteen.getText() + "x";
                        player2Eighteen.setText(i);
                        sumP2 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(54);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player2Eighteen.getText().equals("")) {
                        String i = player2Eighteen.getText() + "xxx";
                        player2Eighteen.setText(i);
                        sumP2 += 54;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else if (player2Eighteen.getText().equals("x")) {
                        String i = player2Eighteen.getText() + "xx";
                        player2Eighteen.setText(i);
                        sumP2 += 36;
                        checkGate18();
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    } else if (player2Eighteen.getText().equals("xx")) {
                        String i = player2Eighteen.getText() + "x";
                        player2Eighteen.setText(i);
                        sumP2 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(54);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(72);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 19) {
                if (multiply == 1) {
                    if (!player2Nineteen.getText().equals("xxx")) {
                        String i = player2Nineteen.getText() + "x";
                        player2Nineteen.setText(i);
                        sumP2 += 19;
                        checkGate19();
                        dart();
                    } else {
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player2Nineteen.getText().equals("xxx") && !player2Nineteen.getText().equals("xx")) {
                        String i = player2Nineteen.getText() + "xx";
                        player2Nineteen.setText(i);
                        sumP2 += 38;
                        checkGate19();
                        dart();
                    } else if (player2Nineteen.getText().equals("xx")) {
                        String i = player2Nineteen.getText() + "x";
                        player2Nineteen.setText(i);
                        sumP2 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player2Nineteen.getText().equals("")) {
                        String i = player2Nineteen.getText() + "xxx";
                        player2Nineteen.setText(i);
                        sumP2 += 57;
                        checkGate19();
                        dart();
                    } else if (player2Nineteen.getText().equals("x")) {
                        String i = player2Nineteen.getText() + "xx";
                        player2Nineteen.setText(i);
                        sumP2 += 38;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else if (player2Nineteen.getText().equals("xx")) {
                        String i = player2Nineteen.getText() + "x";
                        player2Nineteen.setText(i);
                        sumP2 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(57);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player2Nineteen.getText().equals("")) {
                        String i = player2Nineteen.getText() + "xxx";
                        player2Nineteen.setText(i);
                        sumP2 += 57;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else if (player2Nineteen.getText().equals("x")) {
                        String i = player2Nineteen.getText() + "xx";
                        player2Nineteen.setText(i);
                        sumP2 += 38;
                        checkGate19();
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    } else if (player2Nineteen.getText().equals("xx")) {
                        String i = player2Nineteen.getText() + "x";
                        player2Nineteen.setText(i);
                        sumP2 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(57);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(76);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 20) {
                if (multiply == 1) {
                    if (!player2Twenty.getText().equals("xxx")) {
                        String i = player2Twenty.getText() + "x";
                        player2Twenty.setText(i);
                        sumP2 += 20;
                        checkGate20();
                        dart();
                    } else {
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player2Twenty.getText().equals("xxx") && !player2Twenty.getText().equals("xx")) {
                        String i = player2Twenty.getText() + "xx";
                        player2Twenty.setText(i);
                        sumP2 += 40;
                        checkGate20();
                        dart();
                    } else if (player2Twenty.getText().equals("xx")) {
                        String i = player2Twenty.getText() + "x";
                        player2Twenty.setText(i);
                        sumP2 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player2Twenty.getText().equals("")) {
                        String i = player2Twenty.getText() + "xxx";
                        player2Twenty.setText(i);
                        sumP2 += 60;
                        checkGate20();
                        dart();
                    } else if (player2Twenty.getText().equals("x")) {
                        String i = player2Twenty.getText() + "xx";
                        player2Twenty.setText(i);
                        sumP2 += 40;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else if (player2Twenty.getText().equals("xx")) {
                        String i = player2Twenty.getText() + "x";
                        player2Twenty.setText(i);
                        sumP2 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(60);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player2Twenty.getText().equals("")) {
                        String i = player2Twenty.getText() + "xxx";
                        player2Twenty.setText(i);
                        sumP2 += 60;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else if (player2Twenty.getText().equals("x")) {
                        String i = player2Twenty.getText() + "xx";
                        player2Twenty.setText(i);
                        sumP2 += 40;
                        checkGate20();
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    } else if (player2Twenty.getText().equals("xx")) {
                        String i = player2Twenty.getText() + "x";
                        player2Twenty.setText(i);
                        sumP2 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(60);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(80);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 25) {
                if (!player2Bull.getText().equals("xxx")) {
                    String i = player2Bull.getText() + "x";
                    player2Bull.setText(i);
                    sumP2 += 25;
                    checkGateBull();
                    dart();
                } else {
                    if (!gateBull) {
                        add(25);
                    } else {
                        dart();
                    }
                }
            } else if (hit == 50) {
                if (!player2Bull.getText().equals("xxx") && !player2Bull.getText().equals("xx")) {
                    String i = player2Bull.getText() + "xx";
                    player2Bull.setText(i);
                    sumP2 += 50;
                    checkGateBull();
                    dart();
                } else if (player2Bull.getText().equals("xx")) {
                    String i = player2Bull.getText() + "x";
                    player2Bull.setText(i);
                    sumP2 += 25;
                    checkGateBull();
                    if (!gateBull) {
                        add(25);
                    } else {
                        dart();
                    }
                } else {
                    if (!gateBull) {
                        add(50);
                    } else {
                        dart();
                    }
                }
            }
        }
        //third player
        else if (player == 3){
            if (hit == 15) {
                if (multiply == 1) {
                    if (!player3Fifteen.getText().equals("xxx")) {
                        String i = player3Fifteen.getText() + "x";
                        player3Fifteen.setText(i);
                        sumP3 += 15;
                        checkGate15();
                        dart();
                    } else {
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player3Fifteen.getText().equals("xxx") && !player3Fifteen.getText().equals("xx")) {
                        String i = player3Fifteen.getText() + "xx";
                        player3Fifteen.setText(i);
                        sumP3 += 30;
                        checkGate15();
                        dart();
                    } else if (player3Fifteen.getText().equals("xx")) {
                        String i = player3Fifteen.getText() + "x";
                        player3Fifteen.setText(i);
                        sumP3 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player3Fifteen.getText().equals("")) {
                        String i = player3Fifteen.getText() + "xxx";
                        player3Fifteen.setText(i);
                        sumP3 += 45;
                        checkGate15();
                        dart();
                    } else if (player3Fifteen.getText().equals("x")) {
                        String i = player3Fifteen.getText() + "xx";
                        player3Fifteen.setText(i);
                        sumP3 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player3Fifteen.getText().equals("xx")) {
                        String i = player3Fifteen.getText() + "x";
                        player3Fifteen.setText(i);
                        sumP3 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player3Fifteen.getText().equals("")) {
                        String i = player3Fifteen.getText() + "xxx";
                        player3Fifteen.setText(i);
                        sumP3 += 45;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player3Fifteen.getText().equals("x")) {
                        String i = player3Fifteen.getText() + "xx";
                        player3Fifteen.setText(i);
                        sumP3 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else if (player3Fifteen.getText().equals("xx")) {
                        String i = player3Fifteen.getText() + "x";
                        player3Fifteen.setText(i);
                        sumP3 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(60);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 16) {
                if (multiply == 1) {
                    if (!player3Sixteen.getText().equals("xxx")) {
                        String i = player3Sixteen.getText() + "x";
                        player3Sixteen.setText(i);
                        sumP3 += 16;
                        checkGate16();
                        dart();
                    } else {
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player3Sixteen.getText().equals("xxx") && !player3Sixteen.getText().equals("xx")) {
                        String i = player3Sixteen.getText() + "xx";
                        player3Sixteen.setText(i);
                        sumP3 += 32;
                        checkGate16();
                        dart();
                    } else if (player3Sixteen.getText().equals("xx")) {
                        String i = player3Sixteen.getText() + "x";
                        player3Sixteen.setText(i);
                        sumP3 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player3Sixteen.getText().equals("")) {
                        String i = player3Sixteen.getText() + "xxx";
                        player3Sixteen.setText(i);
                        sumP3 += 48;
                        checkGate16();
                        dart();
                    } else if (player3Sixteen.getText().equals("x")) {
                        String i = player3Sixteen.getText() + "xx";
                        player3Sixteen.setText(i);
                        sumP3 += 32;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else if (player3Sixteen.getText().equals("xx")) {
                        String i = player3Sixteen.getText() + "x";
                        player3Sixteen.setText(i);
                        sumP3 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(48);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player3Sixteen.getText().equals("")) {
                        String i = player3Sixteen.getText() + "xxx";
                        player3Sixteen.setText(i);
                        sumP3 += 48;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else if (player3Sixteen.getText().equals("x")) {
                        String i = player3Sixteen.getText() + "xx";
                        player3Sixteen.setText(i);
                        sumP3 += 32;
                        checkGate16();
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    } else if (player3Sixteen.getText().equals("xx")) {
                        String i = player3Sixteen.getText() + "x";
                        player3Sixteen.setText(i);
                        sumP3 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(48);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(64);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 17) {
                if (multiply == 1) {
                    if (!player3Seventeen.getText().equals("xxx")) {
                        String i = player3Seventeen.getText() + "x";
                        player3Seventeen.setText(i);
                        sumP3 += 17;
                        checkGate17();
                        dart();
                    } else {
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player3Seventeen.getText().equals("xxx") && !player3Seventeen.getText().equals("xx")) {
                        String i = player3Seventeen.getText() + "xx";
                        player3Seventeen.setText(i);
                        sumP3 += 34;
                        checkGate17();
                        dart();
                    } else if (player3Seventeen.getText().equals("xx")) {
                        String i = player3Seventeen.getText() + "x";
                        player3Seventeen.setText(i);
                        sumP3 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player3Seventeen.getText().equals("")) {
                        String i = player3Seventeen.getText() + "xxx";
                        player3Seventeen.setText(i);
                        sumP3 += 51;
                        checkGate17();
                        dart();
                    } else if (player3Seventeen.getText().equals("x")) {
                        String i = player3Seventeen.getText() + "xx";
                        player3Seventeen.setText(i);
                        sumP3 += 34;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else if (player3Seventeen.getText().equals("xx")) {
                        String i = player3Seventeen.getText() + "x";
                        player3Seventeen.setText(i);
                        sumP3 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(51);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player3Seventeen.getText().equals("")) {
                        String i = player3Seventeen.getText() + "xxx";
                        player3Seventeen.setText(i);
                        sumP3 += 51;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else if (player3Seventeen.getText().equals("x")) {
                        String i = player3Seventeen.getText() + "xx";
                        player3Seventeen.setText(i);
                        sumP3 += 34;
                        checkGate17();
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    } else if (player3Seventeen.getText().equals("xx")) {
                        String i = player3Seventeen.getText() + "x";
                        player3Seventeen.setText(i);
                        sumP3 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(51);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(68);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 18) {
                if (multiply == 1) {
                    if (!player3Eighteen.getText().equals("xxx")) {
                        String i = player3Eighteen.getText() + "x";
                        player3Eighteen.setText(i);
                        sumP3 += 18;
                        checkGate18();
                        dart();
                    } else {
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player3Eighteen.getText().equals("xxx") && !player3Eighteen.getText().equals("xx")) {
                        String i = player3Eighteen.getText() + "xx";
                        player3Eighteen.setText(i);
                        sumP3 += 36;
                        checkGate18();
                        dart();
                    } else if (player3Eighteen.getText().equals("xx")) {
                        String i = player3Eighteen.getText() + "x";
                        player3Eighteen.setText(i);
                        sumP3 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player3Eighteen.getText().equals("")) {
                        String i = player3Eighteen.getText() + "xxx";
                        player3Eighteen.setText(i);
                        sumP3 += 54;
                        checkGate18();
                        dart();
                    } else if (player3Eighteen.getText().equals("x")) {
                        String i = player3Eighteen.getText() + "xx";
                        player3Eighteen.setText(i);
                        sumP3 += 36;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else if (player3Eighteen.getText().equals("xx")) {
                        String i = player3Eighteen.getText() + "x";
                        player3Eighteen.setText(i);
                        sumP3 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(54);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player3Eighteen.getText().equals("")) {
                        String i = player3Eighteen.getText() + "xxx";
                        player3Eighteen.setText(i);
                        sumP3 += 54;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else if (player3Eighteen.getText().equals("x")) {
                        String i = player3Eighteen.getText() + "xx";
                        player3Eighteen.setText(i);
                        sumP3 += 36;
                        checkGate18();
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    } else if (player3Eighteen.getText().equals("xx")) {
                        String i = player3Eighteen.getText() + "x";
                        player3Eighteen.setText(i);
                        sumP3 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(54);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(72);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 19) {
                if (multiply == 1) {
                    if (!player3Nineteen.getText().equals("xxx")) {
                        String i = player3Nineteen.getText() + "x";
                        player3Nineteen.setText(i);
                        sumP3 += 19;
                        checkGate19();
                        dart();
                    } else {
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player3Nineteen.getText().equals("xxx") && !player3Nineteen.getText().equals("xx")) {
                        String i = player3Nineteen.getText() + "xx";
                        player3Nineteen.setText(i);
                        sumP3 += 38;
                        checkGate19();
                        dart();
                    } else if (player3Nineteen.getText().equals("xx")) {
                        String i = player3Nineteen.getText() + "x";
                        player3Nineteen.setText(i);
                        sumP3 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player3Nineteen.getText().equals("")) {
                        String i = player3Nineteen.getText() + "xxx";
                        player3Nineteen.setText(i);
                        sumP3 += 57;
                        checkGate19();
                        dart();
                    } else if (player3Nineteen.getText().equals("x")) {
                        String i = player3Nineteen.getText() + "xx";
                        player3Nineteen.setText(i);
                        sumP3 += 38;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else if (player3Nineteen.getText().equals("xx")) {
                        String i = player3Nineteen.getText() + "x";
                        player3Nineteen.setText(i);
                        sumP3 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(57);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player3Nineteen.getText().equals("")) {
                        String i = player3Nineteen.getText() + "xxx";
                        player3Nineteen.setText(i);
                        sumP3 += 57;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else if (player3Nineteen.getText().equals("x")) {
                        String i = player3Nineteen.getText() + "xx";
                        player3Nineteen.setText(i);
                        sumP3 += 38;
                        checkGate19();
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    } else if (player3Nineteen.getText().equals("xx")) {
                        String i = player3Nineteen.getText() + "x";
                        player3Nineteen.setText(i);
                        sumP3 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(57);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(76);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 20) {
                if (multiply == 1) {
                    if (!player3Twenty.getText().equals("xxx")) {
                        String i = player3Twenty.getText() + "x";
                        player3Twenty.setText(i);
                        sumP3 += 20;
                        checkGate20();
                        dart();
                    } else {
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player3Twenty.getText().equals("xxx") && !player3Twenty.getText().equals("xx")) {
                        String i = player3Twenty.getText() + "xx";
                        player3Twenty.setText(i);
                        sumP3 += 40;
                        checkGate20();
                        dart();
                    } else if (player3Twenty.getText().equals("xx")) {
                        String i = player3Twenty.getText() + "x";
                        player3Twenty.setText(i);
                        sumP3 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player3Twenty.getText().equals("")) {
                        String i = player3Twenty.getText() + "xxx";
                        player3Twenty.setText(i);
                        sumP3 += 60;
                        checkGate20();
                        dart();
                    } else if (player3Twenty.getText().equals("x")) {
                        String i = player3Twenty.getText() + "xx";
                        player3Twenty.setText(i);
                        sumP3 += 40;
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else if (player3Twenty.getText().equals("xx")) {
                        String i = player3Twenty.getText() + "x";
                        player3Twenty.setText(i);
                        sumP3 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(60);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player3Twenty.getText().equals("")) {
                        String i = player3Twenty.getText() + "xxx";
                        player3Twenty.setText(i);
                        sumP3 += 60;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else if (player3Twenty.getText().equals("x")) {
                        String i = player3Twenty.getText() + "xx";
                        player3Twenty.setText(i);
                        sumP3 += 40;
                        checkGate20();
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    } else if (player3Twenty.getText().equals("xx")) {
                        String i = player3Twenty.getText() + "x";
                        player3Twenty.setText(i);
                        sumP3 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(60);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(80);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 25) {
                if (!player3Bull.getText().equals("xxx")) {
                    String i = player3Bull.getText() + "x";
                    player3Bull.setText(i);
                    sumP3 += 25;
                    checkGateBull();
                    dart();
                } else {
                    if (!gateBull) {
                        add(25);
                    } else {
                        dart();
                    }
                }
            } else if (hit == 50) {
                if (!player3Bull.getText().equals("xxx") && !player3Bull.getText().equals("xx")) {
                    String i = player3Bull.getText() + "xx";
                    player3Bull.setText(i);
                    sumP3 += 50;
                    checkGateBull();
                    dart();
                } else if (player3Bull.getText().equals("xx")) {
                    String i = player3Bull.getText() + "x";
                    player3Bull.setText(i);
                    sumP3 += 25;
                    checkGateBull();
                    if (!gateBull) {
                        add(25);
                    } else {
                        dart();
                    }
                } else {
                    if (!gateBull) {
                        add(50);
                    } else {
                        dart();
                    }
                }
            }
        }
        //fourth player
        else if (player == 4){
            if (hit == 15) {
                if (multiply == 1) {
                    if (!player4Fifteen.getText().equals("xxx")) {
                        String i = player4Fifteen.getText() + "x";
                        player4Fifteen.setText(i);
                        sumP4 += 15;
                        checkGate15();
                        dart();
                    } else {
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player4Fifteen.getText().equals("xxx") && !player4Fifteen.getText().equals("xx")) {
                        String i = player4Fifteen.getText() + "xx";
                        player4Fifteen.setText(i);
                        sumP4 += 30;
                        checkGate15();
                        dart();
                    } else if (player4Fifteen.getText().equals("xx")) {
                        String i = player4Fifteen.getText() + "x";
                        player4Fifteen.setText(i);
                        sumP4 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player4Fifteen.getText().equals("")) {
                        String i = player4Fifteen.getText() + "xxx";
                        player4Fifteen.setText(i);
                        sumP4 += 45;
                        checkGate15();
                        dart();
                    } else if (player4Fifteen.getText().equals("x")) {
                        String i = player4Fifteen.getText() + "xx";
                        player4Fifteen.setText(i);
                        sumP4 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player4Fifteen.getText().equals("xx")) {
                        String i = player4Fifteen.getText() + "x";
                        player4Fifteen.setText(i);
                        sumP4 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player4Fifteen.getText().equals("")) {
                        String i = player4Fifteen.getText() + "xxx";
                        player4Fifteen.setText(i);
                        sumP4 += 45;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player4Fifteen.getText().equals("x")) {
                        String i = player4Fifteen.getText() + "xx";
                        player4Fifteen.setText(i);
                        sumP4 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else if (player4Fifteen.getText().equals("xx")) {
                        String i = player4Fifteen.getText() + "x";
                        player4Fifteen.setText(i);
                        sumP4 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(60);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 16) {
                if (multiply == 1) {
                    if (!player4Sixteen.getText().equals("xxx")) {
                        String i = player4Sixteen.getText() + "x";
                        player4Sixteen.setText(i);
                        sumP4 += 16;
                        checkGate16();
                        dart();
                    } else {
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player4Sixteen.getText().equals("xxx") && !player4Sixteen.getText().equals("xx")) {
                        String i = player4Sixteen.getText() + "xx";
                        player4Sixteen.setText(i);
                        sumP4 += 32;
                        checkGate16();
                        dart();
                    } else if (player4Sixteen.getText().equals("xx")) {
                        String i = player4Sixteen.getText() + "x";
                        player4Sixteen.setText(i);
                        sumP4 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player4Sixteen.getText().equals("")) {
                        String i = player4Sixteen.getText() + "xxx";
                        player4Sixteen.setText(i);
                        sumP4 += 48;
                        checkGate16();
                        dart();
                    } else if (player4Sixteen.getText().equals("x")) {
                        String i = player4Sixteen.getText() + "xx";
                        player4Sixteen.setText(i);
                        sumP4 += 32;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else if (player4Sixteen.getText().equals("xx")) {
                        String i = player4Sixteen.getText() + "x";
                        player4Sixteen.setText(i);
                        sumP4 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(48);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player4Sixteen.getText().equals("")) {
                        String i = player4Sixteen.getText() + "xxx";
                        player4Sixteen.setText(i);
                        sumP4 += 48;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else if (player4Sixteen.getText().equals("x")) {
                        String i = player4Sixteen.getText() + "xx";
                        player4Sixteen.setText(i);
                        sumP4 += 32;
                        checkGate16();
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    } else if (player4Sixteen.getText().equals("xx")) {
                        String i = player4Sixteen.getText() + "x";
                        player4Sixteen.setText(i);
                        sumP4 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(48);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(64);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 17) {
                if (multiply == 1) {
                    if (!player4Seventeen.getText().equals("xxx")) {
                        String i = player4Seventeen.getText() + "x";
                        player4Seventeen.setText(i);
                        sumP4 += 17;
                        checkGate17();
                        dart();
                    } else {
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player4Seventeen.getText().equals("xxx") && !player4Seventeen.getText().equals("xx")) {
                        String i = player4Seventeen.getText() + "xx";
                        player4Seventeen.setText(i);
                        sumP4 += 34;
                        checkGate17();
                        dart();
                    } else if (player4Seventeen.getText().equals("xx")) {
                        String i = player4Seventeen.getText() + "x";
                        player4Seventeen.setText(i);
                        sumP4 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player4Seventeen.getText().equals("")) {
                        String i = player4Seventeen.getText() + "xxx";
                        player4Seventeen.setText(i);
                        sumP4 += 51;
                        checkGate17();
                        dart();
                    } else if (player4Seventeen.getText().equals("x")) {
                        String i = player4Seventeen.getText() + "xx";
                        player4Seventeen.setText(i);
                        sumP4 += 34;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else if (player4Seventeen.getText().equals("xx")) {
                        String i = player4Seventeen.getText() + "x";
                        player4Seventeen.setText(i);
                        sumP4 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(51);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player4Seventeen.getText().equals("")) {
                        String i = player4Seventeen.getText() + "xxx";
                        player4Seventeen.setText(i);
                        sumP4 += 51;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else if (player4Seventeen.getText().equals("x")) {
                        String i = player4Seventeen.getText() + "xx";
                        player4Seventeen.setText(i);
                        sumP4 += 34;
                        checkGate17();
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    } else if (player4Seventeen.getText().equals("xx")) {
                        String i = player4Seventeen.getText() + "x";
                        player4Seventeen.setText(i);
                        sumP4 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(51);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(68);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 18) {
                if (multiply == 1) {
                    if (!player4Eighteen.getText().equals("xxx")) {
                        String i = player4Eighteen.getText() + "x";
                        player4Eighteen.setText(i);
                        sumP4 += 18;
                        checkGate18();
                        dart();
                    } else {
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player4Eighteen.getText().equals("xxx") && !player4Eighteen.getText().equals("xx")) {
                        String i = player4Eighteen.getText() + "xx";
                        player4Eighteen.setText(i);
                        sumP4 += 36;
                        checkGate18();
                        dart();
                    } else if (player4Eighteen.getText().equals("xx")) {
                        String i = player4Eighteen.getText() + "x";
                        player4Eighteen.setText(i);
                        sumP4 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player4Eighteen.getText().equals("")) {
                        String i = player4Eighteen.getText() + "xxx";
                        player4Eighteen.setText(i);
                        sumP4 += 54;
                        checkGate18();
                        dart();
                    } else if (player4Eighteen.getText().equals("x")) {
                        String i = player4Eighteen.getText() + "xx";
                        player4Eighteen.setText(i);
                        sumP4 += 36;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else if (player4Eighteen.getText().equals("xx")) {
                        String i = player4Eighteen.getText() + "x";
                        player4Eighteen.setText(i);
                        sumP4 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(54);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player4Eighteen.getText().equals("")) {
                        String i = player4Eighteen.getText() + "xxx";
                        player4Eighteen.setText(i);
                        sumP4 += 54;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else if (player4Eighteen.getText().equals("x")) {
                        String i = player4Eighteen.getText() + "xx";
                        player4Eighteen.setText(i);
                        sumP4 += 36;
                        checkGate18();
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    } else if (player4Eighteen.getText().equals("xx")) {
                        String i = player4Eighteen.getText() + "x";
                        player4Eighteen.setText(i);
                        sumP4 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(54);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(72);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 19) {
                if (multiply == 1) {
                    if (!player4Nineteen.getText().equals("xxx")) {
                        String i = player4Nineteen.getText() + "x";
                        player4Nineteen.setText(i);
                        sumP4 += 19;
                        checkGate19();
                        dart();
                    } else {
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player4Nineteen.getText().equals("xxx") && !player4Nineteen.getText().equals("xx")) {
                        String i = player4Nineteen.getText() + "xx";
                        player4Nineteen.setText(i);
                        sumP4 += 38;
                        checkGate19();
                        dart();
                    } else if (player4Nineteen.getText().equals("xx")) {
                        String i = player4Nineteen.getText() + "x";
                        player4Nineteen.setText(i);
                        sumP4 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player4Nineteen.getText().equals("")) {
                        String i = player4Nineteen.getText() + "xxx";
                        player4Nineteen.setText(i);
                        sumP4 += 57;
                        checkGate19();
                        dart();
                    } else if (player4Nineteen.getText().equals("x")) {
                        String i = player4Nineteen.getText() + "xx";
                        player4Nineteen.setText(i);
                        sumP4 += 38;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else if (player4Nineteen.getText().equals("xx")) {
                        String i = player4Nineteen.getText() + "x";
                        player4Nineteen.setText(i);
                        sumP4 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(57);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player4Nineteen.getText().equals("")) {
                        String i = player4Nineteen.getText() + "xxx";
                        player4Nineteen.setText(i);
                        sumP4 += 57;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else if (player4Nineteen.getText().equals("x")) {
                        String i = player4Nineteen.getText() + "xx";
                        player4Nineteen.setText(i);
                        sumP4 += 38;
                        checkGate19();
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    } else if (player4Nineteen.getText().equals("xx")) {
                        String i = player4Nineteen.getText() + "x";
                        player4Nineteen.setText(i);
                        sumP4 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(57);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(76);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 20) {
                if (multiply == 1) {
                    if (!player4Twenty.getText().equals("xxx")) {
                        String i = player4Twenty.getText() + "x";
                        player4Twenty.setText(i);
                        sumP4 += 20;
                        checkGate20();
                        dart();
                    } else {
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player4Twenty.getText().equals("xxx") && !player4Twenty.getText().equals("xx")) {
                        String i = player4Twenty.getText() + "xx";
                        player4Twenty.setText(i);
                        sumP4 += 40;
                        checkGate20();
                        dart();
                    } else if (player4Twenty.getText().equals("xx")) {
                        String i = player4Twenty.getText() + "x";
                        player4Twenty.setText(i);
                        sumP4 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player4Twenty.getText().equals("")) {
                        String i = player4Twenty.getText() + "xxx";
                        player4Twenty.setText(i);
                        sumP4 += 60;
                        checkGate20();
                        dart();
                    } else if (player4Twenty.getText().equals("x")) {
                        String i = player4Twenty.getText() + "xx";
                        player4Twenty.setText(i);
                        sumP4 += 40;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else if (player4Twenty.getText().equals("xx")) {
                        String i = player4Twenty.getText() + "x";
                        player4Twenty.setText(i);
                        sumP4 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(60);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player4Twenty.getText().equals("")) {
                        String i = player4Twenty.getText() + "xxx";
                        player4Twenty.setText(i);
                        sumP4 += 60;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else if (player4Twenty.getText().equals("x")) {
                        String i = player4Twenty.getText() + "xx";
                        player4Twenty.setText(i);
                        sumP4 += 40;
                        checkGate20();
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    } else if (player4Twenty.getText().equals("xx")) {
                        String i = player4Twenty.getText() + "x";
                        player4Twenty.setText(i);
                        sumP4 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(60);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(80);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 25) {
                if (!player4Bull.getText().equals("xxx")) {
                    String i = player4Bull.getText() + "x";
                    player4Bull.setText(i);
                    sumP4 += 25;
                    checkGateBull();
                    dart();
                } else {
                    if (!gateBull) {
                        add(25);
                    } else {
                        dart();
                    }
                }
            } else if (hit == 50) {
                if (!player4Bull.getText().equals("xxx") && !player4Bull.getText().equals("xx")) {
                    String i = player4Bull.getText() + "xx";
                    player4Bull.setText(i);
                    sumP4 += 50;
                    checkGateBull();
                    dart();
                } else if (player4Bull.getText().equals("xx")) {
                    String i = player4Bull.getText() + "x";
                    player4Bull.setText(i);
                    sumP4 += 25;
                    checkGateBull();
                    if (!gateBull) {
                        add(25);
                    } else {
                        dart();
                    }
                } else {
                    if (!gateBull) {
                        add(50);
                    } else {
                        dart();
                    }
                }
            }
        }
        //fifth player
        else if (player == 5){
            if (hit == 15) {
                if (multiply == 1) {
                    if (!player5Fifteen.getText().equals("xxx")) {
                        String i = player5Fifteen.getText() + "x";
                        player5Fifteen.setText(i);
                        sumP5 += 15;
                        checkGate15();
                        dart();
                    } else {
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player5Fifteen.getText().equals("xxx") && !player5Fifteen.getText().equals("xx")) {
                        String i = player5Fifteen.getText() + "xx";
                        player5Fifteen.setText(i);
                        sumP5 += 30;
                        checkGate15();
                        dart();
                    } else if (player5Fifteen.getText().equals("xx")) {
                        String i = player5Fifteen.getText() + "x";
                        player5Fifteen.setText(i);
                        sumP5 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player5Fifteen.getText().equals("")) {
                        String i = player5Fifteen.getText() + "xxx";
                        player5Fifteen.setText(i);
                        sumP5 += 45;
                        checkGate15();
                        dart();
                    } else if (player5Fifteen.getText().equals("x")) {
                        String i = player5Fifteen.getText() + "xx";
                        player1Fifteen.setText(i);
                        sumP5 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player5Fifteen.getText().equals("xx")) {
                        String i = player5Fifteen.getText() + "x";
                        player5Fifteen.setText(i);
                        sumP5 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player5Fifteen.getText().equals("")) {
                        String i = player5Fifteen.getText() + "xxx";
                        player5Fifteen.setText(i);
                        sumP5 += 45;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player5Fifteen.getText().equals("x")) {
                        String i = player5Fifteen.getText() + "xx";
                        player5Fifteen.setText(i);
                        sumP5 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else if (player5Fifteen.getText().equals("xx")) {
                        String i = player5Fifteen.getText() + "x";
                        player5Fifteen.setText(i);
                        sumP5 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(60);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 16) {
                if (multiply == 1) {
                    if (!player5Sixteen.getText().equals("xxx")) {
                        String i = player5Sixteen.getText() + "x";
                        player5Sixteen.setText(i);
                        sumP5 += 16;
                        checkGate16();
                        dart();
                    } else {
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player5Sixteen.getText().equals("xxx") && !player5Sixteen.getText().equals("xx")) {
                        String i = player5Sixteen.getText() + "xx";
                        player5Sixteen.setText(i);
                        sumP5 += 32;
                        checkGate16();
                        dart();
                    } else if (player5Sixteen.getText().equals("xx")) {
                        String i = player5Sixteen.getText() + "x";
                        player5Sixteen.setText(i);
                        sumP5 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player5Sixteen.getText().equals("")) {
                        String i = player5Sixteen.getText() + "xxx";
                        player5Sixteen.setText(i);
                        sumP5 += 48;
                        checkGate16();
                        dart();
                    } else if (player5Sixteen.getText().equals("x")) {
                        String i = player5Sixteen.getText() + "xx";
                        player5Sixteen.setText(i);
                        sumP5 += 32;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else if (player5Sixteen.getText().equals("xx")) {
                        String i = player5Sixteen.getText() + "x";
                        player5Sixteen.setText(i);
                        sumP5 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(48);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player5Sixteen.getText().equals("")) {
                        String i = player5Sixteen.getText() + "xxx";
                        player5Sixteen.setText(i);
                        sumP5 += 48;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else if (player5Sixteen.getText().equals("x")) {
                        String i = player5Sixteen.getText() + "xx";
                        player5Sixteen.setText(i);
                        sumP5 += 32;
                        checkGate16();
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    } else if (player5Sixteen.getText().equals("xx")) {
                        String i = player5Sixteen.getText() + "x";
                        player5Sixteen.setText(i);
                        sumP5 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(48);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(64);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 17) {
                if (multiply == 1) {
                    if (!player5Seventeen.getText().equals("xxx")) {
                        String i = player5Seventeen.getText() + "x";
                        player5Seventeen.setText(i);
                        sumP5 += 17;
                        checkGate17();
                        dart();
                    } else {
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player5Seventeen.getText().equals("xxx") && !player5Seventeen.getText().equals("xx")) {
                        String i = player5Seventeen.getText() + "xx";
                        player5Seventeen.setText(i);
                        sumP5 += 34;
                        checkGate17();
                        dart();
                    } else if (player5Seventeen.getText().equals("xx")) {
                        String i = player5Seventeen.getText() + "x";
                        player5Seventeen.setText(i);
                        sumP5 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player5Seventeen.getText().equals("")) {
                        String i = player5Seventeen.getText() + "xxx";
                        player5Seventeen.setText(i);
                        sumP5 += 51;
                        checkGate17();
                        dart();
                    } else if (player5Seventeen.getText().equals("x")) {
                        String i = player5Seventeen.getText() + "xx";
                        player5Seventeen.setText(i);
                        sumP5 += 34;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else if (player5Seventeen.getText().equals("xx")) {
                        String i = player5Seventeen.getText() + "x";
                        player5Seventeen.setText(i);
                        sumP5 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(51);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player5Seventeen.getText().equals("")) {
                        String i = player5Seventeen.getText() + "xxx";
                        player5Seventeen.setText(i);
                        sumP5 += 51;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else if (player5Seventeen.getText().equals("x")) {
                        String i = player5Seventeen.getText() + "xx";
                        player5Seventeen.setText(i);
                        sumP5 += 34;
                        checkGate17();
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    } else if (player5Seventeen.getText().equals("xx")) {
                        String i = player5Seventeen.getText() + "x";
                        player5Seventeen.setText(i);
                        sumP5 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(51);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(68);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 18) {
                if (multiply == 1) {
                    if (!player5Eighteen.getText().equals("xxx")) {
                        String i = player5Eighteen.getText() + "x";
                        player5Eighteen.setText(i);
                        sumP5 += 18;
                        checkGate18();
                        dart();
                    } else {
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player5Eighteen.getText().equals("xxx") && !player5Eighteen.getText().equals("xx")) {
                        String i = player5Eighteen.getText() + "xx";
                        player5Eighteen.setText(i);
                        sumP5 += 36;
                        checkGate18();
                        dart();
                    } else if (player5Eighteen.getText().equals("xx")) {
                        String i = player5Eighteen.getText() + "x";
                        player5Eighteen.setText(i);
                        sumP5 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player5Eighteen.getText().equals("")) {
                        String i = player5Eighteen.getText() + "xxx";
                        player5Eighteen.setText(i);
                        sumP5 += 54;
                        checkGate18();
                        dart();
                    } else if (player5Eighteen.getText().equals("x")) {
                        String i = player5Eighteen.getText() + "xx";
                        player5Eighteen.setText(i);
                        sumP5 += 36;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else if (player5Eighteen.getText().equals("xx")) {
                        String i = player5Eighteen.getText() + "x";
                        player5Eighteen.setText(i);
                        sumP5 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(54);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player5Eighteen.getText().equals("")) {
                        String i = player5Eighteen.getText() + "xxx";
                        player5Eighteen.setText(i);
                        sumP5 += 54;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else if (player5Eighteen.getText().equals("x")) {
                        String i = player5Eighteen.getText() + "xx";
                        player5Eighteen.setText(i);
                        sumP5 += 36;
                        checkGate18();
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    } else if (player5Eighteen.getText().equals("xx")) {
                        String i = player5Eighteen.getText() + "x";
                        player5Eighteen.setText(i);
                        sumP5 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(54);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(72);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 19) {
                if (multiply == 1) {
                    if (!player5Nineteen.getText().equals("xxx")) {
                        String i = player5Nineteen.getText() + "x";
                        player5Nineteen.setText(i);
                        sumP5 += 19;
                        checkGate19();
                        dart();
                    } else {
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player5Nineteen.getText().equals("xxx") && !player5Nineteen.getText().equals("xx")) {
                        String i = player5Nineteen.getText() + "xx";
                        player5Nineteen.setText(i);
                        sumP5 += 38;
                        checkGate19();
                        dart();
                    } else if (player5Nineteen.getText().equals("xx")) {
                        String i = player5Nineteen.getText() + "x";
                        player5Nineteen.setText(i);
                        sumP5 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player5Nineteen.getText().equals("")) {
                        String i = player5Nineteen.getText() + "xxx";
                        player5Nineteen.setText(i);
                        sumP5 += 57;
                        checkGate19();
                        dart();
                    } else if (player5Nineteen.getText().equals("x")) {
                        String i = player5Nineteen.getText() + "xx";
                        player5Nineteen.setText(i);
                        sumP5 += 38;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else if (player5Nineteen.getText().equals("xx")) {
                        String i = player5Nineteen.getText() + "x";
                        player5Nineteen.setText(i);
                        sumP5 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(57);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player5Nineteen.getText().equals("")) {
                        String i = player5Nineteen.getText() + "xxx";
                        player5Nineteen.setText(i);
                        sumP5 += 57;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else if (player5Nineteen.getText().equals("x")) {
                        String i = player5Nineteen.getText() + "xx";
                        player5Nineteen.setText(i);
                        sumP5 += 38;
                        checkGate19();
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    } else if (player5Nineteen.getText().equals("xx")) {
                        String i = player5Nineteen.getText() + "x";
                        player5Nineteen.setText(i);
                        sumP5 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(57);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(76);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 20) {
                if (multiply == 1) {
                    if (!player5Twenty.getText().equals("xxx")) {
                        String i = player5Twenty.getText() + "x";
                        player5Twenty.setText(i);
                        sumP5 += 20;
                        checkGate20();
                        dart();
                    } else {
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player5Twenty.getText().equals("xxx") && !player5Twenty.getText().equals("xx")) {
                        String i = player5Twenty.getText() + "xx";
                        player5Twenty.setText(i);
                        sumP5 += 40;
                        checkGate20();
                        dart();
                    } else if (player5Twenty.getText().equals("xx")) {
                        String i = player5Twenty.getText() + "x";
                        player5Twenty.setText(i);
                        sumP5 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player5Twenty.getText().equals("")) {
                        String i = player5Twenty.getText() + "xxx";
                        player5Twenty.setText(i);
                        sumP5 += 60;
                        checkGate20();
                        dart();
                    } else if (player5Twenty.getText().equals("x")) {
                        String i = player5Twenty.getText() + "xx";
                        player5Twenty.setText(i);
                        sumP5 += 40;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else if (player5Twenty.getText().equals("xx")) {
                        String i = player5Twenty.getText() + "x";
                        player5Twenty.setText(i);
                        sumP5 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(60);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player5Twenty.getText().equals("")) {
                        String i = player5Twenty.getText() + "xxx";
                        player5Twenty.setText(i);
                        sumP5 += 60;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else if (player5Twenty.getText().equals("x")) {
                        String i = player5Twenty.getText() + "xx";
                        player5Twenty.setText(i);
                        sumP5 += 40;
                        checkGate20();
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    } else if (player5Twenty.getText().equals("xx")) {
                        String i = player5Twenty.getText() + "x";
                        player5Twenty.setText(i);
                        sumP5 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(60);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(80);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 25) {
                if (!player5Bull.getText().equals("xxx")) {
                    String i = player5Bull.getText() + "x";
                    player5Bull.setText(i);
                    sumP5 += 25;
                    checkGateBull();
                    dart();
                } else {
                    if (!gateBull) {
                        add(25);
                    } else {
                        dart();
                    }
                }

            } else if (hit == 50) {
                if (!player5Bull.getText().equals("xxx") && !player5Bull.getText().equals("xx")) {
                    String i = player5Bull.getText() + "xx";
                    player5Bull.setText(i);
                    sumP5 += 50;
                    checkGateBull();
                    dart();
                } else if (player5Bull.getText().equals("xx")) {
                    String i = player5Bull.getText() + "x";
                    player5Bull.setText(i);
                    sumP5 += 25;
                    checkGateBull();
                    if (!gateBull) {
                        add(25);
                    } else {
                        dart();
                    }
                } else {
                    if (!gateBull) {
                        add(50);
                    } else {
                        dart();
                    }
                }
            }
        }
        //sixth player
        else if (player == 6){
            if (hit == 15) {
                if (multiply == 1) {
                    if (!player6Fifteen.getText().equals("xxx")) {
                        String i = player6Fifteen.getText() + "x";
                        player6Fifteen.setText(i);
                        sumP6 += 15;
                        checkGate15();
                        dart();
                    } else {
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player6Fifteen.getText().equals("xxx") && !player6Fifteen.getText().equals("xx")) {
                        String i = player6Fifteen.getText() + "xx";
                        player6Fifteen.setText(i);
                        sumP6 += 30;
                        checkGate15();
                        dart();
                    } else if (player6Fifteen.getText().equals("xx")) {
                        String i = player6Fifteen.getText() + "x";
                        player6Fifteen.setText(i);
                        sumP6 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player6Fifteen.getText().equals("")) {
                        String i = player6Fifteen.getText() + "xxx";
                        player6Fifteen.setText(i);
                        sumP6 += 45;
                        checkGate15();
                        dart();
                    } else if (player6Fifteen.getText().equals("x")) {
                        String i = player6Fifteen.getText() + "xx";
                        player6Fifteen.setText(i);
                        sumP6 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player6Fifteen.getText().equals("xx")) {
                        String i = player6Fifteen.getText() + "x";
                        player6Fifteen.setText(i);
                        sumP6 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player6Fifteen.getText().equals("")) {
                        String i = player6Fifteen.getText() + "xxx";
                        player6Fifteen.setText(i);
                        sumP6 += 45;
                        checkGate15();
                        if (!gate15) {
                            add(15);
                        } else {
                            dart();
                        }
                    } else if (player6Fifteen.getText().equals("x")) {
                        String i = player6Fifteen.getText() + "xx";
                        player6Fifteen.setText(i);
                        sumP6 += 30;
                        checkGate15();
                        if (!gate15) {
                            add(30);
                        } else {
                            dart();
                        }
                    } else if (player6Fifteen.getText().equals("xx")) {
                        String i = player6Fifteen.getText() + "x";
                        player6Fifteen.setText(i);
                        sumP6 += 15;
                        checkGate15();
                        if (!gate15) {
                            add(45);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate15) {
                            add(60);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 16) {
                if (multiply == 1) {
                    if (!player6Sixteen.getText().equals("xxx")) {
                        String i = player6Sixteen.getText() + "x";
                        player6Sixteen.setText(i);
                        sumP6 += 16;
                        checkGate16();
                        dart();
                    } else {
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player6Sixteen.getText().equals("xxx") && !player6Sixteen.getText().equals("xx")) {
                        String i = player6Sixteen.getText() + "xx";
                        player6Sixteen.setText(i);
                        sumP6 += 32;
                        checkGate16();
                        dart();
                    } else if (player6Sixteen.getText().equals("xx")) {
                        String i = player6Sixteen.getText() + "x";
                        player6Sixteen.setText(i);
                        sumP6 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player6Sixteen.getText().equals("")) {
                        String i = player6Sixteen.getText() + "xxx";
                        player6Sixteen.setText(i);
                        sumP6 += 48;
                        checkGate16();
                        dart();
                    } else if (player6Sixteen.getText().equals("x")) {
                        String i = player6Sixteen.getText() + "xx";
                        player6Sixteen.setText(i);
                        sumP6 += 32;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else if (player6Sixteen.getText().equals("xx")) {
                        String i = player6Sixteen.getText() + "x";
                        player6Sixteen.setText(i);
                        sumP6 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(48);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player6Sixteen.getText().equals("")) {
                        String i = player6Sixteen.getText() + "xxx";
                        player6Sixteen.setText(i);
                        sumP6 += 48;
                        checkGate16();
                        if (!gate16) {
                            add(16);
                        } else {
                            dart();
                        }
                    } else if (player6Sixteen.getText().equals("x")) {
                        String i = player6Sixteen.getText() + "xx";
                        player6Sixteen.setText(i);
                        sumP6 += 32;
                        checkGate16();
                        if (!gate16) {
                            add(32);
                        } else {
                            dart();
                        }
                    } else if (player6Sixteen.getText().equals("xx")) {
                        String i = player6Sixteen.getText() + "x";
                        player6Sixteen.setText(i);
                        sumP6 += 16;
                        checkGate16();
                        if (!gate16) {
                            add(48);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate16) {
                            add(64);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 17) {
                if (multiply == 1) {
                    if (!player6Seventeen.getText().equals("xxx")) {
                        String i = player6Seventeen.getText() + "x";
                        player6Seventeen.setText(i);
                        sumP6 += 17;
                        checkGate17();
                        dart();
                    } else {
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player6Seventeen.getText().equals("xxx") && !player6Seventeen.getText().equals("xx")) {
                        String i = player6Seventeen.getText() + "xx";
                        player6Seventeen.setText(i);
                        sumP6 += 34;
                        checkGate17();
                        dart();
                    } else if (player6Seventeen.getText().equals("xx")) {
                        String i = player6Seventeen.getText() + "x";
                        player6Seventeen.setText(i);
                        sumP6 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player6Seventeen.getText().equals("")) {
                        String i = player6Seventeen.getText() + "xxx";
                        player6Seventeen.setText(i);
                        sumP6 += 51;
                        checkGate17();
                        dart();
                    } else if (player6Seventeen.getText().equals("x")) {
                        String i = player6Seventeen.getText() + "xx";
                        player6Seventeen.setText(i);
                        sumP6 += 34;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else if (player6Seventeen.getText().equals("xx")) {
                        String i = player6Seventeen.getText() + "x";
                        player6Seventeen.setText(i);
                        sumP6 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(51);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player6Seventeen.getText().equals("")) {
                        String i = player6Seventeen.getText() + "xxx";
                        player6Seventeen.setText(i);
                        sumP6 += 51;
                        checkGate17();
                        if (!gate17) {
                            add(17);
                        } else {
                            dart();
                        }
                    } else if (player6Seventeen.getText().equals("x")) {
                        String i = player6Seventeen.getText() + "xx";
                        player6Seventeen.setText(i);
                        sumP6 += 34;
                        checkGate17();
                        if (!gate17) {
                            add(34);
                        } else {
                            dart();
                        }
                    } else if (player6Seventeen.getText().equals("xx")) {
                        String i = player6Seventeen.getText() + "x";
                        player6Seventeen.setText(i);
                        sumP6 += 17;
                        checkGate17();
                        if (!gate17) {
                            add(51);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate17) {
                            add(68);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 18) {
                if (multiply == 1) {
                    if (!player6Eighteen.getText().equals("xxx")) {
                        String i = player6Eighteen.getText() + "x";
                        player6Eighteen.setText(i);
                        sumP6 += 18;
                        checkGate18();
                        dart();
                    } else {
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player6Eighteen.getText().equals("xxx") && !player6Eighteen.getText().equals("xx")) {
                        String i = player6Eighteen.getText() + "xx";
                        player6Eighteen.setText(i);
                        sumP6 += 36;
                        checkGate18();
                        dart();
                    } else if (player6Eighteen.getText().equals("xx")) {
                        String i = player6Eighteen.getText() + "x";
                        player6Eighteen.setText(i);
                        sumP6 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player6Eighteen.getText().equals("")) {
                        String i = player6Eighteen.getText() + "xxx";
                        player6Eighteen.setText(i);
                        sumP6 += 54;
                        checkGate18();
                        dart();
                    } else if (player6Eighteen.getText().equals("x")) {
                        String i = player6Eighteen.getText() + "xx";
                        player6Eighteen.setText(i);
                        sumP6 += 36;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else if (player6Eighteen.getText().equals("xx")) {
                        String i = player6Eighteen.getText() + "x";
                        player6Eighteen.setText(i);
                        sumP6 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(54);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player6Eighteen.getText().equals("")) {
                        String i = player6Eighteen.getText() + "xxx";
                        player6Eighteen.setText(i);
                        sumP6 += 54;
                        checkGate18();
                        if (!gate18) {
                            add(18);
                        } else {
                            dart();
                        }
                    } else if (player6Eighteen.getText().equals("x")) {
                        String i = player6Eighteen.getText() + "xx";
                        player6Eighteen.setText(i);
                        sumP6 += 36;
                        checkGate18();
                        if (!gate18) {
                            add(36);
                        } else {
                            dart();
                        }
                    } else if (player6Eighteen.getText().equals("xx")) {
                        String i = player6Eighteen.getText() + "x";
                        player6Eighteen.setText(i);
                        sumP6 += 18;
                        checkGate18();
                        if (!gate18) {
                            add(54);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate18) {
                            add(72);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 19) {
                if (multiply == 1) {
                    if (!player6Nineteen.getText().equals("xxx")) {
                        String i = player6Nineteen.getText() + "x";
                        player6Nineteen.setText(i);
                        sumP6 += 19;
                        checkGate19();
                        dart();
                    } else {
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player6Nineteen.getText().equals("xxx") && !player6Nineteen.getText().equals("xx")) {
                        String i = player6Nineteen.getText() + "xx";
                        player6Nineteen.setText(i);
                        sumP6 += 38;
                        checkGate19();
                        dart();
                    } else if (player6Nineteen.getText().equals("xx")) {
                        String i = player6Nineteen.getText() + "x";
                        player6Nineteen.setText(i);
                        sumP6 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player6Nineteen.getText().equals("")) {
                        String i = player6Nineteen.getText() + "xxx";
                        player6Nineteen.setText(i);
                        sumP6 += 57;
                        checkGate19();
                        dart();
                    } else if (player6Nineteen.getText().equals("x")) {
                        String i = player6Nineteen.getText() + "xx";
                        player6Nineteen.setText(i);
                        sumP6 += 38;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else if (player6Nineteen.getText().equals("xx")) {
                        String i = player6Nineteen.getText() + "x";
                        player6Nineteen.setText(i);
                        sumP6 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(57);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player6Nineteen.getText().equals("")) {
                        String i = player6Nineteen.getText() + "xxx";
                        player6Nineteen.setText(i);
                        sumP6 += 57;
                        checkGate19();
                        if (!gate19) {
                            add(19);
                        } else {
                            dart();
                        }
                    } else if (player6Nineteen.getText().equals("x")) {
                        String i = player6Nineteen.getText() + "xx";
                        player6Nineteen.setText(i);
                        sumP6 += 38;
                        checkGate19();
                        if (!gate19) {
                            add(38);
                        } else {
                            dart();
                        }
                    } else if (player6Nineteen.getText().equals("xx")) {
                        String i = player6Nineteen.getText() + "x";
                        player6Nineteen.setText(i);
                        sumP6 += 19;
                        checkGate19();
                        if (!gate19) {
                            add(57);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate19) {
                            add(76);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 20) {
                if (multiply == 1) {
                    if (!player6Twenty.getText().equals("xxx")) {
                        String i = player6Twenty.getText() + "x";
                        player6Twenty.setText(i);
                        sumP6 += 20;
                        checkGate20();
                        dart();
                    } else {
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 2) {
                    if (!player6Twenty.getText().equals("xxx") && !player6Twenty.getText().equals("xx")) {
                        String i = player6Twenty.getText() + "xx";
                        player6Twenty.setText(i);
                        sumP6 += 40;
                        checkGate20();
                        dart();
                    } else if (player6Twenty.getText().equals("xx")) {
                        String i = player6Twenty.getText() + "x";
                        player6Twenty.setText(i);
                        sumP6 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 3) {
                    if (player6Twenty.getText().equals("")) {
                        String i = player6Twenty.getText() + "xxx";
                        player6Twenty.setText(i);
                        sumP6 += 60;
                        checkGate20();
                        dart();
                    } else if (player6Twenty.getText().equals("x")) {
                        String i = player6Twenty.getText() + "xx";
                        player6Twenty.setText(i);
                        sumP6 += 40;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else if (player6Twenty.getText().equals("xx")) {
                        String i = player6Twenty.getText() + "x";
                        player6Twenty.setText(i);
                        sumP6 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(60);
                        } else {
                            dart();
                        }
                    }
                } else if (multiply == 4) {
                    if (player6Twenty.getText().equals("")) {
                        String i = player6Twenty.getText() + "xxx";
                        player6Twenty.setText(i);
                        sumP6 += 60;
                        checkGate20();
                        if (!gate20) {
                            add(20);
                        } else {
                            dart();
                        }
                    } else if (player6Twenty.getText().equals("x")) {
                        String i = player6Twenty.getText() + "xx";
                        player6Twenty.setText(i);
                        sumP6 += 40;
                        checkGate20();
                        if (!gate20) {
                            add(40);
                        } else {
                            dart();
                        }
                    } else if (player6Twenty.getText().equals("xx")) {
                        String i = player6Twenty.getText() + "x";
                        player6Twenty.setText(i);
                        sumP6 += 20;
                        checkGate20();
                        if (!gate20) {
                            add(60);
                        } else {
                            dart();
                        }
                    } else {
                        if (!gate20) {
                            add(80);
                        } else {
                            dart();
                        }
                    }
                }
            } else if (hit == 25) {
                if (!player6Bull.getText().equals("xxx")) {
                    String i = player6Bull.getText() + "x";
                    player6Bull.setText(i);
                    sumP6 += 25;
                    checkGateBull();
                    dart();
                } else {
                    if (!gateBull) {
                        add(25);
                    } else {
                        dart();
                    }
                }
            } else if (hit == 50) {
                if (!player6Bull.getText().equals("xxx") && !player6Bull.getText().equals("xx")) {
                    String i = player6Bull.getText() + "xx";
                    player6Bull.setText(i);
                    sumP6 += 50;
                    checkGateBull();
                    dart();
                } else if (player6Bull.getText().equals("xx")) {
                    String i = player6Bull.getText() + "x";
                    player6Bull.setText(i);
                    sumP6 += 25;
                    checkGateBull();
                    if (!gateBull) {
                        add(25);
                    } else {
                        dart();
                    }
                } else {
                    if (!gateBull) {
                        add(50);
                    } else {
                        dart();
                    }
                }
            }
        }
    }
    public void add(int number){ //adding points to someone's score
        if (player == 1) {
            scoreOne += number;
            displayPlayerOne();
        } else if (player == 2) {
            scoreTwo += number;
            displayPlayerTwo();
        } else if (player == 3) {
            scoreThree += number;
            displayPlayerThree();
        } else if (player == 4) {
            scoreFour += number;
            displayPlayerFour();
        } else if (player == 5) {
            scoreFive += number;
            displayPlayerFive();
        } else if (player == 6) {
            scoreSix += number;
            displayPlayerSix();
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
    public void twoTimes(View view){ //multiplies the number with 2
        timesT.setBackgroundColor(Color.GRAY);
        timesF.setBackgroundResource(android.R.drawable.btn_default);
        timesTh.setBackgroundResource(android.R.drawable.btn_default);
        timesTwo = true;
        timesThree = false;
        timesFour = false;
        multiply = 2;
    }
    public void threeTimes(View view){ //multiplies the number with 3
        timesTh.setBackgroundColor(Color.GRAY);
        timesF.setBackgroundResource(android.R.drawable.btn_default);
        timesT.setBackgroundResource(android.R.drawable.btn_default);
        timesTwo = false;
        timesThree = true;
        timesFour = false;
        multiply = 3;
    }
    public void fourTimes(View view){ //multiplies the number with 4
        timesF.setBackgroundColor(Color.GRAY);
        timesTh.setBackgroundResource(android.R.drawable.btn_default);
        timesT.setBackgroundResource(android.R.drawable.btn_default);
        timesTwo = false;
        timesThree = false;
        timesFour = true;
        multiply = 4;
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
    public void checkGate15(){ //this method is checking if everyone has shutdown gate 15
        if (numOfPlayers == 2){
            if (player1Fifteen.getText().equals("xxx") && player2Fifteen.getText().equals("xxx") && !gate15){
                gate15 = true;
            }
        } else if (numOfPlayers == 3){
            if (player1Fifteen.getText().equals("xxx") && player2Fifteen.getText().equals("xxx") && player3Fifteen.getText().equals("xxx") && !gate15){
                gate15 = true;
            }
        } else if (numOfPlayers == 4){
            if (player1Fifteen.getText().equals("xxx") && player2Fifteen.getText().equals("xxx") && player3Fifteen.getText().equals("xxx") &&
                    player4Fifteen.getText().equals("xxx") && !gate15){
                gate15 = true;
            }
        } else if (numOfPlayers == 5){
            if (player1Fifteen.getText().equals("xxx") && player2Fifteen.getText().equals("xxx") && player3Fifteen.getText().equals("xxx") &&
                    player4Fifteen.getText().equals("xxx") && player5Fifteen.getText().equals("xxx") && !gate15){
                gate15 = true;
            }
        } else if (numOfPlayers == 6){
            if (player1Fifteen.getText().equals("xxx") && player2Fifteen.getText().equals("xxx") && player3Fifteen.getText().equals("xxx") &&
                    player4Fifteen.getText().equals("xxx") && player5Fifteen.getText().equals("xxx") && player6Fifteen.getText().equals("xxx") && !gate15){
                gate15 = true;
            }
        }
    }
    public void checkGate16(){ //this method is checking if everyone has shutdown gate 16
        if (numOfPlayers == 2){
            if (player1Sixteen.getText().equals("xxx") && player2Sixteen.getText().equals("xxx")){
                gate16 = true;
            }
        } else if (numOfPlayers == 3){
            if (player1Sixteen.getText().equals("xxx") && player2Sixteen.getText().equals("xxx") && player3Sixteen.getText().equals("xxx")){
                gate16 = true;
            }
        } else if (numOfPlayers == 4){
            if (player1Sixteen.getText().equals("xxx") && player2Sixteen.getText().equals("xxx") && player3Sixteen.getText().equals("xxx") &&
                    player4Sixteen.getText().equals("xxx")){
                gate16 = true;
            }
        } else if (numOfPlayers == 5){
            if (player1Sixteen.getText().equals("xxx") && player2Sixteen.getText().equals("xxx") && player3Sixteen.getText().equals("xxx") &&
                    player4Sixteen.getText().equals("xxx") && player5Sixteen.getText().equals("xxx")){
                gate16 = true;
            }
        } else if (numOfPlayers == 6){
            if (player1Sixteen.getText().equals("xxx") && player2Sixteen.getText().equals("xxx") && player3Sixteen.getText().equals("xxx") &&
                    player4Sixteen.getText().equals("xxx") && player5Sixteen.getText().equals("xxx") && player6Sixteen.getText().equals("xxx")){
                gate16 = true;
            }
        }
    }
    public void checkGate17(){ //this method is checking if everyone has shutdown gate 17
        if (numOfPlayers == 2){
            if (player1Seventeen.getText().equals("xxx") && player2Seventeen.getText().equals("xxx")){
                gate17 = true;
            }
        } else if (numOfPlayers == 3){
            if (player1Seventeen.getText().equals("xxx") && player2Seventeen.getText().equals("xxx") && player3Seventeen.getText().equals("xxx")){
                gate17 = true;
            }
        } else if (numOfPlayers == 4){
            if (player1Seventeen.getText().equals("xxx") && player2Seventeen.getText().equals("xxx") && player3Seventeen.getText().equals("xxx") &&
                    player4Seventeen.getText().equals("xxx")){
                gate17 = true;
            }
        } else if (numOfPlayers == 5){
            if (player1Seventeen.getText().equals("xxx") && player2Seventeen.getText().equals("xxx") && player3Seventeen.getText().equals("xxx") &&
                    player4Seventeen.getText().equals("xxx") && player5Seventeen.getText().equals("xxx")){
                gate17 = true;
            }
        } else if (numOfPlayers == 6){
            if (player1Seventeen.getText().equals("xxx") && player2Seventeen.getText().equals("xxx") && player3Seventeen.getText().equals("xxx") &&
                    player4Seventeen.getText().equals("xxx") && player5Seventeen.getText().equals("xxx") && player6Seventeen.getText().equals("xxx")){
                gate17 = true;
            }
        }
    }
    public void checkGate18(){ //this method is checking if everyone has shutdown gate 18
        if (numOfPlayers == 2){
            if (player1Eighteen.getText().equals("xxx") && player2Eighteen.getText().equals("xxx")){
                gate18 = true;
            }
        } else if (numOfPlayers == 3){
            if (player1Eighteen.getText().equals("xxx") && player2Eighteen.getText().equals("xxx") && player3Eighteen.getText().equals("xxx")){
                gate18 = true;
            }
        } else if (numOfPlayers == 4){
            if (player1Eighteen.getText().equals("xxx") && player2Eighteen.getText().equals("xxx") && player3Eighteen.getText().equals("xxx") &&
                    player4Eighteen.getText().equals("xxx")){
                gate18 = true;
            }
        } else if (numOfPlayers == 5){
            if (player1Eighteen.getText().equals("xxx") && player2Eighteen.getText().equals("xxx") && player3Eighteen.getText().equals("xxx") &&
                    player4Eighteen.getText().equals("xxx") && player5Eighteen.getText().equals("xxx")){
                gate18 = true;
            }
        } else if (numOfPlayers == 6){
            if (player1Eighteen.getText().equals("xxx") && player2Eighteen.getText().equals("xxx") && player3Eighteen.getText().equals("xxx") &&
                    player4Eighteen.getText().equals("xxx") && player5Eighteen.getText().equals("xxx") && player6Eighteen.getText().equals("xxx")){
                gate18 = true;
            }
        }
    }
    public void checkGate19(){ //this method is checking if everyone has shutdown gate 19
        if (numOfPlayers == 2){
            if (player1Nineteen.getText().equals("xxx") && player2Nineteen.getText().equals("xxx")){
                gate19 = true;
            }
        } else if (numOfPlayers == 3){
            if (player1Nineteen.getText().equals("xxx") && player2Nineteen.getText().equals("xxx") && player3Nineteen.getText().equals("xxx")){
                gate19 = true;
            }
        } else if (numOfPlayers == 4){
            if (player1Nineteen.getText().equals("xxx") && player2Nineteen.getText().equals("xxx") && player3Nineteen.getText().equals("xxx") &&
                    player4Nineteen.getText().equals("xxx")){
                gate19 = true;
            }
        } else if (numOfPlayers == 5){
            if (player1Nineteen.getText().equals("xxx") && player2Nineteen.getText().equals("xxx") && player3Nineteen.getText().equals("xxx") &&
                    player4Nineteen.getText().equals("xxx") && player5Nineteen.getText().equals("xxx")){
                gate19 = true;
            }
        } else if (numOfPlayers == 6){
            if (player1Nineteen.getText().equals("xxx") && player2Nineteen.getText().equals("xxx") && player3Nineteen.getText().equals("xxx") &&
                    player4Nineteen.getText().equals("xxx") && player5Nineteen.getText().equals("xxx") && player6Nineteen.getText().equals("xxx")){
                gate19 = true;
            }
        }
    }
    public void checkGate20(){ //this method is checking if everyone has shutdown gate 20
        if (numOfPlayers == 2){
            if (player1Twenty.getText().equals("xxx") && player2Twenty.getText().equals("xxx")){
                gate20 = true;
            }
        } else if (numOfPlayers == 3){
            if (player1Twenty.getText().equals("xxx") && player2Twenty.getText().equals("xxx") && player3Twenty.getText().equals("xxx")){
                gate20 = true;
            }
        } else if (numOfPlayers == 4){
            if (player1Twenty.getText().equals("xxx") && player2Twenty.getText().equals("xxx") && player3Twenty.getText().equals("xxx") &&
                    player4Twenty.getText().equals("xxx")){
                gate20 = true;
            }
        } else if (numOfPlayers == 5){
            if (player1Twenty.getText().equals("xxx") && player2Twenty.getText().equals("xxx") && player3Twenty.getText().equals("xxx") &&
                    player4Twenty.getText().equals("xxx") && player5Twenty.getText().equals("xxx")){
                gate20 = true;
            }
        } else if (numOfPlayers == 6){
            if (player1Twenty.getText().equals("xxx") && player2Twenty.getText().equals("xxx") && player3Twenty.getText().equals("xxx") &&
                    player4Twenty.getText().equals("xxx") && player5Twenty.getText().equals("xxx") && player6Twenty.getText().equals("xxx")){
                gate20 = true;
            }
        }
    }
    public void checkGateBull(){ //this method is checking if everyone has shutdown gate bull
        if (numOfPlayers == 2){
            if (player1Bull.getText().equals("xxx") && player2Bull.getText().equals("xxx")){
                gateBull = true;
            }
        } else if (numOfPlayers == 3){
            if (player1Bull.getText().equals("xxx") && player2Bull.getText().equals("xxx") && player3Bull.getText().equals("xxx")){
                gateBull = true;
            }
        } else if (numOfPlayers == 4){
            if (player1Bull.getText().equals("xxx") && player2Bull.getText().equals("xxx") && player3Bull.getText().equals("xxx") &&
                    player4Bull.getText().equals("xxx")){
                gateBull = true;
            }
        } else if (numOfPlayers == 5){
            if (player1Bull.getText().equals("xxx") && player2Bull.getText().equals("xxx") && player3Bull.getText().equals("xxx") &&
                    player4Bull.getText().equals("xxx") && player5Bull.getText().equals("xxx")){
                gateBull = true;
            }
        } else if (numOfPlayers == 6){
            if (player1Bull.getText().equals("xxx") && player2Bull.getText().equals("xxx") && player3Bull.getText().equals("xxx") &&
                    player4Bull.getText().equals("xxx") && player5Bull.getText().equals("xxx") && player6Bull.getText().equals("xxx")){
                gateBull = true;
            }
        }
    }
    public void deleteExtraRowOfPoints(){ //this method checks and deletes rows that are extra
        if (numOfPlayers == 2){
            rowOfPoints4.setVisibility(View.GONE);
            rowOfPoints5.setVisibility(View.GONE);
            rowOfPoints6.setVisibility(View.GONE);
            rowOfPoints7.setVisibility(View.GONE);
        } else if (numOfPlayers == 3){
            rowOfPoints5.setVisibility(View.GONE);
            rowOfPoints6.setVisibility(View.GONE);
            rowOfPoints7.setVisibility(View.GONE);
        } else if (numOfPlayers == 4){
            rowOfPoints6.setVisibility(View.GONE);
            rowOfPoints7.setVisibility(View.GONE);
        } else if (numOfPlayers == 5){
            rowOfPoints7.setVisibility(View.GONE);
        }
    }
    public void checkEarlyWin(){ //method that checks every round if there is someone that closed everything
        if (player == 1){
            if (player1Bull.getText().equals("xxx") && player1Twenty.getText().equals("xxx") && player1Nineteen.getText().equals("xxx") &&
                    player1Eighteen.getText().equals("xxx") && player1Seventeen.getText().equals("xxx") && player1Sixteen.getText().equals("xxx") &&
                        player1Fifteen.getText().equals("xxx")){
                win = true;
                winner = 1;
                gatherScores();
                for (int i = 0; i <= 5; i++){
                    if (scores[i] > scores[0]){
                        win = false; break;
                    }
                }
            }
        } else if (player == 2){
            if (player2Bull.getText().equals("xxx") && player2Twenty.getText().equals("xxx") && player2Nineteen.getText().equals("xxx") &&
                    player2Eighteen.getText().equals("xxx") && player2Seventeen.getText().equals("xxx") && player2Sixteen.getText().equals("xxx") &&
                        player2Fifteen.getText().equals("xxx")){
                win = true;
                winner = 2;
                gatherScores();
                for (int i = 0; i <= 5; i++){
                    if (scores[i] > scores[1]){
                        win = false; break;
                    }
                }
            }
        } else if (player == 3){
            if (player3Bull.getText().equals("xxx") && player3Twenty.getText().equals("xxx") && player3Nineteen.getText().equals("xxx") &&
                    player3Eighteen.getText().equals("xxx") && player3Seventeen.getText().equals("xxx") && player3Sixteen.getText().equals("xxx") &&
                        player3Fifteen.getText().equals("xxx")){
                win = true;
                winner = 3;
                gatherScores();
                for (int i = 0; i <= 5; i++){
                    if (scores[i] > scores[2]){
                        win = false; break;
                    }
                }
            }
        } else if (player == 4){
            if (player4Bull.getText().equals("xxx") && player4Twenty.getText().equals("xxx") && player4Nineteen.getText().equals("xxx") &&
                    player4Eighteen.getText().equals("xxx") && player4Seventeen.getText().equals("xxx") && player4Sixteen.getText().equals("xxx") &&
                        player4Fifteen.getText().equals("xxx")){
                win = true;
                winner = 4;
                gatherScores();
                for (int i = 0; i <= 5; i++){
                    if (scores[i] > scores[3]){
                        win = false; break;
                    }
                }
            }
        } else if (player == 5){
            if (player5Bull.getText().equals("xxx") && player5Twenty.getText().equals("xxx") && player5Nineteen.getText().equals("xxx") &&
                    player5Eighteen.getText().equals("xxx") && player5Seventeen.getText().equals("xxx") && player5Sixteen.getText().equals("xxx") &&
                        player5Fifteen.getText().equals("xxx")){
                win = true;
                winner = 5;
                gatherScores();
                for (int i = 0; i <= 5; i++){
                    if (scores[i] > scores[4]){
                        win = false; break;
                    }
                }
            }
        } else if (player == 6){
            if (player6Bull.getText().equals("xxx") && player6Twenty.getText().equals("xxx") && player6Nineteen.getText().equals("xxx") &&
                    player6Eighteen.getText().equals("xxx") && player6Seventeen.getText().equals("xxx") && player6Sixteen.getText().equals("xxx") &&
                        player6Fifteen.getText().equals("xxx")){
                win = true;
                winner = 6;
                gatherScores();
                for (int i = 0; i <= 5; i++){
                    if (scores[i] > scores[5]){
                        win = false; break;
                    }
                }
            }
        }
        if (win){
            declareTheWinner();
        }
    }
    public void sumPoints(){ //method that sums points for players that are playing
        if (numOfPlayers == 2){
            sumP1 += scoreOne;
            sumP2 += scoreTwo;
            sums[0] = sumP1;
            sums[1] = sumP2;
        } else if (numOfPlayers == 3){
            sumP1 += scoreOne;
            sumP2 += scoreTwo;
            sumP3 += scoreThree;
            sums[0] = sumP1;
            sums[1] = sumP2;
            sums[2] = sumP3;
        } else if (numOfPlayers == 4){
            sumP1 += scoreOne;
            sumP2 += scoreTwo;
            sumP3 += scoreThree;
            sumP4 += scoreFour;
            sums[0] = sumP1;
            sums[1] = sumP2;
            sums[2] = sumP3;
            sums[3] = sumP4;
        } else if (numOfPlayers == 5){
            sumP1 += scoreOne;
            sumP2 += scoreTwo;
            sumP3 += scoreThree;
            sumP4 += scoreFour;
            sumP5 += scoreFive;
            sums[0] = sumP1;
            sums[1] = sumP2;
            sums[2] = sumP3;
            sums[3] = sumP4;
            sums[4] = sumP5;
        } else {
            sumP1 += scoreOne;
            sumP2 += scoreTwo;
            sumP3 += scoreThree;
            sumP4 += scoreFour;
            sumP5 += scoreFive;
            sumP6 += scoreSix;
            sums[0] = sumP1;
            sums[1] = sumP2;
            sums[2] = sumP3;
            sums[3] = sumP4;
            sums[4] = sumP5;
            sums[5] = sumP6;
        }
    }
    public void declareTheWinner(){ //method that declares the winner and stops the game
        String k = "";
        first.setBackgroundColor(Color.TRANSPARENT);
        second.setBackgroundColor(Color.TRANSPARENT);
        third.setBackgroundColor(Color.TRANSPARENT);
        forth.setBackgroundColor(Color.TRANSPARENT);
        fifth.setBackgroundColor(Color.TRANSPARENT);
        sixth.setBackgroundColor(Color.TRANSPARENT);
        returnButton.setVisibility(View.VISIBLE);
        if (winner == 1){
            k = "Winner: Player 1";
            roundText.setText(k);
        } else if (winner == 2){
            k = "Winner: Player 2";
            roundText.setText(k);
        } else if (winner == 3){
            k = "Winner: Player 3";
            roundText.setText(k);
        } else if (winner == 4){
            k = "Winner: Player 4";
            roundText.setText(k);
        } else if (winner == 5){
            k = "Winner: Player 5";
            roundText.setText(k);
        } else if (winner == 6){
            k = "Winner: Player 6";
            roundText.setText(k);
        }
        disableAllButtons();
    }
    public void checkTheEndWinner(){ //method that after 20 rounds checks the winner
        sumPoints();
        winner = 1;
        int p = 0; //id in the array for the biggest sum
        if (numOfPlayers == 2){
            for (int i = 0; i <= 1; i++){
                if (sums[i] > sums[p]){
                    p = i;
                    winner = i + 1;
                }
            }
        } else if (numOfPlayers == 3){
            for (int i = 0; i <= 2; i++){
                if (sums[i] > sums[p]){
                    p = i;
                    winner = i + 1;
                }
            }
        } else if (numOfPlayers == 4){
            for (int i = 0; i <= 3; i++){
                if (sums[i] > sums[p]){
                    p = i;
                    winner = i + 1;
                }
            }
        } else if (numOfPlayers == 5){
            for (int i = 0; i <= 4; i++){
                if (sums[i] > sums[p]){
                    p = i;
                    winner = i + 1;
                }
            }
        } else if (numOfPlayers == 6){
            for (int i = 0; i <= 5; i++){
                if (sums[i] > sums[p]){
                    p = i;
                    winner = i + 1;
                }
            }
        }
        declareTheWinner();
    }
    public void gatherScores(){ //method for collecting every score to check it afterwards
        scores[0] = scoreOne;
        scores[1] = scoreTwo;
        scores[2] = scoreThree;
        scores[3] = scoreFour;
        scores[4] = scoreFive;
        scores[5] = scoreSix;
    }
    public void disableAllButtons(){
        missButton.setClickable(false);
        fifty.setClickable(false);
        twentyFive.setClickable(false);
        twenty.setClickable(false);
        nineteen.setClickable(false);
        eighteen.setClickable(false);
        seventeen.setClickable(false);
        sixteen.setClickable(false);
        fifteen.setClickable(false);
        timesT.setClickable(false);
        timesTh.setClickable(false);
        timesF.setClickable(false);
    }
    public void returnToPickingParameters(View view){
        finish();
    }
}