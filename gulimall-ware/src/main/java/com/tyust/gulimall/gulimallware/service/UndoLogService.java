package com.tyust.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyust.common.utils.PageUtils;
import com.tyust.gulimall.gulimallware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author jiejiasa
 * @email 3607960766@qq.com
 * @date 2022-12-21 11:45:42
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

