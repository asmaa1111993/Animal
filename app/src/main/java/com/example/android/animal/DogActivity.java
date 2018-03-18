package com.example.android.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DogActivity extends AppCompatActivity {
    TextView nameView ,colorView ,ageView,otherAnimalView;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);
        nameView = findViewById(R.id.name_text_view);
        colorView = findViewById(R.id.color_text_view);
        ageView = findViewById(R.id.age_text_view);
        otherAnimalView=findViewById(R.id.dogKind_textView);
        img = findViewById(R.id.myDogImage);
        img.setImageResource(R.drawable.dog);

        nameView.setText("animal name: Dog");
        colorView.setText("color:Blakish-brown");
        ageView.setText("age of the dog is 2");
        otherAnimalView.setText("dog kind: Black- jack");
    }
}
