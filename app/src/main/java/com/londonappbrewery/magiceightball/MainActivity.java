package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random numberGenerator = new Random();
        Button main_button = findViewById(R.id.main_buton);
        final ImageView main_image = findViewById(R.id.image_8ball);
        final int[] images = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number_holder;
                number_holder = numberGenerator.nextInt(5);
                main_image.setImageResource(images[number_holder]);
            }
        });
    }
}
