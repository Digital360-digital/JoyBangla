package com.digital360.joybangla;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public class Sheik_Mujib extends Fragment {
    View view;
    Button sheikhMujibJiboni,osomaptoAttojiboniButton,mujibJadughor,mujibLetter,mujibVashon;
    Intent intent;
    Toolbar toolbar;
    int coad =1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater= (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.sheik_mujib,container,false);
        sheikhMujibJiboni=view.findViewById(R.id.mujib_jiboni_btn);
        osomaptoAttojiboniButton=view.findViewById(R.id.mujib_osomapto_btn);
        mujibJadughor=view.findViewById(R.id.mujib_museum_btn);
        mujibLetter=view.findViewById(R.id.mujib_letter_btn);
        mujibVashon=view.findViewById(R.id.mujib_speech_btn);






        ////btn onclick
        sheikhMujibJiboni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               intent = new Intent(getContext(),ShikhMujibJiboni.class);

                startActivity(intent);
            }
        });
        /// osomapto atto jiboni
        osomaptoAttojiboniButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               intent= new Intent(getContext(),OsomaptoAttojiboni.class);
               startActivity(intent);
            }
        });
        // museum btn
        mujibJadughor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                permissionGMS();


            }
        });


        //<<<<<<<<<<< Letter button >>>>>>>>>>>>>>>>>
        mujibLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MujibHandLetter.class);
                startActivity(intent);
            }
        });


        // <<<<<<<<<<< Letter button  End>>>>>>>>>>>>>>>>>
        ///<<<<<<< Vashon Activity >>>>>>

        mujibVashon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MujibVashonList.class);
                startActivity(intent);
            }
        });


        return view;

    }

    public void permissionGMS(){
        LocationRequest locationRequest = LocationRequest.create();
        locationRequest.setInterval(10000);
        locationRequest.setFastestInterval(5000);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder()
                .addLocationRequest(locationRequest);

        SettingsClient client = LocationServices.getSettingsClient(getActivity());
        Task<LocationSettingsResponse> task = client.checkLocationSettings(builder.build());


        task.addOnSuccessListener(getActivity(), new OnSuccessListener<LocationSettingsResponse>() {
            @Override
            public void onSuccess(LocationSettingsResponse locationSettingsResponse) {
                Intent intent =new Intent(getActivity(),JadughorLocation.class);
                startActivity(intent);
            }
        });

        task.addOnFailureListener(getActivity(), new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                if (e instanceof ResolvableApiException) {
                    // Location settings are not satisfied, but this can be fixed
                    // by showing the user a dialog.
                    try {
                        // Show the dialog by calling startResolutionForResult(),
                        // and check the result in onActivityResult().
                        ResolvableApiException resolvable = (ResolvableApiException) e;
                        resolvable.startResolutionForResult(getActivity(),coad);
                    } catch (IntentSender.SendIntentException sendEx) {
                    }
                }
            }
        });
    }


}
