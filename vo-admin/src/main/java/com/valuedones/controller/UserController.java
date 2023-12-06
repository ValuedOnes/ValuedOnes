package com.valuedones.controller;

import com.valuedones.common.Result;
import com.valuedones.pojo.User;
import com.valuedones.pojo.UserLoginDTO;
import com.valuedones.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public void register(User user){
        userService.register(user);
    }

    @PostMapping("/login")
    public Result<String> login(UserLoginDTO userLoginDTO){
        return userService.login(userLoginDTO.getUsername(), userLoginDTO.getPassword());
    }
}
