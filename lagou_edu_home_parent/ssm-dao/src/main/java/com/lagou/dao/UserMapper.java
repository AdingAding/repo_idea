package com.lagou.dao;

import com.lagou.domain.*;

import java.util.List;

public interface UserMapper {

    /**
     * 用户分页和多条件查询
     */
    public List<User> findAllByPage(UserVO userVO);

    /**
     * 用户状态设置
     */
    public void updateUserStatus(User user);

    /**
     * 用户登录（根据手机号查询用户信息是否）
     */
    public User login(User user);



    /**
     * 根据用户id清空中间表
     */
    public void deleteUserContextRole(Integer id);

    /**
     * 分配角色，向中间表添加数据
     */
    public void userContextRole(User_Role_relation user_role_relation);


// 动态显示菜单页面
    /**
     * 根据用户id查询对应的角色信息（回显）
     */
    public List<Role> findUserRelationRoleById(Integer id);

    /**
     * 根据角色id,查询角色拥有的顶级菜单信息
     * */
    public List<Menu> findParentMenuByRoleId(List<Integer> ids);
    /**
     * 根据PID 查询子菜单信息
     * */
    public List<Menu> findSubMenuByPid(int pid);
    /**
     * 获取用户拥有的资源权限信息
     * */
    public List<Resource> findResourceByRoleId(List<Integer> ids);
}
