package com.societe.anonyme.sortofmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnopt,btncnx,btnpop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnopt = findViewById(R.id.btnoption);
        btnopt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,OptionMenuActivity.class));
            }
        });

        btncnx = findViewById(R.id.btncontext);
        btncnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ContextMenuActivity.class));
            }
        });

        btnpop = findViewById(R.id.btnpopup);
        btnpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PopupMenuActivity.class));
            }
        });


    }
}
