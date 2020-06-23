package com.digital360.joybangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class OsomaptoAttojiboni extends AppCompatActivity {
    Toolbar toolbar;
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osomapto_attojiboni);
        getSupportActionBar().hide();
        //getSupportActionBar().setIcon(R.drawable.back);
        toolbar=findViewById(R.id.tool);
        //toolbar.setLogo(R.drawable.back);
        backButton=findViewById(R.id.backId);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        PDFView pdfView =findViewById(R.id.pdfView);
        pdfView.fromAsset("oshomapto_attojiboni.pdf").load();
    }

}
