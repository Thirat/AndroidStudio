package com.example.whale_000.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String sign;
    double oldValue;
    double newValue;
    boolean isFirstValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);

        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        Button buttonDivided = (Button) findViewById(R.id.buttonDivided);
        Button buttonEnter = (Button) findViewById(R.id.buttonEnter);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);

        isFirstValue = true;
        //button 0 action
        button0.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        result.append("0");
                    }
                }
        );

        //button 1 action
        button1.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        result.append("1");
                        if(isFirstValue == true) {
                            TextView oldValue = (TextView) findViewById(R.id.oldValue);
                            oldValue.append("1");
                        }else{
                            TextView newValue = (TextView) findViewById(R.id.newValue);
                            newValue.append("1");
                        }
                    }
                }
        );

        //button 2 action
        button2.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        result.append("2");
                    }
                }
        );

        //button 3 action
        button3.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        result.append("3");
                    }
                }
        );

        //button 4 action
        button4.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        result.append("4");
                    }
                }
        );

        //button 5 action
        button5.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        result.append("5");
                    }
                }
        );

        //button 6 action
        button6.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        result.append("6");
                    }
                }
        );

        //button 7 action
        button7.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        result.append("7");
                    }
                }
        );

        //button 8 action
        button8.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        result.append("8");
                    }
                }
        );

        //button 9 action
        button9.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        result.append("9");
                    }
                }
        );

        //button Clear action
        buttonClear.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        newValue =0;
                        oldValue =0;
                        result.setText("");
                    }
                }
        );

        //button Plus action
        buttonPlus.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        TextView signText = (TextView) findViewById(R.id.sign);
                        TextView oldValueText = (TextView) findViewById(R.id.oldValue);
                        oldValue = Double.parseDouble(result.getText().toString());
                        oldValueText.setText(String.valueOf(oldValue));
                        sign = "+";
                        signText.setText("+");
                        result.setText("");
                    }
                }
        );

        //button Minus action
        buttonMinus.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        oldValue = Double.parseDouble(result.getText().toString());
                        sign = "-";
                        result.setText("");
                    }
                }
        );

        //button Multiply action
        buttonMultiply.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        oldValue = Double.parseDouble(result.getText().toString());
                        sign = "*";
                        result.setText("");
                    }
                }
        );

        //button Divided action
        buttonDivided.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        oldValue = Double.parseDouble(result.getText().toString());
                        sign = "/";
                        result.setText("");
                    }
                }
        );

        //button Enter action
        buttonEnter.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView result = (TextView) findViewById(R.id.result);
                        newValue = Double.parseDouble(result.getText().toString());
                        if(sign.equals("+")){
                            result.setText(String.valueOf(oldValue + newValue));
                        }else if (sign.equals("-")){
                            result.setText(String.valueOf(oldValue - newValue));
                        }else if(sign.equals("*")){
                            result.setText(String.valueOf(oldValue * newValue));
                        }else if(sign.equals("/")){
                            if(newValue != 0){
                                result.setText(String.valueOf(oldValue / newValue));
                            }else{
                                result.setText("Can not divided by 0");
                            }
                        }
                        sign = "";
                    }
                }
        );


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
