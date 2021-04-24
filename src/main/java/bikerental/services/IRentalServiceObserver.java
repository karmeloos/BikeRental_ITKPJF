package bikerental.services;

import bikerental.model.Bike;
import bikerental.model.Rental;

public interface IRentalServiceObserver {
    void rented(Rental rental);
    void returnedBike(Bike bike);
}
