package com.example.rating_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
 TextView textView;
 RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        ratingBar = findViewById(R.id.ratingBar);

    }
    public void submit(View view){
        Float ratingvalue = ratingBar.getRating();
        if (ratingvalue < 2){
            textView.setText("Rating: " + ratingvalue + "\n We will try better next time");

        }
        else if (ratingvalue <=3 && ratingvalue >=2){
            textView.setText("Rating: " + ratingvalue + "\n We are constantly improving");
        }else if (ratingvalue <=4 && ratingvalue >=3){
            textView.setText("Rating: " + ratingvalue + "\n Well we will see");
        }else if (ratingvalue <=5 && ratingvalue >=4){
            textView.setText("Rating: " + ratingvalue + "\n Thanks");
        }
    }
}