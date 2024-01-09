package com.example.zoomcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView_Id);
        zoomControls = findViewById(R.id.zoomControls_Id);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                if (x<7 && y<7){

                    imageView.setScaleX((float) x+1);
                    imageView.setScaleY((float) y+1);
                }


            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                if (x>1 && y>1){

                    imageView.setScaleX((float) x-1);
                    imageView.setScaleY((float) y-1);
                }

            }
        });

    }
}