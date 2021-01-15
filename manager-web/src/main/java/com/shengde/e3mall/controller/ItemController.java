package com.shengde.e3mall.controller;

import com.shengde.e3mall.common.pojo.EasyUIDataGridResult;
import com.shengde.e3mall.common.utils.E3Result;
import com.shengde.e3mall.entity.TbItem;
import com.shengde.e3mall.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * (TbItem)表控制层
 *
 * @author makejava
 * @since 2020-12-07 21:37:42
 */
@Controller
@RequestMapping
public class ItemController {
    /**
     * 服务对象
     */
    @Autowired
    private TbItemService tbItemService;

    /**
     * 通过主键查询单条数据
     *
     * @param  主键
     * @return 单条数据
     */
    @GetMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(Integer itemId) {

        return this.tbItemService.queryById(itemId);
    }


    /**
     * 查询商品列表
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page,Integer rows){
        //调用服务查询商品列表
        EasyUIDataGridResult result = tbItemService.getItemList(page,rows);

        return result;
    }

    /**
     * 商品添加
     */
    @RequestMapping(value = "/item/save",method = RequestMethod.POST)
    @ResponseBody
    public E3Result addItem(TbItem item,String desc){
        E3Result result = tbItemService.addItem(item, desc);
        return result;
    }

}