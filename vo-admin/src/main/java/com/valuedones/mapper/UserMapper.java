package com.valuedones.mapper;

import com.valuedones.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Insert("insert into user(username, password, role, related_pay_account_id)" +
            "values (#{username}, #{password}, #{role}, #{relatedPayAccountId})")
    void register(User user);

    @Select("select * from user where username = #{username} and password = #{password}")
    User login(String username, String password);
}
