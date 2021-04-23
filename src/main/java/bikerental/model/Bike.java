package bikerental.model;


import bikerental.model.enums.BikeType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter

public class Bike {

    private final long id;
    private final BikeType type;
    private final LocalDate startDate;
}
