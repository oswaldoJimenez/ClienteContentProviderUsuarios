package com.example.clientecontentproviderusuarios;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ContentResolver cr = getContentResolver();

        ContentValues cv = new ContentValues();

        cv.put(MiProverdorContenidoContract.Usuarios.NOMBRE,"Jony");
        cv.put(MiProverdorContenidoContract.Usuarios.EMAIL,"@Jony");
        cv.put(MiProverdorContenidoContract.Usuarios.PASS,"123");
        cv.put(MiProverdorContenidoContract.Usuarios.TELEFONO,"3435363636");

        Uri uriresultado = cr.insert(MiProverdorContenidoContract.Usuarios.CONTENT_URI,cv);

        Log.d("Micp",uriresultado.toString());

        Cursor cursor = getContentResolver().query(MiProverdorContenidoContract.Usuarios.CONTENT_URI,
                null,null,null);

        while(cursor.moveToNext()){
            Log.d("MIpc",cursor.getInt(0)+"-"+cursor.getString(2));
        }
    }
}