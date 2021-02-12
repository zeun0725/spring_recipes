package com.jieun.springrecipes.sequence;

public interface SequenceDao {
    public Sequence getSequnece(String sequenceId);
    public int getNextValue(String sequenceId);
}
