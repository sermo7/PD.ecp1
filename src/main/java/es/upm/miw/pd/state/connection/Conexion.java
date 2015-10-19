package es.upm.miw.pd.state.connection;

public class Conexion {

    private EstadoAbstracto estadoAbstracto;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estadoAbstracto = new Cerrado();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estadoAbstracto.estado();
    }

    public void abrir() {
        this.estadoAbstracto.abrir(this);
    }

    public void cerrar() {
        this.estadoAbstracto.cerrar(this);
    }

    public void parar() {
        this.estadoAbstracto.parar(this);
    }

    public void iniciar() {
        this.estadoAbstracto.iniciar(this);
    }

    public void enviar(String msg) {
        this.estadoAbstracto.enviar(this, msg);
    }

    public void recibir(int respuesta) {
        this.estadoAbstracto.recibir(this, respuesta);
    }

    public void setEstado(EstadoAbstracto estadoAbstracto) {
        this.estadoAbstracto = estadoAbstracto;
    }

}
