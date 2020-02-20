package com.example.viewsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        //RelativeLayout relativeLayout = new RelativeLayout(this);
        //TextView textView1 = new TextView(this);
        //textView1.setText("Привет, гусь!");

        //Устанавливаем размер
        //textView1.setLayoutParams(new ViewGroup.LayoutParams
        //        (ViewGroup.LayoutParams.MATCH_PARENT, 200));
        //Добавляем textView в RelativeLayout
        //relativeLayout.addView(textView1);
        //setContentView(relativeLayout);
    }


}
