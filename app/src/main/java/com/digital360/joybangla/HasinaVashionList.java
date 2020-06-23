package com.digital360.joybangla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HasinaVashionList extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasina_vashion_list);
        back=findViewById(R.id.backId);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void vashonBtn(View view) {
        Intent intent = new Intent(HasinaVashionList.this,HasinaVashon.class);
        switch (view.getId()){
            case R.id.hasinaVashonId1:
                intent.putExtra("hasinaVashon","VJJHW7-G4y0");
                break;
                         case R.id.hasinaVashonId2:
                intent.putExtra("hasinaVashon","8X9R8VHa2o8");
                break;
                         case R.id.hasinaVashonId3:
                intent.putExtra("hasinaVashon","MQiC2WFLKe0");
                break;
                         case R.id.hasinaVashonId4:
                intent.putExtra("hasinaVashon","18kHt1WRShk");
                break;
                         case R.id.hasinaVashonId5:
                intent.putExtra("hasinaVashon","YRm9SiLKOQ8");
                break;
                         case R.id.hasinaVashonId6:
                intent.putExtra("hasinaVashon","o-yHRjZM3Pg");
                break;
        }
        startActivity(intent);
    }
}
