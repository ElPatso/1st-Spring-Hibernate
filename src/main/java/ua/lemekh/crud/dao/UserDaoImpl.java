package ua.lemekh.crud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ua.lemekh.crud.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
        logger.info("User was successful created"+user);
    }

    @Override
    public void updateUser(User user) {
    Session session = this.sessionFactory.getCurrentSession();
    session.update(user);
    logger.info("Was updated"+user);
    }

    @Override
    public void deleteUser(int id) {
    Session session = this.sessionFactory.getCurrentSession();
    User user =(User) session.load(User.class,new Integer(id));
    if (user!=null){
        session.delete(user);
    }
    logger.info("deleted"+user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        Session  session = this.sessionFactory.getCurrentSession();
        List<User> userList = session.createQuery("from User").list();
        for (User user : userList){
            logger.info("User "+user);
        }
        return userList;
    }

    @Override
    public User getUserById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, new Integer(id));
        logger.info("Get by id"+user);
        return user;
    }
}
