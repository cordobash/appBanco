package mx.edu.itl.c19130514.appbanco;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BeneficioActivity extends AppCompatActivity {
    final int nivel = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beneficio_activity);

    }
    // Comparacion entre los distintos boton
    // Metodo de los niveles entre los distintos botones.

    public void btnNivelDiezClick(View v) {
        if (nivel < 10) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Nivel insuficiente")
                    .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }
        else{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Promocion canjeada")
                    .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }

    }

    public void btnNivelTresClick(View v) {
        if (nivel < 3) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Nivel insuficiente")
                    .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }
    }

    public void btnNivelSieteClick(View v) {
        if (nivel < 7) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Nivel insuficiente")
                    .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }
    }

    public void btnObtenerClick(View v) {
        if (nivel < 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Nivel insuficiente")
                    .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }
    }

    public void btnNivelDoceClick(View v) {
        if (nivel < 12) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Nivel insuficiente")
                    .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }
    }
    public void btnBeneficioRegresarClick(View v) {
        Intent i =  new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void btnIrClick(View v)
    {
        Intent i = new Intent(this,ServiciosActivity.class);
        startActivity(i);
    }
}
