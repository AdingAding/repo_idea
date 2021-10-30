package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVO;

import java.util.List;

public interface PromotionAdService {
    /**
     * 分页查询
     */
    public PageInfo<PromotionAd> findAllAdByPage(PromotionAdVO promotionAdVO);

    /**
     * 新增广告信息
     */
    public void savePromotionAd(PromotionAd promotionAd);

    /**
     * 更新广告信息
     */
    public void updatePromotionAd(PromotionAd promotionAd);



    public PromotionAd findPromotionAdById(int id);

    /**
     * 广告状态变更
     */
    public void updatePromotionAdStatus(int id, int stauts);
}
