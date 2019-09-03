package com.example.qlquants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NhanVienAdapter extends AppCompatActivity {
    Button btnGetURL, btnPostUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhan_vien_adapter);
        btnGetURL = (Button) findViewById(R.id.btnGetURL);
        btnGetURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NhanVienAdapter.this, ActivityGetURL.class);
                startActivity(intent);
            }
        });
        btnPostUser = (Button) findViewById(R.id.btnPostUser);
        btnPostUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NhanVienAdapter.this, PostUser.class);
                startActivity(intent);
            }
        });
    }
}
