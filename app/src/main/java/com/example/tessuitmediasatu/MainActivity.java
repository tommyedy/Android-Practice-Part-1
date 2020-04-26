package com.example.tessuitmediasatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Et_typeNameHere, Et_typeTextPalindrome;
    private Button btn_Next, btn_Check;
    private String typeNameHere, typeTextPalindrome;

    private static boolean
            isTypeNameHere,
            isTypeTextPalindrome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Et_typeNameHere       = findViewById(R.id.typeNameHere_id);
        Et_typeTextPalindrome = findViewById(R.id.typeTextPalindrome_id);
        btn_Next               = findViewById(R.id.btnNext_id);
        btn_Check              = findViewById(R.id.btnCheck_id);

        typeTextPalindrome    = Et_typeTextPalindrome.getText().toString().trim();

        btn_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (setValidation()){
                    typeNameHere          = Et_typeNameHere.getText().toString().trim();
                    Intent NextIntent      = new Intent(MainActivity.this, Screendua.class);
                    NextIntent.putExtra("name" , typeNameHere);
                    startActivity(NextIntent);
                }

            }
        });


    }

    private boolean checkPalindrome(){
        String textPalindrome = Et_typeTextPalindrome.getText().toString().trim();
        String textTemp       = new StringBuilder(textPalindrome).reverse().toString().trim();
        if (textTemp.equals(textPalindrome)){
            return true;
        }else{
            return false;
        }
    }

    private boolean setValidation() {
        if (Et_typeNameHere.getText().toString().isEmpty()) {
            Et_typeNameHere.setError("Please Fill Name Here");
            isTypeNameHere = false;
        } else {
            isTypeNameHere = true;
        }

        if (Et_typeTextPalindrome.getText().toString().isEmpty()) {
            Et_typeTextPalindrome.setError("Please Fill Text Here");
            isTypeTextPalindrome = false;
        } else {
            isTypeTextPalindrome = true;
        }


        if (isTypeNameHere&&isTypeTextPalindrome){
            return true;
        }else{
            return false;
        }

    }
}
