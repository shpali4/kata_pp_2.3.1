package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(long id);
    void update(User user);
    void delete(long id);
    void save(User user);
}
