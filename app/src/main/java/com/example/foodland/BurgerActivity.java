package com.example.foodland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BurgerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
    }

    public void BackFunction(View view) {
        Intent myintent = new Intent(BurgerActivity.this,MainActivity.class);
        startActivity(myintent);
    }
}