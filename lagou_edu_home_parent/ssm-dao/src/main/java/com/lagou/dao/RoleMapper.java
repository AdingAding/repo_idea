package com.lagou.dao;

import com.lagou.domain.Role;
import com.lagou.domain.Role_menu_relation;

import java.util.List;

public interface RoleMapper {
    /*
        查询角色列表(条件)
     */
    public List<Role> findAllRole(Role role);

    /**
     * 根据角色id查询关联的菜单id
     */
    public List<Integer> findMenuByRoleId(Integer roleId);

    /**
     * 清空角色和菜单的联系
     */
    public void deleteRoleMenuContext(Integer rid);

    /**
     * 为角色分配菜单
     */
    public void roleMenuContext(Role_menu_relation role_menu_relation);

    /**
     * 删除角色
     */
    public void deleteRole(Integer id);
}
