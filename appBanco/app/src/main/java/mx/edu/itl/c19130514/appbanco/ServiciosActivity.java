package mx.edu.itl.c19130514.appbanco;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.*;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class ServiciosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servicios_layout);
    }

    public void btnAtrasServiciosClick(View v)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    // Para facilitar la llamada al toast
    public void mostrarToast (String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
    }

    private EditText edtSuscriptor;
    private View     megacable_login;

    public void btnMegacableClick(View v)
    {
     // Obtenemos la referencia del layout a incrustar
     megacable_login = this.getLayoutInflater().inflate(R.layout.megacable_login,null);
     // Obtener las referencias del EditText
     edtSuscriptor = megacable_login.findViewById(R.id.edtSuscriptor);
     // Preparamos el mensaje
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Conexion con megacable")
                .setView(megacable_login)
                .setPositiveButton("Entrar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        String suscriptor = edtSuscriptor.getText().toString();
                        mostrarToast("Bienvenido : "+ "Pedro" + " Con no.Suscripcion : "+suscriptor );
                    }
                })
                .setNegativeButton("Salir", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setCancelable( false )
                .create()
                .show();
    }
    //------------------------------------------------------------------------------------------d
    private EditText edtUsuario;
    private EditText edtContrasena;

    private View     walmart_login;
    public void btnWalmartClick(View v)
    {
        // Obtenemos la referencia del layout a incrustar
        walmart_login= this.getLayoutInflater().inflate(R.layout.walmart_login,null);
        // Obtener las referencias del EditText
        edtUsuario = walmart_login.findViewById(R.id.edtUsuario);
        edtContrasena = walmart_login.findViewById(R.id.edtContrasena);
        // Preparamos el mensaje
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Conexion con Walmart")
                .setView(walmart_login)
                .setPositiveButton("Entrar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        String usuario = edtUsuario.getText().toString();
                        String contrasena = edtContrasena.getText().toString();
                        mostrarToast("Bienvenido : "+ usuario );
                    }
                })
                .setNegativeButton("Salir", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setCancelable( false )
                .create()
                .show();
    }
}