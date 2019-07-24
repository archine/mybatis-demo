package com.gjing.controller;

import cn.gjing.annotation.NotNull;
import cn.gjing.result.ResultVo;
import com.gjing.domain.User;
import com.gjing.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Gjing
 * @description TODO
 * @date 2019/7/24
 **/
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/user")
    @ApiOperation(value = "添加用户", httpMethod = "POST")
    public ResultVo saveUser(User user) {
        Integer integer = userService.saveUser(user);
        return ResultVo.success(integer);
    }

    @GetMapping("/user_list")
    @ApiOperation(value = "查询用户列表", httpMethod = "GET")
    public ResultVo findUserList() {
        return ResultVo.success(userService.findAll());
    }

    @PutMapping("/user")
    @ApiOperation(value = "更新用户", httpMethod = "PUT")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userName", value = "用户名", required = true, dataType = "String", paramType = "Query"),
            @ApiImplicitParam(name = "userAge", value = "用户年龄", required = true, dataType = "int", paramType = "Query")
    })
    @NotNull
    public ResultVo updateUser(Integer id, String userName, Integer userAge) {
        return ResultVo.success(userService.updateUser(id, userName, userAge));
    }

    @DeleteMapping("/user/{id}")
    @ApiOperation(value = "根据用户id删除用户", httpMethod = "DELETE")
    public ResultVo deleteUser(@PathVariable("id") Integer id) {
        return ResultVo.success(userService.deleteUser(id));
    }
}
