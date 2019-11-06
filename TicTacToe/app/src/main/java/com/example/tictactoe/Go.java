package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Go extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn1);
                checkWin();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn2);
                checkWin();
            }
        });

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
                checkWin();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn5);
                checkWin();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn5);
                checkWin();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn6);
                checkWin();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn7);
                checkWin();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn8);
                checkWin();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn9);
                checkWin();
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
        String b4 = btn4.getText().toString();
        String b5 = btn5.getText().toString();
        String b6 = btn6.getText().toString();
        String b7 = btn7.getText().toString();
        String b8 = btn8.getText().toString();
        String b9 = btn9.getText().toString();


        if (b1.equals(b2) && b1.equals(b3)&&(!b1.equals("") || !b2.equals("") || !b3.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }


        else if(b1.equals(b4) && b4.equals(b7)&&(!b1.equals("") || !b4.equals("") || !b7.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }

        else if(b1.equals(b5) && b5.equals(b9)&&(!b1.equals("") || !b5.equals("") || !b9.equals("")) ){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }

        if(b4.equals(b5) && b5.equals(b6)&&(!b4.equals("") || !b5.equals("") || !b6.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }

        if(b7.equals(b8) && b8.equals(b9)&&(!b7.equals("") || !b8.equals("") || !b9.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }

        if(b2.equals(b5) && b5.equals(b8)&&(!b2.equals("") || !b5.equals("") || !b8.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }

        if(b3.equals(b6) && b6.equals(b9)&&(!b3.equals("") || !b6.equals("") || !b9.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }

        if(b3.equals(b5) && b5.equals(b7)&&(!b3.equals("") || !b5.equals("") || !b7.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }


    }
}
