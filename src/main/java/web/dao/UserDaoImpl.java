package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {


    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<User> index() {
        Query query = entityManager.createQuery("from User");
        return query.getResultList();
    }

    @Override
    public void save(User user) {

        entityManager.merge(user);
    }

    @Override
    public User show(int id) {
        return entityManager.find(User.class, id);
    }


    @Override
    public void update(int id, User updatedUser) {
        User userUpdated = show(id);
        userUpdated.setName(updatedUser.getName());
        userUpdated.setSurname(updatedUser.getSurname());
        userUpdated.setEmail(updatedUser.getEmail());
    }

    @Override
    public void delete(int id) {
        Query query = entityManager.createQuery("delete from User where id =:userId");
        query.setParameter("userId", id);
        query.executeUpdate();
    }
}
