package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
private TextView resultado;
private EditText dolares;
private EditText euros;
private RadioButton dol;
private RadioButton eu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        resultado=findViewById(R.id.Resultado);
        dolares=findViewById(R.id.etDollars);
        euros=findViewById(R.id.etEuros);
        dol=findViewById(R.id.rbDollar);//euros a dolares
        eu=findViewById(R.id.rbEuro);//Dolar a euro
    }

    public void convertir(View v){
        if(dol.isChecked() && !dolares.getText().toString().isEmpty()){
            String cant_dolar= dolares.getText().toString();
            double cantidad = Double.parseDouble(cant_dolar);
            double result=cantidad * 1.10;
        resultado.setText(Double.toString(result));

        } else {
            if(eu.isChecked() && !euros.getText().toString().isEmpty()){
                String cant_euros= euros.getText().toString();
                double cantidad = Double.parseDouble(cant_euros);
                double result=cantidad * 0.91;
                resultado.setText(Double.toString(result));

            } else {
                Toast.makeText(getApplicationContext(),"Sorry,se ha producido un error en la aplicación.",Toast.LENGTH_LONG).show();
            }

        }



    }
}
