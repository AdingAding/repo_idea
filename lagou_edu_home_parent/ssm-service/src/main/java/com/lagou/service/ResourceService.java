package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.Resource;
import com.lagou.domain.ResourceVo;

import java.util.List;

public interface ResourceService {
    /**
     * 分页&条件查询资源信息
     */
    public PageInfo<Resource> findResourceByPage(ResourceVo resourceVo);
}
