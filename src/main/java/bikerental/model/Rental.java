package bikerental.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Duration;
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

    public BigDecimal getCost(){
        Duration time = Duration.between(start, end);
        return BigDecimal.valueOf(time.getSeconds() * 6.66);
    }
}
