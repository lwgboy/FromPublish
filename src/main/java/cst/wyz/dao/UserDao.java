package cst.wyz.dao;

import cst.wyz.entity.User;
import java.util.List;


public interface UserDao {

    User getById(String id);

    List list();

    void add(User user);

    void update(User user);

    void delete(String id);

}
