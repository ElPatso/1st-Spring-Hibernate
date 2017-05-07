package ua.lemekh.crud.dao;

import ua.lemekh.crud.model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public List<User> listUsers();
    public User getUserById(int id);
}
