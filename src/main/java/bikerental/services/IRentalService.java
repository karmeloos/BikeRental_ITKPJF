package bikerental.services;

import java.time.LocalDate;

public interface IRentalService {
    void rentBike(long bikeId, long userId, LocalDate start, int duration) throws Exception;
    void returnBike(long bikeId);
}
