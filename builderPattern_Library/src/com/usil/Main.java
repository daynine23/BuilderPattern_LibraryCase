package com.usil;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LibroFisico libroFisico = new LibroFisico.Builder("Clean Code")
                .addAutor(new Autor("Uncle Bob"))
                .setNumeroPaginas(96)
                .setDimensiones(20, 15, 2)
                .build();

        LibroDigital libroDigital = new LibroDigital.Builder("100 anios de soledad")
                .addAutor(new Autor("Gabriel Garcia Marquez"))
                .setFormato("PDF")
                .setTamanoArchivo(5.6)
                .setEnlaceDescarga("https://ejemplo.com/100-anios")
                .build();

        Audiolibro audiolibro = new Audiolibro.Builder("Luna de Pluton")
                .addAutor(new Autor("Dross Rotzank"))
                .setDuracionGrabacion(12.5)
                .setFormatoAudio("MP3")
                .build();

    }
}
