package com.junduk.android.dartsscoringsystem;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplitScoreDescription extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split_score_description);
    }
    public void setReturnToPickingTheParameters(View view){
        finish();
    }
}
