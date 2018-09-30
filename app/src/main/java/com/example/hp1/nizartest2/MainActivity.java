package com.example.hp1.nizartest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    EditText etNum1 , etNum2;
    Button btResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btResult = (Button) findViewById(R.id.btResult);

        btResult.setOnClickListener((OnClickListener) this);
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);


    }

    public void onClick(View v) {
        if(etNum2.getText().toString().equals("") || etNum1.getText().toString().equals("")){
            Toast.makeText(this,"Emnpty fields",Toast.LENGTH_SHORT).show();
        }else {
            int num1 = Integer.parseInt(etNum1.getText().toString());
            int num2 = Integer.parseInt(etNum2.getText().toString());
            int res1 = num1+num2;
            int res2 = num1-num2;

            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("res1",res1);
            i.putExtra("res2",res2);
            startActivity(i);


        }
    }

}
