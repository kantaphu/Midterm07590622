package com.example.midterm07590622;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.midterm07590622.model.Auth;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.Login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText emailEditText = findViewById(R.id.useredit);
                EditText passwordEditText = findViewById(R.id.passedit);

                String inputEmail = emailEditText.getText().toString();
                String inputPassword = passwordEditText.getText().toString();

                Auth auth = new Auth(inputEmail, inputPassword);

                boolean result = auth.check();

                if (result) {
                    Toast.makeText(
                            LoginActivity.this,
                            R.string.Login_success,
                            Toast.LENGTH_SHORT
                    ).show();

                    Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                    intent.putExtra("aaa", "kantaporn");
                    startActivity(intent);


                } else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                    //dialog.setTitle("Invalid username or password");
                    dialog.setMessage(R.string.Login_failed);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //โค้ดที่ให้ทำงาน เมื่อ user กดปุ่ม ok
                            //todo;
                        }
                    });

                    dialog.show();
                }
            }
        });
    }
}
