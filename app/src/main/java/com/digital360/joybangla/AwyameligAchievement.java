package com.digital360.joybangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AwyameligAchievement extends AppCompatActivity {
    int [] images={R.drawable.awmelig_achievement1,R.drawable.awmelig_achievement2,R.drawable.awmelig_achievement3,R.drawable.awmelig_achievement4,R.drawable.awmelig_achievement5,R.drawable.awmelig_achievement6};
    RecyclerView recyclerView;
    Atapter atapter;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awyamelig_achievement);
      //  recyclerView=findViewById(R.id.listViewId);
        back=findViewById(R.id.backId);

       /* atapter =new Atapter(images, AwyameligAchievement.this);
        // ArrayAdapter madapter = new ArrayAdapter(HasinaAchievements.this,R.layout.recyclerview_layout,R.id.imageId, Collections.singletonList(images));
        recyclerView.setAdapter(atapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(AwyameligAchievement.this));*/




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

