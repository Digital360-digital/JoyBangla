package com.digital360.joybangla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout ;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=findViewById(R.id.drawerId);
        navigationView=findViewById(R.id.navigation_id);



        toggle=new ActionBarDrawerToggle(MainActivity.this,drawerLayout,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(MainActivity.this);

       if (savedInstanceState==null){
           getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,new Home()).commit();
       }




    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
       switch (menuItem.getItemId())
       {
           case R.id.home:
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,new Home()).commit();
               break;
           case R.id.bongobondhu:
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,new Sheik_Mujib()).commit();
               break;
           case R.id.hasina:
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,new SheikHasina()).commit();
               break;
           case R.id.joy:
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,new Joy()).commit();
               break;
           case R.id.awyamelig:
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,new Awyamelig()).commit();
               break;
           case R.id.chatrolig:
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,new Chatrolig()).commit();
               break;

       }
       drawerLayout.closeDrawer(GravityCompat.START);
       return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
