package com.send.LoginApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.send.Myapp.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeactivity);
        Button logout = findViewById(R.id.LogOut);
        Button sub = findViewById(R.id.subject);
        Intent intent = getIntent();
        if(intent != null) {
            String message = intent.getStringExtra("Send");
            if (message != null) {
                Toast.makeText(HomeActivity.this, "ForgotPassword", Toast.LENGTH_SHORT).show();
            }
        }

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,LoginActivity.class);
                intent.putExtra("Logout","logout SUCCESSFULLY");
                startActivity(intent);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,SubjectActivity.class);
                intent.putExtra("Subjects fetched ","");
                startActivity(intent);
            }
        });
    }
}
