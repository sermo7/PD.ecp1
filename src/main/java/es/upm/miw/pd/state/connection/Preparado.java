package es.upm.miw.pd.state.connection;

public class Preparado extends EstadoAbstracto {

    @Override
    public Estado estado() {
        return Estado.PREPARADO;
    }

    @Override
    public void abrir(Conexion conexion) {
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setEstado(new Cerrado());
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setEstado(new Parado());
    }

    @Override
    public void iniciar(Conexion conexion) {
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.getLink().enviar(msg);
        conexion.setEstado(new Esperando());
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

}
