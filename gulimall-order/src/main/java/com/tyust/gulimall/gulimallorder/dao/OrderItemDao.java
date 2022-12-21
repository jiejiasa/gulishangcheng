package com.tyust.gulimall.gulimallorder.dao;

import com.tyust.gulimall.gulimallorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author jiejiasa
 * @email 3607960766@qq.com
 * @date 2022-12-21 11:25:07
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
