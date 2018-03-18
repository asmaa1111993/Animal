package com.example.android.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CatActivity extends AppCompatActivity {
    TextView nameView ,colorView ,ageView,otherAnimalView;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        nameView = findViewById(R.id.name_text_view);
        colorView = findViewById(R.id.color_text_view);
        ageView = findViewById(R.id.age_text_view);
        otherAnimalView=findViewById(R.id.foodType_text_view);
        img = findViewById(R.id.myCatImage);
        img.setImageResource(R.drawable.cat);

        nameView.setText("animal name: Cat");
        colorView.setText("color:Gray");
        ageView.setText("age of the cat is 1");
        otherAnimalView.setText("food Type : cheese");
    }
}
