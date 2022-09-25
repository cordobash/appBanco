package mx.edu.itl.c19130514.appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class TransferenciasActivity extends AppCompatActivity {

    Switch switchE;
    ImageView botonsito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transferencias_layout);
    }

    // Para transferencias_layout
    public void btnTransferenciasAtrasClick(View v)
    {
        //setContentView(R.layout.activity_main);
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }


    public void swTarjetaDigitalClick(View v)
    {
        switchE = (Switch) findViewById(R.id.btnSwitch);
        botonsito = (ImageView) findViewById(R.id.btnTarjetaDigital);
        if(switchE.isChecked())
        {
            //switchE.setChecked(true);
            botonsito.setVisibility(View.VISIBLE);
        }
        else if(!switchE.isChecked())
        {
           // switchE.setChecked(false);
            botonsito.setVisibility(View.INVISIBLE);

        }



    }
}