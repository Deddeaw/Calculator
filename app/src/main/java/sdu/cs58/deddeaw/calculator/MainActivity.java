package sdu.cs58.deddeaw.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1.Explicit
    EditText number1EditText,number2EditText;
    Button  addButton,minusButton,multiButton,dividedButton ;
    TextView resultTextView ;
    int num1,num2,result1,result2,result3,result4 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2.Initial view ผูกตัวแปรบน java กับ element บน xml
        number1EditText= findViewById(R.id.edtNumber1);
        number2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.btnAdd);
        minusButton = findViewById(R.id.btnminus);
        multiButton = findViewById(R.id.btnmulti);
        dividedButton = findViewById(R.id.btndivided);

        resultTextView = findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // แปลงค่าที่รับจาด EditText เป็นตัวเลจ แล้วเก็บลงในตัวแปรชนิด int
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result1 = num1 + num2;
                resultTextView.setText(result1 + " ");
            }

        });//end setOnClickListener
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result2 = num1 - num2;
                resultTextView.setText(result2 + " ");
            }
        });
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result3 = num1 * num2;
                resultTextView.setText(result3 + " ");
            }
        });
        dividedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result4 = num1 / num2;
                resultTextView.setText(result4 + " ");
            }
        });


    }//end Method onCreate

}//end Class
