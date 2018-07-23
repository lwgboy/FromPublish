package cst.wyz.service;

import cst.wyz.base.BaseTest;
import cst.wyz.entity.User;
import cst.wyz.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    @Transactional
    @Rollback(false)
    public void testAdd(){
        User user = new User("1001","wang","8023");

        userService.add(user);

    }

}
