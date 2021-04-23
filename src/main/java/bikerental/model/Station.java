package bikerental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Station {

    long id;
    private final String adress;
    private final int[] bikes;


}
