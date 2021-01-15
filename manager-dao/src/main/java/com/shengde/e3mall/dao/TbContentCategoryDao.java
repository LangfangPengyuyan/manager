package com.shengde.e3mall.dao;

import com.shengde.e3mall.entity.TbContentCategory;

import java.util.List;

/**
 * (TbContentCategory)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-07 11:45:58
 */
public interface TbContentCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbContentCategory queryById(int parentId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbContentCategory 实例对象
     * @return 对象列表
     */
    List<TbContentCategory> queryAll(int parentId);

    /**
     * 新增数据
     *
     * @param tbContentCategory 实例对象
     * @return 影响行数
     */
    int insert(TbContentCategory tbContentCategory);

}