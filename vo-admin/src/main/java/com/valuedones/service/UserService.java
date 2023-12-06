package com.valuedones.service;

import com.valuedones.common.Result;
import com.valuedones.pojo.User;

public interface UserService {
    void register(User user);

    Result<String> login(String username, String password);
}
