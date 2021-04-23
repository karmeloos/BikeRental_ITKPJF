package bikerental.model;

import bikerental.model.enums.Privilege;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.PrimitiveIterator;

@Getter
@AllArgsConstructor

public class User {

    private final long id;
    private final String userName;
    private  String Name;
    private final String email;
    private final LocalDate registrationDate;
    private Privilege privilege;

}
