package com.chen.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.common.utils.PageUtils;
import com.chen.gulimallproduct.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chen
 * @email chen@gmail.com
 * @date 2022-04-13 13:25:34
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

