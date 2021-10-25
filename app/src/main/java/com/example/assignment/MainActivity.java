package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Serializable {

    private CheckBox lambo,ferarri,supra;
    private RadioButton lamboInterior,ferarriInterior,supraInterior;
    private SwitchCompat lamboSport,ferarriSport,supraSport;
    private ArrayList<String> order=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lambo = (CheckBox) findViewById(R.id.lambo_checkBox);
        lamboInterior = (RadioButton) findViewById(R.id.lambo_leather);
        lamboSport = (SwitchCompat) findViewById(R.id.lambo_sport);
        ferarri = (CheckBox) findViewById(R.id.ferarri_checkBox);
        ferarriInterior = (RadioButton) findViewById(R.id.ferarri_leather);
        ferarriSport = (SwitchCompat) findViewById(R.id.ferarri_sport);
        supra = (CheckBox) findViewById(R.id.supra_checkBox);
        supraInterior = (RadioButton) findViewById(R.id.supra_leather);
        supraSport = (SwitchCompat) findViewById(R.id.supra_sport);

        ImageButton add = (ImageButton) findViewById(R.id.add_cart);
        Button display = (Button) findViewById(R.id.display);
        Button complete = (Button) findViewById(R.id.complete);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lambo.isChecked()) {
                    order.add("Lamborghini Aventador SV ");
                }
                if (lamboInterior.isChecked()) {
                    order.add("Leather Interior ");
                } else {
                    order.add("Fabric Interior ");
                }
                if (lamboSport.isChecked()) {
                    order.add("Sport Package ");
                }
                if (ferarri.isChecked()) {
                    order.add("Ferarri La Ferarri ");
                }
                if (ferarriInterior.isChecked()) {
                    order.add("Leather Interior ");
                } else {
                    order.add("Fabric Interior ");
                }
                if (ferarriSport.isChecked()) {
                    order.add("Sport Package ");
                }
                if (supra.isChecked()) {
                    order.add("Toyota Supra ");
                }
                if (supraInterior.isChecked()) {
                    order.add("Leather Interior ");
                } else {
                    order.add("Fabric Interior ");
                }
                if (supraSport.isChecked()) {
                    order.add("Sport Package ");
                }
                Context c = getApplicationContext();
                Toast.makeText(c, "Items Added To Cart" , Toast.LENGTH_SHORT).show();
            }
        });

        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}