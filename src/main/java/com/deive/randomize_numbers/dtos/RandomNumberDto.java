package com.deive.randomize_numbers.dtos;

import com.deive.randomize_numbers.models.Interval;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberDto {

    private final Interval interval;
    private long randomNumberGenerated;
    private String message;

    public RandomNumberDto(Interval interval) {
        this.interval = interval;
    }

    public Interval getInterval() {
        return interval;
    }

    public long getRandomNumberGenerated() {
        return randomNumberGenerated;
    }

    public void setRandomNumber() {
        double randomNumber = ThreadLocalRandom.current().nextLong(this.interval.getFirstIntervalValue(), this.interval.getLastIntervalValue() + 1);
        this.randomNumberGenerated = (long) randomNumber;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
