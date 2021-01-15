package com.shengde.e3mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shengde.e3mall.common.pojo.EasyUIDataGridResult;
import com.shengde.e3mall.common.utils.E3Result;
import com.shengde.e3mall.common.utils.IDUtiles;
import com.shengde.e3mall.dao.TbItemDao;
import com.shengde.e3mall.dao.TbItemDescDao;
import com.shengde.e3mall.entity.*;
import com.shengde.e3mall.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * (TbItem)表服务实现类
 *
 * @author makejava
 * @since 2020-12-07 11:46:03
 */
@Service
public class TbItemServiceImpl implements TbItemService {



    @Autowired
    TbItemDao itemMapper;

    @Autowired
    TbItemDescDao itemDescMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbItem queryById(Integer id) {
        return this.itemMapper.queryById(id);
    }

    /**
     * 查询商品列表
     * @param page
     * @param rows
     * @return
     */
    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        //设置分页信息
        PageHelper.startPage(page, rows);
        //执行查询
        List<TbItem> list = itemMapper.queryAll(new TbItem());
        //创建一个返回值对象
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setRows(list);
        //取分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        //取总记录数
        long total = pageInfo.getTotal();
        result.setTotal(total);
        return result;
    }

    @Override
    public E3Result addItem(TbItem item,String desc){

        //生成商品id
        long itemId = IDUtiles.genItemId();
        //补全item的属性
        item.setId((int) itemId);
        //1-正常。2-下架。3-删除
        item.setStatus(1);
        item.setCreated(new Date());
        item.setUpdated(new Date());
        //向商品表插入数据
        itemMapper.insert(item);
        //创建一个商品描述对应的pojo对象
        TbItemDesc itemDesc = new TbItemDesc();
        //补全属性
        itemDesc.setItemId((int) itemId);
        itemDesc.setItemDesc(desc);
        itemDesc.setCreated(new Date());
        itemDesc.setUpdated(new Date());
        //向商品描述表插入数据
        itemDescMapper.insert(itemDesc);
        //返回成功
        return E3Result.ok();

    }




}