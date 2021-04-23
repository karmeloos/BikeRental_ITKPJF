package bikerental;

import bikerental.model.*;
import bikerental.model.enums.City;
import bikerental.model.enums.Privilege;


import java.math.BigDecimal;
import java.util.List;

public interface UserInterface {

    //User
    boolean add(User user);
    boolean rent(User user, Bike bike);
    BigDecimal giveBack(User user, Bike bike);
    List<Station> findBike(District district);
    List<Station> findPlaceToReturn(District district);

    //Admin
    boolean assign(User user, Privilege privilege);
    boolean change(User user, Privilege privilege);
    List<Bike> displayBikes();
    List<District> displayDistricts();
    List<Rental> displayRentals();
    List<Rental> displayRentals(User user);
    List<Station> displayStations(City city);
    List<Station> displayStations(District district);
    List<User> displayUsers();



}
