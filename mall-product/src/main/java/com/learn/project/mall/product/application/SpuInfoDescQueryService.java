package com.learn.project.mall.product.application;

import com.learn.project.common.mybatis.util.PageUtils;
import com.learn.project.mall.product.application.dto.SpuInfoDescDto;

import java.util.Map;

/**
 * spu信息介绍-查询服务接口
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2022-02-06 20:41:32
 */
public interface SpuInfoDescQueryService {
    /**
     * 分页查询数据
     * @param params 查询参数
     * @return 分页结果
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 通过spuId获取指定数据
     * @param spuId spuId
     * @return 数据
     */
     SpuInfoDescDto getById(Long spuId);
}
