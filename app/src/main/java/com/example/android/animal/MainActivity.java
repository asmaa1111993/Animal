package com.example.android.animal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button animalButton ,tigerButton,catButton,dogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animalButton = findViewById(R.id.animalButton);
        tigerButton = findViewById(R.id.tigerButton);
        dogButton = findViewById(R.id.dogButton);
        catButton = findViewById(R.id.catButton);

        View.OnClickListener goToAnimalActivity = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animalActivity = new Intent(MainActivity.this,AnimalActivity.class);
                startActivity(animalActivity);
            }
        };

        View.OnClickListener goToTigerActivity = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tigerActivity = new Intent(MainActivity.this,TigerActivity.class);
                startActivity(tigerActivity);
            }
        };

        View.OnClickListener goToDogActivity = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dogActivity = new Intent(MainActivity.this,DogActivity.class);
                startActivity(dogActivity);
            }
        };

        View.OnClickListener goToCatActivity = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent catActivity = new Intent(MainActivity.this,CatActivity.class);
                startActivity(catActivity);
            }
        };
        animalButton.setOnClickListener(goToAnimalActivity);
        tigerButton.setOnClickListener(goToTigerActivity);
        dogButton.setOnClickListener(goToDogActivity);
        catButton.setOnClickListener(goToCatActivity);
    }
}
