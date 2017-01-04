package com.valdiviezo.anahi.AndroidTraining_tarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.valdiviezo.anahi.AndroidTraining_tarea1.R;

// @Anahi Valdiviezo

public class Main2Activity extends AppCompatActivity {
    private EditText cantLineas;
    private TextView lineas;
    private Button botonImprimir;
    private Button botonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        botonVolver = (Button) findViewById(R.id.buttonVolver);
        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        botonImprimir = (Button) findViewById(R.id.buttonImprimir);
        cantLineas = (EditText) findViewById(R.id.cantLineas);
        lineas = (TextView) findViewById(R.id.lineas);
        if(cantLineas.getText().toString().equals("")){
            cantLineas.setText("0");
        }
        botonImprimir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!cantLineas.getText().toString().equals("")) {
                    final int numLineas = Integer.parseInt(cantLineas.getText().toString());
                    for (int i = 1; i <= numLineas; i++) {
                        lineas.setText(lineas.getText().toString() + "Linea" + i + "\n");
                    }
                }

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
