package com.deive.randomize_numbers.controllers;

import com.deive.randomize_numbers.dtos.RandomNumberDto;
import com.deive.randomize_numbers.models.Interval;
import com.deive.randomize_numbers.services.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class RandomNumberController {

    @Autowired
    private RandomNumberService randomNumberService;

    @GetMapping("/random-number")
    public ResponseEntity<RandomNumberDto> getRandomNumber(@Valid @RequestBody Interval interval) {
        return this.randomNumberService.generateRandomNumberFromInterval(interval);
    }

}
