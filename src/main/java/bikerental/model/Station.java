package bikerental.model;

import bikerental.model.enums.City;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor

public class Station {

    private final long id;
    private final String address;
    private final City city;
    //TODO::  Wymyśleć rozwiązanie limit miejsc;
//    private final int[] bikes;
    private List<Long> bikes;


    public boolean lockIn(long bikeId) {
        // TODO: Zrobić limit
        bikes.add(bikeId);
        return bikes.contains(bikeId);
    }
}
