package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.inputField);
        display.setShowSoftInputOnFocus(false);

    }

    private void updateText(String strToAdd) {
        String oldString = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldString.substring(0, cursorPos);
        String rightStr = oldString.substring(cursorPos);

        display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        display.setSelection(cursorPos + 1);
    }

    public void zeroBtn(View view) {
        updateText("0");
    }

    public void oneBtn(View view) {
        updateText("1");
    }

    public void twoBtn(View view) {
        updateText("2");
    }

    public void threeBtn(View view) {
        updateText("3");
    }

    public void fourBtn(View view) {
        updateText("4");
    }

    public void fiveBtn(View view) {
        updateText("5");
    }

    public void sixBtn(View view) {
        updateText("6");
    }

    public void sevenBtn(View view) {
        updateText("7");
    }

    public void eightBtn(View view) {
        updateText("8");
    }

    public void nineBtn(View view) {
        updateText("9");
    }

    public void pointBtn(View view) {
        updateText(".");
    }

    public void exponentBtn(View view) {
        updateText("e");
    }

    public void equalBtn(View view) {
        String userEx = display.getText().toString();
        Expression exp = new Expression(userEx);
        String result = String.valueOf(exp.calculate());
        display.setText(result);
        display.setSelection(result.length());
    }

    public void addBtn(View view) {
        updateText("+");
    }

    public void subtractBtn(View view) {
        updateText("-");
    }

    public void multiplyBtn(View view) {
        updateText("*");
    }

    public void divideBtn(View view) {
        updateText("/");
    }

    public void modBtn(View view) {
        updateText("%");
    }

    public void backspaceBtn(View view) {
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();
        if (cursorPos != 0 && textLen != 0) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos - 1);
        }
    }

    public void clearBtn(View view) {
        display.setText("");
    }

    public void lgBtn(View view) {
        updateText("log(");
        display.setSelection(display.getSelectionStart() + 3);
    }

    public void lnBtn(View view) {
        updateText("ln(");
        display.setSelection(display.getSelectionStart() + 2);
    }

    public void rparenthesisBtn(View view) {
        updateText(")");
    }
    public void lparenthesisBtn(View view) {
        updateText("(");
    }

    public void powerBtn(View view) {
        updateText("^");
    }

    public void rootBtn(View view) {
        updateText("sqrt(");
        display.setSelection(display.getSelectionStart() + 4);
    }

    public void piBtn(View view) {
        updateText("pi");
        display.setSelection(display.getSelectionStart() + 1);
    }

    public void sinBtn(View view) {
        updateText("sin(");
        display.setSelection(display.getSelectionStart() + 3);
    }

    public void cosBtn(View view) {
        updateText("cos(");
        display.setSelection(display.getSelectionStart() + 3);
    }

    public void tanBtn(View view) {
        updateText("tan(");
        display.setSelection(display.getSelectionStart() + 3);
    }

}