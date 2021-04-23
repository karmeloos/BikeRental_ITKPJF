package bikerental.model;

import bikerental.model.enums.City;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Station {

    private final long id;
    private final String address;
    private final City city;
    private final int[] bikes;


}
