package com.example.firstandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = getIntent().getExtras().getString("ds");
        TextView mTextView = findViewById(R.id.textView2);
        mTextView.setText(name);
    }

    public void loginHandler(View view) {
        Toast.makeText(this, "loggin in", Toast.LENGTH_SHORT).show();
        Intent mIntent;
        mIntent  = new Intent(MainActivity.this,HomeActivity.class);
        mIntent.putExtra("s2","satyam in java");
        startActivity(mIntent);
    }
}