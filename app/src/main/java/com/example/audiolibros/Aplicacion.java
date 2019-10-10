package com.example.audiolibros;

import android.app.Application;

import java.util.Vector;

public class Aplicacion extends Application {

    private Vector<Libro> vectorLibros;
    private AdaptadorLibrosFiltro adptador;

    @Override
    public void onCreate() {
        super.onCreate();
        vectorLibros =Libro.ejemploLibros();
        adptador = new AdaptadorLibrosFiltro (this, vectorLibros);
    }

    public AdaptadorLibrosFiltro getAdaptador() {
        return adptador;
    }

    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }
}
