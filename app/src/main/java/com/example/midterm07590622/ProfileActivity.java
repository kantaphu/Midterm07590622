package com.example.midterm07590622;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent(); //เข้าถึง Intent ที่ส่งมาจากต้นทาง
        String usera = intent.getStringExtra("aaa"); //อ่านข้อมูลจาก
    }
}
