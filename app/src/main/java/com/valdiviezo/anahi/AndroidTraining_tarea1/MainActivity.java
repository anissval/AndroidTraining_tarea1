package com.valdiviezo.anahi.AndroidTraining_tarea1;

import android.content.Intent;
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

public class MainActivity extends AppCompatActivity {

    private EditText numeroMes;
    private TextView mes;
    private Button enviar;
    private Button nextPage;
    private EditText num_1;
    private EditText num_2;
    private EditText operador;
    private Button calcular;
    private TextView resultado;
    private TextView warning;
    private Float _resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextPage = (Button) findViewById(R.id.nextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });
        numeroMes = (EditText) findViewById(R.id.editTextNum);
        mes = (TextView) findViewById(R.id.textViewMes);
        enviar = (Button) findViewById(R.id.buttonEnviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int numMes = Integer.parseInt(numeroMes.getText().toString());
                switch (numMes){
                    case 1:
                        setMes("Enero");
                            break;
                    case 2:
                        setMes("Febrero");
                        break;
                    case 3:
                        setMes("Marzo");
                        break;
                    case 4:
                        setMes("Abril");
                        break;
                    case 5:
                        setMes("Mayo");
                        break;
                    case 6:
                        setMes("Junio");
                        break;
                    case 7:
                        setMes("Julio");
                        break;
                    case 8:
                        setMes("Agosto");
                        break;
                    case 9:
                        setMes("Septiembre");
                        break;
                    case 10:
                        setMes("Octubre");
                        break;
                    case 11:
                        setMes("Noviembre");
                        break;
                    case 12:
                        setMes("Diciembre");
                        break;
                    default:
                        setMes("Ingrese un numero valido");
                }

            }
        });
        ejercicio2();

    }

    private void setMes(String _mes){
        mes.setText(_mes);
    }

    private void ejercicio2(){
        num_1 = (EditText) findViewById(R.id.num_1);
        operador = (EditText) findViewById(R.id.operador);
        num_2 = (EditText) findViewById(R.id.num_2);
        calcular = (Button) findViewById(R.id.buttonCalcular);
        resultado = (TextView) findViewById(R.id.resultado);
        warning = (TextView) findViewById(R.id.warning);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float valor1 = Float.parseFloat(num_1.getText().toString());
                float valor2 = Float.parseFloat(num_2.getText().toString());
                String op = operador.getText().toString();
                switch (op){
                    case "*":
                        _resultado = valor1*valor2;
                        break;
                    case "+":
                        _resultado = valor1+valor2;
                        break;
                    case "-":
                        _resultado = valor1-valor2;
                        break;
                    case "/":
                        _resultado= valor1/valor2;
                        break;
                    default:
                        warning.setText(R.string.warningOperator);
                        warning.setVisibility(View.VISIBLE);
                }
                resultado.setText(String.valueOf(" = " + _resultado));

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
