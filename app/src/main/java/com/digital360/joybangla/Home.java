package com.digital360.joybangla;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Home extends Fragment {
    ViewFlipper viewFlipper;
    ImageView sheikhmujib,hasina,joy,awyamelig;


    int images[]={R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater= (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.home,container,false);
        viewFlipper = view.findViewById(R.id.silder);
        sheikhmujib=view.findViewById(R.id.mujibImg);
        hasina=view.findViewById(R.id.hasinaId);
        joy=view.findViewById(R.id.joyId);
        awyamelig=view.findViewById(R.id.awyameligId);

////// slider
        for (int i =0;i<images.length;i++){
            ImageView imageView = new ImageView(getActivity());
           imageView.setBackgroundResource(images[i]);
           /*if (i==0){
            imageView.setBackgroundResource(R.drawable.slide1a);}
            if (i==1){
            imageView.setBackgroundResource(R.drawable.slider1d);}
           // if (i==2){
//            imageView.setBackgroundResource(R.drawable.slider2a);}*/

            viewFlipper.addView(imageView);

            viewFlipper.setFlipInterval(1000);
            viewFlipper.setAutoStart(true);



        }

///// sheikh mujibur img click
        sheikhmujib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ShikhMujibJiboni.class);
                startActivity(intent);

            }
        });
  ///// sheikh Hasina img click
        hasina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ShekhiHasinaJiboni.class);
                startActivity(intent);

            }
        });
        ///// joy img click
        joy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),JoyJiboni.class);
                startActivity(intent);

            }
        });
              ///// Awyamelig img click
        awyamelig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),BangladeshAwyamelig.class);
                startActivity(intent);

            }
        });

        return view;


    }


    //// slider show
    public void filipImage(int image){
       ImageView imageView = new ImageView(getActivity());
       imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);

        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);

        // animation
        viewFlipper.setInAnimation(getActivity(),android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(getActivity(),android.R.anim.slide_out_right);
    }
}
