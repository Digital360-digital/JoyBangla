package com.digital360.joybangla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JoyVashonList extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joy_vashon_list);
        back=findViewById(R.id.backId);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void vashonBtn(View view) {
        Intent intent = new Intent(JoyVashonList.this,JoyVashon.class);
        switch (view.getId()){
            case R.id.joyVashonId1:
                intent.putExtra("joyVashon","CBkOdy3askI");
                break;
            case R.id.joyVashonId2:
                intent.putExtra("joyVashon","Og0TiRhBas0");
                break;
            case R.id.joyVashonId3:
                intent.putExtra("joyVashon","ifd0Ku5i0PU");
                break;
        }
        startActivity(intent);
    }
}
