package com.send.LoginApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.send.Myapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);
        Button createnew = findViewById(R.id.NewUser);
        Button forgotPassword = findViewById(R.id.ForgotPassword);
        Button home = findViewById(R.id.log);
        TextView username = findViewById(R.id.UserName);
        TextView password = findViewById(R.id.password);


        createnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, CreateActivity.class);
                intent.putExtra("Message", "Hello from new user");
                startActivity(intent);
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ForgotPassword.class);
                intent.putExtra("Message", "New password created");
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("1234") && password.getText().toString().equals("1234")) {
                    Toast.makeText(LoginActivity.this, "LOGIN SUCCESSFULLY", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    intent.putExtra("Login", "Home page opened");
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "You miss the username and password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}