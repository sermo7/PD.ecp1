package es.upm.miw.pd.factorymethod.naturalnumber;

public class NaturalNumberEsCreator extends NaturalNumbersCreator {

    @Override
    public NaturalNumber createNaturalNumber(int naturalNumber) {
        return new NaturalNumberEs(naturalNumber);
    }

}
