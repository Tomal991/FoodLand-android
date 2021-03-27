package com.example.foodland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KacchiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kacchi);
    }

    public void BackFunction(View view) {
        Intent myintent = new Intent(KacchiActivity.this,MainActivity.class);
        startActivity(myintent);
    }
}