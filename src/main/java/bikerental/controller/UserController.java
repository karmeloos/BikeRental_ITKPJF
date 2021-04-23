package bikerental.controller;

import bikerental.model.*;
import bikerental.model.enums.City;
import bikerental.model.enums.Privilege;
import bikerental.resources.*;

import java.math.BigDecimal;
import java.util.List;

public class UserController implements IUserController {

    private final IUsers users = new Users();
    private final IStations stations = new Stations();
    private final IRentals rentals = new Rentals();

    @Override
    public boolean add(User user) {
        return users.add(user);
    }

    @Override
    public boolean rent(User user, Bike bike) {
        long id = bike.getId();
        if(!stations.lockout(id)){
            return false;
        }
        return rentals.rent(new Rental(bike, user));
    }

    @Override
    public BigDecimal giveBack(User user, Station station) {
        //TODO :: dodawanie usuwanie bike ze station
        Rental rental = rentals.giveBack(user);
        return rental.getCost();
    }

    @Override
    public List<Station> findBike(District district) {
        return null ;
    }

    @Override
    public List<Station> findPlaceToReturn(District district) {
        return null;
    }

    @Override
    public boolean add(Bike bike) {
        return false;
    }

    @Override
    public boolean add(Station station) {
        return false;
    }

    @Override
    public boolean add(District district) {
        return false;
    }

    @Override
    public boolean assign(User user, Privilege privilege) {
        return false;
    }

    @Override
    public boolean change(User user, Privilege privilege) {
        return false;
    }

    @Override
    public List<Bike> displayBikes() {
        return null;
    }

    @Override
    public List<District> displayDistricts() {
        return null;
    }

    @Override
    public List<Rental> displayRentals() {
        return null;
    }

    @Override
    public List<Rental> displayActiveRentals() {
        return null;
    }

    @Override
    public List<Rental> displayRentals(User user) {
        return null;
    }

    @Override
    public List<Station> displayStations(City city) {
        return null;
    }

    @Override
    public List<Station> displayStations(District district) {
        return null;
    }

    @Override
    public List<User> displayUsers() {
        return null;
    }
}
