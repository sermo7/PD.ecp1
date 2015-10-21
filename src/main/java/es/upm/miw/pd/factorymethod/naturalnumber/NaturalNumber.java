package es.upm.miw.pd.factorymethod.naturalnumber;

public abstract class NaturalNumber {

    private int value;

    private String[] textValue;

    public NaturalNumber(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }

    public void add(int value) {
        this.setValue(this.value + value);
    }

    public String getTextValue() {
        if (this.value < textValue.length) {
            return this.textValue[this.value];
        } else {
            return "???";
        }
    }

    public void setTextValues(String[] textValue) {
        this.textValue = textValue;
    }

}
