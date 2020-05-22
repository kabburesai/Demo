package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public ImageView imageView_profilePicture;
    public TextView textView_contactPersonName,textView_newMessageInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        imageView_profilePicture = findViewById(R.id.imageView_profilePic);
        imageView_profilePicture.setImageResource(R.drawable.jack);
        textView_contactPersonName = findViewById(R.id.textView_contactName);
        textView_newMessageInfo = findViewById(R.id.textView_newMessage);

    }
}
