package com.example.tictactoe;

import android.graphics.drawable.Drawable;
import android.support.v4.util.ArraySet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageButton i1,i2,i3,i4,i5,i6,i7,i8,i9;
TextView t1,t2;
Button b1;
int win[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
char choices[] ={'b','b','b','b','b','b','b','b','b'};
char state;


public Integer signs[]={R.drawable.o,R.drawable.x};
public int currTurn=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1=(ImageButton)findViewById(R.id.ib0);
        i2=(ImageButton)findViewById(R.id.ib1);
        i3=(ImageButton)findViewById(R.id.ib2);
        i4=(ImageButton)findViewById(R.id.ib3);
        i5=(ImageButton)findViewById(R.id.ib4);
        i6=(ImageButton)findViewById(R.id.ib5);
        i7=(ImageButton)findViewById(R.id.ib6);
        i8=(ImageButton)findViewById(R.id.ib7);
        i9=(ImageButton)findViewById(R.id.ib8);
        t1=(TextView) findViewById(R.id.lbl_heading);
        t2=(TextView) findViewById(R.id.lbl_op);

        t2.setText("O's turn");

        b1=(Button)findViewById(R.id.btn_restart);

    }
    public  void click1(View view){
        check_turn();
        i1.setImageResource(signs[currTurn]);
        choices[0]=state;
        i1.setEnabled(false);
        check_win();
    }
    public  void click2(View view){
        check_turn();
        choices[1]=state;
        i2.setImageResource(signs[currTurn]);
        i2.setEnabled(false);
        check_win();
    }
    public  void click3(View view){
        check_turn();
        choices[2]=state;
        i3.setImageResource(signs[currTurn]);
        i3.setEnabled(false);
        check_win();
    }
    public  void click4(View view){
        check_turn();
        choices[3]=state;
        i4.setImageResource(signs[currTurn]);
        i4.setEnabled(false);
        check_win();
    }
    public  void click5(View view){
        check_turn();
        choices[4]=state;
        i5.setImageResource(signs[currTurn]);
        i5.setEnabled(false);
        check_win();
    }
    public  void click6(View view){
        check_turn();
        choices[5]=state;
        i6.setImageResource(signs[currTurn]);
        i6.setEnabled(false);
        check_win();
    }
    public  void click7(View view){
        check_turn();
        choices[6]=state;
        i7.setImageResource(signs[currTurn]);
        i7.setEnabled(false);
        check_win();
    }
    public  void click8(View view){
        check_turn();
        choices[7]=state;
        i8.setImageResource(signs[currTurn]);
        i8.setEnabled(false);
        check_win();
    }
    public  void click9(View view){
        check_turn();
        choices[8]=state;
        i9.setImageResource(signs[currTurn]);
        i9.setEnabled(false);
        check_win();
    }
    public int check_turn(){
        if (currTurn==0){
            set_text();
            currTurn=1;
        }
        else if(currTurn==1){
            set_text();
            currTurn=0;
        }


        return currTurn;
    }
    public void set_text(){

        if (currTurn==0){
            t2.setText("O's turn");
            state = 'x';
        }
        else if(currTurn==1){
            t2.setText("X's turn");
            state = 'o';
        }
    }
    public void restart(View view){
        t2.setText("O's turn");
        i1.setEnabled(true);
        i2.setEnabled(true);
        i3.setEnabled(true);
        i4.setEnabled(true);
        i5.setEnabled(true);
        i6.setEnabled(true);
        i7.setEnabled(true);
        i8.setEnabled(true);
        i9.setEnabled(true);
        t2.animate().scaleX(-1).scaleY(-1);
        i1.setImageResource(R.drawable.blank);
        i2.setImageResource(R.drawable.blank);
        i3.setImageResource(R.drawable.blank);
        i4.setImageResource(R.drawable.blank);
        i5.setImageResource(R.drawable.blank);
        i6.setImageResource(R.drawable.blank);
        i7.setImageResource(R.drawable.blank);
        i8.setImageResource(R.drawable.blank);
        i9.setImageResource(R.drawable.blank);
        for (int i=0;i<=8;i++){
            choices[i]='b';
        }
        currTurn=1;
    }
    public void check_win(){
//        int win[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
//        char choices[] ={'b','b','b','b','b','b','b','b','b'};
        for (int m = 0; m<8; m++){

            int data1,data2,data3;
            data1 =win[m][0];
            data2 =win[m][1];
            data3 =win[m][2];

            if (choices[data1]=='x' && choices[data2]=='x' &&choices[data3]=='x'){
                t2.animate().scaleY(-10).scaleX(-10);
                t2.setText("X Won");

                t2.setTextColor(0xFF00574B);
                t2.animate().scaleX(2).scaleY(2).rotation(1800).setDuration(4000);
                i1.setEnabled(false);
                i2.setEnabled(false);
                i3.setEnabled(false);
                i4.setEnabled(false);
                i5.setEnabled(false);
                i6.setEnabled(false);
                i7.setEnabled(false);
                i8.setEnabled(false);
                i9.setEnabled(false);

                break;
            }
            else if (choices[data1]=='o' && choices[data2]=='o' &&choices[data3]=='o'){
                t2.animate().scaleY(-10).scaleX(-10);
                t2.setText("O Won");
                t2.setTextColor(0xFF00574B);
                t2.animate().scaleX(2).scaleY(2).rotation(1800).setDuration(4000);
                i1.setEnabled(false);
                i2.setEnabled(false);
                i3.setEnabled(false);
                i4.setEnabled(false);
                i5.setEnabled(false);
                i6.setEnabled(false);
                i7.setEnabled(false);
                i8.setEnabled(false);
                i9.setEnabled(false);
                break;
            }
        }
    }

}
