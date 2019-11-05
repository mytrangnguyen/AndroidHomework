package com.example.mykaro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn1);
                checkWin();
                checkPlayWin(btn1,btn2,btn3,"X");
                checkPlayWin(btn1,btn4,btn7,"X");


            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn2);
                checkWin();
            }
        });

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn3);
                checkWin();
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn4);
            }
        });

        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn5);
            }
        });

        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn6);
            }
        });

        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn7);
            }
        });

        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn8);
            }
        });

        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn9);
            }
        });

    }

    int count =0;
    public void checkXO(Button btn){
        if(count % 2 ==0){
            btn.setText("X");
        }
        else btn.setText("O");
        count++;

    }

    public void checkWin(){
        String b1 = btn1.getText().toString();
        String b2 = btn2.getText().toString();
        String b3 = btn3.getText().toString();
        if(b1.equals(b2) && b2.equals(b3)){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }

    }

    public void checkPlayWin(Button a, Button b, Button c, String XO) {
        String b1 = a.getText().toString();
        String b2 = b.getText().toString();
        String b3 = c.getText().toString();
        if(b1.equals(XO)&& b2.equals(XO)&& b3.equals(XO)) {
            Toast.makeText(this, "Win nè mọi người  ơi", Toast.LENGTH_SHORT).show();

        }

    }
}
