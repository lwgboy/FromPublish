package cst.wyz.dao;

import cst.wyz.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public User getById(String id) {
        return getSession().get(User.class,id);
    }

    @Override
    public List list() {
        return getSession().createCriteria(User.class).list();
    }

    @Override
    public void add(User user) {
        getSession().save(user);
    }

    @Override
    public void update(User user) {
        getSession().update(user);
    }

    @Override
    public void delete(String id) {
        getSession().delete(getById(id));
    }
}
