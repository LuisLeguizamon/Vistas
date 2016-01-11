package com.example.luis.vistas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.Toast;

public class Listview extends AppCompatActivity {
    ListView listajava;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //Get ListView object from xml
        listajava=(ListView)findViewById(R.id.listaxml);

        //Defined Array values to show in ListView
        String[] values = new String[] {"AGRO","ARTES","ELECTRICIDAD","FINANZAS","GASTRONOMÍA","TECNOLOGÍA","IDIOMAS","SALUD"};

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        ArrayAdapter <String> adaptador = new ArrayAdapter<String>(this,R.layout.textlist,R.id.textformat,values);

        //Assign adapter to ListView
        listajava.setAdapter(adaptador);

    }
}


