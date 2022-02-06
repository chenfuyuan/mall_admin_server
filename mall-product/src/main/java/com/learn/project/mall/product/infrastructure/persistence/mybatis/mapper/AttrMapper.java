package com.learn.project.mall.product.infrastructure.persistence.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learn.project.mall.product.infrastructure.persistence.mybatis.entity.AttrDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性-数据库访问接口
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2022-02-06 20:41:32
 */
@Mapper
public interface AttrMapper extends BaseMapper<AttrDo> {


}
