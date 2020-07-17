package com.example.examen_1merparcial;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class pantalla extends AppCompatActivity {
    private Button btnR1, btnR2, btnR3, btnR4;
    private String pregunta;
    private TextView preguntaM;
    private ArrayList<String> preguntas;
    private Map<String, String> mapaPreguntaR;
    private ArrayList<String> respuestasValidas;
    private ArrayList<String> todasResp;
    private static final Random ran = new Random();

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);
        inicialiarDatos();
        cargarPreguntas();
        cargarMapaAP();
        mostrarinfoAplicacion();
        //leerPreguntas();
       // preguntaM.setText(preguntas.get(0));

    }

    public void mostrarinfoAplicacion(){
        int pregunta = ran.nextInt(preguntas.size());
        preguntaM.setText(preguntas.get(pregunta));
        String[] separar = todasResp.get(pregunta).split(",");

        btnR1.setText(separar[0]);
        btnR2.setText(separar[1]);
        btnR3.setText(separar[2]);
        btnR4.setText(separar[3]);
     }

    public void inicialiarDatos(){
        btnR1 = (Button)findViewById(R.id.button2);
        btnR2 = (Button)findViewById(R.id.button3);
        btnR3 = (Button)findViewById(R.id.button4);
        btnR4 = (Button)findViewById(R.id.button5);
        preguntaM = (TextView)findViewById(R.id.textView);
        preguntaM.setText("Hola que haces");
        //Toast.makeText()

    }

    public void cargarPreguntas(){
        preguntas = new ArrayList<>();
       respuestasValidas = new ArrayList<>();
       todasResp = new ArrayList<>();
        preguntas.add("CUal es el personaje principal de vengadores?");
        preguntas.add("Cual es el personaje principal de Pokemon?");
        preguntas.add("cCual es la pelicula mas taquillera?");
        respuestasValidas.add("Aerom");
        respuestasValidas.add("ASK");
        respuestasValidas.add("Avengers");
        todasResp.add("Yo, Aerom, Capitan America, Spiderman");
        todasResp.add("PIkachu, ASK, Doctor ock, Misdy");
        todasResp.add("Titanic, Avengers, Avatar, Malver");
    }
    
    public void cargarMapaAP(){
        mapaPreguntaR = new HashMap<>();
        for(int i = 0; i< preguntas.size(); i++){
            mapaPreguntaR.put(preguntas.get(i), respuestasValidas.get(i));
        }
    }
        

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)

    /*public void leerPreguntas(){
        String fileName = "app/src/androidTest/java/datos.Preguntas.txt";
        try(BufferedReader inputStream = new BufferedReader(new FileReader(fileName))){
           String line = null;
            while((line = inputStream.readLine()) != null){
                System.out.println(line);
                pregunta = line;
            }
        }catch (FileNotFoundException e1){
            System.out.println("errorrrr");
        }catch (IOException e2){
            System.out.println("errror");
        }
    }*/

    public void respuestaUno(View view){

    }

    public void respuestaDos(View view){

    }

    public void respuestaTres(View view){

    }

    public void respuestaCuatro(View view){

    }
}