package bikerental.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Bike {

    private final long id;
    private final Biketype type;
}
