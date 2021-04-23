package bikerental.resources;

import bikerental.model.Rental;
import bikerental.model.User;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Rentals implements IRentals {
    private List<Rental> rentals;

    @Override
    public boolean rent(Rental rental) {
        rentals.add(rental);
        return rentals.contains(rental);
    }

    @Override
    public Rental giveBack(User user) {
        Optional<Rental> rental = rentals.stream()
                .filter(u -> u.equals(user) && u.getEnd().equals(null))
                .findAny();
        return rental.get();
    }
}
