package bikerental.resources;

import bikerental.model.User;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;
@Getter
public class Users implements IUsers {

    private List<User> users =  new LinkedList<>();

    @Override
    public boolean add(User user) {
        users.add(user);
        return users.contains(user);
    }
}
