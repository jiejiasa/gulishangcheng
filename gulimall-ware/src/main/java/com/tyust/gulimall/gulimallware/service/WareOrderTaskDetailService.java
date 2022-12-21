package com.tyust.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyust.common.utils.PageUtils;
import com.tyust.gulimall.gulimallware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author jiejiasa
 * @email 3607960766@qq.com
 * @date 2022-12-21 11:45:42
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

