package bikerental.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data

public class Rental {
    private final Bike bike;
    private final User user;
    private final LocalDateTime start;
    private LocalDateTime end;

    public Rental(Bike bike, User user) {
        this.bike = bike;
        this.user = user;
        start = LocalDateTime.now();
    }
}
