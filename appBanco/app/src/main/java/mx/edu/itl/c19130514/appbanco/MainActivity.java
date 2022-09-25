package mx.edu.itl.c19130514.appbanco;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.*;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    final int nivel = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnTransferClick(View v)
    {

        //this.setContentView(R.layout.transferencias_layout);
        Intent i = new Intent(this,TransferenciasActivity.class);
        startActivity(i);
    }

    // Metodos del activity beneficio
    public void btnProgresoClick(View v) {
        Intent i = new Intent(this, BeneficioActivity.class);
        startActivity(i);
    }
}