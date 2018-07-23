package cst.wyz.controller;

import cst.wyz.entity.User;
import cst.wyz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add")
    public String add( User user){
        userService.add(user);
        return "success";
    }

}
