package com.jieun.springrecipes.sequence;

public class SequenceGenerator {
    private int initial;
    private String suffix;

    private DatePrefixGenerator prefixGenerator = new DatePrefixGenerator();

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setPrefixGenerator(DatePrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }
}
