package com.eroger.service;

import com.eroger.domain.Cuisine;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ParseCuisineCSVService implements ParseService{
    public List<Cuisine> parse() throws FileNotFoundException {
        String fileName = "src/main/resources/files/cuisines.csv";

        return  new CsvToBeanBuilder(new FileReader(fileName))
                .withType(Cuisine.class)
                .build()
                .parse();
    }
}