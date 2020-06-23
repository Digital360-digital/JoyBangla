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

public class JoyJiboni extends AppCompatActivity {
    Toolbar toolbar;
    Button backButton;
    ImageView joyChildhood,joyStudent,joyPolitic,joyDigital;
    Intent intent;
    ActivityOptions options;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joy_jiboni);
        getSupportActionBar().hide();
        //getSupportActionBar().setIcon(R.drawable.back);
        toolbar=findViewById(R.id.tool);
        //toolbar.setLogo(R.drawable.back);
        backButton=findViewById(R.id.backId);
        joyChildhood=findViewById(R.id.joyChildhoodImgID);
        joyStudent=findViewById(R.id.joyStudentImgID);
        joyPolitic=findViewById(R.id.joyPoliticImgID);
        joyDigital=findViewById(R.id.joyDigitalImgID);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        joyChildhood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(JoyJiboni.this,JoyChild.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options=ActivityOptions.makeSceneTransitionAnimation(JoyJiboni.this,joyChildhood, ViewCompat.getTransitionName(joyChildhood));
                startActivity(intent,options.toBundle());
                }

            }
        });
        joyStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(JoyJiboni.this,JoyStudent.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options=ActivityOptions.makeSceneTransitionAnimation(JoyJiboni.this,joyStudent, ViewCompat.getTransitionName(joyStudent));
                    startActivity(intent,options.toBundle());
                }

            }
        });
        joyPolitic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(JoyJiboni.this,JoyPolitic.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options=ActivityOptions.makeSceneTransitionAnimation(JoyJiboni.this,joyPolitic, ViewCompat.getTransitionName(joyPolitic));
                    startActivity(intent,options.toBundle());
                }

            }
        });
        joyDigital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(JoyJiboni.this,JoyDigital.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options=ActivityOptions.makeSceneTransitionAnimation(JoyJiboni.this,joyDigital, ViewCompat.getTransitionName(joyDigital));
                    startActivity(intent,options.toBundle());
                }

            }
        });

    }
}
