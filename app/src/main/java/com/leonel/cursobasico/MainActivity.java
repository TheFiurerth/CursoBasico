package com.leonel.cursobasico;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

// Importando clase Perro del paquete animal
import com.leonel.cursobasico.animales.Gato;
import com.leonel.cursobasico.animales.Perro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(new View(this));

        // Instanciando un objeto
        // de la clase Perro
        Perro gufi = new Perro();

        // Accediendo al atributo edad de
        // clase Perro con el objeto gufi
        gufi.edad = 5;

        // Accediendo al metodo dormir de
        // clase Perro con el objeto gufi
        gufi.dormir();

// Instanciando objeto de la clase Gato
        Gato garfio = new Gato();

        garfio.sexo = 'M';

        Gato.edad = 34;

        garfio.edad = 34;
    }
}
