package com.example.bai1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtA, edtB, edtResult;
    Button btnSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtResult = findViewById(R.id.edtResult);
        btnSum = findViewById(R.id.btnSum);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int a = Integer.parseInt(edtA.getText().toString());
                    int b = Integer.parseInt(edtB.getText().toString());
                    int sum = a + b;
                    edtResult.setText(String.valueOf(sum));
                } catch (NumberFormatException e) {
                    edtResult.setText("Lỗi nhập liệu");
                }
            }
        });
    }
}
