package com.example.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private Button bu1;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        buttonui();


    }

    /**
     * @time 2018/4/17  15:10
     * @describe Create Menu
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * @time 2018/4/17  15:17
     * @describe Menu Item
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Add_item:
                Toast.makeText(FirstActivity.this, "Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Remove_item:
                Toast.makeText(FirstActivity.this, "Remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    /**
     * @time 2018/4/17  15:13
     * @describe Button
     */
    public void buttonui() {
        bu1 = findViewById(R.id.button_1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //显式
//                intent = new Intent(FirstActivity.this,SecondActivity.class);
//                startActivity(intent);
                //隐式
                intent = new Intent("com.example.ACTION_STAR");
                startActivity(intent);
//                finish();//test销毁
                Toast.makeText(FirstActivity.this, "View-Onclick", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
