package com.example.listviewpractice;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent = getIntent();
        ImageView imageView = findViewById(R.id.showImage);
        TextView textView = findViewById(R.id.studentName);
        imageView.setImageResource(intent.getIntExtra("imageID",R.drawable.emoji_kids_01));
        textView.setText(intent.getStringExtra("studentName"));
    }
}
