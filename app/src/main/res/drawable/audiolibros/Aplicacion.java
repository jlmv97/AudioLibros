package com.example.audiolibros;

import android.app.Application;

import java.util.Vector;

public class Aplicacion extends Application {

    private Vector<Libro> vectorLibros;
    private AdaptadorLibros adptador;

    @Override
    public void onCreate() {
        super.onCreate();
        vectorLibros = Libro.ejemploLibros();
        adptador = new AdaptadorLibros(this, vectorLibros);
    }

    public AdaptadorLibros getAdaptador() {
        return adptador;
    }

    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }
}
