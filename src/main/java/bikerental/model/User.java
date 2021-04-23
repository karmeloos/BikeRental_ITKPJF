package bikerental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor

public class User {

    private final long id;
    private final String userName;
    private final String Name;
    private final String email;
    private final LocalDate registrationDate;

}
