package com.lagou.service;


import com.github.pagehelper.PageInfo;
import com.lagou.domain.*;

import java.util.List;

public interface UserService {

    /**
     * 分页和条件查询
     */
    public PageInfo<User> findAllByPage(UserVO userVO);

    /**
     * 用户状态
     */
    public void updateUserStatus(int id, String status);

    /**
     * 用户登录
     */
    public User login(User user) throws Exception;


    /**
     * 根据用户id查询对应的角色信息（回显）
     */
    public List<Role> findUserRelationRoleById(Integer id);

    /**
     * 用户关联角色
     */
    public void userContextRole(UserVO userVO);


    /**
     * 获取用户权限进行动态展示
     */
    public ResponseResult getUserPermissions(Integer id);
}
