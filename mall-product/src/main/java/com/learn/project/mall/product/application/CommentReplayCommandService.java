package com.learn.project.mall.product.application;

import com.learn.project.mall.product.application.command.CommentReplayCommand;

import java.util.Collection;
import java.util.List;

/**
 * 商品评价回复关系-命令服务接口
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2022-02-06 20:41:32
 */
public interface CommentReplayCommandService {

    /**
     * 保存或更新
     * @param commentReplayCommand
     */
    Long saveOrUpdate(CommentReplayCommand commentReplayCommand);

    /**
     * 删除，根据传递过来的id列表
     * @param ids id列表
     * @return
     */
    boolean delete(Collection<Long> ids);

    /**
     * 删除，根据传递过来的id
     * @param id id
     * @return
     */
    boolean delete(Long id);

    /**
     * 批量进行保存或更新
     * @param commentReplayCommandList
     * @return
     */
    Long[] batchSaveOrUpdate(List<CommentReplayCommand> commentReplayCommandList);
}
