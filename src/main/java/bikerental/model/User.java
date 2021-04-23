package bikerental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class User {

    private final long id;
    private final String userName;
    private final String email;

}
