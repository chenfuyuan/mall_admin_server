package com.learn.project.mall.product.application.dto;

import lombok.Data;

import java.util.Date;

/**
 * 属性&属性分组关联-数据传输对象
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2022-02-06 20:41:32
 */
@Data
public class AttrAttrgroupRelationDto {

    /**
    * id
    */
    private Long id;
    /**
    * 属性id
    */
    private Long attrId;
    /**
    * 属性分组id
    */
    private Long attrGroupId;
    /**
    * 属性组内排序
    */
    private Integer attrSort;
    /**
    * 是否删除[0-未删除, 1-删除]
    */
    private Integer isDelete;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 修改时间
    */
    private Date gmtModified;
    /**
    * 更新版本
    */
    private Integer updateVersion;
}
