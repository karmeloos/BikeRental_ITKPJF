package bikerental.controller;

import bikerental.model.*;
import bikerental.model.enums.City;
import bikerental.model.enums.Privilege;


import java.math.BigDecimal;
import java.util.List;

public interface IUserController {

    //User
    boolean add(User user);
    boolean rent(User user, Bike bike);
    BigDecimal giveBack(User user, Station station);
    List<Station> findBike(District district);
    List<Station> findPlaceToReturn(District district);

    //Admin
    boolean add(Bike bike);
    boolean add(Station station);
    boolean add(District district);
    boolean assign(User user, Privilege privilege);
    boolean change(User user, Privilege privilege);
    List<Bike> displayBikes();
    List<District> displayDistricts();
    List<Rental> displayRentals();
    List<Rental> displayActiveRentals();
    List<Rental> displayRentals(User user);
    List<Station> displayStations(City city);
    List<Station> displayStations(District district);
    List<User> displayUsers();




}
