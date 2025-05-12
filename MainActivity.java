package com.avm.application3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void clicBoton(View v){
        TextView txtTexto = findViewById(R.id.txtTexto);
        txtTexto.setText("Click en el boton");}

        public void verMensaje(View v){
            Toast.makeText(this, "Cuadro de mensaje en Android", Toast.LENGTH_LONG).show();
        }
        public void clickBotones (View v)
    {
         button bt = (button) v;
        TextView etiqueta = findViewById(R.id.txtTexto);
        if(bt.getID() == R.id.button3)
        {
            etiqueta.setText("Click en el boton izquierdo");
        }
        else if(bt.getID() == R.id.button4)
        {
            etiqueta.setText("Click en el boton central");
        }
        else if(bt.getID() == R.id.button5)
        {
            etiqueta.setText("Click en el boton derecho");
        }
    }
}
