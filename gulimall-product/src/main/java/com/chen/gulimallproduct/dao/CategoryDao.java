package com.chen.gulimallproduct.dao;

import com.chen.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chen
 * @email chen@gmail.com
 * @date 2022-04-13 13:25:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
