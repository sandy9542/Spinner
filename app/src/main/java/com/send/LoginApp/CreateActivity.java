package com.send.LoginApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.send.Myapp.R;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createnewlogin);
        Button create = findViewById(R.id.create);
        TextView username = findViewById(R.id.UserName);
        TextView email = findViewById(R.id.emailId);
        TextView createPass = findViewById(R.id.Create_password);
        TextView reEnterPass = findViewById(R.id.reEnterPassword);
        Intent intent = getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("message");
            if (message != null) {
                Toast.makeText(CreateActivity.this,"New Account created",Toast.LENGTH_SHORT).show();
            }
        }
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("1234") && email.getText().toString().equals("1234") &&
                        createPass.getText().toString().equals("1234") && reEnterPass.getText().toString().equals("1234")) {
                    Intent intent1 = new Intent(CreateActivity.this, HomeActivity.class);
                    intent1.putExtra("Account", "Account created");
                    startActivity(intent1);
                }
                else {
                    Toast.makeText(CreateActivity.this, "You miss something once check", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}