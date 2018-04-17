package com.example.apptest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private Button bu2;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        buttonui();
    }

    public void buttonui() {
        bu2 = findViewById(R.id.button_2);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:123455"));
                startActivity(intent);
//                Toast.makeText(SecondActivity.this, "SecondOpen", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
