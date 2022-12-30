package web.dao;

import web.models.User;

import java.util.List;

public interface UserDAO {
    List<User> index();
    User show(long id);
    void update(User user);
    void delete(long id);
    void save(User user);
}
