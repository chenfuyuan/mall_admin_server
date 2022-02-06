package com.learn.project.mall.product.application.dto;

import lombok.Data;

import java.util.Date;

/**
 * sku图片-数据传输对象
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2022-02-06 20:41:32
 */
@Data
public class SkuImagesDto {

    /**
    * id
    */
    private Long id;
    /**
    * sku_id
    */
    private Long skuId;
    /**
    * 图片地址
    */
    private String imgUrl;
    /**
    * 排序
    */
    private Integer imgSort;
    /**
    * 默认图[0 - 不是默认图，1 - 是默认图]
    */
    private Integer defaultImg;
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
