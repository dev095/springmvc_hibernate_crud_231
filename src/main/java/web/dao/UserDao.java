package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    public List<User> index();

    public User show(int id);

    public void save(User person);

    public void update(int id, User updatedUser);

    public void delete(int id);
}
