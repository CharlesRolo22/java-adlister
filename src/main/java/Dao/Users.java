package Dao;

import models.User;

import java.util.List;

public interface Users {
    User findByUsername(String username);
    Long insert(User user);
}