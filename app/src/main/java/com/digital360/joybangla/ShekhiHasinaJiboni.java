package com.digital360.joybangla;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ShekhiHasinaJiboni extends AppCompatActivity {
    ImageView hasinaChildImg, hasinaStudentLifeImg, hasinaPoliticalLifeImg, hasinaPrimeMinisterImg;
int i;
Toolbar toolbar;
Button backButton;

View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shekhi_hasina_jiboni);
        getSupportActionBar().hide();
        //getSupportActionBar().setIcon(R.drawable.back);
        toolbar=findViewById(R.id.tool);
        //toolbar.setLogo(R.drawable.back);
        backButton=findViewById(R.id.backId);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });









        hasinaChildImg = findViewById(R.id.hasina_child_Img_ID);
        hasinaStudentLifeImg=findViewById(R.id.hasina_studentLife_Img_ID);
        hasinaPoliticalLifeImg=findViewById(R.id.hasina_politicalLife_Img_ID);
        hasinaPrimeMinisterImg=findViewById(R.id.hasina_primeMinister_Img_ID);

        hasinaChildImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShekhiHasinaJiboni.this, HasinaChildHood.class);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions bundle = ActivityOptions.makeSceneTransitionAnimation(ShekhiHasinaJiboni.this, hasinaChildImg, ViewCompat.getTransitionName(hasinaChildImg));
                    startActivity(intent, bundle.toBundle());
                }
            }
        });
        hasinaPrimeMinisterImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShekhiHasinaJiboni.this, HasinaMinister.class);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions bundle = ActivityOptions.makeSceneTransitionAnimation(ShekhiHasinaJiboni.this, hasinaPrimeMinisterImg, ViewCompat.getTransitionName(hasinaPrimeMinisterImg));
                    startActivity(intent, bundle.toBundle());
                }
            }
        });
        hasinaStudentLifeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShekhiHasinaJiboni.this, HasinaStudentLife.class);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions bundle = ActivityOptions.makeSceneTransitionAnimation(ShekhiHasinaJiboni.this, hasinaStudentLifeImg, ViewCompat.getTransitionName(hasinaStudentLifeImg));
                    startActivity(intent, bundle.toBundle());
                }
            }
        });
        hasinaPoliticalLifeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShekhiHasinaJiboni.this, HasinaPoliticalLife.class);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions bundle = ActivityOptions.makeSceneTransitionAnimation(ShekhiHasinaJiboni.this, hasinaPoliticalLifeImg, ViewCompat.getTransitionName(hasinaPoliticalLifeImg));
                    startActivity(intent, bundle.toBundle());
                }
            }
        });



        

    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
}

