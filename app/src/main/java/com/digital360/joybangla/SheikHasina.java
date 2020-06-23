package com.digital360.joybangla;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SheikHasina extends Fragment {
    Button hasinaJibontBtn,hasinaVasonBtn,hasinaOrjonBtn;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater= (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.sheik_hasina,container,false);

        hasinaJibontBtn=view.findViewById(R.id.hasinaJiboniBtnId);
        hasinaVasonBtn=view.findViewById(R.id.hasinaVasonBtnId);
        hasinaOrjonBtn=view.findViewById(R.id.hasinaOrjonBtnId);

        hasinaJibontBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ShekhiHasinaJiboni.class);
                startActivity(intent);
            }
        });

        hasinaVasonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getContext(),HasinaVashionList.class);
                startActivity(intent);
            }
        });


        hasinaOrjonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),HasinaAchievements.class);
                startActivity(intent);
            }
        });


        return view;

    }
}
