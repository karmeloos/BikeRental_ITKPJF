package bikerental.resources;

import bikerental.model.Rental;
import bikerental.model.User;

public interface IRentals {

    boolean rent(Rental rental);

    Rental giveBack(User user);
}
