package es.upm.miw.pd.state.connection;

public class Cerrado extends EstadoAbstracto {

    @Override
    public Estado estado() {
        return Estado.CERRADO;
    }

    @Override
    public void abrir(Conexion conexion) {
        conexion.setEstado(new Preparado());
    }

    @Override
    public void cerrar(Conexion conexion) {
    }

    @Override
    public void parar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void iniciar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

}
