package com.lagou.service.impl;

import com.lagou.dao.RoleMapper;
import com.lagou.domain.Role;
import com.lagou.domain.RoleMenuVo;
import com.lagou.domain.Role_menu_relation;
import com.lagou.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> findAllRole(Role role) {
        List<Role> allRole = roleMapper.findAllRole(role);
        return allRole;
    }

    @Override
    public List<Integer> findMenuByRoleId(Integer roleId) {
        List<Integer> menuByRoleId = roleMapper.findMenuByRoleId(roleId);
        return menuByRoleId;
    }

    /**
     * 为角色分配菜单信息
     * @param roleMenuVo
     */
    @Override
    public void roleMenuContext(RoleMenuVo roleMenuVo) {
        // 1.清空中间表信息
        roleMapper.deleteRoleMenuContext(roleMenuVo.getRoleId());

        for (Integer integer : roleMenuVo.getMenuIdList()) {
            // 在遍历的时候封装数据
            Role_menu_relation role_menu_relation = new Role_menu_relation();
            role_menu_relation.setMenuId(integer);
            role_menu_relation.setRoleId(roleMenuVo.getRoleId());

            Date date = new Date();
            role_menu_relation.setCreatedTime(date);
            role_menu_relation.setUpdatedTime(date);

            role_menu_relation.setCreatedBy("system");
            role_menu_relation.setUpdatedby("system");
            roleMapper.roleMenuContext(role_menu_relation);
        }

    }

    @Override
    public void deleteRole(Integer roleId) {
        roleMapper.deleteRoleMenuContext(roleId);

        roleMapper.deleteRole(roleId);
    }
}
