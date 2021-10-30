package com.lagou.service;

import com.lagou.domain.Role;
import com.lagou.domain.RoleMenuVo;

import java.util.List;

public interface RoleService {


    public List<Role> findAllRole(Role role);

    /**
     * 根据角色id查询关联的菜单id
     */
    public List<Integer> findMenuByRoleId(Integer roleId);

    /**
     * 为角色分配菜单信息
     */
    public void roleMenuContext(RoleMenuVo roleMenuVo);

    /**
     * 删除角色
     */
    public void deleteRole(Integer roleId);
}
