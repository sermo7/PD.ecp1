package es.upm.miw.pd.factorymethod.naturalnumber;

public class NaturalNumbersManager {

    private NaturalNumber naturalNumber;

    private NaturalNumbersCreator naturalNumberCreator;

    public void setCreator(NaturalNumbersCreator naturalNumberCreator) {
        this.naturalNumberCreator = naturalNumberCreator;
    }

    public void createNaturalNumber(int naturalNumber) {
        this.naturalNumber = this.naturalNumberCreator.createNaturalNumber(naturalNumber);
    }

    public NaturalNumber getNaturalNumber() {
        return naturalNumber;
    }

}
