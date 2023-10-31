package com.send.LoginApp;

import org.mozilla.javascript.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.send.Myapp.R;
import org.mozilla.javascript.Scriptable;

public class CalculartorActivity extends AppCompatActivity {

    ImageView btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0;
    ImageView btn_dot, btn_equal, btn_ac, btn_module, btn_plus, btn_minus, btn_multiplication;

    TextView inputTxt, outPuttxt;

    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outPuttxt = findViewById(R.id.outPuttxt);
        inputTxt = findViewById(R.id.inputTxt);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_dot = findViewById(R.id.btn_dot);
        btn_equal = findViewById(R.id.btn_equal);
        btn_ac = findViewById(R.id.btn_ac);
        btn_module = findViewById(R.id.btn_module);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiplication = findViewById(R.id.btn_multiplication);

        btn_0.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "0");
        });

        btn_1.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "1");
        });

        btn_2.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "2");
        });


        btn_3.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "3");
        });

        btn_4.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "4");
        });

        btn_5.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "5");
        });

        btn_6.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "6");
        });

        btn_7.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "7");
        });

        btn_8.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "8");
        });

        btn_9.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "9");
        });

        btn_ac.setOnClickListener(v -> {
            inputTxt.setText("");
            outPuttxt.setText("");
        });

        btn_dot.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + ".");
        });

        btn_plus.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "+");
        });

        btn_minus.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "-");
        });

        btn_module.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "%");
        });

        btn_multiplication.setOnClickListener(v -> {
            data = inputTxt.getText().toString();
            inputTxt.setText(data + "×");
        });

        btn_equal.setOnClickListener(v -> {
            data = inputTxt.getText().toString();

            data = data.replaceAll("×", "*");
            data = data.replaceAll("%", "/100");
            data = data.replaceAll("÷", "/");

            Context rhino = Context.enter();
            rhino.setOptimizationLevel(-1);

            String finalResult = "";

            Scriptable scriptable = rhino.initStandardObjects();
            finalResult = rhino.evaluateString(scriptable, data, "Javsscript", 1, null).toString();

            outPuttxt.setText(finalResult);

        });

    }
}
