package com.usil;

import java.util.List;

public abstract class Libro {

    protected String titulo;
    protected List<Autor> autores;
    protected List<Resena> resenas;

    // Constructor protegido para uso en el Builder
    protected Libro(String titulo, List<Autor> autores, List<Resena> resenas) {
        this.titulo = titulo;
        this.autores = autores;
        this.resenas = resenas;
    }

    // Métodos comunes
    public String getTitulo() {
        return titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Resena> getResenas() {
        return resenas;
    }
}
