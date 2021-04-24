package bikerental.services;

import bikerental.model.Bike;
import bikerental.model.Rental;
import bikerental.model.User;
import bikerental.resources.Bikes;
import bikerental.resources.IRentals;
import bikerental.resources.IUsers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentalService implements IRentalServiceSubject, IRentalService {
    List<IRentalServiceObserver> observers = new ArrayList();
    private IUsers users;
    private IRentals rentals;
    private Bikes bikes;

    public RentalService(IUsers users, IRentals rentals, Bikes bikes){
        this.users = users;
        this.rentals = rentals;
        this.bikes = bikes;
    }

    @Override
    public void addObserver(IRentalServiceObserver observer) {
        observers.add(observer);
    }


    @Override
    public void rentBike(long bikeId, long userId, LocalDate start, int duration) throws Exception {
        Bike bikeResult = bikes.getBikes().stream()
                .filter(n -> n.getId() == bikeId)
                .findFirst()
                .get();

        if(bikeResult == null) {
            throw new Exception("No bike with this id");
        }

        User userResult = users.getUsers().stream()
                .filter(n -> n.getId() == userId)
                .findFirst()
                .get();

        if(userResult == null) {
            throw new Exception("No user with this id");
        }

        Rental rental = new Rental(bikeResult, userResult);

        rentals.rent(rental);
    }

    @Override
    public void returnBike(long bikeId) {

    }
}
