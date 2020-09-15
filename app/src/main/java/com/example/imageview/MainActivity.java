package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static ImageView imageView;
    private static Button button;
    private int current_image_index;
    int [] image = {R.mipmap.b_round,R.mipmap.a_round,R.mipmap.ic_launcher};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setImageView();
    }
    public void setImageView(){
        imageView = (ImageView)findViewById(R.id.imageView);
        button = (Button)findViewById(R.id.btn_img);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image_index++;
                current_image_index = current_image_index % image.length;
                imageView.setImageResource(image[current_image_index]);
            }
        });

    }
}