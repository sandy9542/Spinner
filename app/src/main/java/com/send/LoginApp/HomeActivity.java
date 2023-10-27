package com.send.LoginApp;

import android.content.Intent;
import android.os.Bundle;
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
        Button getCourses = findViewById(R.id.courses);
        Intent intent = getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("Send");
            if (message != null) {
                Toast.makeText(HomeActivity.this, "ForgotPassword", Toast.LENGTH_SHORT).show();
            }
        }

        logout.setOnClickListener(v -> {
            Intent intent1 = new Intent(HomeActivity.this, LoginActivity.class);
            intent1.putExtra("Logout", "logout SUCCESSFULLY");
            finish();
            startActivity(intent1);
        });

        getCourses.setOnClickListener(v -> {
            Intent intent1 = new Intent(HomeActivity.this, CoursesActivity.class);
            intent1.putExtra("Subjects fetched ", "");
            startActivity(intent1);
        });
    }
}
