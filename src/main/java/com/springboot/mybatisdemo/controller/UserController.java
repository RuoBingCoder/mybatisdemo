package com.springboot.mybatisdemo.controller;

import com.springboot.mybatisdemo.pojo.User;
import com.springboot.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * @author : 石建雷
 * @date :2019/2/27
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/{page}")
    public String page(@PathVariable String page, User user) {
        return page;

    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     * @Valid 开启对 Users 对象的数据校验 *BindingResult:封装了校验的结果
     */
    @RequestMapping("/addUser")
    public String addUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "from";
        } else {
            userService.addUser(user);
        }
        return "success";

    }

    /**
     * 显示所有用户
     *
     * @param model
     * @return
     */
    @RequestMapping("/findAllUser")
    public String findAllUser(Model model) {
        List<User> userList = userService.findUserAll();
        model.addAttribute("userList", userList);
        return "showUser";

    }

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        userService.updateUser(user);
        return "success";

    }

    /**
     * 查找用户
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/findUserById")
    public String findByUser(Integer id, Model model) {
        User user = userService.findByUserId(id);
        model.addAttribute("user", user);
        return "searchUser";

    }

    /**
     * 删除用户
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/deleteUserById")
    public String deleteUserById(Integer id) {
        userService.deleteUserById(id);

        return "redirect:/user/findAllUser";

    }
}
