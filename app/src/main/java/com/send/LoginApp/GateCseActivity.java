package com.send.LoginApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.send.Myapp.R;

public class GateCseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coursesactivity);
        Button gateCse = findViewById(R.id.gatecse);
        Intent intent = getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("Send");
            if (message != null) {
                Toast.makeText(GateCseActivity.this, "ForgotPassword", Toast.LENGTH_SHORT).show();
            }
        }

        gateCse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GateCseActivity.this, SubjectsActivity.class);
                intent.putExtra("Gate Mech subjects", "subject are opened");
                startActivity(intent);
            }
        });
    }
}
