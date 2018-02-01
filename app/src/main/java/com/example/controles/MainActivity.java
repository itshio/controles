package com.example.controles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button botonAceptar;
    CheckBox cbmusica,cbdeportes,cbcine;
    RadioGroup rgsexo;
    Spinner spprovincias;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //IDENTIFICACION DE VISTAS

        botonAceptar = (Button)findViewById(R.id.boton_aceptar);
        cbmusica = (CheckBox)findViewById(R.id.cb_musica);
        cbdeportes = (CheckBox)findViewById(R.id.cb_deportes);
        cbcine = (CheckBox)findViewById(R.id.cb_cine);
        rgsexo = (RadioGroup)findViewById(R.id.radiogroup_sexo);
        spprovincias = (Spinner)findViewById(R.id.sp_provincias);

        String[] provincias = {"Cadiz","Malaga","Almeria","Cordoba"};

        ArrayAdapter<String> adapatador = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,provincias);

        spprovincias.setAdapter(adapatador);







         //EVENTO CLICK DEL BOTON ACEPTAR

        botonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "has clicado aceptar", Toast.LENGTH_SHORT).show();
            }
        });




    }//Fin On create


    public void pulsarcancelar(View view) {





        //COMPROBAR EVENTOS CHCKEADOS (CHECKBOX)

        String preferencias ="";
        if(cbmusica.isChecked()){

            preferencias+="Musica";
        }


        if(cbcine.isChecked()){

            preferencias+="Cine";
        }


        if(cbdeportes.isChecked()){

            preferencias+="Deportes";
        }

        /*Toast.makeText(getApplicationContext(), "Esta Checkeado: "+preferencias, Toast.LENGTH_SHORT).show();*/


        //COMPROBAR ELEMENTOS RADIOBUTTON
        int id=rgsexo.getCheckedRadioButtonId();

        RadioButton rbseleccionado=(RadioButton)findViewById(id);
        String textorbseleccionado = rbseleccionado.getText().toString();
        Toast.makeText(getApplicationContext(), "Sexo: "+textorbseleccionado, Toast.LENGTH_SHORT).show();



    }


    public void selecciones (View view){

        //COMO OBTENER EL VALOR SELECCIONADO DE UN SPINNER

        String provinciaseleccioanda = spprovincias.getSelectedItem().toString();
        Toast.makeText(getApplicationContext(), "Provincia: "+provinciaseleccioanda, Toast.LENGTH_SHORT).show();


    }






}//Fin MainActivity
