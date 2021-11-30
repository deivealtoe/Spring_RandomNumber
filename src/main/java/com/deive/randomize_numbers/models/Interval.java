package com.deive.randomize_numbers.models;

import org.hibernate.validator.constraints.Range;

public class Interval {

    @Range(min = Long.MIN_VALUE, max = Long.MAX_VALUE)
    private long firstIntervalValue;
    @Range(min = Long.MIN_VALUE, max = Long.MAX_VALUE)
    private long lastIntervalValue;

    public long getFirstIntervalValue() {
        return firstIntervalValue;
    }

    public void setFirstIntervalValue(long firstIntervalValue) {
        this.firstIntervalValue = firstIntervalValue;
    }

    public long getLastIntervalValue() {
        return lastIntervalValue;
    }

    public void setLastIntervalValue(long lastIntervalValue) {
        this.lastIntervalValue = lastIntervalValue;
    }

    public boolean isValidInterval() {
        return this.firstIntervalValue <= this.lastIntervalValue;
    }

}
