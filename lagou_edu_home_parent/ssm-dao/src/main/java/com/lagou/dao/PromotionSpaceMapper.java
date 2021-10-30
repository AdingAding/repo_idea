package com.lagou.dao;

import com.lagou.domain.PromotionSpace;

import java.util.List;

public interface PromotionSpaceMapper {

    /**
     * 查询所有广告位信息
     */
    public List<PromotionSpace> findAll();

    /**
     * 添加广告位
     */
    public void savePromotionSpace(PromotionSpace promotionSpace);

    /**
     * 回显广告位信息
     */
    public PromotionSpace findPromotionSpaceById(int id);

    /**
     * 更新广告位
     */
    public void updatePromotionSpace(PromotionSpace promotionSpace);
}
