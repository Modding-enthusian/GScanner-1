package com.example.gscannerv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username           = (TextView) findViewById(R.id.login_username);
        TextView password           = (TextView) findViewById(R.id.login_password);
        MaterialButton confirmBtn   = (MaterialButton) findViewById(R.id.login_btn_confirm);

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @override
            public void onClick(View v) {
                if ((username.getText().toString().equals("admin")) &&
                    (password.getText().toString().equals("gscanner")))
                {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "LOGIN FAILED");
                }
            }
        });
    }
}