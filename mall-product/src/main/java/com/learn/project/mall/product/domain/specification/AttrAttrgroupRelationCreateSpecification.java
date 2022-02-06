package com.learn.project.mall.product.domain.specification;

import com.learn.project.common.core.domain.AbstractSpecification;
import com.learn.project.mall.product.domain.model.attrAttrgroupRelation.AttrAttrgroupRelation;
import org.springframework.stereotype.Component;

/**
 * 属性&属性分组关联-创建时校验类
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2022-02-06 21:50:38
 */
@Component
public class AttrAttrgroupRelationCreateSpecification extends AbstractSpecification<AttrAttrgroupRelation> {

    @Override
    public boolean isSatisfiedBy(AttrAttrgroupRelation attrAttrgroupRelation) {
        return true;
    }
}
