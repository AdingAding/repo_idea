package com.lagou.dao;

import com.lagou.domain.Menu;

import java.util.List;

public interface MenuMapper {

    /**
     * 查询父子级菜单信息
     */
    public List<Menu> findSubMenuListByPid(int pid);

    /**
     * 查询所有菜单信息
     */
    public List<Menu> findAllMenu();

    /**
     * 回显菜单信息
     * @param id
     * @return
     */
    Menu findMenuById(Integer id);
}
