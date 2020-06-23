package com.digital360.joybangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BangladeshAwyamelig extends AppCompatActivity {
    Button backButton;
    ImageView awyameligItihas,awyameligJuddheObodan,awyameligGonotontreObodan,awyameligGothonTontro;
    Intent intent;
    ActivityOptions options;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangladesh_awyamelig);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().hide();
        backButton=findViewById(R.id.backId);
        awyameligItihas=findViewById(R.id.awyameligItihasBtnId);
        awyameligJuddheObodan=findViewById(R.id.awyameligJuddheObodanBtnId);
        awyameligGonotontreObodan=findViewById(R.id.awyameligGonotontraObodanBtnId);
        awyameligGothonTontro=findViewById(R.id.awyameligGhoshonaBtnId);



        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        awyameligItihas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(BangladeshAwyamelig.this,AwyameligItihas.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options=ActivityOptions.makeSceneTransitionAnimation(BangladeshAwyamelig.this,awyameligItihas, ViewCompat.getTransitionName(awyameligItihas));
                startActivity(intent,options.toBundle());
                }

            }
        });
        awyameligJuddheObodan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(BangladeshAwyamelig.this,AwyameligJuddhaObodan.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options=ActivityOptions.makeSceneTransitionAnimation(BangladeshAwyamelig.this,awyameligJuddheObodan, ViewCompat.getTransitionName(awyameligJuddheObodan));
                startActivity(intent,options.toBundle());
                }

            }
        });

        awyameligGonotontreObodan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(BangladeshAwyamelig.this,AwyameligGonotronteObodan.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options=ActivityOptions.makeSceneTransitionAnimation(BangladeshAwyamelig.this,awyameligGonotontreObodan, ViewCompat.getTransitionName(awyameligGonotontreObodan));
                startActivity(intent,options.toBundle());
                }

            }
        });


        awyameligGothonTontro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(BangladeshAwyamelig.this,AwyameligGhosona.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options=ActivityOptions.makeSceneTransitionAnimation(BangladeshAwyamelig.this,awyameligGothonTontro, ViewCompat.getTransitionName(awyameligGothonTontro));
                startActivity(intent,options.toBundle());
                }

            }
        });


    }
}
