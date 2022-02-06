package com.learn.project.mall.product.domain.specification;

import com.learn.project.common.core.domain.AbstractSpecification;
import com.learn.project.mall.product.domain.model.spuInfoDesc.SpuInfoDesc;
import org.springframework.stereotype.Component;

/**
 * spu信息介绍-创建时校验类
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2022-02-06 21:50:38
 */
@Component
public class SpuInfoDescCreateSpecification extends AbstractSpecification<SpuInfoDesc> {

    @Override
    public boolean isSatisfiedBy(SpuInfoDesc spuInfoDesc) {
        return true;
    }
}
