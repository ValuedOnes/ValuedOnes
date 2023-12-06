package com.valuedones.service.impl;

import com.valuedones.common.Result;
import com.valuedones.mapper.UserMapper;
import com.valuedones.pojo.User;
import com.valuedones.service.UserService;
import com.valuedones.utils.JWTUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public void register(User user) {
        userMapper.register(user);
    }

    public Result<String> login(String username, String password) {
        User user = userMapper.login(username, password);
        if (user != null) {
            // 生成JWT返回
            Map<String, Object> claims = new HashMap<>();
            claims.put("username", username);
            return Result.success(JWTUtils.getJWT(claims));
        }
        return Result.error("用户名或密码错误");
    }
}
