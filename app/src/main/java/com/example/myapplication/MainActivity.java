package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private  EditText editText1;
    private  EditText editText2;
    private Button buttonSum1;
    private Button btndiv;
    private Button btnmul;
    private Button btnsub;


 //  private textView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        buttonSum1 =(Button)  findViewById(R.id.buttonSum);
        btndiv =(Button)  findViewById(R.id.btndiv);
        btnmul=(Button)  findViewById(R.id.btnmul);
        btnsub=(Button)findViewById(R.id.btnsub);
       // textView4=(textView) findViewById(R.id.textView);
      //  btShow();

    }

    public void btShow1(View v)
    {

                         String val1 = editText1.getText().toString();
                         String val2 = editText2.getText().toString();

                         int a = Integer.parseInt(val1);
                         int b = Integer.parseInt(val2);
                         int sum = a + b;
                         Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_SHORT).show();
                         // textView4.setText(String.valueOf(sum));

    }

    public void mul(View v)
    {

        String val1 = editText1.getText().toString();
        String val2 = editText2.getText().toString();

        int a = Integer.parseInt(val1);
        int b = Integer.parseInt(val2);
        int mul = a * b;
        Toast.makeText(getApplicationContext(), String.valueOf(mul), Toast.LENGTH_SHORT).show();
        // textView4.setText(String.valueOf(sum));

    }
    public void btnsub(View v)
    {

        String val1 = editText1.getText().toString();
        String val2 = editText2.getText().toString();

        int a = Integer.parseInt(val1);
        int b = Integer.parseInt(val2);
        int sub = a - b;
        Toast.makeText(getApplicationContext(), String.valueOf(sub), Toast.LENGTH_SHORT).show();
        // textView4.setText(String.valueOf(sum));

    }
    public void btndiv(View v)
    {

        String val1 = editText1.getText().toString();
        String val2 = editText2.getText().toString();

        float a = Integer.parseInt(val1);
        float b = Integer.parseInt(val2);
        float div = a / b;
        Toast.makeText(getApplicationContext(), String.valueOf(div), Toast.LENGTH_SHORT).show();
        // textView4.setText(String.valueOf(sum));

    }











    public void btShow()
    {
        buttonSum1.setOnClickListener
                (new View.OnClickListener() {
                     public void onClick(View View) {
                         String val1 = editText1.getText().toString();
                         String val2 = editText2.getText().toString();

                         int a = Integer.parseInt(val1);
                         int b = Integer.parseInt(val2);
                         int sum = a + b;
                         Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_SHORT).show();
                         // textView4.setText(String.valueOf(sum));

                     }

                 }
                );
    }
}



