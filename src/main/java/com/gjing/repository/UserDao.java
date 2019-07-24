package com.gjing.repository;

import com.gjing.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Gjing
 * @description TODO
 * @date 2019/7/24
 **/
@Mapper
public interface UserDao {
    /**
     * 添加用户
     * @param user 用户对象
     * @return 添加数量
     */
    @Insert("insert user (company_id, user_name, user_age) values(#{companyId},#{userName},#{userAge})")
    int saveUser(User user);

    /**
     * 查询用户列表
     * @return 用户列表
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 修改用户信息
     * @param userId 用户id
     * @param userName 用户名
     * @param userAge 用户年龄
     * @return 返回match数量
     */
    int updateUser(@Param("userId") Integer userId, @Param("userName") String userName, @Param("userAge") Integer userAge);

    /**
     * 删除用户
     * @param userId 用户id
     * @return 数量
     */
    @Delete("delete from user where user_id = #{userId}")
    int deleteUser(Integer userId);
}
