package bikerental.model;


import bikerental.model.enums.City;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class District {

    private final long id;
    private final String name;
    private final City city;

}
