package com.example.klaviatureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Button button1_1,button1_2,button1_3,button1_4,button0_1,button0_2,button0_3,button0_4,button2_1,button2_2,button2_3,button2_4,button3_1,button3_2,button3_3,button3_4,button4_1,button4_2,button4_3,button4_4;
    TextView textView,anotherText;
    ImageButton changeColor;
    LinearLayout linearLayout;
    public float FindResult(String MainString){
        Stack<Float> MyMainList= new Stack<Float>();
        Stack<Float> MyAnotherList= new Stack<Float>();
        char[] c = MainString.toCharArray();

        String[] s=MainString.split("[/*+%-]");
        int n=0;
        if(s.length<=1){
            return Float.valueOf(s[n]);
        }
        float MainInteger=Float.valueOf(s[n]);
        n++;
        for(char c1:c){
            if(c1=='*'){
                MainInteger= MainInteger*Float.valueOf(s[n]);
                n++;
            }
            else if (c1=='/'){
                MainInteger=MainInteger/Float.valueOf(s[n]);
                n++;
            }
            else if (c1=='%'){
                MainInteger=MainInteger*Float.valueOf(s[n])/100;
                n++;
            }
            else if (c1=='+'){
                MainInteger=MainInteger+Float.valueOf(s[n]);
                n++;
            }
            else if (c1=='-'){
                MainInteger=MainInteger-Float.valueOf(s[n]);
                n++;
            }

        }
        return MainInteger;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        changeColor = findViewById(R.id.btn_changeColor);
        textView=findViewById(R.id.MainText);
        anotherText=findViewById(R.id.anotherText);
        linearLayout=findViewById(R.id.LinearLayoutMain);
        button0_1=findViewById(R.id.button0_1);
        button0_2=findViewById(R.id.button0_2);
        button0_3=findViewById(R.id.button0_3);
        button0_4=findViewById(R.id.button0_4);
        button1_1=findViewById(R.id.button1_1);
        button1_2=findViewById(R.id.button1_2);
        button1_3=findViewById(R.id.button1_3);
        button1_4=findViewById(R.id.button1_4);
        button2_1=findViewById(R.id.button2_1);
        button2_2=findViewById(R.id.button2_2);
        button2_3=findViewById(R.id.button2_3);
        button2_4=findViewById(R.id.button2_4);
        button3_1=findViewById(R.id.button3_1);
        button3_2=findViewById(R.id.button3_2);
        button3_3=findViewById(R.id.button3_3);
        button3_4=findViewById(R.id.button3_4);
        button4_1=findViewById(R.id.button4_1);
        button4_2=findViewById(R.id.button4_2);
        button4_3=findViewById(R.id.button4_3);
        button4_4=findViewById(R.id.button4_4);


        button0_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("");
                anotherText.setText("");
            }
        });
        button0_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=textView.getText().toString();
                char[] c=s.toCharArray();

                //reqemlerin arxasinca yazilarken islenir
                if(s.length()!=0)
                if(c[s.length()-1]!='-'&&c[s.length()-1]!='+'&&c[s.length()-1]!='/'&&c[s.length()-1]!='*'&&c[s.length()-1]!='%'){

                    textView.append("%");

                }
                else{
                    textView.setText("");

                    for(int l=0;l<s.length()-1;l++){
                        textView.append(Character.toString(c[l]));

                    }
                    textView.append("%");
                }
            }
        });
        button0_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=textView.getText().toString();
                textView.setText("");
                if(s.length()>1) {

                    char[] c = s.toCharArray();
                    for (int l = 0; l < s.length() - 1; l++) {
                        textView.append(Character.toString(c[l]));

                    }
                    //continue from here
                    if (c[s.length() - 2] != '*' && c[s.length() - 2] != '%' && c[s.length() - 2] != '/' && c[s.length() - 2] != '-' && c[s.length() - 2] != '+') {

                        float find = FindResult(textView.getText().toString());
                        if(find%1==0){
                            int n=(int) find;
                            anotherText.setText(Integer.toString(n));
                        }
                        else
                        anotherText.setText(Float.toString(find));
                    }
                }else{
                    anotherText.setText("");
                }


            }
        });
        button0_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=textView.getText().toString();
                char[] c=s.toCharArray();

                //reqemlerin arxasinca yazilarken islenir
                if(s.length()!=0)
                if(c[s.length()-1]!='-'&&c[s.length()-1]!='+'&&c[s.length()-1]!='/'&&c[s.length()-1]!='*'&&c[s.length()-1]!='%'){

                    textView.append("/");
                }
                else{
                    textView.setText("");

                    for(int l=0;l<s.length()-1;l++){
                        textView.append(Character.toString(c[l]));

                    }
                    textView.append("/");
                }
            }
        });
        button1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("1");
                float find=FindResult(textView.getText().toString());
                if(find%1==0){
                    int n=(int) find;
                    anotherText.setText(Integer.toString(n));
                }
                else
                anotherText.setText(Float.toString(find));
            }
        });
        button1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("2");
                float find=FindResult(textView.getText().toString());
                if(find%1==0){
                    int n=(int) find;
                    anotherText.setText(Integer.toString(n));
                }
                else
                anotherText.setText(Float.toString(find));
            }
        });
        button1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("3");
                float find=FindResult(textView.getText().toString());
                if(find%1==0){
                    int n=(int) find;
                    anotherText.setText(Integer.toString(n));
                }
                else
                anotherText.setText(Float.toString(find));
            }
        });
        button1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=textView.getText().toString();
                char[] c=s.toCharArray();

                //reqemlerin arxasinca yazilarken islenir
                if(s.length()!=0)
                if(c[s.length()-1]!='-'&&c[s.length()-1]!='+'&&c[s.length()-1]!='/'&&c[s.length()-1]!='*'&&c[s.length()-1]!='%'  ){
                    textView.append("*");
                }
                //isarelerin yerini deyiserken islenir
                else{
                    textView.setText("");

                    for(int l=0;l<s.length()-1;l++){
                        textView.append(Character.toString(c[l]));

                    }
                    textView.append("*");
                }
            }

        });

        button2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("4");
                float find=FindResult(textView.getText().toString());
                if(find%1==0){
                    int n=(int) find;
                    anotherText.setText(Integer.toString(n));
                }
                else
                anotherText.setText(Float.toString(find));
            }
        });
        button2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("5");
                float find=FindResult(textView.getText().toString());
                if(find%1==0){
                    int n=(int) find;
                    anotherText.setText(Integer.toString(n));
                }
                else
                anotherText.setText(Float.toString(find));
            }
        });
        button2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("6");
                float find=FindResult(textView.getText().toString());
                if(find%1==0){
                    int n=(int) find;
                    anotherText.setText(Integer.toString(n));
                }
                else
                anotherText.setText(Float.toString(find));
            }
        });
        button2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=textView.getText().toString();
                char[] c=s.toCharArray();


                //reqemlerin arxasinca yazilarken islenir
                if(s.length()!=0)
                if(c[s.length()-1]!='-'&&c[s.length()-1]!='+'&&c[s.length()-1]!='/'&&c[s.length()-1]!='*'&&c[s.length()-1]!='%'){
                    textView.append("-");
                }
                else{
                    textView.setText("");

                    for(int l=0;l<s.length()-1;l++){
                        textView.append(Character.toString(c[l]));

                    }
                    textView.append("-");
                }

            }
        });
        button3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("7");
                float find=FindResult(textView.getText().toString());
                if(find%1==0){
                    int n=(int) find;
                    anotherText.setText(Integer.toString(n));
                }
                else
                anotherText.setText(Float.toString(find));
            }
        });
        button3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("8");
                float find=FindResult(textView.getText().toString());
                if(find%1==0){
                    int n=(int) find;
                    anotherText.setText(Integer.toString(n));
                }
                else
                anotherText.setText(Float.toString(find));
            }
        });
        button3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("9");
                float find=FindResult(textView.getText().toString());
                if(find%1==0){
                    int n=(int) find;
                    anotherText.setText(Integer.toString(n));
                }
                else
                anotherText.setText(Float.toString(find));
            }
        });
        button3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=textView.getText().toString();
                char[] c=s.toCharArray();


                //reqemlerin arxasinca yazilarken islenir
                if(s.length()!=0)
                if(c[s.length()-1]!='-'&&c[s.length()-1]!='+'&&c[s.length()-1]!='/'&&c[s.length()-1]!='*'&&c[s.length()-1]!='%'){
                    textView.append("+");
                }
                else{
                    textView.setText("");

                    for(int l=0;l<s.length()-1;l++){
                        textView.append(Character.toString(c[l]));

                    }
                    textView.append("+");
                }

            }
        });
        button4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("0");
                float find=FindResult(textView.getText().toString());
                if(find%1==0){
                    int n=(int) find;
                    anotherText.setText(Integer.toString(n));
                }
                else
                anotherText.setText(Float.toString(find));
            }
        });
        button4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(".");
            }
        });
        button4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("00");

                float find=FindResult(textView.getText().toString());
                if(find%1==0){
                    int n=(int) find;
                    anotherText.setText(Integer.toString(n));
                }
                else
                anotherText.setText(Float.toString(find));
            }
        });
        button4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(anotherText.getText());
                anotherText.setText("");
            }
        });

        //Change color button

        changeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetDialog();
            }
        });


    }
    public void SetDialog(){
        ExampleDilaog exampleDilaog=new ExampleDilaog();
        exampleDilaog.show(getSupportFragmentManager(),"Example Dialog");

    }
}