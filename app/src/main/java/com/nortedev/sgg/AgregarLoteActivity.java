package com.nortedev.sgg;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AgregarLoteActivity extends AppCompatActivity{
    public static final String EXTRA_MSG = "com.nortedev.SGG.MSG_GUARDAR";
    private EditText dicose;
    private EditText area;
    private EditText latitud;
    private EditText longitud;
    private EditText usoPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_lote);
        dicose = findViewById(R.id.textViewIngresarDicose);
        area =  findViewById(R.id.textViewIngresarArea);
        latitud = findViewById(R.id.textViewIngresarLatitud);
        longitud = findViewById(R.id.textViewIngresarLongitud);
        usoPrincipal = findViewById(R.id.textViewIngresarUsoPrincipal);

        final Button btnAgregar = findViewById(R.id.btnGuardar);
        btnAgregar.setOnClickListener(view -> {
        Intent respuesta = new Intent();
        if(TextUtils.isEmpty(usoPrincipal.getText())){
            setResult(RESULT_CANCELED, respuesta);
        } else {
            String textoUsoPrincipal = dicose.getText().toString();
            respuesta.putExtra(EXTRA_MSG, textoUsoPrincipal);
            setResult(RESULT_OK, respuesta);
        }
        finish();
        });
    }
}
