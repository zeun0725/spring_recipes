package com.jieun.springrecipes.sequence;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    private PrefixGenerator prefixGenerator;
    private int initial;
    private String suffix;
    private final AtomicInteger counter = new AtomicInteger();

    public SequenceGenerator() {
    }

    public SequenceGenerator(PrefixGenerator prefixGenerator, int initial, String suffix) {
        this.prefixGenerator = prefixGenerator;
        this.initial = initial;
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }

    public String getSequence() {
        String builder = prefixGenerator.getPrefix() + initial + counter.getAndIncrement() + suffix;
        return builder;
    }

}
