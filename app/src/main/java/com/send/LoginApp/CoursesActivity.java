package com.send.LoginApp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.send.Myapp.R;

public class CoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coursesactivity);
        Button gateMech = findViewById(R.id.gatemech);
        Intent intent = getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("Searching");
            if (message != null) {
                Toast.makeText(CoursesActivity.this, "TQ", Toast.LENGTH_SHORT).show();
            }
        }

        gateMech.setOnClickListener(v -> {
            Intent intent1 = new Intent(CoursesActivity.this, SubjectsActivity.class);
            intent1.putExtra("Gate Mech Courses", "Courses are opened");
            startActivity(intent1);
        });
    }
}
