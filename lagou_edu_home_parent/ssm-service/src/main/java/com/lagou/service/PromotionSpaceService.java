package com.lagou.service;

import com.lagou.domain.PromotionSpace;

import java.util.List;

public interface PromotionSpaceService {

    /**
     * 查询所有广告位信息
     */
    public List<PromotionSpace> findAll();

    /**
     * 新增广告位
     */
    public void savePromotionSpace(PromotionSpace promotionSpace);

    /**
     * 回显
     */
    public PromotionSpace findPromotionSpaceById(int id);

    /**
     * 更新广告位
     */
    public void updatePromotionSpace(PromotionSpace promotionSpace);
}
