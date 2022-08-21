package com.junduk.android.dartsscoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AroundTheWorld2 extends AppCompatActivity {
    Button hitButton, missButton, backButton;
    ImageView dart1, dart2, dart3;
    LinearLayout firstPlayer, secondPlayer, thirdPlayer, forthPlayer, fifthPlayer, sixthPlayer;
    TextView currentPlayer, target, dartsCount, limit;
    TextView playerOne, playerTwo, playerThree, playerFour, playerFive, playerSix, first, second, third, forth, fifth, sixth;
    Bundle extras;
    int numOfPlayers, targetOne, targetTwo, targetThree, targetFour, targetFive, targetSix, counter, player, lastTieBreakPlayer, n;
    int dartsCount1, dartsCount2, dartsCount3, dartsCount4, dartsCount5, dartsCount6;
    int[] biggestDartsCount, index;
    Boolean done, tieBreak, equal;
    String name1, name2, name3, name4, name5, name6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_around_the_world2);
        //darts
        dart1 = findViewById(R.id.dart1);
        dart2 = findViewById(R.id.dart2);
        dart3 = findViewById(R.id.dart3);
        //LinearLayouts for players
        firstPlayer = findViewById(R.id.firstPlayer);
        secondPlayer = findViewById(R.id.secondPlayer);
        thirdPlayer = findViewById(R.id.thirdPlayer);
        forthPlayer = findViewById(R.id.forthPlayer);
        fifthPlayer = findViewById(R.id.fifthPlayer);
        sixthPlayer = findViewById(R.id.sixthPlayer);
        //buttons
        hitButton = findViewById(R.id.hitButton);
        missButton = findViewById(R.id.missButton);
        backButton = findViewById(R.id.backButton);
        //textviews in the middle
        currentPlayer = findViewById(R.id.currentPlayer);
        target = findViewById(R.id.target);
        dartsCount = findViewById(R.id.dartsCount);
        limit = findViewById(R.id.limit);
        //players
        playerOne = findViewById(R.id.playerOne);
        playerTwo = findViewById(R.id.playerTwo);
        playerThree = findViewById(R.id.playerThree);
        playerFour = findViewById(R.id.playerFour);
        playerFive = findViewById(R.id.playerFive);
        playerSix = findViewById(R.id.playerSix);
        //player targets
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        forth = findViewById(R.id.forth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        extras = getIntent().getExtras();
        //setting dinamical targets for everyone
        targetOne = 1;
        targetTwo = 1;
        targetThree = 1;
        targetFour = 1;
        targetFive = 1;
        targetSix = 1;
        //setting darts count for everyone
        dartsCount1 = 0;
        dartsCount2 = 0;
        dartsCount3 = 0;
        dartsCount4 = 0;
        dartsCount5 = 0;
        dartsCount6 = 0;
        //setting other little things
        counter = 3;
        player = 1;
        lastTieBreakPlayer = 0;
        done = false;
        tieBreak = false;
        biggestDartsCount = new int[]{0, 0, 0, 0, 0, 0};
        index = new int[]{0, 0, 0, 0, 0, 0};
        if (extras != null) {
            numOfPlayers = extras.getInt("players");
            equal = extras.getBoolean("equal");
        }
        if (!equal){
            limit.setVisibility(View.GONE);
        }
        setPlayers();
        settingUpTheGame();
        currentPlayer.setText(first.getText().toString().trim());
        String firstTarget = "Target: " + targetOne;
        target.setText(firstTarget);
        first.setBackgroundColor(Color.parseColor("#89cff0"));
    }
    public void checkNumOfDarts(){
        if (player == 1){
            if (dartsCount1 == 50){
                counter = 1;
                done = true;
            }
        } else if (player == 2){
            if (dartsCount2 == 50){
                counter = 1;
                done = true;
            }
        } else if (player == 3){
            if (dartsCount3 == 50){
                counter = 1;
                done = true;
            }
        } else if (player == 4){
            if (dartsCount4 == 50){
                counter = 1;
                done = true;
            }
        } else if (player == 5){
            if (dartsCount5 == 50){
                counter = 1;
                done = true;
            }
        } else if (player == 6){
            if (dartsCount6 == 50){
                counter = 1;
                done = true;
            }
        }
    }
    public void setPlayers(){
        if (numOfPlayers == 2){
            thirdPlayer.setVisibility(View.GONE);
            forthPlayer.setVisibility(View.GONE);
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
            name1 = extras.getString("name1");
            name2 = extras.getString("name2");
            first.setText(name1);
            second.setText(name2);
        } else if (numOfPlayers == 3){
            forthPlayer.setVisibility(View.GONE);
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
            name1 = extras.getString("name1");
            name2 = extras.getString("name2");
            name3 = extras.getString("name3");
            first.setText(name1);
            second.setText(name2);
            third.setText(name3);
        } else if (numOfPlayers == 4){
            fifthPlayer.setVisibility(View.GONE);
            sixthPlayer.setVisibility(View.GONE);
            name1 = extras.getString("name1");
            name2 = extras.getString("name2");
            name3 = extras.getString("name3");
            name4 = extras.getString("name4");
            first.setText(name1);
            second.setText(name2);
            third.setText(name3);
            forth.setText(name4);
        } else if (numOfPlayers == 5){
            sixthPlayer.setVisibility(View.GONE);
            name1 = extras.getString("name1");
            name2 = extras.getString("name2");
            name3 = extras.getString("name3");
            name4 = extras.getString("name4");
            name5 = extras.getString("name5");
            first.setText(name1);
            second.setText(name2);
            third.setText(name3);
            forth.setText(name4);
            fifth.setText(name5);
        } else if (numOfPlayers == 6){
            name1 = extras.getString("name1");
            name2 = extras.getString("name2");
            name3 = extras.getString("name3");
            name4 = extras.getString("name4");
            name5 = extras.getString("name5");
            name6 = extras.getString("name6");
            first.setText(name1);
            second.setText(name2);
            third.setText(name3);
            forth.setText(name4);
            fifth.setText(name5);
            sixth.setText(name6);
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
    public void miss(View view){
        if (!tieBreak) {
            darts();
        } else { //made another darts-like method for tie break because amplifyingDartsCount() isn't needed when a player misses in a tie break
            counter -= 1;
            if (counter == 2){
                dart3.setVisibility(View.INVISIBLE);
            } else if (counter == 1){
                dart2.setVisibility(View.INVISIBLE);
            } else if (counter == 0) {
                if (player != lastTieBreakPlayer) {
                    counter = 3;
                    changingTieBreakPlayers();
                } else {
                    if (equal){
                        checkingTieBreakAgainWithLimits();
                    } else {
                        checkingTieBreakAgain();
                    }
                }
            }
        }
    }
    public void darts(){ //method for changing darts and players
        amplifyingDartsCount();
        if (equal) {
            checkNumOfDarts();
        }
        counter -= 1;
        if (counter == 2){
            dart3.setVisibility(View.INVISIBLE);
        } else if (counter == 1){
            dart2.setVisibility(View.INVISIBLE);
        } else if (counter == 0){
            if (tieBreak && player != lastTieBreakPlayer) {
                counter = 3;
                changingTieBreakPlayers();
            } else if (tieBreak && !equal){
                checkingTieBreakAgain();
            } else if (tieBreak){
                checkingTieBreakAgainWithLimits();
            } else if (done && player == numOfPlayers && !equal){
                tieBreakCheck();
            } else if (done && player == numOfPlayers){
                tieBreakCheckWithLimits();
            } else {
                dart3.setVisibility(View.VISIBLE);
                dart2.setVisibility(View.VISIBLE);
                counter = 3;
                player++;
                if (player > numOfPlayers) {
                    player = 1;
                }
                changingPlayers();
                changingDartsCountAndTargets();
            }
        }
    }
    public void winnerWithLimits(){
        hitButton.setClickable(false);
        hitButton.setEnabled(false);
        missButton.setClickable(false);
        missButton.setEnabled(false);
        backButton.setClickable(true);
        backButton.setEnabled(true);
        backButton.setVisibility(View.VISIBLE);
        target.setVisibility(View.GONE);
        limit.setVisibility(View.GONE);
        dartsCount.setVisibility(View.GONE);
        first.setBackgroundColor(Color.TRANSPARENT);
        second.setBackgroundColor(Color.TRANSPARENT);
        third.setBackgroundColor(Color.TRANSPARENT);
        forth.setBackgroundColor(Color.TRANSPARENT);
        fifth.setBackgroundColor(Color.TRANSPARENT);
        sixth.setBackgroundColor(Color.TRANSPARENT);
        dart1.setVisibility(View.VISIBLE);
        dart2.setVisibility(View.VISIBLE);
        dart3.setVisibility(View.VISIBLE);
        if (index[0] == 1){
            String winner = "Winner";
            playerOne.setText(winner);
            String nothing = "";
            playerTwo.setText(nothing);
            playerThree.setText(nothing);
            playerFour.setText(nothing);
            playerFive.setText(nothing);
            playerSix.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        } else if (index[0] == 2){
            String winner = "Winner";
            playerTwo.setText(winner);
            String nothing = "";
            playerOne.setText(nothing);
            playerThree.setText(nothing);
            playerFour.setText(nothing);
            playerFive.setText(nothing);
            playerSix.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        } else if (index[0] == 3){
            String winner = "Winner";
            playerThree.setText(winner);
            String nothing = "";
            playerOne.setText(nothing);
            playerTwo.setText(nothing);
            playerFour.setText(nothing);
            playerFive.setText(nothing);
            playerSix.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        } else if (index[0] == 4){
            String winner = "Winner";
            playerFour.setText(winner);
            String nothing = "";
            playerOne.setText(nothing);
            playerTwo.setText(nothing);
            playerThree.setText(nothing);
            playerFive.setText(nothing);
            playerSix.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        } else if (index[0] == 5){
            String winner = "Winner";
            playerFive.setText(winner);
            String nothing = "";
            playerOne.setText(nothing);
            playerTwo.setText(nothing);
            playerThree.setText(nothing);
            playerFour.setText(nothing);
            playerSix.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        } else if (index[0] == 6){
            String winner = "Winner";
            playerSix.setText(winner);
            String nothing = "";
            playerOne.setText(nothing);
            playerTwo.setText(nothing);
            playerThree.setText(nothing);
            playerFour.setText(nothing);
            playerFive.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        }
    }
    public void checkingTieBreakAgainWithLimits(){ //method for checking after the tie break with limits
        int sum = dartsCount1 + dartsCount2 + dartsCount3 + dartsCount4 + dartsCount5 + dartsCount6;
        if (sum != 0) {
            biggestDartsCount = new int[]{0, 0, 0, 0, 0, 0};
            index = new int[]{0, 0, 0, 0, 0, 0};
            int[] listOfLevels = {dartsCount1, dartsCount2, dartsCount3, dartsCount4, dartsCount5, dartsCount6};
            if (numOfPlayers == 2){ //because every target can be 0 and then all players are going to be in the tie break even if they aren't playing
                listOfLevels[2] = -1;
                listOfLevels[3] = -1;
                listOfLevels[4] = -1;
                listOfLevels[5] = -1;
            } else if (numOfPlayers == 3){
                listOfLevels[3] = -1;
                listOfLevels[4] = -1;
                listOfLevels[5] = -1;
            } else if (numOfPlayers == 4){
                listOfLevels[4] = -1;
                listOfLevels[5] = -1;
            } else if (numOfPlayers == 5){
                listOfLevels[5] = -1;
            }
            biggestDartsCount[0] = listOfLevels[0]; //using the variable biggestDartsCount but it's really biggestTargetCount
            index[0] = 1;
            for (int i = 1; i <= 5; i++) { //searching for the highest target count
                if (listOfLevels[i] > biggestDartsCount[0]) {
                    biggestDartsCount[0] = listOfLevels[i];
                    index[0] = i + 1;
                }
            }
            n = 1;
            for (int i = 1; i <= 5; i++) { //searching for the same target count
                if (listOfLevels[i] == biggestDartsCount[0] && index[0] != (i + 1)) {
                    biggestDartsCount[n] = listOfLevels[i];
                    index[n] = i + 1;
                    n++;
                }
            }
        }
        if (biggestDartsCount[1] == 0){
            winnerWithLimits();
        } else {
            tieBreak = true;
            settingUpTheTieBreak();
        }
    }
    public void checkingTieBreakAgain(){ //method for checking after the tie break
        int sum = dartsCount1 + dartsCount2 + dartsCount3 + dartsCount4 + dartsCount5 + dartsCount6;
        if (sum != 0) {
            biggestDartsCount = new int[]{0, 0, 0, 0, 0, 0};
            index = new int[]{0, 0, 0, 0, 0, 0};
            int[] listOfUsedDarts = {dartsCount1, dartsCount2, dartsCount3, dartsCount4, dartsCount5, dartsCount6};
            String[] listOfPlayers = {playerOne.getText().toString().trim(), playerTwo.getText().toString().trim(), playerThree.getText().toString().trim(), playerFour.getText().toString().trim(), playerFive.getText().toString().trim(), playerSix.getText().toString().trim()};
            for (int i = 0; i <= 5; i++){ //making the first one for the reference later
                if (!listOfPlayers[i].equalsIgnoreCase("0")){
                    biggestDartsCount[0] = listOfUsedDarts[i];
                    index[0] = i + 1;
                    break;
                }
            }
            for (int i = 1; i <= 5; i++) { //searching for the highest darts count
                if (listOfUsedDarts[i] > biggestDartsCount[0]) {
                    biggestDartsCount[0] = listOfUsedDarts[i];
                    index[0] = i + 1;
                }
            }
            n = 1;
            for (int i = 1; i <= 5; i++) { //searching for the same darts count
                if (listOfUsedDarts[i] == biggestDartsCount[0] && index[0] != (i + 1)) {
                    biggestDartsCount[n] = listOfUsedDarts[i];
                    index[n] = i + 1;
                    n++;
                }
            }
        }
        if (biggestDartsCount[1] == 0){
            winner();
        } else {
            tieBreak = true;
            settingUpTheTieBreak();
        }
    }
    public void tieBreakCheckWithLimits() { //method for checking if there's a tie break with limits
        int[] listOfLevels = {targetOne, targetTwo, targetThree, targetFour, targetFive, targetSix};
        if (numOfPlayers == 2){ //because every target can be 0 and then all players are going to be in the tie break even if they aren't playing
            listOfLevels[2] = -1;
            listOfLevels[3] = -1;
            listOfLevels[4] = -1;
            listOfLevels[5] = -1;
        } else if (numOfPlayers == 3){
            listOfLevels[3] = -1;
            listOfLevels[4] = -1;
            listOfLevels[5] = -1;
        } else if (numOfPlayers == 4){
            listOfLevels[4] = -1;
            listOfLevels[5] = -1;
        } else if (numOfPlayers == 5){
            listOfLevels[5] = -1;
        }
        biggestDartsCount[0] = listOfLevels[0]; //using the variable biggestDartsCount but it's really biggestTargetCount
        index[0] = 1;
        for (int i = 1; i <= 5; i++) { //searching for the highest target count
            if (listOfLevels[i] > biggestDartsCount[0]) {
                biggestDartsCount[0] = listOfLevels[i];
                index[0] = i + 1;
            }
        }
        n = 1;
        for (int i = 1; i <= 5; i++) { //searching for the same target count
            if (listOfLevels[i] == biggestDartsCount[0] && index[0] != (i + 1)) {
                biggestDartsCount[n] = listOfLevels[i];
                index[n] = i + 1;
                n++;
            }
        }
        if (biggestDartsCount[1] == 0) {
            winnerWithLimits();
        } else {
            tieBreak = true;
            settingUpTheTieBreak();
        }
    }
    public void tieBreakCheck(){ //method for checking if there's a tie break
        int[] listOfUsedDarts = {dartsCount1, dartsCount2, dartsCount3, dartsCount4, dartsCount5, dartsCount6};
        String[] listOfPlayers = {playerOne.getText().toString().trim(), playerTwo.getText().toString().trim(), playerThree.getText().toString().trim(), playerFour.getText().toString().trim(), playerFive.getText().toString().trim(), playerSix.getText().toString().trim()};
        for (int i = 0; i <= 5; i++){ //making the first one for the reference later
            if (listOfPlayers[i].equalsIgnoreCase("Done")){
                biggestDartsCount[0] = listOfUsedDarts[i];
                index[0] = i + 1;
                break;
            }
        }
        for (int i = 1; i <= 5; i++) { //searching for the lowest darts count
            if (listOfUsedDarts[i] < biggestDartsCount[0] && listOfPlayers[i].equalsIgnoreCase("Done")) {
                biggestDartsCount[0] = listOfUsedDarts[i];
                index[0] = i + 1;
            }
        }
        n = 1;
        for (int i = 1; i <= 5; i++) { //searching for the same darts count
            if (listOfUsedDarts[i] == biggestDartsCount[0] && index[0] != (i + 1) && listOfPlayers[i].equalsIgnoreCase("Done")) {
                biggestDartsCount[n] = listOfUsedDarts[i];
                index[n] = i + 1;
                n++;
            }
        }
        if (biggestDartsCount[1] == 0){
            if (equal){
                winnerWithLimits();
            } else {
                winner();
            }
        } else {
            tieBreak = true;
            settingUpTheTieBreak();
        }
    }
    public void winner(){ //method that declares the winner and disables everything
        hitButton.setClickable(false);
        hitButton.setEnabled(false);
        missButton.setClickable(false);
        missButton.setEnabled(false);
        backButton.setClickable(true);
        backButton.setEnabled(true);
        backButton.setVisibility(View.VISIBLE);
        target.setVisibility(View.GONE);
        limit.setVisibility(View.GONE);
        dartsCount.setVisibility(View.GONE);
        first.setBackgroundColor(Color.TRANSPARENT);
        second.setBackgroundColor(Color.TRANSPARENT);
        third.setBackgroundColor(Color.TRANSPARENT);
        forth.setBackgroundColor(Color.TRANSPARENT);
        fifth.setBackgroundColor(Color.TRANSPARENT);
        sixth.setBackgroundColor(Color.TRANSPARENT);
        dart1.setVisibility(View.VISIBLE);
        dart2.setVisibility(View.VISIBLE);
        dart3.setVisibility(View.VISIBLE);
        if (index[0] == 1){
            String winner = "Winner";
            playerOne.setText(winner);
            String nothing = "";
            playerTwo.setText(nothing);
            playerThree.setText(nothing);
            playerFour.setText(nothing);
            playerFive.setText(nothing);
            playerSix.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        } else if (index[0] == 2){
            String winner = "Winner";
            playerTwo.setText(winner);
            String nothing = "";
            playerOne.setText(nothing);
            playerThree.setText(nothing);
            playerFour.setText(nothing);
            playerFive.setText(nothing);
            playerSix.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        } else if (index[0] == 3){
            String winner = "Winner";
            playerThree.setText(winner);
            String nothing = "";
            playerOne.setText(nothing);
            playerTwo.setText(nothing);
            playerFour.setText(nothing);
            playerFive.setText(nothing);
            playerSix.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        } else if (index[0] == 4){
            String winner = "Winner";
            playerFour.setText(winner);
            String nothing = "";
            playerOne.setText(nothing);
            playerTwo.setText(nothing);
            playerThree.setText(nothing);
            playerFive.setText(nothing);
            playerSix.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        } else if (index[0] == 5){
            String winner = "Winner";
            playerFive.setText(winner);
            String nothing = "";
            playerOne.setText(nothing);
            playerTwo.setText(nothing);
            playerThree.setText(nothing);
            playerFour.setText(nothing);
            playerSix.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        } else if (index[0] == 6){
            String winner = "Winner";
            playerSix.setText(winner);
            String nothing = "";
            playerOne.setText(nothing);
            playerTwo.setText(nothing);
            playerThree.setText(nothing);
            playerFour.setText(nothing);
            playerFive.setText(nothing);
            String over = "Game over";
            currentPlayer.setText(over);
        }
    }
    public void settingUpTheTieBreak(){ //method for setting up the tie break
        String tBrk = "Tie Break";
        currentPlayer.setText(tBrk);
        first.setBackgroundColor(Color.TRANSPARENT);
        second.setBackgroundColor(Color.TRANSPARENT);
        third.setBackgroundColor(Color.TRANSPARENT);
        forth.setBackgroundColor(Color.TRANSPARENT);
        fifth.setBackgroundColor(Color.TRANSPARENT);
        sixth.setBackgroundColor(Color.TRANSPARENT);
        dartsCount1 = 0;
        dartsCount2 = 0;
        dartsCount3 = 0;
        dartsCount4 = 0;
        dartsCount5 = 0;
        dartsCount6 = 0;
        dart1.setVisibility(View.VISIBLE);
        dart2.setVisibility(View.VISIBLE);
        dart3.setVisibility(View.VISIBLE);
        target.setVisibility(View.GONE);
        dartsCount.setVisibility(View.GONE);
        firstPlayer.setVisibility(View.GONE);
        secondPlayer.setVisibility(View.GONE);
        thirdPlayer.setVisibility(View.GONE);
        forthPlayer.setVisibility(View.GONE);
        fifthPlayer.setVisibility(View.GONE);
        sixthPlayer.setVisibility(View.GONE);
        for (int i = 0; i <= 5; i++){
            if (biggestDartsCount[i] == 0){
                break;
            } else {
                lastTieBreakPlayer = index[i];
                if (index[i] == 1){
                    firstPlayer.setVisibility(View.VISIBLE);
                    playerOne.setText("0");
                } else if (index[i] == 2){
                    secondPlayer.setVisibility(View.VISIBLE);
                    playerTwo.setText("0");
                } else if (index[i] == 3){
                    thirdPlayer.setVisibility(View.VISIBLE);
                    playerThree.setText("0");
                } else if (index[i] == 4){
                    forthPlayer.setVisibility(View.VISIBLE);
                    playerFour.setText("0");
                } else if (index[i] == 5){
                    fifthPlayer.setVisibility(View.VISIBLE);
                    playerFive.setText("0");
                } else if (index[i] == 6){
                    sixthPlayer.setVisibility(View.VISIBLE);
                    playerSix.setText("0");
                }
            }
        }
        counter = 3;
        if (index[0] == 1){
            player = 1;
            first.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (index[0] == 2){
            player = 2;
            second.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (index[0] == 3){
            player = 3;
            third.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (index[0] == 4){
            player = 4;
            forth.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (index[0] == 5){
            player = 5;
            fifth.setBackgroundColor(Color.parseColor("#89cff0"));
        } else if (index[0] == 6){
            player = 6;
            sixth.setBackgroundColor(Color.parseColor("#89cff0"));
        }
    }
    public void changingTieBreakPlayers(){
        for (int i = 0; i <= 5; i++){
            if (player == index[i]){
                player = index[i + 1];
                changingPlayers();
                dart1.setVisibility(View.VISIBLE);
                dart2.setVisibility(View.VISIBLE);
                dart3.setVisibility(View.VISIBLE);
                break;
            }
        }
    }
    public void back(View view){
        finish();
    }
    public void changingPlayers(){ //method for changing colors of the players
        if (!tieBreak) {
            if (player == 1) {
                currentPlayer.setText(first.getText().toString().trim());
                first.setBackgroundColor(Color.parseColor("#89cff0"));
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.TRANSPARENT);
            } else if (player == 2) {
                currentPlayer.setText(second.getText().toString().trim());
                first.setBackgroundColor(Color.TRANSPARENT);
                second.setBackgroundColor(Color.parseColor("#89cff0"));
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.TRANSPARENT);
            } else if (player == 3) {
                currentPlayer.setText(third.getText().toString().trim());
                first.setBackgroundColor(Color.TRANSPARENT);
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.parseColor("#89cff0"));
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.TRANSPARENT);
            } else if (player == 4) {
                currentPlayer.setText(forth.getText().toString().trim());
                first.setBackgroundColor(Color.TRANSPARENT);
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.parseColor("#89cff0"));
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.TRANSPARENT);
            } else if (player == 5) {
                currentPlayer.setText(fifth.getText().toString().trim());
                first.setBackgroundColor(Color.TRANSPARENT);
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.parseColor("#89cff0"));
                sixth.setBackgroundColor(Color.TRANSPARENT);
            } else if (player == 6) {
                currentPlayer.setText(sixth.getText().toString().trim());
                first.setBackgroundColor(Color.TRANSPARENT);
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.parseColor("#89cff0"));
            }
        } else {
            if (player == 1) {
                first.setBackgroundColor(Color.parseColor("#89cff0"));
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.TRANSPARENT);
            } else if (player == 2) {
                first.setBackgroundColor(Color.TRANSPARENT);
                second.setBackgroundColor(Color.parseColor("#89cff0"));
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.TRANSPARENT);
            } else if (player == 3) {
                first.setBackgroundColor(Color.TRANSPARENT);
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.parseColor("#89cff0"));
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.TRANSPARENT);
            } else if (player == 4) {
                first.setBackgroundColor(Color.TRANSPARENT);
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.parseColor("#89cff0"));
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.TRANSPARENT);
            } else if (player == 5) {
                first.setBackgroundColor(Color.TRANSPARENT);
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.parseColor("#89cff0"));
                sixth.setBackgroundColor(Color.TRANSPARENT);
            } else if (player == 6) {
                first.setBackgroundColor(Color.TRANSPARENT);
                second.setBackgroundColor(Color.TRANSPARENT);
                third.setBackgroundColor(Color.TRANSPARENT);
                forth.setBackgroundColor(Color.TRANSPARENT);
                fifth.setBackgroundColor(Color.TRANSPARENT);
                sixth.setBackgroundColor(Color.parseColor("#89cff0"));
            }
        }
    }
    public void hit(View view){ //method for the button "hit"
        if (!tieBreak) {
            if (player == 1) {
                targetOne++;
                if (targetOne == 21) {
                    targetOne = 25;
                    changingTargets();
                } else if (targetOne == 26) {
                    targetOne = 50;
                    changingTargets();
                } else if (targetOne == 51) {
                    done = true;
                    String dn = "Done";
                    playerOne.setText(dn);
                    counter = 1;
                    darts();
                } else {
                    changingTargets();
                }
            } else if (player == 2) {
                targetTwo++;
                if (targetTwo == 21) {
                    targetTwo = 25;
                    changingTargets();
                } else if (targetTwo == 26) {
                    targetTwo = 50;
                    changingTargets();
                } else if (targetTwo == 51) {
                    done = true;
                    String dn = "Done";
                    playerTwo.setText(dn);
                    counter = 1;
                    darts();
                } else {
                    changingTargets();
                }
            } else if (player == 3) {
                targetThree++;
                if (targetThree == 21) {
                    targetThree = 25;
                    changingTargets();
                } else if (targetThree == 26) {
                    targetThree = 50;
                    changingTargets();
                } else if (targetThree == 51) {
                    done = true;
                    String dn = "Done";
                    playerThree.setText(dn);
                    counter = 1;
                    darts();
                } else {
                    changingTargets();
                }
            } else if (player == 4) {
                targetFour++;
                if (targetFour == 21) {
                    targetFour = 25;
                    changingTargets();
                } else if (targetFour == 26) {
                    targetFour = 50;
                    changingTargets();
                } else if (targetFour == 51) {
                    done = true;
                    String dn = "Done";
                    playerFour.setText(dn);
                    counter = 1;
                    darts();
                } else {
                    changingTargets();
                }
            } else if (player == 5) {
                targetFive++;
                if (targetFive == 21) {
                    targetFive = 25;
                    changingTargets();
                } else if (targetFive == 26) {
                    targetFive = 50;
                    changingTargets();
                } else if (targetFive == 51) {
                    done = true;
                    String dn = "Done";
                    playerFive.setText(dn);
                    counter = 1;
                    darts();
                } else {
                    changingTargets();
                }
            } else if (player == 6) {
                targetSix++;
                if (targetSix == 21) {
                    targetSix = 25;
                    changingTargets();
                } else if (targetSix == 26) {
                    targetSix = 50;
                    changingTargets();
                } else if (targetSix == 51) {
                    done = true;
                    String dn = "Done";
                    playerSix.setText(dn);
                    counter = 1;
                    darts();
                } else {
                    changingTargets();
                }
            }
        } else {
            darts();
        }
    }
    public void changingTargets(){ //changing targets in the table, in the middle and calling darts()
        if (player == 1) {
            playerOne.setText(String.valueOf(targetOne));
            String trgt = "Target: " + targetOne;
            target.setText(trgt);
        } else if (player == 2) {
            playerTwo.setText(String.valueOf(targetTwo));
            String trgt = "Target: " + targetTwo;
            target.setText(trgt);
        } else if (player == 3) {
            playerThree.setText(String.valueOf(targetThree));
            String trgt = "Target: " + targetThree;
            target.setText(trgt);
        } else if (player == 4) {
            playerFour.setText(String.valueOf(targetFour));
            String trgt = "Target: " + targetFour;
            target.setText(trgt);
        } else if (player == 5) {
            playerFive.setText(String.valueOf(targetFive));
            String trgt = "Target: " + targetFive;
            target.setText(trgt);
        } else if (player == 6) {
            playerSix.setText(String.valueOf(targetSix));
            String trgt = "Target: " + targetSix;
            target.setText(trgt);
        }
        darts();
    }
    public void amplifyingDartsCount(){ //amplifying darts count for each player
        if (player == 1){
            dartsCount1++;
        } else if (player == 2){
            dartsCount2++;
        } else if (player == 3){
            dartsCount3++;
        } else if (player == 4){
            dartsCount4++;
        } else if (player == 5){
            dartsCount5++;
        } else if (player == 6){
            dartsCount6++;
        }
        changingDartsCountAndTargets();
    }
    public void changingDartsCountAndTargets(){ //method for changing darts count and targets on every new round and every hit
        if (!tieBreak) {
            if (player == 1) {
                String trg = "Target: " + targetOne;
                target.setText(trg);
                String drtsCnt = "Darts count: " + dartsCount1;
                dartsCount.setText(drtsCnt);
            } else if (player == 2) {
                String trg = "Target: " + targetTwo;
                target.setText(trg);
                String drtsCnt = "Darts count: " + dartsCount2;
                dartsCount.setText(drtsCnt);
            } else if (player == 3) {
                String trg = "Target: " + targetThree;
                target.setText(trg);
                String drtsCnt = "Darts count: " + dartsCount3;
                dartsCount.setText(drtsCnt);
            } else if (player == 4) {
                String trg = "Target: " + targetFour;
                target.setText(trg);
                String drtsCnt = "Darts count: " + dartsCount4;
                dartsCount.setText(drtsCnt);
            } else if (player == 5) {
                String trg = "Target: " + targetFive;
                target.setText(trg);
                String drtsCnt = "Darts count: " + dartsCount5;
                dartsCount.setText(drtsCnt);
            } else if (player == 6) {
                String trg = "Target: " + targetSix;
                target.setText(trg);
                String drtsCnt = "Darts count: " + dartsCount6;
                dartsCount.setText(drtsCnt);
            }
        } else {
            if (player == 1){
                playerOne.setText(String.valueOf(dartsCount1));
            } else if (player == 2){
                playerTwo.setText(String.valueOf(dartsCount2));
            } else if (player == 3){
                playerThree.setText(String.valueOf(dartsCount3));
            } else if (player == 4){
                playerFour.setText(String.valueOf(dartsCount4));
            } else if (player == 5){
                playerFive.setText(String.valueOf(dartsCount5));
            } else if (player == 6){
                playerSix.setText(String.valueOf(dartsCount6));
            }
        }
    }
}