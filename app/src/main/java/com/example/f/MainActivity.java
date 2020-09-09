package com.example.f;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnCom;
    private Button btnSem;
    private EditText edtDose;
    private EditText edtPeso;
    private EditText edtConcentracao;
    private TextView txvConcentracao;
    private TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCom = (Button) findViewById(R.id.btnCom);
        btnSem = (Button) findViewById(R.id.btnSem);
        edtDose = (EditText) findViewById(R.id.edtDose);
        edtPeso = (EditText) findViewById(R.id.edtPeso);
        edtConcentracao = (EditText) findViewById(R.id.edtConcentracao);
        txvConcentracao = (TextView) findViewById(R.id.txvConcentracao);
        txvResultado = (TextView) findViewById(R.id.txvResultado);

    }

    public void setBtnSem(View view) {
        txvConcentracao.setVisibility(View.INVISIBLE);
        edtConcentracao.setVisibility(View.INVISIBLE);
    }
    public void setBtnCom(View view) {
        txvConcentracao.setVisibility(View.VISIBLE);
        edtConcentracao.setVisibility(View.VISIBLE);
    }

    public void calcular(View view){
        double doseStr = Double.valueOf(edtDose.getText().toString());
        double pesoStr = Double.valueOf(edtPeso.getText().toString());
        double concentracaoStr = Double.valueOf(edtConcentracao.getText().toString());

        Double result = (doseStr * pesoStr) / concentracaoStr;
        txvResultado.setText(result.toString());
    }
}