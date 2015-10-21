package es.upm.miw.pd.factorymethod.naturalnumber;

public class NaturalNumberEnCreator extends NaturalNumbersCreator {

    @Override
    public NaturalNumber createNaturalNumber(int naturalNumber) {
        return new NaturalNumberEn(naturalNumber);
    }

}
