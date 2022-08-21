package com.junduk.android.dartsscoringsystem;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AroundTheWorldDescription extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_around_the_world_description);
    }
    public void setReturnToPickingTheParameters(View view){
        finish();
    }
}