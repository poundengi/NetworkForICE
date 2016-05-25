package com.chonlavit.networkforice;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton link_to_group1_content = (ImageButton) findViewById(R.id.group1);
        ImageButton link_to_group2_content = (ImageButton) findViewById(R.id.group2);
        ImageButton link_to_group3_content = (ImageButton) findViewById(R.id.group3);
        ImageButton link_to_group4_content = (ImageButton) findViewById(R.id.group4);
        ImageButton link_to_group5_content = (ImageButton) findViewById(R.id.group5);
        ImageButton link_to_group6_content = (ImageButton) findViewById(R.id.group6);


        link_to_group1_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToGroup1Content();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });

        link_to_group2_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToGroup2Content();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });

        link_to_group3_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToGroup3Content();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });

        link_to_group4_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToGroup4Content();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });

        link_to_group5_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToGroup5Content();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });

        link_to_group6_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToGroup6Content();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });




    }

    protected void redirectToGroup1Content(){
        Intent intent = new Intent(getApplicationContext(), Group1.class);
        startActivity(intent);
    }

    protected void redirectToGroup2Content(){
        Intent intent = new Intent(getApplicationContext(), Group2.class);
        startActivity(intent);
    }

    protected void redirectToGroup3Content(){
        Intent intent = new Intent(getApplicationContext(), Group3.class);
        startActivity(intent);
    }

    protected void redirectToGroup4Content(){
        Intent intent = new Intent(getApplicationContext(), Group4.class);
        startActivity(intent);
    }

    protected void redirectToGroup5Content(){
        Intent intent = new Intent(getApplicationContext(), Group5.class);
        startActivity(intent);
    }

    protected void redirectToGroup6Content(){
        Intent intent = new Intent(getApplicationContext(), Group6.class);
        startActivity(intent);
    }




}
