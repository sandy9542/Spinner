package com.send.LoginApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.send.Myapp.R;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword);
        Button newPassword = findViewById(R.id.Submit);
        TextView email = findViewById(R.id.Email);
        TextView otp = findViewById(R.id.OTP);
//        final int[] code = new int[1];
        TextView oldPass = findViewById(R.id.enterOldPassword);
        TextView newPass = findViewById(R.id.enterNewPassword);
        Intent intent = getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("Send");
            if (message != null) {
                Toast.makeText(ForgotPassword.this, "ForgotPassword", Toast.LENGTH_SHORT).show();
            }
        }

        newPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Random random = new Random();
//                code[0] =random.nextInt(8999)+1000;
//                String url = "";
//                RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
//                StringRequest stringRequest = new StringRequest(Request.Method.POST,url,);
                if (email.getText().toString().equals("1234") && otp.getText().toString().equals("1234") &&
                        oldPass.getText().toString().equals("1234") && newPass.getText().toString().equals("1234")) {
                    Toast.makeText(ForgotPassword.this, "You successfully changed the password", Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(ForgotPassword.this, LoginActivity.class);
                    intent1.putExtra("Account", "Account created");
                    startActivity(intent1);
                } else {
                    Toast.makeText(ForgotPassword.this, "You miss something once check", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}