package com.example.crossgame12345678;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    boolean isYellowHidden =false;

//    public void onImageClick (View view){
//        Log.d("DEBUG", "Image Clicked");
//        ImageView currentImage = (ImageView) view;
//
//        ImageView redImage = (ImageView) findViewById(R.id.radio);
//
//        if(isYellowHidden){
//
//            currentImage.animate().alpha(1).translationY(0).setDuration(1000);
//            redImage.animate().translationY(-1500).setDuration(1000);
//
//            isYellowHidden =false;
//        }
//       else {
//           redImage.setTranslationY(-1500);
//            redImage.animate().alpha(0).translationY(1500).setDuration(1000);
//
//            currentImage.animate().alpha(0).translationY(-1500).setDuration(1000);
//
//            isYellowHidden = true;
//        }
////        currentImage.animate().translationY(-1500).setDuration(1000);


//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}