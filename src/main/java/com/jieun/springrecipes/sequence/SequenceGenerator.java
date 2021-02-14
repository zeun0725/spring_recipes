package com.jieun.springrecipes.sequence;

public class SequenceGenerator {

    private PrefixGenerator prefixGenerators;
    private int initial;
    private String suffix;
    private int counter;

    public SequenceGenerator() {
    }

    public SequenceGenerator(PrefixGenerator prefixGenerators, int initial, String suffix) {
        this.prefixGenerators = prefixGenerators;
        this.initial = initial;
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setPrefixGenerator(PrefixGenerator prefixGenerators) {
        this.prefixGenerators = prefixGenerators;
    }

    public synchronized String getSequence() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(prefixGenerators.getPrefix());
        buffer.append(initial + counter++);
        buffer.append(suffix);
        return buffer.toString();
    }

}
