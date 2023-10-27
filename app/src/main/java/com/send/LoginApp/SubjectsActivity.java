package com.send.LoginApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.send.Myapp.R;

public class SubjectsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gatemechactivity);
        setContentView(R.layout.gatecseactivity);
        Button buy = findViewById(R.id.BuyCourses);
        Intent intent = getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("Send");
            if (message != null) {
                Toast.makeText(SubjectsActivity.this, "ForgotPassword", Toast.LENGTH_SHORT).show();
            }
        }
        buy.setOnClickListener(v -> {
                Intent intent1 = new Intent(SubjectsActivity.this, BuyCourseActivity.class);
                intent1.putExtra("You can see all subjects", "Select Course and Buy");
                startActivity(intent1);
        });
    }
}
