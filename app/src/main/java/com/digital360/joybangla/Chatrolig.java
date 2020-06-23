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

public class Chatrolig extends Fragment {
    Button chatroligDetails, chatroligItihas, chatroligImgGalary;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.chatrolig, container, false);
        chatroligDetails = view.findViewById(R.id.bangladesh_chatrolig_detail_btnId);
        chatroligItihas = view.findViewById(R.id.bangladesh_chatrolig_itihas_btnId);
        chatroligImgGalary = view.findViewById(R.id.bangladesh_chatrolig_picture_btnId);


        chatroligDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BangladeshChatroligDetails.class);
                startActivity(intent);
            }
        });
        chatroligItihas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BangladeshChatroligItihas.class);
                startActivity(intent);
            }
        });

        chatroligImgGalary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ChatroligImgGalary.class);
                startActivity(intent);
            }
        });


        return view;

    }
}
