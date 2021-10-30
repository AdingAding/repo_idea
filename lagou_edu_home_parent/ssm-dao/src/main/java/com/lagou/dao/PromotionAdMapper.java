package com.lagou.dao;

import com.lagou.domain.PromotionAd;

import java.util.List;

public interface PromotionAdMapper {
    /**
     * 分页查询
     */
    public List<PromotionAd> findAllAdByPage();

    /**
     * 新增广告信息
     */
    public void savePromotionAd(PromotionAd promotionAd);

    /**
     * 更新广告信息
     */
    public void updatePromotionAd(PromotionAd promotionAd);

    /**
     * 回显广告信息
     */
    public PromotionAd findPromotionAdById(int id);

    /**
     * 广告状态变更
     */
    public void updatePromotionAdStatus(PromotionAd promotionAd);
}
