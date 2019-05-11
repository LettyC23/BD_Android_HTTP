package com.example.conversortemperaturasact4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText pantalla;
    String grados;
    double cantidad, resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla =(EditText)findViewById(R.id.txt_convertir);


    }





    public void centigradosAFahrenheit(View v){
        String grados = pantalla.getText().toString();
        cantidad = Double.parseDouble(grados);
        resultado = (cantidad *9/5)+32;
        pantalla.setText(resultado+"");
    }

    public void centigradosAKelvin(View v){

    }

    public void centigradosARankie(View v){

    }
    public void fahrenheitACentigrados(View v){

    }

    public void fahrenheitAKelvin(View v){

    }

    public void fahrenheitARankie(View v){

    }

    public void kelvinACentigrados(View v){

    }

    public void kelvinAFahrenheit(View v){

    }

    public void kelvinARankie(View v){

    }

    public void rankieACentigrados(View v){

    }

    public void rankieAFahrenheit(View v){

    }

    public void rankieARankie(View v){

    }




}

