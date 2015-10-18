package es.upm.miw.pd.composite.expression;

public class Multiplicar extends CompositeExpresion {

    public Multiplicar(Expresion exp1, Expresion exp2) {
        super(exp1, exp2);
    }

    @Override
    public int operar() {
        int pos = 0;
        int resultado = expresiones.get(pos).operar();
        pos++;
        while (pos < expresiones.size()) {
            resultado *= expresiones.get(pos).operar();
            pos++;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return cadena("*");
    }

}
