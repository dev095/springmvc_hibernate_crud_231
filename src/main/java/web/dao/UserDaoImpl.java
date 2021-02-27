package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao{


    @Override
    public List<User> index() {
        return null;
    }

    @Override
    public User show(int id) {
        return null;
    }

    @Override
    public void save(User person) {

    }

    @Override
    public void update(int id, User updatedUser) {

    }

    @Override
    public void delete(int id) {

    }
}
