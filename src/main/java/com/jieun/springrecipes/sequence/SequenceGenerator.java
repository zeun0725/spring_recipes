package com.jieun.springrecipes.sequence;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    @Autowired
    private PrefixGenerator[] prefixGenerators;
    private int initial;
    private String suffix;
    private final AtomicInteger counter = new AtomicInteger();

    public SequenceGenerator() {
    }

    public SequenceGenerator(PrefixGenerator[] prefixGenerators, int initial, String suffix) {
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

    public void setPrefixGenerator(PrefixGenerator[] prefixGenerators) {
        this.prefixGenerators = prefixGenerators;
    }

    public String getSequence() {
        StringBuilder builder = new StringBuilder();
        for (PrefixGenerator prefix : prefixGenerators)  {
            builder.append(prefix.getPrefix());
            builder.append("-");
        }
        builder.append(initial).append(counter.getAndIncrement()).append(suffix);
        return builder.toString();
    }

}
