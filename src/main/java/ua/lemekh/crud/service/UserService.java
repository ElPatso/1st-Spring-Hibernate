package ua.lemekh.crud.service;

import ua.lemekh.crud.model.User;

import java.util.List;

/**
 * Created by Ostap on 18.03.2017.
 */
public interface UserService {
    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int id);

    public User getUserById(int id);

    public List<User> listUser();
}
