package com.doodlzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText usuario;
    private EditText contraseña;
    private SharedPreferences.OnSharedPreferenceChangeListener preferencesChangeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        usuario = findViewById(R.id.txt_Usuario);
        contraseña = findViewById(R.id.txt_Contraseña);

    }

    public void Ingresar(View view) {
        String usu = usuario.getText().toString();
        String contra = contraseña.getText().toString();

        if(usu.equals("paola")&& contra.equals("paola")){

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }else if(usu.equals("jessica")&& contra.equals("jessica")){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "No son correctos", Toast.LENGTH_LONG).show();
        }
    }
}
