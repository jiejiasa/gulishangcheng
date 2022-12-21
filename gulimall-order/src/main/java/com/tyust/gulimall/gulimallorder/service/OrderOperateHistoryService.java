package com.tyust.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyust.common.utils.PageUtils;
import com.tyust.gulimall.gulimallorder.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author jiejiasa
 * @email 3607960766@qq.com
 * @date 2022-12-21 11:25:07
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

