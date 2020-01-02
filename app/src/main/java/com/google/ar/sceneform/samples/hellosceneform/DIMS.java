package com.google.ar.sceneform.samples.hellosceneform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DIMS extends AppCompatActivity {
    private TextView LenEdit,BenEdit,HenEdit,Area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dims);
        Intent jump=getIntent();
        LenEdit = findViewById(R.id.LenEdit);
        BenEdit = findViewById(R.id.BenEdit);
        HenEdit = findViewById(R.id.HenEdit);
        Area = findViewById(R.id.area);
        //LenEdit.setEnabled(false);
        LenEdit.setText(jump.getStringExtra("length"));
        //BenEdit.setEnabled(false);
        BenEdit.setText(jump.getStringExtra("breadth"));
        //HenEdit.setEnabled(false);
        HenEdit.setText(jump.getStringExtra("height"));
        Area.setText("Your Volume and DIM Solve Cost will be shown Here");
    }
}
