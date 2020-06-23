package com.digital360.joybangla;

import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;

public class JadughorLocation extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    FusedLocationProviderClient fusedLocationProviderClient;
    double  lastLat,lastLng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadughor_location);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        fusedLocationProviderClient= LocationServices.getFusedLocationProviderClient(JadughorLocation.this);
       // getCurrentLocation();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(JadughorLocation.this);


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng sydney = new LatLng(23.75167785, 90.37649971);
        LatLng currentplace = new LatLng(lastLat,lastLng);
        mMap.addMarker(new MarkerOptions().position(sydney));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,18));
    }

    //// get current location
    public void getCurrentLocation(){
        if (ContextCompat.checkSelfPermission(JadughorLocation.this, Manifest.permission.ACCESS_FINE_LOCATION)!=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(JadughorLocation.this,new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},1);
        }else {
        fusedLocationProviderClient.getLastLocation().addOnSuccessListener(JadughorLocation.this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                Toast.makeText(JadughorLocation.this, "cccc", Toast.LENGTH_SHORT).show();
                if (location != null) {
                    lastLat = location.getLatitude();
                    lastLng = location.getLongitude();
                }

            }

        });}

    }

}
