package com.digital360.joybangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.view.ViewCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ShikhMujibJiboni extends AppCompatActivity {
    ImageView sheikhMujibChildhood,sheikhMujibPolitic1,sheikhMujibPolitic2,sheikhMujibPrecident;
    Toolbar toolbar;
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shikh_mujib_jiboni);
        getSupportActionBar().hide();
        toolbar=findViewById(R.id.tool);
        sheikhMujibChildhood=findViewById(R.id.mujib_childhood_imgBtnID);
        sheikhMujibPolitic1=findViewById(R.id.mujib_politic1_imgBtnID);
        sheikhMujibPolitic2=findViewById(R.id.mujib_politic2_imgBtnID);
        sheikhMujibPrecident=findViewById(R.id.mujib_precident_imgBtnID);


        backButton=findViewById(R.id.backId);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        sheikhMujibChildhood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ShikhMujibJiboni.this,MujibChildAndStudent.class);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions bundle = ActivityOptions.makeSceneTransitionAnimation(ShikhMujibJiboni.this,sheikhMujibChildhood, ViewCompat.getTransitionName(sheikhMujibChildhood));
                    startActivity(intent,bundle.toBundle());
                }
            }
        });
        sheikhMujibPolitic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShikhMujibJiboni.this,MujibPolitic1.class);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    //ActivityOptions compat = ActivityOptions.makeSceneTransitionAnimation(ShikhMujibJiboni.this,sheikhMujibPolitic1,ViewCompat.getTransitionName(sheikhMujibPolitic1));
                    ActivityOptions bundle = ActivityOptions.makeSceneTransitionAnimation(ShikhMujibJiboni.this,sheikhMujibPolitic1, ViewCompat.getTransitionName(sheikhMujibPolitic1));
                    startActivity(intent,bundle.toBundle());
                }

            }
        });
        sheikhMujibPolitic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShikhMujibJiboni.this,MujibPolitic2.class);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    //ActivityOptions compat = ActivityOptions.makeSceneTransitionAnimation(ShikhMujibJiboni.this,sheikhMujibPolitic1,ViewCompat.getTransitionName(sheikhMujibPolitic1));
                    ActivityOptions bundle = ActivityOptions.makeSceneTransitionAnimation(ShikhMujibJiboni.this,sheikhMujibPolitic2, ViewCompat.getTransitionName(sheikhMujibPolitic2));
                    startActivity(intent,bundle.toBundle());
                }

            }
        });
        sheikhMujibPrecident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShikhMujibJiboni.this,MujibPrecident.class);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    //ActivityOptions compat = ActivityOptions.makeSceneTransitionAnimation(ShikhMujibJiboni.this,sheikhMujibPolitic1,ViewCompat.getTransitionName(sheikhMujibPolitic1));
                    ActivityOptions bundle = ActivityOptions.makeSceneTransitionAnimation(ShikhMujibJiboni.this,sheikhMujibPrecident, ViewCompat.getTransitionName(sheikhMujibPrecident));
                    startActivity(intent,bundle.toBundle());
                }

            }
        });

    }
}
