package com.digital360.joybangla;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Awyamelig extends Fragment {

    View view;
    Button itihasButton,achievement;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater= (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.awyamelig,container,false);
        itihasButton=view.findViewById(R.id.awmelig_deatils_buttonId);

        itihasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),BangladeshAwyamelig.class);
                startActivity(intent);
            }
        });
        achievement=view.findViewById(R.id.awmelig_achievement_buttonId);
        achievement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),AwyameligAchievement.class);
                startActivity(intent);
            }
        });




        return view;

    }
}
