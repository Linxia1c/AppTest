package com.example.apptest;

import android.content.Intent;
import android.net.Uri;
import android.nfc.tech.TagTechnology;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
    /**
     * @time 2018/4/17  19:39
     * @describe Button
     */
    public void buttonui() {
        bu2 = findViewById(R.id.button_2);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("tel:123455"));
//                startActivity(intent);
//                intent = getIntent();
//                String data = intent.getStringExtra("extra_data");
//                Log.d("extra",data);

                intent = new Intent();
                intent.putExtra("extra_data","lalalalala");
                setResult(RESULT_OK,intent);
                finish();

//                Toast.makeText(SecondActivity.this, "SecondOpen", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        intent = new Intent();
        intent.putExtra("extra_data","lalalalalalal");
        setResult(RESULT_OK,intent);
        super.onBackPressed();
    }
}
