package cl.accenture.programatufuturo.guias.guia16.exceptions;

public class SinConexionException extends Exception {
    //Extendere de la clase madre exception

    public SinConexionException(String message, Throwable e){
        //Throwable sera un error cualquiera, con el cual se cual es exactamente el error
        super(message, e);

    }
}
