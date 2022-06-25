package com.chen.gulimallproduct.dao;

import com.chen.gulimallproduct.entity.SkuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.gulimallproduct.vo.web.SkuItemVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * sku信息
 * 
 * @author chen
 * @email chen@gmail.com
 * @date 2022-04-13 13:25:34
 */
@Mapper
public interface SkuInfoDao extends BaseMapper<SkuInfoEntity> {

    List<SkuItemVo.SkuItemSaleAttrVo> selectAllSaleAttrValue(@Param("spuId") Long spuId);
}
