package bikerental.resources;

import bikerental.model.User;

import java.util.LinkedList;
import java.util.List;

public class Users implements IUsers {

    private List<User> users =  new LinkedList<>();

    @Override
    public boolean add(User user) {
        users.add(user);
        return users.contains(user);
    }
}
