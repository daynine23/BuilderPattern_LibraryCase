package com.usil;

import java.util.ArrayList;
import java.util.List;

public class LibroDigital extends Libro{

    private String formato;
    private double tamanoArchivo;
    private String enlaceDescarga;

    private LibroDigital(Builder builder) {
        super(builder.titulo, builder.autores, builder.resenas);
        this.formato = builder.formato;
        this.tamanoArchivo = builder.tamanoArchivo;
        this.enlaceDescarga = builder.enlaceDescarga;
    }

    public static class Builder {
        private String titulo;
        private List<Autor> autores = new ArrayList<Autor>();
        private List<Resena> resenas = new ArrayList<Resena>();
        private String formato;
        private double tamanoArchivo;
        private String enlaceDescarga;

        public Builder(String titulo) {
            this.titulo = titulo;
        }

        public Builder addAutor(Autor autor) {
            this.autores.add(autor);
            return this;
        }

        public Builder addResena(Resena resena) {
            this.resenas.add(resena);
            return this;
        }

        public Builder setFormato(String formato) {
            this.formato = formato;
            return this;
        }

        public Builder setTamanoArchivo(double tamanoArchivo) {
            this.tamanoArchivo = tamanoArchivo;
            return this;
        }

        public Builder setEnlaceDescarga(String enlaceDescarga) {
            this.enlaceDescarga = enlaceDescarga;
            return this;
        }

        public LibroDigital build() {
            return new LibroDigital(this);
        }
    }
}
