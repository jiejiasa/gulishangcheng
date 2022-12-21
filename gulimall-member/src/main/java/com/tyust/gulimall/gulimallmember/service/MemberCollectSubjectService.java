package com.tyust.gulimall.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyust.common.utils.PageUtils;
import com.tyust.gulimall.gulimallmember.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author jiejiasa
 * @email 3607960766@qq.com
 * @date 2022-12-21 11:37:50
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

