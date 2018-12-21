package cl.accenture.programatufuturo.guias.guia16.dao;

public class CancionDAO {
    //Lo primero seria crear el atributo conexion para luego ocuparlo como una nueva coneccion

    private Conexion conexion;


    public CancionDAO() {
        this.conexion = new Conexion();
    }
}
