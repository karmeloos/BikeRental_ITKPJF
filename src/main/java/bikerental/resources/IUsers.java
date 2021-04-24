package bikerental.resources;

import bikerental.model.User;

import java.util.List;

public interface IUsers {
    List<User> getUsers();
    boolean add(User user);
}
