package com.tyust.gulimall.gulimallproduct.dao;

import com.tyust.gulimall.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jiejiasa
 * @email 3607960766@qq.com
 * @date 2022-12-21 10:26:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
