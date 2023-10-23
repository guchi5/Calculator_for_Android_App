package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Map<String, Button> btns;
    private TextView calcText;
    private StringBuilder sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btns = new HashMap(){
            {
                put("0", findViewById(R.id.btn0));
                put("1", findViewById(R.id.btn1));
                put("2", findViewById(R.id.btn2));
                put("3", findViewById(R.id.btn3));
                put("4", findViewById(R.id.btn4));
                put("5", findViewById(R.id.btn5));
                put("6", findViewById(R.id.btn6));
                put("7", findViewById(R.id.btn7));
                put("8", findViewById(R.id.btn8));
                put("9", findViewById(R.id.btn9));
                put("plus", findViewById(R.id.btnPlus));
                put("sub", findViewById(R.id.btnSub));
                put("mul", findViewById(R.id.btnMul));
                put("div", findViewById(R.id.btnDiv));
                put("clear", findViewById(R.id.btnClear));
                put("equal", findViewById(R.id.btnEqual));
            }
        };
        for(Button btn : btns.values()){
            btn.setOnClickListener(this);
        }
        calcText = findViewById(R.id.calcText);
        sb = new StringBuilder();
    }
    @Override
    public void onClick(View view){
        // 入力制限で分岐
        if(sb.length()<10){
            if(view.getId() == R.id.btn0 && sb.length() > 0){
                sb.append("0");
                calcText.setText(sb);
            }
            if(view.getId() == R.id.btn1){
                sb.append("1");
                calcText.setText(sb);
            }
            if(view.getId() == R.id.btn2){
                sb.append("2");
                calcText.setText(sb);
            }
            if(view.getId() == R.id.btn3){
                sb.append("3");
                calcText.setText(sb);
            }
            if(view.getId() == R.id.btn4){
                sb.append("4");
                calcText.setText(sb);
            }
            if(view.getId() == R.id.btn5){
                sb.append("5");
                calcText.setText(sb);
            }
            if(view.getId() == R.id.btn6){
                sb.append("6");
                calcText.setText(sb);
            }
            if(view.getId() == R.id.btn7){
                sb.append("7");
                calcText.setText(sb);
            }
            if(view.getId() == R.id.btn8){
                sb.append("8");
                calcText.setText(sb);
            }
            if(view.getId() == R.id.btn9){
                sb.append("9");
                calcText.setText(sb);
            }
        }
        // クリア処理
        if(view.getId() == R.id.btnClear){
            sb = new StringBuilder();
            calcText.setText("0");
        }


    }
}