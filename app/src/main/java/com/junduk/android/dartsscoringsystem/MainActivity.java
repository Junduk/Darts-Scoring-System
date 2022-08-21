package com.junduk.android.dartsscoringsystem;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView moreGames;
    //String b;
    //private static String ip = "192.168.1.6";
    //private static String port = "1433";
    //private static String Classes = "net.sourceforge.jtds.jdbc.Driver";
    //private static String database = "test";
    //private static String username = "Junduk";
    //private static String password = "test";
    //private static String url = "jdbc:jtds:sqlserver://" + ip + ":" + port + "/" + database;
    //private Connection connection = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        moreGames = findViewById(R.id.moreGames);
        /*ActivityCompat.requestPermissions(this, new String[]{(Manifest.permission.INTERNET)}, PackageManager.PERMISSION_GRANTED);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        try {
            Class.forName(Classes);
            connection = DriverManager.getConnection(url, username, password);
            moreGames.setText(R.string.NewGame);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
            Toast.makeText(this, "Error somewhere.", Toast.LENGTH_SHORT).show();
        } catch (SQLException e){
            b = String.valueOf(e);
            Toast.makeText(this, b, Toast.LENGTH_LONG).show();
        }
        */
    }
    public void openRegularGame(View view){
        Intent regGameIntent = new Intent(this, RegularGame.class);
        startActivity(regGameIntent);
    }
    public void openGamesDes(View view) {
        Intent gamesDesIntent = new Intent(this, com.junduk.android.dartsscoringsystem.GameDescription.class);
        startActivity(gamesDesIntent);

        /*if (connection != null){
            Statement statement;
            try {
                statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("Select * from TEST_TABLE");
                while (resultSet.next()){
                    moreGames.setText(resultSet.getString(1));
                }
            } catch (SQLException e) {
                e.printStackTrace();
                Toast.makeText(this, "Can't get the data from the database.", Toast.LENGTH_SHORT).show();
            }
        } else {
            moreGames.setText(b);
        }*/
    }
    public void openSplitScore(View view){
        Intent splitScoreIntent = new Intent(this, SplitScore.class);
        startActivity(splitScoreIntent);
    }
    public void openCricket(View view){
        Intent splitScoreIntent = new Intent(this, Cricket.class);
        startActivity(splitScoreIntent);
    }
    public void openKiller(View view){
        Intent killerIntent = new Intent(this, Killer.class);
        startActivity(killerIntent);
    }
    public void openAroundTheWorld(View view){
        Intent aroundTheWorldIntent = new Intent(this, AroundTheWorld.class);
        startActivity(aroundTheWorldIntent);

        /*if (connection != null){
            Statement statement;
            try {
                statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("Delete from TEST_TABLE; INSERT INTO TEST_TABLE VALUES ('Idemo Niis')");
                while (resultSet.next()){
                    moreGames.setText(resultSet.getString(1));
                }
            } catch (SQLException e) {
                e.printStackTrace();
                Toast.makeText(this, "Can't get the data from the database.", Toast.LENGTH_SHORT).show();
            }
        } else {
            moreGames.setText(b);
        }*/
    }
    public void openShanghai(View view){
        Intent shanghai = new Intent(this, Shanghai.class);
        startActivity(shanghai);
    }
}