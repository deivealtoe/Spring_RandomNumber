package com.deive.randomize_numbers.services;

import com.deive.randomize_numbers.dtos.RandomNumberDto;
import com.deive.randomize_numbers.models.Interval;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RandomNumberService {

    public ResponseEntity<RandomNumberDto> generateRandomNumberFromInterval(Interval interval) {
        RandomNumberDto randomNumberDto = new RandomNumberDto(interval);

        if (randomNumberDto.getInterval().isValidInterval()) {
            randomNumberDto.setRandomNumber();
            randomNumberDto.setMessage("Success!");
            return ResponseEntity.ok(randomNumberDto);
        } else {
            randomNumberDto.setMessage("Must be a valid range. Last value should be greater than first value!");
            return ResponseEntity.badRequest().body(randomNumberDto);
        }
    }

}
