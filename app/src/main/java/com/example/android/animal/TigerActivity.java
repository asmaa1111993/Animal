package com.example.android.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TigerActivity extends AppCompatActivity {
    TextView nameView ,colorView ,ageView,otherAnimalView;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiger);
        nameView = findViewById(R.id.name_text_view);
        colorView = findViewById(R.id.color_text_view);
        ageView = findViewById(R.id.age_text_view);
        otherAnimalView=findViewById(R.id.speed_text_view);
        img = findViewById(R.id.myTigerImage);
        img.setImageResource(R.drawable.tiger);

        nameView.setText("animal name: Tiger");
        colorView.setText("color:Brown with black lines");
        ageView.setText("age of the tiger is 4");
        otherAnimalView.setText("speed is 12 km");
    }
}
