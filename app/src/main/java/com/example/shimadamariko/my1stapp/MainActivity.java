package com.example.shimadamariko.my1stapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = findViewById(R.id.editText);

                Toast toast = Toast.makeText(MainActivity.this, et.getText()+"   "
                        +"登録しました",Toast.LENGTH_SHORT);
                toast.show();
                et.setText("");
                }

          // class OnImageButton implements View.OnClickListener {

             //   @Override
              //  public void onClick(View v) {
              //      EditText et = findViewById(R.id.editText);


                    //  Toast.makeText(MainActivity.this,  str, Toast.LENGTH_SHORT).show();

                //    Toast toast = Toast.makeText(MainActivity.this, et.getText(), Toast.LENGTH_SHORT);
                //    toast.show();


                //    View.OnClickListener events = new OnImageButton();

            //        findViewById(R.id.imageButton).setOnClickListener(events);

            //    }
        });
        findViewById(R.id.imageButton).setOnClickListener(new OnClickListener() {
            public void onClick(View v){
                String str = "アイスバーグ";
//                lable.setText(((EditText) findViewById(R.id.editText)).getText());
                new AlertDialog.Builder(MainActivity.this)
                      .setMessage(str)
                      .show();



        }
    });
        }
    }