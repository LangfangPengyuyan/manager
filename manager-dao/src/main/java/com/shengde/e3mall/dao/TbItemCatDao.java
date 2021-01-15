package com.shengde.e3mall.dao;

import com.shengde.e3mall.entity.TbItemCat;

import java.util.List;


/**
 * (TbItemCat)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-07 11:46:05
 */
public interface TbItemCatDao {


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbItemCat 实例对象
     * @return 对象列表
     */
    List<TbItemCat> queryAll(TbItemCat tbItemCat);



}