package com.digital360.joybangla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MujibVashonList extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mujib_vashon_list);
        back=findViewById(R.id.backId);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void march7(View view) {
        Intent intent = new Intent(MujibVashonList.this,MujibVashon.class);
        switch (view.getId()){
            case R.id.vashion_mach7:
                intent.putExtra("video","h4FPQRjJ1Vo");
                break;
            case R.id.vashion_jatisonghoe:
                intent.putExtra("video","U9QehD6rZDc");
                break;
            case R.id.vashion_londonNewsRepoter:
                intent.putExtra("video","T1QwwBwzCnU");
                break;
            case R.id.vashion_interview:
                intent.putExtra("video","cMS7SHIN9H8");
                break;
            case R.id.vashion_bakshal:
                intent.putExtra("video","Gwic-yGxoz8");
                break;
            case R.id.vashion_osrowSomarpon:
                intent.putExtra("video","A5FKyvKZ1xU");
                break;
            case R.id.vashion_samorikAkademi:
                intent.putExtra("video","4aqobwLAgdk");
                break;

        }
        startActivity(intent);
    }
}
