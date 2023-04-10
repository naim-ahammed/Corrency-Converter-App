package com.naimweb3.correncyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView1,textView2,textView3,textView4,textView5,textView6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);



    }

    public void convrtNow(View view) {

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);


        String taka = editText.getText().toString();
        Double takaToDuble = Double.parseDouble(taka);
        Double dollarInDuble = takaToDuble * 0.0094;
        String dollarInString = String.valueOf(dollarInDuble);
        textView1.setText(dollarInString);


        Double rupeeInDuble = takaToDuble * 0.78;
        String rupeeInString = String.valueOf(rupeeInDuble);
        textView2.setText(rupeeInString);

        Double EuroInDuble = takaToDuble * 0.0088;
        String EuroInString = String.valueOf(EuroInDuble);
        textView3.setText(EuroInString);

        Double RealInDuble = takaToDuble * 0.049;
        String RealInString = String.valueOf(RealInDuble);
        textView4.setText(RealInString);

        Double BahtInDuble = takaToDuble * 0.31;
        String BahtInString = String.valueOf(BahtInDuble);
        textView5.setText(BahtInString);

        Double YenInDuble = takaToDuble * 1.23;
        String YenInString = String.valueOf(YenInDuble);
        textView6.setText(YenInString);

    }
}