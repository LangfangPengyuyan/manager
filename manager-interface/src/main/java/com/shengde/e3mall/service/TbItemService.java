package com.shengde.e3mall.service;


import com.shengde.e3mall.common.pojo.EasyUIDataGridResult;
import com.shengde.e3mall.common.utils.E3Result;
import com.shengde.e3mall.entity.TbItem;

/**
 * (TbItem)表服务接口
 *
 * @author makejava
 * @since 2020-12-07 11:46:03
 */
public interface TbItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbItem queryById(Integer id);


    EasyUIDataGridResult getItemList(int page,int rows);


    E3Result addItem(TbItem item, String desc);


}