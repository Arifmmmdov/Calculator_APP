package com.example.klaviatureapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.os.MessageCompat;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.zip.Inflater;

public class ExampleDilaog extends AppCompatDialogFragment implements View.OnClickListener {
    TextView TW_Heksa;
    LinearLayout linearLayout;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.change_color_layout,null);
        TW_Heksa=view.findViewById(R.id.HeksaNumbers);

        linearLayout=view.findViewById(R.id.LinearLayoutMain);
        //Buttons
        view.findViewById(R.id.Blue).setOnClickListener(this);
        view.findViewById(R.id.Red).setOnClickListener(this);
        view.findViewById(R.id.Green).setOnClickListener(this);
        view.findViewById(R.id.Yellow).setOnClickListener(this);
        view.findViewById(R.id.Orange).setOnClickListener(this);
        view.findViewById(R.id.Purple).setOnClickListener(this);
        view.findViewById(R.id.Grey).setOnClickListener(this);
        view.findViewById(R.id.Black).setOnClickListener(this);
        view.findViewById(R.id.Brown).setOnClickListener(this);
        view.findViewById(R.id.White).setOnClickListener(this);


        builder.setView(view)
                .setTitle("Select Color")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }


    @Override
    public void onClick(View v) {
        int i=v.getId();
        switch(i){
            case R.id.Blue: TW_Heksa.setText("Blue");break;
            case R.id.Red: TW_Heksa.setText("Red");break;
            case R.id.Yellow: TW_Heksa.setText("Yellow");break;
            case R.id.Green: TW_Heksa.setText("Green");break;
            case R.id.Orange: TW_Heksa.setText("Orange");break;
            case R.id.Purple: TW_Heksa.setText("Purple");break;
            case R.id.Grey: TW_Heksa.setText("Grey");break;
            case R.id.Black: TW_Heksa.setText("Black");break;
            case R.id.Brown: TW_Heksa.setText("Brown");break;
            case R.id.White: TW_Heksa.setText("White");break;



        }
    }



}
