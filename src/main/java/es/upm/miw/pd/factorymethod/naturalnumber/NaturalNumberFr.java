package es.upm.miw.pd.factorymethod.naturalnumber;

public class NaturalNumberFr extends NaturalNumber {

    private static final String[] textValue = {"zero", "un", "deux", "trois", "quatre", "cinq"};

    public NaturalNumberFr(int value) {
        super(value);
        setTextValues(textValue);
    }

}
