package model;

public class Cancion {
    private int idCancion, duracion;
    private String nombre, autor, genero;

    public Cancion() {
        this.idCancion = 0;
        this.duracion = 0;
        this.nombre = "";
        this.autor = "";
        this.genero = "";
    }

    public Cancion(int idCancion, int duracion, String nombre, String autor, String genero) {
        this.idCancion = idCancion;
        this.duracion = duracion;
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
    }

    public int getIdCancion() {
        return this.idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public int getDuracion() {
        return this.duracion;
    }



    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean equals(Object o){
        if (o instanceof Cancion){
            Cancion x=(Cancion) o;
            this.getIdCancion()=x.getIdCancion();
        }
        return false;
    }
}
