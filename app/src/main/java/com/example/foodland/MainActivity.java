package com.example.foodland;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] food = {"Select","Burger","Pizza","Kacchi"};

    Spinner myspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myspinner = (Spinner) findViewById(R.id.myspinnerID);
        myspinner.setOnItemSelectedListener(this);

       ArrayAdapter array = new ArrayAdapter(this, android.R.layout.simple_spinner_item, food);
        array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(array);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Fragment myFragment;
        if(text.equals("Burger")){
            myFragment = new BurgerFragment();
        }
        else if(text.equals("Pizza")){
            myFragment = new PizzaFragment();
        }
        else if(text.equals("Kacchi")){
            myFragment = new KacchiFragment();
        }
        else {
            myFragment = new BlankFragment();
        }
       FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.myFragment, myFragment);
        ft.commit();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}