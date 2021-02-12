package com.jieun.springrecipes.sequence;

public interface SequenceDao {
    Sequence getSequnece(String sequenceId);
    int getNextValue(String sequenceId);
}
