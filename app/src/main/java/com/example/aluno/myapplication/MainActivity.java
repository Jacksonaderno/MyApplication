package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickBtnok(){

        EditText editTextName = (EditText) findViewById(R.id.name);
        String name = "Seja bem vindo"+ editTextName.getText().toString() ;
        EditText editTextSobrenome = (EditText) findViewById(R.id.sobrenome);

        name = name + " " + editTextSobrenome.getText().toString();

        Toast.makeText(this,name,Toast.LENGTH_LONG).show();
    }
}
