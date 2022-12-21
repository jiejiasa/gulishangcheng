package com.tyust.gulimall.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyust.common.utils.PageUtils;
import com.tyust.gulimall.gulimallcoupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author jiejiasa
 * @email 3607960766@qq.com
 * @date 2022-12-21 11:30:55
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

