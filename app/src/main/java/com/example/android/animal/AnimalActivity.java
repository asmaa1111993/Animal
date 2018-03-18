package com.example.android.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalActivity extends AppCompatActivity {

    TextView nameView ,colorView ,ageView;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        nameView = findViewById(R.id.name_text_view);
        colorView = findViewById(R.id.color_text_view);
        ageView = findViewById(R.id.age_text_view);
        img = findViewById(R.id.myAnimalImage);
        img.setImageResource(R.drawable.animal);

        nameView.setText("girraf");
        colorView.setText("Brown");
        ageView.setText("10");
    }
}
