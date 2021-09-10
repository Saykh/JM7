package com.edilov.springMVC.dao;

import com.edilov.springMVC.models.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> showAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(int id) {
        User user = entityManager.find(User.class,id);
        entityManager.remove(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUserById(int id) {
       return entityManager.find(User.class,id);
    }
}