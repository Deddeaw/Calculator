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
    Button  addButton ;
    TextView resultTextView ;
    int num1,num2,result ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2.Initial view ผูกตัวแปรบน java กับ element บน xml
        number1EditText= findViewById(R.id.edtNumber1);
        number2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.btnAdd);
        resultTextView = findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // แปลงค่าที่รับจาด EditText เป็นตัวเลจ แล้วเก็บลงในตัวแปรชนิด int
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 + num2;

                //4. แสดงผลลัพธ์
                resultTextView.setText(result + " ");
            }
        });//end setOnClickListener

    }//end Method onCreate

}//end Class
