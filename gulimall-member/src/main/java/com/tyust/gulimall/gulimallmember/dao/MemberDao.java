package com.tyust.gulimall.gulimallmember.dao;

import com.tyust.gulimall.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jiejiasa
 * @email 3607960766@qq.com
 * @date 2022-12-21 11:37:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
