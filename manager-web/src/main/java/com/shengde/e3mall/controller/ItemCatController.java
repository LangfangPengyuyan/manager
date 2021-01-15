package com.shengde.e3mall.controller;

import com.shengde.e3mall.common.pojo.EasyUITreeNode;
import com.shengde.e3mall.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品分类管理
 */
@Controller
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatList(@RequestParam(name = "id",defaultValue = "0") int parentId){

        //调用服务查询节点列表
        List<EasyUITreeNode> list = itemCatService.getItemCatlist(parentId);

        return list;
    }
}