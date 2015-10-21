package es.upm.miw.pd.factorymethod.naturalnumber;

public class NaturalNumberFrCreator extends NaturalNumbersCreator {

    @Override
    public NaturalNumber createNaturalNumber(int naturalNumber) {
        return new NaturalNumberFr(naturalNumber);
    }

}
