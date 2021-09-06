package com.example.ex_no_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int textSize = 20;
    boolean isColorChanged = false;
    int textStyle = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView outputTextView = findViewById(R.id.tv_output);
        Button textSizeChange = findViewById(R.id.btn_text_size_change);
        textSizeChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textSize <= 50) {
                    textSize = 20;
                } else {
                    textSize += 5;
                }
                outputTextView.setTextSize(textSize);
            }
        });

        Button textColorChange = findViewById(R.id.btn_text_color_change);
        textColorChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isColorChanged) {
                    outputTextView.setTextColor(Color.parseColor("#FF0000"));
                    isColorChanged = false;
                } else {
                    outputTextView.setTextColor(Color.parseColor("#00FF00"));
                    isColorChanged = true;

                }
            }
        });

        Button textStyleChange = findViewById(R.id.btn_text_style_change);
        textStyleChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStyle += 1;
                if(textStyle > 4) {
                    textStyle = 1;
                }

                switch (textStyle) {
                    case 1: outputTextView.setTypeface(Typeface.DEFAULT);
                    break;
                    case 2: outputTextView.setTypeface(Typeface.DEFAULT_BOLD);
                        break;
                    case 3: outputTextView.setTypeface(Typeface.MONOSPACE);
                        break;
                    case 4: outputTextView.setTypeface(Typeface.SERIF, Typeface.BOLD);
                        break;
                }
            }
        });
    }
}