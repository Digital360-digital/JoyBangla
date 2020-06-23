package com.digital360.joybangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.Collections;

public class HasinaAchievements extends AppCompatActivity {
int [] images={R.drawable.hasina_achievement1,R.drawable.hasina_achievement2,R.drawable.hasina_achievement3,R.drawable.hasina_achievement4,R.drawable.hasina_achievement5,R.drawable.hasina_achievement6,R.drawable.hasina_achievement7,R.drawable.hasina_achievement8,R.drawable.hasina_achievement9,R.drawable.hasina_achievement10,R.drawable.hasina_achievement11,R.drawable.hasina_achievement12,R.drawable.hasina_achievement13,R.drawable.hasina_achievement14,R.drawable.hasina_achievement15,R.drawable.hasina_achievement16,R.drawable.hasina_achievement17,R.drawable.hasina_achievement18,R.drawable.hasina_achievement19,R.drawable.hasina_achievement20,R.drawable.hasina_achievement21,R.drawable.hasina_achievement22,R.drawable.hasina_achievement23,R.drawable.hasina_achievement24,R.drawable.hasina_achievement25};
    RecyclerView recyclerView;
    Atapter atapter;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasina_achievements);
        recyclerView=findViewById(R.id.listViewId);
        back=findViewById(R.id.backId);

        atapter =new Atapter(images, HasinaAchievements.this);
       // ArrayAdapter madapter = new ArrayAdapter(HasinaAchievements.this,R.layout.recyclerview_layout,R.id.imageId, Collections.singletonList(images));
        recyclerView.setAdapter(atapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(HasinaAchievements.this));




        //////////  <<<<<<<<<Back buttton>>>>>>> /////////////////
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        //////////  <<<<<<<<<Back buttton end >>>>>>> /////////////////

    }



}
